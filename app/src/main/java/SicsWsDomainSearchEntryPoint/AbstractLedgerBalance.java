package SicsWsDomainSearchEntryPoint;

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

public class AbstractLedgerBalance extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Business Identifier, Wks ID
	*/
    public String identifier;
    
	/**
	* Former Identifier, Former ID
	*/
    public String formerIdentifier;
    
	/**
	* Legal Reporing Unit
	*/
    public SicsReportingUnitReference reportingUnit;
    
	/**
	* SubclassNumber: 225. SicsRefAccountGroup
	*/
    public SicsReferenceDataReference accountGroup;
    
	/**
	* SubclassNumber: 45. SicsRefBusinessDirection
	*                Level Of Business
	*/
    public SicsReferenceDataReference levelOfBusiness;
    
	/**
	* Accounting Year
	*/
    public Integer accountingYear;
    
	/**
	* SubclassNumber: 177. SicsRefAccountingPeriod.
	*                Accounting Period
	*/
    public SicsReferenceDataReference accountingRefPeriod;
    
	/**
	* Booking Date
	*/
    public java.util.Date dateOfBooking;
    
	/**
	* Booking Year
	*/
    public Integer bookingYear;
    
	/**
	* SubclassNumber: 10. SicsRefPeriod.
	*                Booking Period
	*/
    public SicsReferenceDataReference bookingPeriod;
    
	/**
	* Business Partner Reference (References tab)
	*/
    public String bPartnerReference;
    
	/**
	* Rebord Reference (References tab)
	*/
    public String ediRinetUniqueRebordReference;
    
	/**
	* Resett Reference (References tab)
	*/
    public String ediRinetUniqueResettReference;
    
	/**
	* Retacc Reference (References tab)
	*/
    public String ediRinetUniqueRetaccReference;

    public AbstractLedgerBalance ()
    {
    }

    public AbstractLedgerBalance (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("identifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.identifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("formerIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.formerIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.formerIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reportingUnit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reportingUnit = (SicsReportingUnitReference)__envelope.get(j,SicsReportingUnitReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("accountGroup"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accountGroup = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("levelOfBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.levelOfBusiness = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("accountingYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountingYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.accountingYear = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountingRefPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accountingRefPeriod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
                if (info.name.equals("bPartnerReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bPartnerReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.bPartnerReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ediRinetUniqueRebordReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ediRinetUniqueRebordReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.ediRinetUniqueRebordReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ediRinetUniqueResettReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ediRinetUniqueResettReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.ediRinetUniqueResettReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ediRinetUniqueRetaccReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ediRinetUniqueRetaccReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.ediRinetUniqueRetaccReference = (String)obj;
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
            return this.identifier!=null?this.identifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.formerIdentifier!=null?this.formerIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.reportingUnit!=null?this.reportingUnit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.accountGroup!=null?this.accountGroup:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.levelOfBusiness!=null?this.levelOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.accountingYear!=null?this.accountingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.accountingRefPeriod!=null?this.accountingRefPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.dateOfBooking!=null?Helper.getDateFormat().format(this.dateOfBooking):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.bookingYear!=null?this.bookingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.bookingPeriod!=null?this.bookingPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.bPartnerReference!=null?this.bPartnerReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.ediRinetUniqueRebordReference!=null?this.ediRinetUniqueRebordReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.ediRinetUniqueResettReference!=null?this.ediRinetUniqueResettReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.ediRinetUniqueRetaccReference!=null?this.ediRinetUniqueRetaccReference:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+14;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifier";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "formerIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReportingUnitReference.class;
            info.name = "reportingUnit";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accountGroup";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "levelOfBusiness";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "accountingYear";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accountingRefPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfBooking";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "bookingYear";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "bookingPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "bPartnerReference";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ediRinetUniqueRebordReference";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ediRinetUniqueResettReference";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ediRinetUniqueRetaccReference";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

