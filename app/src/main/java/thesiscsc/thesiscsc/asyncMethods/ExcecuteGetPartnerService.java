package thesiscsc.thesiscsc.asyncMethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.util.RangeValueIterator;
import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;
import java.util.Date;

import SicsWsDomainRetrievalEntryPoint.AuthenticationToken;
import SicsWsDomainRetrievalEntryPoint.DomainObject;
import SicsWsDomainRetrievalEntryPoint.ElementSpecification;
import SicsWsDomainRetrievalEntryPoint.Input;
import SicsWsDomainRetrievalEntryPoint.LedgerRemittanceBalance;
import SicsWsDomainRetrievalEntryPoint.SicsGenericInput;
import SicsWsDomainRetrievalEntryPoint.SicsLedgerRemittanceBalanceReference;
import SicsWsDomainRetrievalEntryPoint.SicsWsDomainRetrievalEntryPointBinding;
import SicsWsDomainRetrievalEntryPoint.Specification;

public class ExcecuteGetPartnerService extends AsyncTask<String, Void, LedgerRemittanceBalance> {
    private Context mContext;
    SharedPreferences prefs;

    public ExcecuteGetPartnerService(Context context) {
        mContext = context;
    }


    @Override
    protected LedgerRemittanceBalance doInBackground(String... arg0) {


        prefs = mContext.getSharedPreferences("credentials", Context.MODE_PRIVATE);


        SicsGenericInput param0 = new SicsGenericInput();

        AuthenticationToken token = new AuthenticationToken();

        token.userId = prefs.getString("username", "");
        token.signature = prefs.getString("signature","");
        token.expiration = new Date(prefs.getLong("exp", 0));
        param0.authenticationToken = token;

        Input param1 = new Input();

        Specification specification = new Specification();
        specification.retrieveAll = false;

        ElementSpecification one = new ElementSpecification();
        one.name = "baseCompanyName";
        ElementSpecification two = new ElementSpecification();
        two.name = "businessPartnerName";
        ElementSpecification three = new ElementSpecification();
        three.name = "payeePartnerName";
        ElementSpecification four = new ElementSpecification();
        four.name = "secondaryBusinessPartnerName";

        ArrayList<ElementSpecification> eleArray = new ArrayList<>();
        eleArray.add(one);
        eleArray.add(two);
        eleArray.add(three);
        eleArray.add(four);

        specification.elementSpecification = eleArray;

        param1.specification = specification;

        SicsWsDomainRetrievalEntryPointBinding service = new SicsWsDomainRetrievalEntryPointBinding(null,"http://"+ prefs.getString("ip","") + "/SwanLake/SicsWSServlet");

        SicsLedgerRemittanceBalanceReference sicsLedgerRemittanceBalanceReference = new SicsLedgerRemittanceBalanceReference();
        sicsLedgerRemittanceBalanceReference.identifier = arg0[0];

        param1.referenceObject = sicsLedgerRemittanceBalanceReference;



        try{
            LedgerRemittanceBalance ledgerRemittanceBalance =  (LedgerRemittanceBalance) service.retrieveObject(param0,param1);

            return ledgerRemittanceBalance;
        }catch (Exception e){
            Log.d("TEST", Log.getStackTraceString(e));
        }
        return null;
    }
}