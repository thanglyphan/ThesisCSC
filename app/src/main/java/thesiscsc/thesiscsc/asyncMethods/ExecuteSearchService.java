package thesiscsc.thesiscsc.asyncMethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;
import java.util.Date;

import SicsWsDomainSearchEntryPoint.AuthenticationToken;
import SicsWsDomainSearchEntryPoint.DbOutput;
import SicsWsDomainSearchEntryPoint.Input;
import SicsWsDomainSearchEntryPoint.SicsGenericInput;
import SicsWsDomainSearchEntryPoint.SicsWsDomainSearchEntryPointBinding;
import thesiscsc.thesiscsc.model.User;

/**
 * Created by Adam on 03.03.2017.
 */

public class ExecuteSearchService extends AsyncTask<String, Void, ArrayList<User>> {
    private Context mContext;
    SharedPreferences prefs;

    public ExecuteSearchService(Context context) {
        mContext = context;
    }
    @Override
        protected ArrayList<User> doInBackground(String... params) {
            ArrayList<User> userList = new ArrayList<>();

        prefs = mContext.getSharedPreferences("credentials", Context.MODE_PRIVATE);


            SicsGenericInput param0 = new SicsGenericInput();

            AuthenticationToken token = new AuthenticationToken();

            token.userId = prefs.getString("username", "");
            token.signature = prefs.getString("signature","");
            token.expiration = new Date(prefs.getLong("exp", 0));
            param0.authenticationToken = token;

            Input param1 = new Input();

            SicsWsDomainSearchEntryPoint.SQLSpecification SQLSpecification = new SicsWsDomainSearchEntryPoint.SQLSpecification();
            SQLSpecification.sqlStatement = params[0];
            param1.inputSQLSpecification = SQLSpecification;


            SicsWsDomainSearchEntryPointBinding service = new SicsWsDomainSearchEntryPointBinding(null,"http://"+ prefs.getString("ip","") + "/SwanLake/SicsWSServlet");

            try{
                DbOutput res = service.executeSearch(param0,param1);
                userList = res.getUserList();
                if (params[0] == null) {
                    for (User u : userList) {
                        if (u.getUser_Id().equals(prefs.getString("username", ""))) {
                            userList.remove(u);
                        }
                    }
                }

            }catch (Exception e){
                Log.d("TEST", Log.getStackTraceString(e));
            }
            return userList;
        }
    }

