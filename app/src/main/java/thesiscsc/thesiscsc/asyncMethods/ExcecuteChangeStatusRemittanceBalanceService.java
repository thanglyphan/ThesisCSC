package thesiscsc.thesiscsc.asyncMethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;
import java.util.Date;

import SicsWsDomainRetrievalEntryPoint.LedgerRemittanceBalance;
import SicsWsPcAccountingEntryPoint.AuthenticationToken;
import SicsWsPcAccountingEntryPoint.ChangeStatusRemittanceBalanceInput;
import SicsWsPcAccountingEntryPoint.LedgerRemittanceBalanceChangeStatus;
import SicsWsPcAccountingEntryPoint.SicsGenericInput;
import SicsWsPcAccountingEntryPoint.SicsLedgerRemittanceBalanceReference;
import SicsWsPcAccountingEntryPoint.SicsReferenceDataReference;
import SicsWsPcAccountingEntryPoint.SicsWsPcAccountingEntryPointBinding;


public class ExcecuteChangeStatusRemittanceBalanceService extends AsyncTask<String, Void, Boolean> {
    private Context mContext;
    SharedPreferences prefs;

    public ExcecuteChangeStatusRemittanceBalanceService(Context context) {
        mContext = context;
    }
    @Override
    protected Boolean doInBackground(String... params) {


        prefs = mContext.getSharedPreferences("credentials", Context.MODE_PRIVATE);


        SicsGenericInput param0 = new SicsGenericInput();

        AuthenticationToken token = new AuthenticationToken();

        token.userId = prefs.getString("username", "");
        token.signature = prefs.getString("signature","");
        token.expiration = new Date(prefs.getLong("exp", 0));


      /*  token.userId = "AHABES";
        token.signature = "561BF86584C8DCCA6D37B56E57955B3A561004E2";
        token.expiration = new Date(2017-03-16);
        param0.authenticationToken = token;
        */

        ChangeStatusRemittanceBalanceInput param1 = new ChangeStatusRemittanceBalanceInput();

        SicsLedgerRemittanceBalanceReference sicsLedgerRemittanceBalanceReference = new SicsLedgerRemittanceBalanceReference();
        sicsLedgerRemittanceBalanceReference.identifier = "R27";



        LedgerRemittanceBalanceChangeStatus ledgerRemittanceBalanceChangeStatus = new LedgerRemittanceBalanceChangeStatus();

        SicsReferenceDataReference sicsReferenceDataReference = new SicsReferenceDataReference();
        sicsReferenceDataReference.code = "FINAL";
        sicsReferenceDataReference.subclassNumber = 179;

        ledgerRemittanceBalanceChangeStatus.status = sicsReferenceDataReference;
        ledgerRemittanceBalanceChangeStatus.valueDate = new Date(2017-03-15);
        ledgerRemittanceBalanceChangeStatus.dateOfBooking = new Date(2017-03-15);

        param1.ledgerRemittanceBalanceReference = sicsLedgerRemittanceBalanceReference;
        param1.ledgerRemittanceBalance = ledgerRemittanceBalanceChangeStatus;


        SicsWsPcAccountingEntryPointBinding service = new SicsWsPcAccountingEntryPointBinding(null, "http://" + prefs.getString("ip", "") + "/SwanLake/SicsWSServlet");

        try{
            service.changeStatusRemittanceBalance(param0,param1);
            return true;
        }catch (Exception e){
            Log.d("remstatus", Log.getStackTraceString(e));
            return false;
        }
    }
}


