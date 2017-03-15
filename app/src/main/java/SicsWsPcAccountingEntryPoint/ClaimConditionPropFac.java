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

public class ClaimConditionPropFac extends ClaimCondition implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 136. SicsRefClaimSequence
	*                            Claim Sequence
	*/
    public SicsReferenceDataReference claimSequence;
    
	/**
	* Claim Advice Limit (1st field)
	*/
    public BigDecimal claimAdviceLimitAmount;
    
	/**
	* Claim Advice Limit (nd field) . Note for nonProp: only mainCurrency valid here
	*/
    public SicsCurrencyReference claimAdviceLimitCurrency;
    
	/**
	* Comments:
	*/
    public String claimAdviceLimitComment;
    
	/**
	* % Excess Point (not for propFac)
	*/
    public BigDecimal claimAdviceLimitPercent;
    
	/**
	* Claim Co-operation
	*/
    public Boolean claimCooperation;
    
	/**
	* Ex Gratia
	*/
    public Boolean isExGratiaPayment;
    
	/**
	* Retroactive Date
	*/
    public java.util.Date retroactiveDate;
    
	/**
	* SubclassNumber: 125. SicsRefDeductionMethod
	*                         Loss Adjustment Expenses - Paid Losses on LossAdjustmentExpenses tab
	*/
    public SicsReferenceDataReference lossAdjustmentExpensesPaidLosses;
    
	/**
	* Paid Losses Percent Value on Loss Adjustment Expenses tab
	*/
    public BigDecimal paidLossesPercentValue;
    
	/**
	* SubclassNumber: 223.
	*                         Paid Losses Entry Code Group on Loss Adjustment Expenses tab
	*/
    public SicsAccountingEntryCodeGroupReference paidLossesEntryCodeGroup;
    
	/**
	* SubclassNumber: 125. SicsRefDeductionMethod
	*                         Loss Adjustment Expenses - Reserves on LossAdjustmentExpenses tab
	*/
    public SicsReferenceDataReference lossAdjustmentExpensesReserves;
    
	/**
	* Reserves Percent Value on Loss Adjustment Expenses tab
	*/
    public BigDecimal reservesPercentValue;
    
	/**
	* SubclassNumber: 223.
	*                         Reserves Entry Code Group on Loss Adjustment Expenses tab
	*/
    public SicsAccountingEntryCodeGroupReference reservesEntryCodeGroup;

    public ClaimConditionPropFac ()
    {
    }

    public ClaimConditionPropFac (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("claimSequence"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimSequence = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimAdviceLimitAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimAdviceLimitAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimAdviceLimitAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimAdviceLimitCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimAdviceLimitCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimAdviceLimitComment"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimAdviceLimitComment = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.claimAdviceLimitComment = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimAdviceLimitPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimAdviceLimitPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimAdviceLimitPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimCooperation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimCooperation = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.claimCooperation = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isExGratiaPayment"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isExGratiaPayment = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isExGratiaPayment = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("retroactiveDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.retroactiveDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.retroactiveDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lossAdjustmentExpensesPaidLosses"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lossAdjustmentExpensesPaidLosses = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paidLossesPercentValue"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.paidLossesPercentValue = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.paidLossesPercentValue = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("paidLossesEntryCodeGroup"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paidLossesEntryCodeGroup = (SicsAccountingEntryCodeGroupReference)__envelope.get(j,SicsAccountingEntryCodeGroupReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("lossAdjustmentExpensesReserves"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lossAdjustmentExpensesReserves = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reservesPercentValue"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reservesPercentValue = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.reservesPercentValue = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reservesEntryCodeGroup"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reservesEntryCodeGroup = (SicsAccountingEntryCodeGroupReference)__envelope.get(j,SicsAccountingEntryCodeGroupReference.class,false);
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
            return this.claimSequence!=null?this.claimSequence:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.claimAdviceLimitAmount!=null?this.claimAdviceLimitAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.claimAdviceLimitCurrency!=null?this.claimAdviceLimitCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.claimAdviceLimitComment!=null?this.claimAdviceLimitComment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.claimAdviceLimitPercent!=null?this.claimAdviceLimitPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.claimCooperation!=null?this.claimCooperation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.isExGratiaPayment!=null?this.isExGratiaPayment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.retroactiveDate!=null?Helper.getDateFormat().format(this.retroactiveDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.lossAdjustmentExpensesPaidLosses!=null?this.lossAdjustmentExpensesPaidLosses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.paidLossesPercentValue!=null?this.paidLossesPercentValue.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.paidLossesEntryCodeGroup!=null?this.paidLossesEntryCodeGroup:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.lossAdjustmentExpensesReserves!=null?this.lossAdjustmentExpensesReserves:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.reservesPercentValue!=null?this.reservesPercentValue.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.reservesEntryCodeGroup!=null?this.reservesEntryCodeGroup:SoapPrimitive.NullSkip;
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
            info.type = SicsReferenceDataReference.class;
            info.name = "claimSequence";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimAdviceLimitAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "claimAdviceLimitCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimAdviceLimitComment";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimAdviceLimitPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "claimCooperation";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isExGratiaPayment";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "retroactiveDate";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "lossAdjustmentExpensesPaidLosses";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paidLossesPercentValue";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = SicsAccountingEntryCodeGroupReference.class;
            info.name = "paidLossesEntryCodeGroup";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "lossAdjustmentExpensesReserves";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reservesPercentValue";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = SicsAccountingEntryCodeGroupReference.class;
            info.name = "reservesEntryCodeGroup";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

