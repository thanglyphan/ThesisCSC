package thesiscsc.thesiscsc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import org.ksoap2.serialization.SoapObject;

import thesiscsc.thesiscsc.asyncMethods.ExcecuteRetrieveObjectService;

/**
 * Created by Adam on 10.03.2017.
 */

public class ObjectRetrievalActivity extends AppCompatActivity {
        Button buttonApprove, buttonDeny;
        TextView text;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_payment);

            String katt = "aids";

            SoapObject request = new SoapObject(katt, "GetQuickParkEvents");

            SoapObject user = new SoapObject(katt, "User");
            user.addProperty("ID", "int");
            user.addProperty("Name", "string");
            user.addProperty("UserName", "UserName");
            user.addProperty("Password", "Password");

            SoapObject filter = new SoapObject(katt, "Filter");

            SoapObject timeSpan = new SoapObject(katt, "TimeSpan");
            timeSpan.addProperty("Since", "dateTime");
            timeSpan.addProperty("To", "dateTime");

            filter.addSoapObject(timeSpan);
            filter.addProperty("Reg", "string");
            filter.addProperty("Nalog", "string");
            filter.addProperty("Status", "string");
            filter.addProperty("Value", "string");


            request.addSoapObject(user);
            request.addSoapObject(filter);

            Log.d("aids",request.toString());
    }

}
