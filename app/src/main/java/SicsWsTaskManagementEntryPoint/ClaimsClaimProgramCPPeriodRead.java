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
import java.math.BigInteger;

public class ClaimsClaimProgramCPPeriodRead extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date cpPeriodFrom;
    
    public java.util.Date cpPeriodTo;
    
    public Boolean fguIndicator;
    
	/**
	* SubclassNumber: 01036.
	*/
    public SicsReferenceDataReference exclusion;
    
	/**
	* SubclassNumber: 01037.
	*/
    public SicsReferenceDataReference exclusionInsuredPeriod;
    
    public java.util.Date gnpiFrom;
    
    public java.util.Date gnpiTo;
    
	/**
	* SubclassNumber: 01014.
	*/
    public SicsReferenceDataReference gnpiCode;
    
	/**
	* SubclassNumber: 01015.
	*/
    public SicsReferenceDataReference gnpiCode1;
    
    public SicsMonetaryAmountReference gnpiAmount;
    
    public BigInteger gnpiNumber;
    
	/**
	* SubclassNumber: 01016.
	*/
    public SicsReferenceDataReference gnpiDescription;
    
    public String note;
    
    public BookingControlOnScopeOfCoverList bookingControlOnScopeOfCoverList;
    
    public SicsUserReference responsibleUser;

    public ClaimsClaimProgramCPPeriodRead ()
    {
    }

    public ClaimsClaimProgramCPPeriodRead (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("cpPeriodFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cpPeriodFrom = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.cpPeriodFrom = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("cpPeriodTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cpPeriodTo = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.cpPeriodTo = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("fguIndicator"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fguIndicator = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.fguIndicator = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("exclusion"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.exclusion = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("exclusionInsuredPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.exclusionInsuredPeriod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("gnpiFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.gnpiFrom = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.gnpiFrom = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("gnpiTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.gnpiTo = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.gnpiTo = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("gnpiCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.gnpiCode = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("gnpiCode1"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.gnpiCode1 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("gnpiAmount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.gnpiAmount = (SicsMonetaryAmountReference)__envelope.get(j,SicsMonetaryAmountReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("gnpiNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.gnpiNumber = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.gnpiNumber = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("gnpiDescription"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.gnpiDescription = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("note"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.note = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.note = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bookingControlOnScopeOfCoverList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingControlOnScopeOfCoverList = new BookingControlOnScopeOfCoverList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("responsibleUser"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.responsibleUser = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
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
            return this.cpPeriodFrom!=null?Helper.getDateFormat().format(this.cpPeriodFrom):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.cpPeriodTo!=null?Helper.getDateFormat().format(this.cpPeriodTo):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.fguIndicator!=null?this.fguIndicator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.exclusion!=null?this.exclusion:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.exclusionInsuredPeriod!=null?this.exclusionInsuredPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.gnpiFrom!=null?Helper.getDateFormat().format(this.gnpiFrom):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.gnpiTo!=null?Helper.getDateFormat().format(this.gnpiTo):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.gnpiCode!=null?this.gnpiCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.gnpiCode1!=null?this.gnpiCode1:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.gnpiAmount!=null?this.gnpiAmount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.gnpiNumber!=null?this.gnpiNumber.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.gnpiDescription!=null?this.gnpiDescription:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.bookingControlOnScopeOfCoverList!=null?this.bookingControlOnScopeOfCoverList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.responsibleUser!=null?this.responsibleUser:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+15;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cpPeriodFrom";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cpPeriodTo";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "fguIndicator";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "exclusion";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "exclusionInsuredPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "gnpiFrom";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "gnpiTo";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "gnpiCode";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "gnpiCode1";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = SicsMonetaryAmountReference.class;
            info.name = "gnpiAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "gnpiNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "gnpiDescription";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "bookingControlOnScopeOfCoverList";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = SicsUserReference.class;
            info.name = "responsibleUser";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

