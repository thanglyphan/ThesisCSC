package domain;

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

public class LedgerBusiness extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* business
	* 							This field is mandatory for technical worksheet not for Claim worksheet.
	* 						    This field will never be accessed in Claim worksheet
	* 							as business will be taken from claimToSoc.
	*/
    public SicsBusinessReference business;
    
	/**
	* currency
	*/
    public SicsCurrencyReference currency;

    public LedgerBusiness ()
    {
    }

    public LedgerBusiness (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
	    super(paramObj, __envelope);
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
                if (info.name.equals("business"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.business = (SicsBusinessReference)__envelope.get(j,SicsBusinessReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("currency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.currency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return this.business!=null?this.business:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return currency;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsBusinessReference.class;
            info.name = "business";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

