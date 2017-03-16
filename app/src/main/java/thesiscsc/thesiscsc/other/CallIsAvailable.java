package thesiscsc.thesiscsc.other;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import thesiscsc.thesiscsc.LoginActivity;
import thesiscsc.thesiscsc.MenuActivity;
import thesiscsc.thesiscsc.asyncMethods.ExcecuteIsAvailableService;

/**
 * Created by Adam on 14.03.2017.
 */

public class CallIsAvailable {
    public String CallIsAvailable (Context context){

        SharedPreferences prefs;

        prefs = context.getSharedPreferences("credentials", Context.MODE_PRIVATE);
        ExcecuteIsAvailableService excecuteIsAvailableService = new ExcecuteIsAvailableService(context);
        try {
            String reply = excecuteIsAvailableService.execute().get(2000, TimeUnit.MILLISECONDS);
            return reply;
        } catch (Exception e) {
            Toast.makeText(context, "Server is not available, user has been logged out", Toast.LENGTH_LONG).show();

            prefs.edit().putString("username", null).apply();
            prefs.edit().putString("password", null).apply();

            Intent i = new Intent(context, LoginActivity.class);
            i.putExtra("SERVER_GONE", "yep");
            context.startActivity(i);

            return null;
        }
    }
}
