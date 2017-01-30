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
import java.math.BigDecimal;

public class LedgerDetail extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public SicsAccountingEntryCodeReference entryCode;
    
    public BigDecimal amount;
    
    public SicsInsuredPeriodReference insuredPeriod;
    
    public String sourceWsId;
    
    public String targetWsId;
    
    public Integer originalAccountingYear;
    
	/**
	* SubclassNumber: 177. SicsRefAccountingPeriod.
	*/
    public SicsReferenceDataReference originalAccountingPeriod;
    
	/**
	* UwYR
	*/
    public Integer underwritingYear;
    
	/**
	* Original UwYR
	*/
    public Integer originalUnderwritingYear;
    
	/**
	* OccYR
	*/
    public Integer occurrenceYear;
    
	/**
	* Released
	*                SubclassNumber: 1018. SicsRefReleasedIndicator.
	*/
    public SicsReferenceDataReference releasedIndicator;
    
	/**
	* Section
	*/
    public String sectionLongDisplayName;
    
	/**
	* AccClassification
	*/
    public String classificationName;
    
	/**
	* AccPeriod From-To
	*/
    public String accountingPeriodAsString;
    
	/**
	* Claim ID
	*/
    public String claimIdentifier;
    
	/**
	* Transferred to GL
	*/
    public java.util.Date dateOfTransferToGeneralLedger;
    
	/**
	* Reporting Classification
	*/
    public String reportingClassificationAsPrintString;
    
	/**
	* SubclassNumber: 280. SicsRefReinsuranceCategory.
	*/
    public SicsReferenceDataReference reinsuranceCategory;
    
	/**
	* Notes
	*/
    public String description;
    
    public Boolean isRetroceded;
    
    public String businessIdOfAssumedBusiness;
    
    public SicsCountryReference taxCountry;
    
    public BigDecimal taxPercentage;
    
	/**
	* SubclassNumber: 1101. SicsRefOriginalClassOfBusiness.
	*/
    public SicsReferenceDataReference originalClassOfBusiness;
    
    public SicsBusinessPartnerReference originalResponsiblePartner;
    
    public SicsBusinessPartnerReference originalBaseCompany;
    
    public SicsHeadlineLossReference headlineLoss;

    public LedgerDetail ()
    {
    }

    public LedgerDetail (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("insuredPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredPeriod = (SicsInsuredPeriodReference)__envelope.get(j,SicsInsuredPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("sourceWsId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sourceWsId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.sourceWsId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("targetWsId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.targetWsId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.targetWsId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("originalAccountingYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.originalAccountingYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.originalAccountingYear = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("originalAccountingPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.originalAccountingPeriod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("underwritingYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.underwritingYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.underwritingYear = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("originalUnderwritingYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.originalUnderwritingYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.originalUnderwritingYear = (Integer)obj;
                        }
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
                if (info.name.equals("releasedIndicator"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.releasedIndicator = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("sectionLongDisplayName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sectionLongDisplayName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.sectionLongDisplayName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("classificationName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.classificationName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.classificationName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountingPeriodAsString"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountingPeriodAsString = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.accountingPeriodAsString = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.claimIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateOfTransferToGeneralLedger"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfTransferToGeneralLedger = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfTransferToGeneralLedger = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reportingClassificationAsPrintString"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reportingClassificationAsPrintString = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.reportingClassificationAsPrintString = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reinsuranceCategory"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reinsuranceCategory = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("description"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.description = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.description = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isRetroceded"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isRetroceded = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isRetroceded = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessIdOfAssumedBusiness"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessIdOfAssumedBusiness = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessIdOfAssumedBusiness = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("taxCountry"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.taxCountry = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("taxPercentage"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.taxPercentage = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.taxPercentage = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("originalClassOfBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.originalClassOfBusiness = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("originalResponsiblePartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.originalResponsiblePartner = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("originalBaseCompany"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.originalBaseCompany = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
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
            return this.entryCode!=null?this.entryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.amount!=null?this.amount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.insuredPeriod!=null?this.insuredPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.sourceWsId!=null?this.sourceWsId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.targetWsId!=null?this.targetWsId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.originalAccountingYear!=null?this.originalAccountingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.originalAccountingPeriod!=null?this.originalAccountingPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.underwritingYear!=null?this.underwritingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.originalUnderwritingYear!=null?this.originalUnderwritingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.occurrenceYear!=null?this.occurrenceYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.releasedIndicator!=null?this.releasedIndicator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.sectionLongDisplayName!=null?this.sectionLongDisplayName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.classificationName!=null?this.classificationName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.accountingPeriodAsString!=null?this.accountingPeriodAsString:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.claimIdentifier!=null?this.claimIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.dateOfTransferToGeneralLedger!=null?Helper.getDateFormat().format(this.dateOfTransferToGeneralLedger):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.reportingClassificationAsPrintString!=null?this.reportingClassificationAsPrintString:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.reinsuranceCategory!=null?this.reinsuranceCategory:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.description!=null?this.description:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.isRetroceded!=null?this.isRetroceded:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.businessIdOfAssumedBusiness!=null?this.businessIdOfAssumedBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.taxCountry!=null?this.taxCountry:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+22)
        {
            return this.taxPercentage!=null?this.taxPercentage.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+23)
        {
            return this.originalClassOfBusiness!=null?this.originalClassOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+24)
        {
            return this.originalResponsiblePartner!=null?this.originalResponsiblePartner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+25)
        {
            return this.originalBaseCompany!=null?this.originalBaseCompany:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+26)
        {
            return this.headlineLoss!=null?this.headlineLoss:SoapPrimitive.NullSkip;
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
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "entryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amount";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsInsuredPeriodReference.class;
            info.name = "insuredPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sourceWsId";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "targetWsId";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "originalAccountingYear";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "originalAccountingPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "underwritingYear";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "originalUnderwritingYear";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "occurrenceYear";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "releasedIndicator";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sectionLongDisplayName";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "classificationName";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "accountingPeriodAsString";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfTransferToGeneralLedger";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reportingClassificationAsPrintString";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "reinsuranceCategory";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "description";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isRetroceded";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessIdOfAssumedBusiness";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = SicsCountryReference.class;
            info.name = "taxCountry";
            info.namespace= "";
        }
        if(propertyIndex==count+22)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "taxPercentage";
            info.namespace= "";
        }
        if(propertyIndex==count+23)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "originalClassOfBusiness";
            info.namespace= "";
        }
        if(propertyIndex==count+24)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "originalResponsiblePartner";
            info.namespace= "";
        }
        if(propertyIndex==count+25)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "originalBaseCompany";
            info.namespace= "";
        }
        if(propertyIndex==count+26)
        {
            info.type = SicsHeadlineLossReference.class;
            info.name = "headlineLoss";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

