package thesiscsc.thesiscsc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by thang on 07.02.2017.
 */

public class PaymentActivity extends AppCompatActivity  {
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
            idOffer = startingIntent.getStringExtra("id_offer"); // Retrieve the id
        }

        String message = intent.getStringExtra(MenuActivity.EXTRA_MESSAGE);

        if (message != null) {
            text.setText(message);
        }

        if (idOffer != null){
            Log.d("works",idOffer);
        } else {
            Log.d("works", "doesn't work");
        }
    }
}