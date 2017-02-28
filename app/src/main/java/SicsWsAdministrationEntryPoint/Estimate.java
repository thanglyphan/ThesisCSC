package SicsWsAdministrationEntryPoint;

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
import java.math.BigInteger;

public class Estimate extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date dateOfEstimate;
    
    public SicsCurrencyReference currentCurrencyName;
    
    public BigInteger currentAmount;
    
    public SicsUserReference estimatedBy;

    public Estimate ()
    {
    }

    public Estimate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("dateOfEstimate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfEstimate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfEstimate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("currentCurrencyName"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.currentCurrencyName = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("currentAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.currentAmount = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.currentAmount = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("estimatedBy"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.estimatedBy = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
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
            return this.dateOfEstimate!=null?Helper.getDateFormat().format(this.dateOfEstimate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.currentCurrencyName!=null?this.currentCurrencyName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.currentAmount!=null?this.currentAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.estimatedBy!=null?this.estimatedBy:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfEstimate";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currentCurrencyName";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "currentAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsUserReference.class;
            info.name = "estimatedBy";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

