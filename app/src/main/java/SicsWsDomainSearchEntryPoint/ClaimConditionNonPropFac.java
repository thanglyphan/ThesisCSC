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

public class ClaimConditionNonPropFac extends ClaimCondition implements KvmSerializable,java.io.Serializable
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
	* Classification Priority (on Limits-tab)
	*/
    public Integer classificationPriority;
    
	/**
	* SubclassNumber: 554. SicsRefLossExpenses
	*                            Interest Clause Type (on Interest Clause tab)
	*/
    public SicsReferenceDataReference refInterestClauseType;
    
	/**
	* Note on Interest Clause tab
	*/
    public String interestClauseNote;
    
	/**
	* Deposit applied on Annuity Clause tab
	*/
    public Boolean isAnnuityDeposits;
    
	/**
	* SubclassNumber: 557. SicsRefAnnuityPaymentsSystem
	*                            System on Annuity Clause tab
	*/
    public SicsReferenceDataReference refAnnuitySystem;
    
	/**
	* SubclassNumber: 557. SicsRefAnnuityPaymentsSystem
	*                            Redemption on Annuity Clause tab
	*/
    public SicsReferenceDataReference refAnnuityRedemption;
    
	/**
	* Years after Redemption on Annuity Clause tab
	*/
    public Integer annuityNumberOfYears;
    
	/**
	* SubclassNumber: 558. SicsRefRedemptionArrangement
	*                            Redemption Arrangements on Annuity Clause tab
	*/
    public SicsReferenceDataReference refAnnuityRedemptionArrangement;
    
	/**
	* Note on Annuity Clause tab
	*/
    public String annuityClauseNote;
    
	/**
	* Retroactive Date
	*/
    public java.util.Date retroactiveDate;

    public ClaimConditionNonPropFac ()
    {
    }

    public ClaimConditionNonPropFac (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("classificationPriority"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.classificationPriority = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.classificationPriority = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refInterestClauseType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refInterestClauseType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("interestClauseNote"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.interestClauseNote = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.interestClauseNote = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isAnnuityDeposits"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAnnuityDeposits = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAnnuityDeposits = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refAnnuitySystem"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refAnnuitySystem = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("refAnnuityRedemption"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refAnnuityRedemption = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("annuityNumberOfYears"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.annuityNumberOfYears = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.annuityNumberOfYears = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refAnnuityRedemptionArrangement"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refAnnuityRedemptionArrangement = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("annuityClauseNote"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.annuityClauseNote = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.annuityClauseNote = (String)obj;
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
            return this.refLossAdjustmentExpenseType!=null?this.refLossAdjustmentExpenseType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.refDeclaratoryJudgementType!=null?this.refDeclaratoryJudgementType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.declaratoryJudgementAmount!=null?this.declaratoryJudgementAmount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.ecoPercent!=null?this.ecoPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.refEcoType!=null?this.refEcoType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.ecoAmount!=null?this.ecoAmount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.xplPercent!=null?this.xplPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.refXplType!=null?this.refXplType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.xplAmount!=null?this.xplAmount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.originalLossLimit!=null?this.originalLossLimit.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.originalLossLimitCurrency!=null?this.originalLossLimitCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.originalLossPriority!=null?this.originalLossPriority.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.originalLossPriorityCurrency!=null?this.originalLossPriorityCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.classificationPriority!=null?this.classificationPriority:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.refInterestClauseType!=null?this.refInterestClauseType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+22)
        {
            return this.interestClauseNote!=null?this.interestClauseNote:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+23)
        {
            return this.isAnnuityDeposits!=null?this.isAnnuityDeposits:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+24)
        {
            return this.refAnnuitySystem!=null?this.refAnnuitySystem:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+25)
        {
            return this.refAnnuityRedemption!=null?this.refAnnuityRedemption:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+26)
        {
            return this.annuityNumberOfYears!=null?this.annuityNumberOfYears:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+27)
        {
            return this.refAnnuityRedemptionArrangement!=null?this.refAnnuityRedemptionArrangement:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+28)
        {
            return this.annuityClauseNote!=null?this.annuityClauseNote:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+29)
        {
            return this.retroactiveDate!=null?Helper.getDateFormat().format(this.retroactiveDate):SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+30;
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
            info.type = SicsReferenceDataReference.class;
            info.name = "refLossAdjustmentExpenseType";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refDeclaratoryJudgementType";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = SicsMonetaryAmountReference.class;
            info.name = "declaratoryJudgementAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ecoPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refEcoType";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = SicsMonetaryAmountReference.class;
            info.name = "ecoAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "xplPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refXplType";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = SicsMonetaryAmountReference.class;
            info.name = "xplAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "originalLossLimit";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "originalLossLimitCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "originalLossPriority";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "originalLossPriorityCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "classificationPriority";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refInterestClauseType";
            info.namespace= "";
        }
        if(propertyIndex==count+22)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "interestClauseNote";
            info.namespace= "";
        }
        if(propertyIndex==count+23)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAnnuityDeposits";
            info.namespace= "";
        }
        if(propertyIndex==count+24)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refAnnuitySystem";
            info.namespace= "";
        }
        if(propertyIndex==count+25)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refAnnuityRedemption";
            info.namespace= "";
        }
        if(propertyIndex==count+26)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "annuityNumberOfYears";
            info.namespace= "";
        }
        if(propertyIndex==count+27)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refAnnuityRedemptionArrangement";
            info.namespace= "";
        }
        if(propertyIndex==count+28)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "annuityClauseNote";
            info.namespace= "";
        }
        if(propertyIndex==count+29)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "retroactiveDate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

