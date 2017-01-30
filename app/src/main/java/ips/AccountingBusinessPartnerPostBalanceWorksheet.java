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

public class AccountingBusinessPartnerPostBalanceWorksheet extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Responsible BP
	*/
    public SicsBusinessPartnerReference secondaryBusinessPartner;
    
	/**
	* Defaulted to todays date
	*                       received
	*/
    public java.util.Date receivedDate;
    
	/**
	* Defaulted to todays date
	*                       Booked
	*/
    public java.util.Date dateOfBooking;
    
    public LedgerTechnicalBalancePostModeList ledgerTechnicalBalancePostModeList=new LedgerTechnicalBalancePostModeList();
    
	/**
	* Defaulted to todays date
	*                       Registered
	*/
    public java.util.Date registrationDate;
    
	/**
	* -by
	*/
    public SicsUserReference registeredBy;

    public AccountingBusinessPartnerPostBalanceWorksheet ()
    {
    }

    public AccountingBusinessPartnerPostBalanceWorksheet (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("secondaryBusinessPartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.secondaryBusinessPartner = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("receivedDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.receivedDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.receivedDate = (java.util.Date)obj;
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
                if (info.name.equals("ledgerTechnicalBalancePostModeList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.ledgerTechnicalBalancePostModeList = new LedgerTechnicalBalancePostModeList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("registrationDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.registrationDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.registrationDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("registeredBy"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.registeredBy = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
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
            return secondaryBusinessPartner;
        }
        if(propertyIndex==count+1)
        {
            return this.receivedDate!=null?Helper.getDateFormat().format(this.receivedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.dateOfBooking!=null?Helper.getDateFormat().format(this.dateOfBooking):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return ledgerTechnicalBalancePostModeList;
        }
        if(propertyIndex==count+4)
        {
            return this.registrationDate!=null?Helper.getDateFormat().format(this.registrationDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return registeredBy;
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
            info.type = SicsBusinessPartnerReference.class;
            info.name = "secondaryBusinessPartner";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "receivedDate";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfBooking";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "ledgerTechnicalBalancePostModeList";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "registrationDate";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsUserReference.class;
            info.name = "registeredBy";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

