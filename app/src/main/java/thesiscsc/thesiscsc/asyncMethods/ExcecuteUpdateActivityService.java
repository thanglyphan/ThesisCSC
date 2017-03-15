package thesiscsc.thesiscsc.asyncMethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import java.util.Date;

import SicsWsTaskManagementEntryPoint.ActivityCommentCreate;
import SicsWsTaskManagementEntryPoint.ActivityCommentList;
import SicsWsTaskManagementEntryPoint.ActivityCommentUpdateList;
import SicsWsTaskManagementEntryPoint.ActivityOutputDataCreate;
import SicsWsTaskManagementEntryPoint.ActivityOutputDataList;
import SicsWsTaskManagementEntryPoint.AuthenticationToken;
import SicsWsTaskManagementEntryPoint.SicsGenericInput;
import SicsWsTaskManagementEntryPoint.SicsTaskManagementActivityReference;
import SicsWsTaskManagementEntryPoint.SicsUserReference;
import SicsWsTaskManagementEntryPoint.SicsWsTaskManagementEntryPointBinding;
import SicsWsTaskManagementEntryPoint.UpdateActivityInput;

/**
 * Created by Adam on 15.03.2017.
 */

public class ExcecuteUpdateActivityService extends AsyncTask<String, Void, Boolean> {
    private Context mContext;
    SharedPreferences prefs;
    String processIdentifier;
    String comment;

    public ExcecuteUpdateActivityService(Context context, String processIdentifier, String comment) {
        mContext = context;
        this.processIdentifier = processIdentifier;
        this.comment = comment;
    }
    @Override
    protected Boolean doInBackground(String... params) {


        prefs = mContext.getSharedPreferences("credentials", Context.MODE_PRIVATE);


        SicsGenericInput param0 = new SicsGenericInput();

        AuthenticationToken token = new AuthenticationToken();

        token.userId = prefs.getString("username", "");
        token.signature = prefs.getString("signature","");
        token.expiration = new Date(prefs.getLong("exp", 0));

        param0.authenticationToken = token;

        UpdateActivityInput param1 = new UpdateActivityInput();

        SicsTaskManagementActivityReference sicsTaskManagementActivityReference = new SicsTaskManagementActivityReference();
        sicsTaskManagementActivityReference.processIdentifier = processIdentifier;
        sicsTaskManagementActivityReference.internalName = "closeRemittance";

        ActivityOutputDataList activityOutputDataList = new ActivityOutputDataList();
        ActivityOutputDataCreate activityOutputDataCreate = new ActivityOutputDataCreate();
        activityOutputDataCreate.parameterName = "authorized";
        activityOutputDataCreate.parameterValue = "Y";
        activityOutputDataList.add(0,activityOutputDataCreate);

        ActivityCommentList activityCommentList = new ActivityCommentList();

        ActivityCommentCreate activityCommentCreate = new ActivityCommentCreate();
        SicsUserReference sicsUserReference = new SicsUserReference();
        sicsUserReference.userId = prefs.getString("username", "");
        activityCommentCreate.addedBy = sicsUserReference;
        activityCommentCreate.addedTime = new Date();
        activityCommentCreate.text = comment;
        activityCommentList.add(0,activityCommentCreate);

        param1.activityReference = sicsTaskManagementActivityReference;
        param1.outputDataList = activityOutputDataList;
        param1.commentList = activityCommentList;


        SicsWsTaskManagementEntryPointBinding service = new SicsWsTaskManagementEntryPointBinding(null, "http://" + prefs.getString("ip", "") + "/SwanLake/SicsWSServlet");

        try{
            service.updateActivity(param0,param1);
            return true;
        }catch (Exception e){
            Log.d("remstatus", Log.getStackTraceString(e));
            return false;
        }
    }
}


