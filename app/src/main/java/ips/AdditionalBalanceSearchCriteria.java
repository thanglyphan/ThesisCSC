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

public class AdditionalBalanceSearchCriteria extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public Boolean isPartiallySettled;
    
    public Boolean isSettled;
    
    public Boolean isUnsettled;
    
    public Boolean isWrittenOff;
    
    public java.util.Date dateOfBookingFrom;
    
    public java.util.Date dateOfBookingTo;
    
    public Integer fromBookingYear;
    
    public Integer toBookingYear;
    
	/**
	* SubclassNumber: 10. SicsRefPeriod.
	*                 Booking Period
	*/
    public SicsReferenceDataReference bookingPeriodFrom;
    
	/**
	* SubclassNumber: 10. SicsRefPeriod.
	*                 Booking Period
	*/
    public SicsReferenceDataReference bookingPeriodTo;
    
    public Integer accountingYearFrom;
    
    public Integer accountingYearTo;
    
	/**
	* SubclassNumber: 177. SicsRefAccountingPeriod.
	*                 Accounting Period
	*/
    public SicsReferenceDataReference accountingRefPeriodFrom;
    
	/**
	* SubclassNumber: 177. SicsRefAccountingPeriod.
	*                 Accounting Period
	*/
    public SicsReferenceDataReference accountingRefPeriodTo;

    public AdditionalBalanceSearchCriteria ()
    {
    }

    public AdditionalBalanceSearchCriteria (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("isPartiallySettled"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isPartiallySettled = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isPartiallySettled = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isSettled"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isSettled = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isSettled = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isUnsettled"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isUnsettled = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isUnsettled = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isWrittenOff"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isWrittenOff = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isWrittenOff = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateOfBookingFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfBookingFrom = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfBookingFrom = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateOfBookingTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfBookingTo = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfBookingTo = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("fromBookingYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fromBookingYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.fromBookingYear = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("toBookingYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.toBookingYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.toBookingYear = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bookingPeriodFrom"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingPeriodFrom = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bookingPeriodTo"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingPeriodTo = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("accountingYearFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountingYearFrom = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.accountingYearFrom = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountingYearTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountingYearTo = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.accountingYearTo = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountingRefPeriodFrom"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accountingRefPeriodFrom = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("accountingRefPeriodTo"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accountingRefPeriodTo = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
            return this.isPartiallySettled!=null?this.isPartiallySettled:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.isSettled!=null?this.isSettled:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.isUnsettled!=null?this.isUnsettled:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.isWrittenOff!=null?this.isWrittenOff:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.dateOfBookingFrom!=null?Helper.getDateFormat().format(this.dateOfBookingFrom):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.dateOfBookingTo!=null?Helper.getDateFormat().format(this.dateOfBookingTo):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.fromBookingYear!=null?this.fromBookingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.toBookingYear!=null?this.toBookingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.bookingPeriodFrom!=null?this.bookingPeriodFrom:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.bookingPeriodTo!=null?this.bookingPeriodTo:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.accountingYearFrom!=null?this.accountingYearFrom:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.accountingYearTo!=null?this.accountingYearTo:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.accountingRefPeriodFrom!=null?this.accountingRefPeriodFrom:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.accountingRefPeriodTo!=null?this.accountingRefPeriodTo:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 14;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isPartiallySettled";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isSettled";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isUnsettled";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isWrittenOff";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfBookingFrom";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfBookingTo";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "fromBookingYear";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "toBookingYear";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "bookingPeriodFrom";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "bookingPeriodTo";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "accountingYearFrom";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "accountingYearTo";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accountingRefPeriodFrom";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accountingRefPeriodTo";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

