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
import java.math.BigDecimal;

public class ClaimConditionPropTreaty extends ClaimCondition implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 554. SicsRefLossExpenses
	*                            Loss Adjustment Expenses/Costs
	*/
    public SicsReferenceDataReference refLossAdjustmentExpenseType;
    
	/**
	* SubclassNumber: 554. SicsRefLossExpenses
	*                            Declaratory Judgement (on nonProp on Limits-tab) 1st field
	*/
    public SicsReferenceDataReference refDeclaratoryJudgementType;
    
	/**
	* Declaratory Judgement (on nonProp on Limits-tab) 2nd and 3rd field: amount - currency
	*/
    public SicsMonetaryAmountReference declaratoryJudgementAmount;
    
	/**
	* ECO (on nonProp on Limits-tab) 1st field
	*/
    public BigDecimal ecoPercent;
    
	/**
	* SubclassNumber: 554. SicsRefLossExpenses
	*                            ECO (on nonProp on Limits-tab) 2nd field (dropDown)
	*/
    public SicsReferenceDataReference refEcoType;
    
	/**
	* ECO (on nonProp on Limits-tab) 3rd and 4th field amount - currency
	*/
    public SicsMonetaryAmountReference ecoAmount;
    
	/**
	* XPL (on nonProp on Limits-tab) 1st field
	*/
    public BigDecimal xplPercent;
    
	/**
	* SubclassNumber: 554. SicsRefLossExpenses
	*                            XPL (on nonProp on Limits-tab) 2nd field (dropDown)
	*/
    public SicsReferenceDataReference refXplType;
    
	/**
	* XPL (on nonProp on Limits-tab) 3rd and 4th field amount - currency
	*/
    public SicsMonetaryAmountReference xplAmount;
    
	/**
	* Original Loss Limit (on nonProp on Limits-tab) 1st field
	*/
    public BigDecimal originalLossLimit;
    
	/**
	* Original Loss Limit (on nonProp on Limits-tab) 2nd field
	*/
    public SicsCurrencyReference originalLossLimitCurrency;
    
	/**
	* Original Loss Priority (on nonProp on Limits-tab) 1st field
	*/
    public BigDecimal originalLossPriority;
    
	/**
	* Original Loss Priority (on nonProp on Limits-tab) 2nd field
	*/
    public SicsCurrencyReference originalLossPriorityCurrency;
    
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

    public ClaimConditionPropTreaty ()
    {
    }

    public ClaimConditionPropTreaty (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("refLossAdjustmentExpenseType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refLossAdjustmentExpenseType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("refDeclaratoryJudgementType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refDeclaratoryJudgementType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("declaratoryJudgementAmount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.declaratoryJudgementAmount = (SicsMonetaryAmountReference)__envelope.get(j,SicsMonetaryAmountReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("ecoPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ecoPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.ecoPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refEcoType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refEcoType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("ecoAmount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.ecoAmount = (SicsMonetaryAmountReference)__envelope.get(j,SicsMonetaryAmountReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("xplPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.xplPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.xplPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refXplType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refXplType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("xplAmount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.xplAmount = (SicsMonetaryAmountReference)__envelope.get(j,SicsMonetaryAmountReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("originalLossLimit"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.originalLossLimit = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.originalLossLimit = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("originalLossLimitCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.originalLossLimitCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("originalLossPriority"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.originalLossPriority = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.originalLossPriority = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("originalLossPriorityCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.originalLossPriorityCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
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
            return this.refLossAdjustmentExpenseType!=null?this.refLossAdjustmentExpenseType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.refDeclaratoryJudgementType!=null?this.refDeclaratoryJudgementType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.declaratoryJudgementAmount!=null?this.declaratoryJudgementAmount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.ecoPercent!=null?this.ecoPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.refEcoType!=null?this.refEcoType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.ecoAmount!=null?this.ecoAmount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.xplPercent!=null?this.xplPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.refXplType!=null?this.refXplType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.xplAmount!=null?this.xplAmount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.originalLossLimit!=null?this.originalLossLimit.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.originalLossLimitCurrency!=null?this.originalLossLimitCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.originalLossPriority!=null?this.originalLossPriority.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.originalLossPriorityCurrency!=null?this.originalLossPriorityCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.lossAdjustmentExpensesPaidLosses!=null?this.lossAdjustmentExpensesPaidLosses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.paidLossesPercentValue!=null?this.paidLossesPercentValue.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.paidLossesEntryCodeGroup!=null?this.paidLossesEntryCodeGroup:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.lossAdjustmentExpensesReserves!=null?this.lossAdjustmentExpensesReserves:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.reservesPercentValue!=null?this.reservesPercentValue.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.reservesEntryCodeGroup!=null?this.reservesEntryCodeGroup:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+19;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refLossAdjustmentExpenseType";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refDeclaratoryJudgementType";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsMonetaryAmountReference.class;
            info.name = "declaratoryJudgementAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ecoPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refEcoType";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsMonetaryAmountReference.class;
            info.name = "ecoAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "xplPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refXplType";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = SicsMonetaryAmountReference.class;
            info.name = "xplAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "originalLossLimit";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "originalLossLimitCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "originalLossPriority";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "originalLossPriorityCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "lossAdjustmentExpensesPaidLosses";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paidLossesPercentValue";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = SicsAccountingEntryCodeGroupReference.class;
            info.name = "paidLossesEntryCodeGroup";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "lossAdjustmentExpensesReserves";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reservesPercentValue";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
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

