package thesiscsc.thesiscsc.asyncMethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import org.ksoap2.serialization.AttributeInfo;

import java.util.Date;

import SicsWsTaskManagementEntryPoint.ChangeTaskStatusInput;
import SicsWsTaskManagementEntryPoint.ChangeTaskStatusSummary;
import SicsWsTaskManagementEntryPoint.SicsTaskManagementProcessReference;
import SicsWsTaskManagementEntryPoint.SicsUserReference;
import SicsWsTaskManagementEntryPoint.SicsWsTaskManagementEntryPointBinding;

/**
 * Created by Adam on 15.03.2017.
 */

public class ExcecuteChangeTaskStatusService extends AsyncTask<String, Void, Boolean> {
    private Context mContext;
    SharedPreferences prefs;
    String identifier;
    int subclassNumber;

    public ExcecuteChangeTaskStatusService(Context context, String identifier, int subclassNumber) {
        mContext = context;
        this.identifier = identifier;
        this.subclassNumber = subclassNumber;
    }


    @Override
    protected Boolean doInBackground(String... params) {
        prefs = mContext.getSharedPreferences("credentials", Context.MODE_PRIVATE);
        SicsWsTaskManagementEntryPoint.SicsGenericInput param0 = new SicsWsTaskManagementEntryPoint.SicsGenericInput();

        ChangeTaskStatusInput param1 = new ChangeTaskStatusInput();

        SicsWsTaskManagementEntryPoint.AuthenticationToken token = new SicsWsTaskManagementEntryPoint.AuthenticationToken();

        token.userId = prefs.getString("username", "");
        token.signature = prefs.getString("signature","");
        token.expiration = new Date(prefs.getLong("exp", 0));
        param0.authenticationToken = token;

        SicsTaskManagementProcessReference processReference = new SicsTaskManagementProcessReference();
        processReference.processIdentifier = identifier;


        SicsWsTaskManagementEntryPoint.SicsReferenceDataReference sicsReferenceData = new SicsWsTaskManagementEntryPoint.SicsReferenceDataReference();
        sicsReferenceData.code = params[0];
        sicsReferenceData.subclassNumber = subclassNumber;

        param1.processReference = processReference;
        param1.status = sicsReferenceData;

        SicsUserReference sicsUserReference = new SicsUserReference();

        param1.suggestedActualOwner = sicsUserReference;


        SicsWsTaskManagementEntryPointBinding service = new SicsWsTaskManagementEntryPointBinding(null, "http://" + prefs.getString("ip", "") + "/SwanLake/SicsWSServlet");


        try{
            ChangeTaskStatusSummary res = service.changeTaskStatus(param0,param1);
            return true;
        }catch (Exception e){
            Log.d("tasksummary", Log.getStackTraceString(e));
            return false;
        }
    }
}
