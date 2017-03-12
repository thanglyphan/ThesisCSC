package thesiscsc.thesiscsc;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import thesiscsc.thesiscsc.asyncMethods.ExcecuteRetrieveObjectService;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

/**
 * Created by thang on 07.02.2017.
 */

public class PaymentActivity extends AppCompatActivity {
    Button buttonApprove, buttonDeny;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        buttonApprove = (Button) findViewById(R.id.buttonApprove);
        buttonDeny = (Button) findViewById(R.id.buttonDeny);
        text = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();



        String idOffer = "";

        Intent startingIntent = getIntent();
        if (startingIntent != null) {
            idOffer = startingIntent.getStringExtra("remittance_id"); // Retrieve the id
        }

        String message = intent.getStringExtra(MenuActivity.EXTRA_MESSAGE);

        if (message != null) {
            text.setText(message);
        }

        if (idOffer != null) {
            Log.d("idOffer", idOffer);
        } else {
            Log.d("idOffer", "doesn't work");
        }



        ExcecuteRetrieveObjectService excecuteRetrieveObjectService = new ExcecuteRetrieveObjectService(this);
        try {
            String hei = excecuteRetrieveObjectService.execute(idOffer).get();
        } catch (Exception e) {
            Log.d("exception", e.toString());
        }

    }


}