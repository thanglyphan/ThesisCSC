package SicsWsPcAccountingEntryPoint;

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
import java.math.BigDecimal;

public class LedgerRemittanceBalanceCreate extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 179. SicsRefAccountingRemittanceStatus. This element is mandatory for Copy Remittance Worksheet.
	*/
    public SicsReferenceDataReference status;
    
    public java.util.Date valueDate;
    
    public java.util.Date dateOfBooking;
    
    public SicsBookingYearPeriodReference bookingYearAndPeriod;
    
	/**
	* If isPaid is set false this means it is received.
	*/
    public Boolean isPaid=false;
    
	/**
	* SubclassNumber: 175. Code: CHECK ,CHECK2 ,INT ,EXTERNAL ,WIRE ,WIRE2 ,WRITE_OFF ,AOTO. SicsRefAccountingRemittanceType.
	*/
    public SicsReferenceDataReference remittanceType;
    
    public String checkNumber;
    
    public SicsCurrencyReference bankAccountCurrency;
    
    public SicsCurrencyReference currency;
    
    public BigDecimal originalAmount;
    
    public SicsBankAccountReference bankAccount;
    
    public BigDecimal bankAccountAmount;
    
    public SicsBusinessPartnerReference baseCompany;
    
    public SicsReportingUnitReference reportingUnit;
    
    public SicsCurrencyReference bankChargeCurrency;
    
    public BigDecimal bankChargeAmount;
    
    public java.util.Date dueDate;
    
    public java.util.Date accountingDocumentReceivedDate;
    
    public SicsBusinessPartnerReference businessPartner;
    
    public SicsReportingUnitReference paymentPartnerReportingUnit;
    
    public Address paymentPartnersAddress;
    
	/**
	* This Element is Mandatory if the new remittance direction is Paid (the balance amount is positive), the Payment Type  is Wire and the Status is Final .
	*/
    public SicsBankAccountReference partnersBankAccount;
    
    public SicsBankAccountReference intermediaryBankAccount;
    
    public String businessPartnerReference;
    
	/**
	* Either both payeePartner and payeeAddress should be present in the input or none of them.
	*/
    public SicsPartyReference payeePartner;
    
	/**
	* Either both payeePartner and payeeAddress should be present in the input or none of them.
	*/
    public Address payeeAddress;
    
	/**
	* If payeePartner and payeeAddress are present in input then attentionLine may be present else it should not be given in the input.
	*/
    public String attentionLine;
    
	/**
	* SubclassNumber: 415. SicsRefRemittanceClassification.
	*/
    public SicsReferenceDataReference remittanceClassification;
    
	/**
	* SubclassNumber: 1099. SicsRefRemittanceClassification2.
	*/
    public SicsReferenceDataReference remittanceClassification2;
    
	/**
	* SubclassNumber: 1100. SicsRefRemittanceClassification3.
	*/
    public SicsReferenceDataReference remittanceClassification3;
    
    public String additionalPartnersRef;
    
    public String otherReference;
    
    public String outwardCedentsContractReference;
    
	/**
	* SubclassNumber: 416. SicsRefGeneralLedgerAccount.
	*/
    public SicsReferenceDataReference generalLedgerAccount;
    
    public SicsInsuredPeriodReference insuredPeriod;
    
    public String note;
    
    public SicsBusinessPartnerReference responsibleBusinessPartner;
    
	/**
	* SubclassNumber: 595. SicsRefAccountingLedgerRemittanceLevelOfBusinessIndicator.
	*/
    public SicsReferenceDataReference direction;
    
    public SicsLedgerBalanceLinkToRemittanceReference linkToLedgerBalance;

    public LedgerRemittanceBalanceCreate ()
    {
    }

    public LedgerRemittanceBalanceCreate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("bookingYearAndPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingYearAndPeriod = (SicsBookingYearPeriodReference)__envelope.get(j,SicsBookingYearPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("isPaid"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isPaid = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isPaid = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("remittanceType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.remittanceType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("checkNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.checkNumber = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.checkNumber = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bankAccountCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bankAccountCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
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
                if (info.name.equals("originalAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.originalAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.originalAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bankAccount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bankAccount = (SicsBankAccountReference)__envelope.get(j,SicsBankAccountReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bankAccountAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bankAccountAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.bankAccountAmount = (BigDecimal)obj;
                        }
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
                if (info.name.equals("reportingUnit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reportingUnit = (SicsReportingUnitReference)__envelope.get(j,SicsReportingUnitReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bankChargeCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bankChargeCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bankChargeAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bankChargeAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.bankChargeAmount = (BigDecimal)obj;
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
                if (info.name.equals("accountingDocumentReceivedDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountingDocumentReceivedDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.accountingDocumentReceivedDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessPartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartner = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paymentPartnerReportingUnit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paymentPartnerReportingUnit = (SicsReportingUnitReference)__envelope.get(j,SicsReportingUnitReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paymentPartnersAddress"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paymentPartnersAddress = (Address)__envelope.get(j,Address.class,false);
                    }
                    continue;
                }
                if (info.name.equals("partnersBankAccount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.partnersBankAccount = (SicsBankAccountReference)__envelope.get(j,SicsBankAccountReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("intermediaryBankAccount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.intermediaryBankAccount = (SicsBankAccountReference)__envelope.get(j,SicsBankAccountReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessPartnerReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessPartnerReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("payeePartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.payeePartner = (SicsPartyReference)__envelope.get(j,SicsPartyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("payeeAddress"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.payeeAddress = (Address)__envelope.get(j,Address.class,false);
                    }
                    continue;
                }
                if (info.name.equals("attentionLine"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.attentionLine = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.attentionLine = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("remittanceClassification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.remittanceClassification = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("remittanceClassification2"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.remittanceClassification2 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("remittanceClassification3"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.remittanceClassification3 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("additionalPartnersRef"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.additionalPartnersRef = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.additionalPartnersRef = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("otherReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.otherReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.otherReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("outwardCedentsContractReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.outwardCedentsContractReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.outwardCedentsContractReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("generalLedgerAccount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.generalLedgerAccount = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
                if (info.name.equals("responsibleBusinessPartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.responsibleBusinessPartner = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("direction"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.direction = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("linkToLedgerBalance"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.linkToLedgerBalance = (SicsLedgerBalanceLinkToRemittanceReference)__envelope.get(j,SicsLedgerBalanceLinkToRemittanceReference.class,false);
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
            return this.status!=null?this.status:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.valueDate!=null?Helper.getDateFormat().format(this.valueDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.dateOfBooking!=null?Helper.getDateFormat().format(this.dateOfBooking):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.bookingYearAndPeriod!=null?this.bookingYearAndPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return isPaid;
        }
        if(propertyIndex==count+5)
        {
            return this.remittanceType!=null?this.remittanceType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.checkNumber!=null?this.checkNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.bankAccountCurrency!=null?this.bankAccountCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.currency!=null?this.currency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.originalAmount!=null?this.originalAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.bankAccount!=null?this.bankAccount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.bankAccountAmount!=null?this.bankAccountAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.baseCompany!=null?this.baseCompany:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.reportingUnit!=null?this.reportingUnit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.bankChargeCurrency!=null?this.bankChargeCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.bankChargeAmount!=null?this.bankChargeAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.dueDate!=null?Helper.getDateFormat().format(this.dueDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.accountingDocumentReceivedDate!=null?Helper.getDateFormat().format(this.accountingDocumentReceivedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.businessPartner!=null?this.businessPartner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.paymentPartnerReportingUnit!=null?this.paymentPartnerReportingUnit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.paymentPartnersAddress!=null?this.paymentPartnersAddress:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.partnersBankAccount!=null?this.partnersBankAccount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+22)
        {
            return this.intermediaryBankAccount!=null?this.intermediaryBankAccount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+23)
        {
            return this.businessPartnerReference!=null?this.businessPartnerReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+24)
        {
            return this.payeePartner!=null?this.payeePartner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+25)
        {
            return this.payeeAddress!=null?this.payeeAddress:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+26)
        {
            return this.attentionLine!=null?this.attentionLine:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+27)
        {
            return this.remittanceClassification!=null?this.remittanceClassification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+28)
        {
            return this.remittanceClassification2!=null?this.remittanceClassification2:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+29)
        {
            return this.remittanceClassification3!=null?this.remittanceClassification3:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+30)
        {
            return this.additionalPartnersRef!=null?this.additionalPartnersRef:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+31)
        {
            return this.otherReference!=null?this.otherReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+32)
        {
            return this.outwardCedentsContractReference!=null?this.outwardCedentsContractReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+33)
        {
            return this.generalLedgerAccount!=null?this.generalLedgerAccount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+34)
        {
            return this.insuredPeriod!=null?this.insuredPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+35)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+36)
        {
            return this.responsibleBusinessPartner!=null?this.responsibleBusinessPartner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+37)
        {
            return this.direction!=null?this.direction:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+38)
        {
            return this.linkToLedgerBalance!=null?this.linkToLedgerBalance:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+39;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "status";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "valueDate";
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
            info.type = SicsBookingYearPeriodReference.class;
            info.name = "bookingYearAndPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isPaid";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "remittanceType";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "checkNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "bankAccountCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "originalAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = SicsBankAccountReference.class;
            info.name = "bankAccount";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "bankAccountAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "baseCompany";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = SicsReportingUnitReference.class;
            info.name = "reportingUnit";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "bankChargeCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "bankChargeAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dueDate";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "accountingDocumentReceivedDate";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "businessPartner";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = SicsReportingUnitReference.class;
            info.name = "paymentPartnerReportingUnit";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = Address.class;
            info.name = "paymentPartnersAddress";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = SicsBankAccountReference.class;
            info.name = "partnersBankAccount";
            info.namespace= "";
        }
        if(propertyIndex==count+22)
        {
            info.type = SicsBankAccountReference.class;
            info.name = "intermediaryBankAccount";
            info.namespace= "";
        }
        if(propertyIndex==count+23)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessPartnerReference";
            info.namespace= "";
        }
        if(propertyIndex==count+24)
        {
            info.type = SicsPartyReference.class;
            info.name = "payeePartner";
            info.namespace= "";
        }
        if(propertyIndex==count+25)
        {
            info.type = Address.class;
            info.name = "payeeAddress";
            info.namespace= "";
        }
        if(propertyIndex==count+26)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "attentionLine";
            info.namespace= "";
        }
        if(propertyIndex==count+27)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "remittanceClassification";
            info.namespace= "";
        }
        if(propertyIndex==count+28)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "remittanceClassification2";
            info.namespace= "";
        }
        if(propertyIndex==count+29)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "remittanceClassification3";
            info.namespace= "";
        }
        if(propertyIndex==count+30)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "additionalPartnersRef";
            info.namespace= "";
        }
        if(propertyIndex==count+31)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "otherReference";
            info.namespace= "";
        }
        if(propertyIndex==count+32)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "outwardCedentsContractReference";
            info.namespace= "";
        }
        if(propertyIndex==count+33)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "generalLedgerAccount";
            info.namespace= "";
        }
        if(propertyIndex==count+34)
        {
            info.type = SicsInsuredPeriodReference.class;
            info.name = "insuredPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+35)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        if(propertyIndex==count+36)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "responsibleBusinessPartner";
            info.namespace= "";
        }
        if(propertyIndex==count+37)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "direction";
            info.namespace= "";
        }
        if(propertyIndex==count+38)
        {
            info.type = SicsLedgerBalanceLinkToRemittanceReference.class;
            info.name = "linkToLedgerBalance";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

