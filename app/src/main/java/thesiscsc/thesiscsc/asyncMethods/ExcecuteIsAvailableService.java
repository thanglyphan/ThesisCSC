package thesiscsc.thesiscsc.asyncMethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import SicsWsAdministrationEntryPoint.SicsWsAdministrationEntryPointBinding;

/**
 * Created by Adam on 05.03.2017.
 */

public class ExcecuteIsAvailableService extends AsyncTask<String, Void, String> {
    private Context mContext;
    SharedPreferences prefs;

    public ExcecuteIsAvailableService(Context context) {
        mContext = context;
    }

    @Override
    protected String doInBackground(String... params) {

        prefs = mContext.getSharedPreferences("credentials", Context.MODE_PRIVATE);
        SicsWsAdministrationEntryPointBinding service = new SicsWsAdministrationEntryPointBinding(null, "http://" + prefs.getString("ip", "") + "/SwanLake/SicsWSServlet");

        try {
            Boolean res = service.isAvailable();
            if (res) {
                return "Server is available.";
            } else {
                return "Server is not available";
            }
        } catch (Exception e) {
            Log.d("ExcecuteAboutService", e.toString());
            return "Something went wrong";
        }
    }
}