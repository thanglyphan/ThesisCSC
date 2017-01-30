package ips;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 29/01/2017
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class WorksheetLedgerEntry extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Business Worksheet : xsi type = LedgerBusiness
	*                Claim Worksheet : xsi type = LedgerClaim
	*/
    public LedgerBusiness ledger;
    
    public AccountingBalanceGroupingParameter balanceGroupingParameter;
    
    public AccountingDetailBalanceEntryList detailBalanceEntryList;

    public WorksheetLedgerEntry ()
    {
    }

    public WorksheetLedgerEntry (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                java.lang.Object obj = info.getValue(); 
                if (info.name.equals("ledger"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.ledger = (LedgerBusiness)__envelope.get(j,LedgerBusiness.class,false);
                    }
                    continue;
                }
                if (info.name.equals("balanceGroupingParameter"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.balanceGroupingParameter = (AccountingBalanceGroupingParameter)__envelope.get(j,AccountingBalanceGroupingParameter.class,false);
                    }
                    continue;
                }
                if (info.name.equals("detailBalanceEntryList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.detailBalanceEntryList = new AccountingDetailBalanceEntryList(j,__envelope);
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return ledger;
        }
        if(propertyIndex==1)
        {
            return this.balanceGroupingParameter!=null?this.balanceGroupingParameter:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.detailBalanceEntryList!=null?this.detailBalanceEntryList:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = LedgerBusiness.class;
            info.name = "ledger";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = AccountingBalanceGroupingParameter.class;
            info.name = "balanceGroupingParameter";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "detailBalanceEntryList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
