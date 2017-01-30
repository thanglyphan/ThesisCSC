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

public class AbstractPolicyAccountingDetail extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public Boolean isEstimate;
    
    public java.util.Date dueDate;
    
    public SicsCurrencyReference currency;
    
    public Integer bookingYear;
    
	/**
	* SubclassNumber: 10. SicsRefPeriod
	*/
    public SicsReferenceDataReference bookingPeriod;
    
    public SicsWsDatespanReference accountingPeriod;

    public AbstractPolicyAccountingDetail ()
    {
    }

    public AbstractPolicyAccountingDetail (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("isEstimate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isEstimate = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isEstimate = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dueDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dueDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dueDate = (java.util.Date)obj;
                        }
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
                if (info.name.equals("bookingYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bookingYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.bookingYear = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bookingPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingPeriod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("accountingPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accountingPeriod = (SicsWsDatespanReference)__envelope.get(j,SicsWsDatespanReference.class,false);
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
            return this.isEstimate!=null?this.isEstimate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.dueDate!=null?Helper.getDateFormat().format(this.dueDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return currency;
        }
        if(propertyIndex==count+3)
        {
            return this.bookingYear!=null?this.bookingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.bookingPeriod!=null?this.bookingPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.accountingPeriod!=null?this.accountingPeriod:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isEstimate";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dueDate";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "bookingYear";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "bookingPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsWsDatespanReference.class;
            info.name = "accountingPeriod";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
