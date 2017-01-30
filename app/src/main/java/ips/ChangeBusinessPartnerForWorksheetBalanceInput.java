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

public class ChangeBusinessPartnerForWorksheetBalanceInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsLedgerBalanceReference ledgerBalanceReference;
    
    public SicsBusinessPartnerReference businessPartner;

    public ChangeBusinessPartnerForWorksheetBalanceInput ()
    {
    }

    public ChangeBusinessPartnerForWorksheetBalanceInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("ledgerBalanceReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.ledgerBalanceReference = (SicsLedgerBalanceReference)__envelope.get(j,SicsLedgerBalanceReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessPartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartner = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
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
            return ledgerBalanceReference;
        }
        if(propertyIndex==1)
        {
            return businessPartner;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsLedgerBalanceReference.class;
            info.name = "ledgerBalanceReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "businessPartner";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

