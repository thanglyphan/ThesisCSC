package thesiscsc.thesiscsc.asyncMethods;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.util.Log;

import SicsWsAdministrationEntryPoint.SicsWsAdministrationEntryPointBinding;
import thesiscsc.thesiscsc.LoginActivity;

/**
 * Created by Adam on 05.03.2017.
 */

public class ExcecuteIsAvailableService extends AsyncTask<String, Void, String> {
    private Context mContext;
    private Fragment mFragment;
    SharedPreferences prefs;

    public ExcecuteIsAvailableService(Context context) {
        mContext = context;
        //mFragment = fragment;
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
        }
        return null;
    }
}