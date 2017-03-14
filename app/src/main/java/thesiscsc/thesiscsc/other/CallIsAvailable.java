package thesiscsc.thesiscsc.other;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import thesiscsc.thesiscsc.asyncMethods.ExcecuteIsAvailableService;

/**
 * Created by Adam on 14.03.2017.
 */

public class CallIsAvailable {
    public String CallIsAvailable (Context context){
        ExcecuteIsAvailableService excecuteIsAvailableService = new ExcecuteIsAvailableService(context);
        try {
            String reply = excecuteIsAvailableService.execute().get(5000, TimeUnit.MILLISECONDS);
            return reply;
        } catch (Exception e) {
            Toast.makeText(context, "Server is not available, user has been logged out", Toast.LENGTH_LONG).show();
            return null;
        }
    }
}
