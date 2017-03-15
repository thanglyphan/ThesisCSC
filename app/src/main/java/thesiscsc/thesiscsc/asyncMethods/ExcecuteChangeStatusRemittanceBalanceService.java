package thesiscsc.thesiscsc.asyncMethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    String identifier;

    public ExcecuteChangeStatusRemittanceBalanceService(Context context, String identifier) {
        mContext = context;
        this.identifier = identifier;
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

        Log.d("remstatus",token.userId);
        Log.d("remstatus",token.signature);
        Log.d("remstatus",token.expiration + "");

        ChangeStatusRemittanceBalanceInput param1 = new ChangeStatusRemittanceBalanceInput();

        SicsLedgerRemittanceBalanceReference sicsLedgerRemittanceBalanceReference = new SicsLedgerRemittanceBalanceReference();
        sicsLedgerRemittanceBalanceReference.identifier = identifier;



        LedgerRemittanceBalanceChangeStatus ledgerRemittanceBalanceChangeStatus = new LedgerRemittanceBalanceChangeStatus();

        SicsReferenceDataReference sicsReferenceDataReference = new SicsReferenceDataReference();
        sicsReferenceDataReference.code = "FINAL";
        sicsReferenceDataReference.subclassNumber = 179;

        ledgerRemittanceBalanceChangeStatus.status = sicsReferenceDataReference;


        ledgerRemittanceBalanceChangeStatus.valueDate = new Date();
        ledgerRemittanceBalanceChangeStatus.dateOfBooking = new Date();

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


