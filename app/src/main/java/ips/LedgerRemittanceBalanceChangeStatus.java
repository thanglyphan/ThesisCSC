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

public class LedgerRemittanceBalanceChangeStatus extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public SicsBookingYearPeriodReference bookingYearAndPeriod;
    
	/**
	* SubclassNumber: 179. SicsRefAccountingRemittanceStatus. This element is mandatory for Copy Remittance Worksheet.
	*/
    public SicsReferenceDataReference status;
    
    public java.util.Date valueDate;
    
    public java.util.Date dateOfBooking;
    
    public Boolean isAccepted;

    public LedgerRemittanceBalanceChangeStatus ()
    {
    }

    public LedgerRemittanceBalanceChangeStatus (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("bookingYearAndPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingYearAndPeriod = (SicsBookingYearPeriodReference)__envelope.get(j,SicsBookingYearPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("status"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.status = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("valueDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.valueDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.valueDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateOfBooking"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfBooking = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfBooking = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isAccepted"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAccepted = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAccepted = (Boolean)obj;
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
            return this.bookingYearAndPeriod!=null?this.bookingYearAndPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.status!=null?this.status:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.valueDate!=null?Helper.getDateFormat().format(this.valueDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.dateOfBooking!=null?Helper.getDateFormat().format(this.dateOfBooking):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.isAccepted!=null?this.isAccepted:SoapPrimitive.NullSkip;
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
            info.type = SicsBookingYearPeriodReference.class;
            info.name = "bookingYearAndPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "status";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "valueDate";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfBooking";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAccepted";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

