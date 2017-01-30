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
import java.math.BigDecimal;

public class LedgerDetailLight extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public SicsLightScopeOfCoverReference lightScopeOfCoverReference;
    
    public SicsLightClaimReference claim;
    
    public SicsHeadlineLossReference headlineLoss;
    
    public SicsBusinessPartnerReference baseCompany;
    
    public SicsClassificationForLightPolicyReference classification;
    
    public Integer accountingYear=0;
    
    public String identifier;
    
    public String title;
    
    public Boolean isEstimate=false;
    
    public Boolean isAlreadyRetroceded=false;
    
    public Boolean isToBeCeded;
    
    public SicsWsDatespanReference accountingPeriod;
    
	/**
	* SubclassNumber: 177. SicsRefAccountingPeriod.
	*/
    public SicsReferenceDataReference accountingRefPeriod;
    
    public java.util.Date dateOfBooking;
    
    public Integer bookingYear=0;
    
	/**
	* SubclassNumber: 10. SicsRefPeriod.
	*/
    public SicsReferenceDataReference bookingPeriod;
    
    public Integer bookingYear2;
    
	/**
	* SubclassNumber: 10. SicsRefPeriod.
	*/
    public SicsReferenceDataReference bookingPeriod2;
    
    public Integer bookingYear3;
    
	/**
	* SubclassNumber: 10. SicsRefPeriod.
	*/
    public SicsReferenceDataReference bookingPeriod3;
    
    public Integer occurrenceYear;
    
    public java.util.Date asOfDate;
    
    public SicsCurrencyReference currency;
    
    public SicsAccountingEntryCodeReference entryCode;
    
    public BigDecimal amount;
    
    public BigDecimal newAmount;
    
    public String comment;

    public LedgerDetailLight ()
    {
    }

    public LedgerDetailLight (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("lightScopeOfCoverReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lightScopeOfCoverReference = (SicsLightScopeOfCoverReference)__envelope.get(j,SicsLightScopeOfCoverReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claim"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claim = (SicsLightClaimReference)__envelope.get(j,SicsLightClaimReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("headlineLoss"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.headlineLoss = (SicsHeadlineLossReference)__envelope.get(j,SicsHeadlineLossReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("baseCompany"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.baseCompany = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("classification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.classification = (SicsClassificationForLightPolicyReference)__envelope.get(j,SicsClassificationForLightPolicyReference.class,false);
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
                if (info.name.equals("title"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.title = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.title = (String)obj;
                        }
                    }
                    continue;
                }
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
                if (info.name.equals("isAlreadyRetroceded"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAlreadyRetroceded = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAlreadyRetroceded = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isToBeCeded"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isToBeCeded = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isToBeCeded = (Boolean)obj;
                        }
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
                if (info.name.equals("bookingYear2"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bookingYear2 = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.bookingYear2 = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bookingPeriod2"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingPeriod2 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bookingYear3"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bookingYear3 = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.bookingYear3 = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bookingPeriod3"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingPeriod3 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("occurrenceYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.occurrenceYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.occurrenceYear = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("asOfDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.asOfDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.asOfDate = (java.util.Date)obj;
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
                if (info.name.equals("entryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.entryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("amount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.amount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("newAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.newAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.newAmount = (BigDecimal)obj;
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
            return lightScopeOfCoverReference;
        }
        if(propertyIndex==count+1)
        {
            return this.claim!=null?this.claim:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.headlineLoss!=null?this.headlineLoss:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return baseCompany;
        }
        if(propertyIndex==count+4)
        {
            return this.classification!=null?this.classification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return accountingYear;
        }
        if(propertyIndex==count+6)
        {
            return identifier;
        }
        if(propertyIndex==count+7)
        {
            return this.title!=null?this.title:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return isEstimate;
        }
        if(propertyIndex==count+9)
        {
            return isAlreadyRetroceded;
        }
        if(propertyIndex==count+10)
        {
            return this.isToBeCeded!=null?this.isToBeCeded:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.accountingPeriod!=null?this.accountingPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return accountingRefPeriod;
        }
        if(propertyIndex==count+13)
        {
            return this.dateOfBooking!=null?Helper.getDateFormat().format(this.dateOfBooking):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return bookingYear;
        }
        if(propertyIndex==count+15)
        {
            return bookingPeriod;
        }
        if(propertyIndex==count+16)
        {
            return this.bookingYear2!=null?this.bookingYear2:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.bookingPeriod2!=null?this.bookingPeriod2:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.bookingYear3!=null?this.bookingYear3:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.bookingPeriod3!=null?this.bookingPeriod3:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.occurrenceYear!=null?this.occurrenceYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.asOfDate!=null?Helper.getDateFormat().format(this.asOfDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+22)
        {
            return currency;
        }
        if(propertyIndex==count+23)
        {
            return entryCode;
        }
        if(propertyIndex==count+24)
        {
            return this.amount!=null?this.amount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+25)
        {
            return this.newAmount!=null?this.newAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+26)
        {
            return this.comment!=null?this.comment:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+27;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsLightScopeOfCoverReference.class;
            info.name = "lightScopeOfCoverReference";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsLightClaimReference.class;
            info.name = "claim";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsHeadlineLossReference.class;
            info.name = "headlineLoss";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "baseCompany";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsClassificationForLightPolicyReference.class;
            info.name = "classification";
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifier";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "title";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isEstimate";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAlreadyRetroceded";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isToBeCeded";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = SicsWsDatespanReference.class;
            info.name = "accountingPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accountingRefPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfBooking";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "bookingYear";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "bookingPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "bookingYear2";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "bookingPeriod2";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "bookingYear3";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "bookingPeriod3";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "occurrenceYear";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "asOfDate";
            info.namespace= "";
        }
        if(propertyIndex==count+22)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==count+23)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "entryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+24)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amount";
            info.namespace= "";
        }
        if(propertyIndex==count+25)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "newAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+26)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "comment";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
