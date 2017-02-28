package SicsWsTaskManagementEntryPoint;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 30/01/2017
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class ExchangeRateBasis extends AbstractExchangeRateBasis implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date exchangeRateDate;
    
    public SicsReferenceDataReference exchangeRatePeriod;
    
    public Integer exchangeRateYear;
    
    public Boolean useInceptionRate;
    
    public Boolean useMostRecentDailyRate;

    public ExchangeRateBasis ()
    {
    }

    public ExchangeRateBasis (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("exchangeRateDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.exchangeRateDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.exchangeRateDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("exchangeRatePeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.exchangeRatePeriod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("exchangeRateYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.exchangeRateYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.exchangeRateYear = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("useInceptionRate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.useInceptionRate = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.useInceptionRate = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("useMostRecentDailyRate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.useMostRecentDailyRate = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.useMostRecentDailyRate = (Boolean)obj;
                        }
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
            return this.exchangeRateDate!=null?Helper.getDateFormat().format(this.exchangeRateDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.exchangeRatePeriod!=null?this.exchangeRatePeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.exchangeRateYear!=null?this.exchangeRateYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.useInceptionRate!=null?this.useInceptionRate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.useMostRecentDailyRate!=null?this.useMostRecentDailyRate:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "exchangeRateDate";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "exchangeRatePeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "exchangeRateYear";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "useInceptionRate";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "useMostRecentDailyRate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
