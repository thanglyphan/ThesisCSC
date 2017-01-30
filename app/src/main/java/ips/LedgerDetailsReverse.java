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

public class LedgerDetailsReverse extends TechnicalWorksheetReverse implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Identifer field should be same for all list elements.
	*/
    public LedgerDetailList ledgerDetailList=new LedgerDetailList();
    
    public java.util.Date dateOfBooking;
    
    public java.util.Date registrationTimestamp;
    
    public String comment;
    
	/**
	* Booking Year/Period column
	*/
    public SicsBookingYearPeriodReference bookingYearPeriod;
    
	/**
	* Legal Booking Year/Period column
	*/
    public SicsBookingYearPeriodReference bookingYearPeriod2;
    
	/**
	* Global Booking Year/Period column
	*/
    public SicsBookingYearPeriodReference bookingYearPeriod3;
    
	/**
	* Source Business
	*/
    public SicsInsuredPeriodReference linkInsuredPeriodToProtectedBusiness;

    public LedgerDetailsReverse ()
    {
    }

    public LedgerDetailsReverse (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("ledgerDetailList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.ledgerDetailList = new LedgerDetailList(j,__envelope);
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
                if (info.name.equals("registrationTimestamp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.registrationTimestamp = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.registrationTimestamp = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("comment"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.comment = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.comment = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bookingYearPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingYearPeriod = (SicsBookingYearPeriodReference)__envelope.get(j,SicsBookingYearPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bookingYearPeriod2"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingYearPeriod2 = (SicsBookingYearPeriodReference)__envelope.get(j,SicsBookingYearPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bookingYearPeriod3"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingYearPeriod3 = (SicsBookingYearPeriodReference)__envelope.get(j,SicsBookingYearPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("linkInsuredPeriodToProtectedBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.linkInsuredPeriodToProtectedBusiness = (SicsInsuredPeriodReference)__envelope.get(j,SicsInsuredPeriodReference.class,false);
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
            return ledgerDetailList;
        }
        if(propertyIndex==count+1)
        {
            return this.dateOfBooking!=null?Helper.getDateFormat().format(this.dateOfBooking):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.registrationTimestamp!=null?Helper.getDateTimeFormat().format(this.registrationTimestamp):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.comment!=null?this.comment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.bookingYearPeriod!=null?this.bookingYearPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.bookingYearPeriod2!=null?this.bookingYearPeriod2:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.bookingYearPeriod3!=null?this.bookingYearPeriod3:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.linkInsuredPeriodToProtectedBusiness!=null?this.linkInsuredPeriodToProtectedBusiness:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "ledgerDetailList";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfBooking";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "registrationTimestamp";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "comment";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsBookingYearPeriodReference.class;
            info.name = "bookingYearPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsBookingYearPeriodReference.class;
            info.name = "bookingYearPeriod2";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsBookingYearPeriodReference.class;
            info.name = "bookingYearPeriod3";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsInsuredPeriodReference.class;
            info.name = "linkInsuredPeriodToProtectedBusiness";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

