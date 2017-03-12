package thesiscsc.thesiscsc.asyncMethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import java.util.Date;

import SicsWsDomainRetrievalEntryPoint.AuthenticationToken;
import SicsWsDomainRetrievalEntryPoint.DomainObject;
import SicsWsDomainRetrievalEntryPoint.Input;
import SicsWsDomainRetrievalEntryPoint.SicsGenericInput;
import SicsWsDomainRetrievalEntryPoint.SicsLedgerRemittanceBalanceReference;
import SicsWsDomainRetrievalEntryPoint.SicsWsDomainRetrievalEntryPointBinding;
import SicsWsDomainRetrievalEntryPoint.Specification;

public class ExcecuteRetrieveObjectService extends AsyncTask<String, Void, String> {
    private Context mContext;
    SharedPreferences prefs;

    public ExcecuteRetrieveObjectService(Context context) {
        mContext = context;
    }
    @Override
    protected String doInBackground(String... arg0) {


        prefs = mContext.getSharedPreferences("credentials", Context.MODE_PRIVATE);


        SicsGenericInput param0 = new SicsGenericInput();

        AuthenticationToken token = new AuthenticationToken();

        token.userId = prefs.getString("username", "");
        token.signature = prefs.getString("signature","");
        token.expiration = new Date(prefs.getLong("exp", 0));
        param0.authenticationToken = token;

        Input param1 = new Input();

        Specification specification = new Specification();
        specification.retrieveAll = true;
        param1.specification = specification;

        SicsWsDomainRetrievalEntryPointBinding service = new SicsWsDomainRetrievalEntryPointBinding(null,"http://"+ prefs.getString("ip","") + "/SwanLake/SicsWSServlet");

        SicsLedgerRemittanceBalanceReference sicsLedgerRemittanceBalanceReference = new SicsLedgerRemittanceBalanceReference();
        sicsLedgerRemittanceBalanceReference.identifier = arg0[0];

        param1.referenceObject = sicsLedgerRemittanceBalanceReference;



        try{
            DomainObject res = service.retrieveObject(param0,param1);
            Log.d("DOMAINOBJECT", res.objectId);
        }catch (Exception e){
            Log.d("TEST", Log.getStackTraceString(e));
        }
        return "hei";
    }
}