package thesiscsc.thesiscsc.asyncMethods;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import java.util.Date;

import SicsWsDomainSearchEntryPoint.ActualOwnerProperties;
import SicsWsDomainSearchEntryPoint.SicsWsDomainSearchEntryPointBinding;
import SicsWsDomainSearchEntryPoint.TaskFindCriteria;
import SicsWsDomainSearchEntryPoint.TaskProperties;
import SicsWsDomainSearchEntryPoint.TaskSearchCriteria;
import SicsWsDomainSearchEntryPoint.TaskSearchResultOutput;
import SicsWsDomainSearchEntryPoint.TaskUserList;
import thesiscsc.thesiscsc.model.Task;

/**
 * Created by Adam on 15.03.2017.
 */

public class ExcecuteTaskSearchService extends AsyncTask<String, Void, String> {
    private Context mContext;
    SharedPreferences prefs;

    public ExcecuteTaskSearchService(Context context) {
        mContext = context;
    }


    @Override
    protected String doInBackground(String... params) {
        prefs = mContext.getSharedPreferences("credentials", Context.MODE_PRIVATE);
        SicsWsDomainSearchEntryPoint.SicsGenericInput param0 = new SicsWsDomainSearchEntryPoint.SicsGenericInput();


        SicsWsDomainSearchEntryPoint.AuthenticationToken token = new SicsWsDomainSearchEntryPoint.AuthenticationToken();

        token.userId = prefs.getString("username", "");
        token.signature = prefs.getString("signature","");
        token.expiration = new Date(prefs.getLong("exp", 0));
        param0.authenticationToken = token;

        TaskSearchCriteria param1 = new TaskSearchCriteria();
        TaskProperties taskProp = new TaskProperties();
        taskProp.findOnlyOwnTasks = true;

        TaskFindCriteria taskcrit = new TaskFindCriteria();
        taskcrit.taskProperties = taskProp;

        SicsWsDomainSearchEntryPoint.SicsUserReference sicReference = new SicsWsDomainSearchEntryPoint.SicsUserReference();
        sicReference.userId = token.userId;
        TaskUserList users = new TaskUserList();
        users.add(sicReference);

        ActualOwnerProperties actOwner = new ActualOwnerProperties();
        actOwner.actualOwnerList = users;
        taskcrit.actualOwnerProperties = actOwner;

        param1.criteria = taskcrit;

        SicsWsDomainSearchEntryPointBinding service = new SicsWsDomainSearchEntryPointBinding(null,"http://"+ prefs.getString("ip", "") + "/SwanLake/SicsWSServlet");
        Log.d("showme", params[0]);
        try{
            TaskSearchResultOutput res = service.executeTaskSearch(param0,param1);

            for(SicsWsDomainSearchEntryPoint.TaskFindResult a: res.taskSearchResultList) {

                Log.d("showmediscrim",a.processIdentifier);
                if (a.displayDiscriminator != null && a.displayDiscriminator.equals(params[0])){
                    Log.d("showme",a.displayDiscriminator);
                    Log.d("showme",a.processIdentifier);
                    return a.processIdentifier;
                }
            }
            return null;
        }catch (Exception e){
            Log.d("showme", Log.getStackTraceString(e));
            return null;
        }
    }
}
