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

public class SingleAccountCondition extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date accountAsOfDate;
    
    public SicsReferenceDataReference accountingPeriod;
    
    public Integer accountingYear=0;
    
	/**
	* Changed
	*                      NB: Should only be used for domain retrieval as this is a computed value.
	*/
    public Boolean accountIsManuallyChanged;
    
    public Boolean accountIsPaid;
    
    public Boolean accountIsReceived;
    
	/**
	* Account No
	*                      NB: Should only be used for domain retrieval as this is a computed value.
	*/
    public String accountNumber;
    
    public String accountNumberPrefix;
    
    public Boolean attachCommissionStatement;
    
    public Boolean attachLossCorridorLossParticipationStatement;
    
    public Boolean attachProfitCommissionStatement;
    
    public java.util.Date booked;
    
    public java.util.Date cedentsPaymentDueDate;
    
    public BigDecimal expectedPremiumPercentage=BigDecimal.ZERO;
    
    public java.util.Date inspectionDate;
    
    public Boolean portfolio;
    
    public java.util.Date productionDate;
    
    public java.util.Date receivedDate;
    
    public java.util.Date reinsurersPaymentDueDate;
    
    public java.util.Date runDate;
    
    public SicsReferenceDataReference status;
    
    public java.util.Date submissionDate;

    public SingleAccountCondition ()
    {
    }

    public SingleAccountCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("accountAsOfDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountAsOfDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.accountAsOfDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountingPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accountingPeriod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
                if (info.name.equals("accountIsManuallyChanged"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountIsManuallyChanged = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.accountIsManuallyChanged = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountIsPaid"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountIsPaid = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.accountIsPaid = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountIsReceived"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountIsReceived = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.accountIsReceived = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountNumber = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.accountNumber = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountNumberPrefix"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.accountNumberPrefix = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.accountNumberPrefix = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("attachCommissionStatement"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.attachCommissionStatement = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.attachCommissionStatement = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("attachLossCorridorLossParticipationStatement"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.attachLossCorridorLossParticipationStatement = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.attachLossCorridorLossParticipationStatement = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("attachProfitCommissionStatement"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.attachProfitCommissionStatement = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.attachProfitCommissionStatement = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("booked"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.booked = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.booked = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("cedentsPaymentDueDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cedentsPaymentDueDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.cedentsPaymentDueDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("expectedPremiumPercentage"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.expectedPremiumPercentage = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.expectedPremiumPercentage = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("inspectionDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.inspectionDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.inspectionDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("portfolio"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.portfolio = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.portfolio = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("productionDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.productionDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.productionDate = (java.util.Date)obj;
                        }
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
                if (info.name.equals("reinsurersPaymentDueDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reinsurersPaymentDueDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.reinsurersPaymentDueDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("runDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.runDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.runDate = (java.util.Date)obj;
                        }
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
                if (info.name.equals("submissionDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.submissionDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.submissionDate = (java.util.Date)obj;
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
            return this.accountAsOfDate!=null?Helper.getDateFormat().format(this.accountAsOfDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return accountingPeriod;
        }
        if(propertyIndex==count+2)
        {
            return accountingYear;
        }
        if(propertyIndex==count+3)
        {
            return this.accountIsManuallyChanged!=null?this.accountIsManuallyChanged:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.accountIsPaid!=null?this.accountIsPaid:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.accountIsReceived!=null?this.accountIsReceived:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.accountNumber!=null?this.accountNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.accountNumberPrefix!=null?this.accountNumberPrefix:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.attachCommissionStatement!=null?this.attachCommissionStatement:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.attachLossCorridorLossParticipationStatement!=null?this.attachLossCorridorLossParticipationStatement:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.attachProfitCommissionStatement!=null?this.attachProfitCommissionStatement:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.booked!=null?Helper.getDateFormat().format(this.booked):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.cedentsPaymentDueDate!=null?Helper.getDateFormat().format(this.cedentsPaymentDueDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.expectedPremiumPercentage!=null?this.expectedPremiumPercentage.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.inspectionDate!=null?Helper.getDateFormat().format(this.inspectionDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.portfolio!=null?this.portfolio:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.productionDate!=null?Helper.getDateFormat().format(this.productionDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.receivedDate!=null?Helper.getDateFormat().format(this.receivedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.reinsurersPaymentDueDate!=null?Helper.getDateFormat().format(this.reinsurersPaymentDueDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.runDate!=null?Helper.getDateFormat().format(this.runDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.status!=null?this.status:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.submissionDate!=null?Helper.getDateFormat().format(this.submissionDate):SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+22;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "accountAsOfDate";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accountingPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "accountingYear";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "accountIsManuallyChanged";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "accountIsPaid";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "accountIsReceived";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "accountNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "accountNumberPrefix";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "attachCommissionStatement";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "attachLossCorridorLossParticipationStatement";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "attachProfitCommissionStatement";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "booked";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cedentsPaymentDueDate";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "expectedPremiumPercentage";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "inspectionDate";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "portfolio";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "productionDate";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "receivedDate";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reinsurersPaymentDueDate";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "runDate";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "status";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "submissionDate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
