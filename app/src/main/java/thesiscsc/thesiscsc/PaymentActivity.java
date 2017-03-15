package thesiscsc.thesiscsc;

import android.content.Intent;
import java.text.SimpleDateFormat;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
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
import thesiscsc.thesiscsc.asyncMethods.ExcecuteRetrieveObjectService;
import thesiscsc.thesiscsc.other.CallIsAvailable;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

/**
 * Created by thang on 07.02.2017.
 */

public class PaymentActivity extends AppCompatActivity {
    Button buttonApprove, buttonDeny;


    TextView text, moneyText, dateText, text2,text3,text4,text5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        try {
            String reply = new CallIsAvailable().CallIsAvailable(getBaseContext());
        } catch (Exception e) {
            Log.d("ÆØÅ",Log.getStackTraceString(e));
        }

        text = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        text4 = (TextView) findViewById(R.id.textView4);
        text5 = (TextView) findViewById(R.id.textView5);

        moneyText = (TextView) findViewById(R.id.moneyTextView);
        dateText = (TextView) findViewById(R.id.dateTextView);

        buttonApprove = (Button) findViewById(R.id.buttonApprove);
        buttonDeny = (Button) findViewById(R.id.buttonDeny);

        Intent intent = getIntent();


        String idOffer = "";

        Intent startingIntent = getIntent();
        if (startingIntent != null) {
            idOffer = startingIntent.getStringExtra("remittance_id"); // Retrieve the id
            text.setText("Remittance ID: " + idOffer);
        }

        String message = intent.getStringExtra(MenuActivity.EXTRA_MESSAGE);

        if (message != null) {
            text.setText(message);
        }

        text.setText(message);
        if (idOffer != null) {
            Log.d("idOffer", idOffer);
        } else {
            idOffer = "R15";
            Log.d("idOffer", "doesn't work");
        }

        LedgerRemittanceBalance ledgerRemittanceBalance;
        ExcecuteRetrieveObjectService excecuteRetrieveObjectService = new ExcecuteRetrieveObjectService(this);
        try {
            ledgerRemittanceBalance = excecuteRetrieveObjectService.execute(idOffer).get();
            moneyText.setText(ledgerRemittanceBalance.currency.isoAlpha + " " + ledgerRemittanceBalance.originalAmount );
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            dateText.setText(formatter.format(ledgerRemittanceBalance.dateOfBooking));

            text4.setText(ledgerRemittanceBalance.baseCompany.identifier);
            text5.setText(ledgerRemittanceBalance.paymentPartnersAddress.partnerAddressIdentifier);


        } catch (Exception e) {
            Log.d("exception", e.toString());
        }


    }
}