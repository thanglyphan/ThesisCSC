package thesiscsc.thesiscsc;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import SicsWsDomainRetrievalEntryPoint.DomainObject;
import SicsWsDomainRetrievalEntryPoint.LedgerRemittanceBalance;
import thesiscsc.thesiscsc.asyncMethods.ExcecuteChangeStatusRemittanceBalanceService;
import thesiscsc.thesiscsc.asyncMethods.ExcecuteChangeTaskStatusService;
import thesiscsc.thesiscsc.asyncMethods.ExcecuteGetPartnerService;
import thesiscsc.thesiscsc.asyncMethods.ExcecuteRetrieveObjectService;
import thesiscsc.thesiscsc.asyncMethods.ExcecuteTaskSearchService;
import thesiscsc.thesiscsc.asyncMethods.ExcecuteUpdateActivityService;
import thesiscsc.thesiscsc.asyncMethods.ExecuteSearchService;
import thesiscsc.thesiscsc.fragment.AdminPanelFragment;
import thesiscsc.thesiscsc.model.Task;
import thesiscsc.thesiscsc.other.CallIsAvailable;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class PaymentActivity extends AppCompatActivity {
    Button buttonApprove, buttonDeny, buttonDate;
    String displayDiscriminator, tempDateStore;
    EditText comment;
    Task task;
    TextView text, moneyText, dateText, text2, text3, text4, text5;
    private DatePicker datePicker;
    private Calendar calendar;
    private int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        try {
            String reply = new CallIsAvailable().CallIsAvailable(getBaseContext());
        } catch (Exception e) {
            Log.d("ÆØÅ", Log.getStackTraceString(e));
        }

        task = (Task) getIntent().getSerializableExtra("task");
        comment = (EditText) findViewById(R.id.comment);
        text = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        text4 = (TextView) findViewById(R.id.textView4);
        text5 = (TextView) findViewById(R.id.textView5);

        moneyText = (TextView) findViewById(R.id.moneyTextView);
        dateText = (TextView) findViewById(R.id.dateTextView);

        buttonApprove = (Button) findViewById(R.id.buttonApprove);
        buttonDeny = (Button) findViewById(R.id.buttonDeny);
        //buttonDate = (Button) findViewById(R.id.buttonDate);

        displayDiscriminator = "";
        if (getIntent().getStringExtra("remittance_id") != null) {
            displayDiscriminator = getIntent().getStringExtra("remittance_id"); // Retrieve the id
        } else {
            displayDiscriminator = task.displayDiscriminator;
        }


        LedgerRemittanceBalance ledgerRemittanceBalance;
        ExcecuteRetrieveObjectService excecuteRetrieveObjectService = new ExcecuteRetrieveObjectService(this);

        LedgerRemittanceBalance names;
        ExcecuteGetPartnerService excecuteGetPartnerService = new ExcecuteGetPartnerService(this);
        try {
            ledgerRemittanceBalance = excecuteRetrieveObjectService.execute(displayDiscriminator).get();
            text.setText("Remittance ID: " + displayDiscriminator);
            moneyText.setText(ledgerRemittanceBalance.originalAmount + " " + ledgerRemittanceBalance.currency.isoAlpha);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            dateText.setText(formatter.format(ledgerRemittanceBalance.dateOfBooking));

            names = excecuteGetPartnerService.execute(displayDiscriminator).get();
            text4.setText(names.checkNumber);
            text5.setText(names.lmmReference);


            Log.d("eyyy", names.checkNumber + " " + names.lmmReference);


        } catch (Exception e) {
            Log.d("paymentlog", Log.getStackTraceString(e));
        }

        final ExcecuteTaskSearchService getProcessIdentifierForDisplayDiscriminator = new ExcecuteTaskSearchService(this);
        String processID;
        try {
            processID = getProcessIdentifierForDisplayDiscriminator.execute(displayDiscriminator).get();
            Log.d("processID", "processID: " + processID);
        } catch (Exception e) {
            processID = null;
        }

        final ExcecuteChangeStatusRemittanceBalanceService excec = new ExcecuteChangeStatusRemittanceBalanceService(this, displayDiscriminator);
        final ExcecuteUpdateActivityService excec2 = new ExcecuteUpdateActivityService(this, processID);
        final ExcecuteChangeTaskStatusService excec3 = new ExcecuteChangeTaskStatusService(this, processID, 1146);

        buttonApprove.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {

                    Boolean a = excec.execute().get();
                    Boolean b = excec2.execute("Y", comment.getText().toString()).get();
                    Boolean c = excec3.execute("COMPLETED").get();
                    Toast.makeText(getBaseContext(), "Payment was succesfully authorized.", Toast.LENGTH_SHORT).show();
                    finish();
                    //  Log.d("paymentlog", a + " " + b + " " + c);
                } catch (Exception e) {
                    Log.d("paymentlog", Log.getStackTraceString(e));
                }
            }
        });
        buttonDeny.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Boolean a = excec.execute().get();
                    Boolean b = excec2.execute("N", comment.getText().toString()).get();
                    Boolean c = excec3.execute("COMPLETED").get();
                    // Log.d("paymentlog", a + " " + b + " " + c);
                    Toast.makeText(getBaseContext(), "Payment was succesfully denied.", Toast.LENGTH_SHORT).show();
                    finish();
                } catch (Exception e) {
                    Log.d("paymentlog", Log.getStackTraceString(e));
                }
            }
        });
    }

    //Datepicker for payment authorization

    /*@SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca",
                Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2+1, arg3);
                }
            };

    private void showDate(int year, int month, int day) {
        buttonDate.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));

        tempDateStore = new StringBuilder().append(year).append("-")
                .append(month).append("-").append(day).toString();

        System.out.println(tempDateStore);

    }*/

}