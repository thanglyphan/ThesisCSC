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
import java.math.BigInteger;

public class ClaimScopeOfCoverToClaimRelationship extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public SectionSpecificClassificationList sectionSpecificClassificationList;
    
    public java.util.Date claimAdvisedDate;
    
    public java.util.Date claimActionDate;
    
    public String actionComment;
    
    public java.util.Date adviceReceivedDate;
    
    public AdviceMonetaryAmount adviceAmountCurrency;
    
    public ClaimReferenceList claimReferenceList;
    
    public Boolean isIndexed;
    
    public Boolean isAutomaticIndexCalculation;
    
    public SicsCountryIndexRowReference baseIndex;
    
    public ClaimOutwardCedentsContractRelationList protectionAllocationOccList;
    
    public ClaimProtectionProgramRelationList protectionAllocationPpList;
    
    public ClaimProgramPeriodReference scopeOfCoverToClaimToCPP;
    
    public ClaimToInsuredClaimantRelationList insuredClaimantList;
    
    public VariousClaimDetailList variousClaimDetailList;
    
    public ClaimClaimGroupRelationshipList claimGroupRelationshipList;
    
    public ReportingUnitRelationList reportingUnitList;
    
    public Boolean transferToLedger;
    
    public ClaimToBusinessPartnerRelationshipList businessPartnerList;
    
	/**
	* Claim Main Currency
	*/
    public SicsCurrencyReference mainCurrency;
    
	/**
	* Incurred Claim From Ground Up
	*/
    public BigDecimal amountFromGroundUp;
    
    public BigDecimal amountPolicyLimit;
    
	/**
	* Deductible
	*/
    public BigDecimal amountExpenses;
    
	/**
	* Our Ground Up Loss
	*/
    public BigDecimal amountOurGroundUp;
    
    public BigDecimal amountMaxIncurred;
    
    public Integer accountingYear;
    
	/**
	* Aggregate
	*/
    public Boolean isAggregateDeductible;
    
    public ClaimFundingObjectList claimFundingObjectList;
    
    public UserDefinedFields userDefinedFieldsCondition;
    
	/**
	* To be sent only when updating a Substitute Scope Of Cover to Claim Relationship (Interlocking Claims).
	*/
    public ClaimScopeOfCoverSubstituteInformation substituteScopeOfCover;
    
    public SicsScopeOfCoverReference scopeOfCoverReference;
    
    public java.util.Date reviewDate;
    
    public BigDecimal share;
    
    public BigInteger numberOfAdvises;
    
    public java.util.Date lastAdvisedDate;
    
    public ClaimStatusReadList claimStatusList;
    
    public ClaimDispositionReadList claimDispositionList;
    
    public ClaimLimitConditionReadList limitConditionList;
    
    public ClaimShareConditionReadList shareConditionList;

    public ClaimScopeOfCoverToClaimRelationship ()
    {
    }

    public ClaimScopeOfCoverToClaimRelationship (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("sectionSpecificClassificationList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.sectionSpecificClassificationList = (SectionSpecificClassificationList)__envelope.get(j,SectionSpecificClassificationList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimAdvisedDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimAdvisedDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.claimAdvisedDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimActionDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimActionDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.claimActionDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("actionComment"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.actionComment = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.actionComment = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("adviceReceivedDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.adviceReceivedDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.adviceReceivedDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("adviceAmountCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.adviceAmountCurrency = (AdviceMonetaryAmount)__envelope.get(j,AdviceMonetaryAmount.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimReferenceList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimReferenceList = new ClaimReferenceList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("isIndexed"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isIndexed = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isIndexed = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isAutomaticIndexCalculation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAutomaticIndexCalculation = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAutomaticIndexCalculation = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("baseIndex"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.baseIndex = (SicsCountryIndexRowReference)__envelope.get(j,SicsCountryIndexRowReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("protectionAllocationOccList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.protectionAllocationOccList = new ClaimOutwardCedentsContractRelationList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("protectionAllocationPpList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.protectionAllocationPpList = new ClaimProtectionProgramRelationList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("scopeOfCoverToClaimToCPP"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.scopeOfCoverToClaimToCPP = (ClaimProgramPeriodReference)__envelope.get(j,ClaimProgramPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insuredClaimantList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredClaimantList = new ClaimToInsuredClaimantRelationList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("variousClaimDetailList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.variousClaimDetailList = new VariousClaimDetailList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("claimGroupRelationshipList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimGroupRelationshipList = new ClaimClaimGroupRelationshipList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("reportingUnitList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reportingUnitList = (ReportingUnitRelationList)__envelope.get(j,ReportingUnitRelationList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("transferToLedger"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.transferToLedger = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.transferToLedger = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartnerList = new ClaimToBusinessPartnerRelationshipList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("mainCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.mainCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("amountFromGroundUp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amountFromGroundUp = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.amountFromGroundUp = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("amountPolicyLimit"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amountPolicyLimit = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.amountPolicyLimit = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("amountExpenses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amountExpenses = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.amountExpenses = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("amountOurGroundUp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amountOurGroundUp = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.amountOurGroundUp = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("amountMaxIncurred"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amountMaxIncurred = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.amountMaxIncurred = (BigDecimal)obj;
                        }
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
                if (info.name.equals("isAggregateDeductible"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAggregateDeductible = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAggregateDeductible = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimFundingObjectList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimFundingObjectList = new ClaimFundingObjectList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("userDefinedFieldsCondition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.userDefinedFieldsCondition = (UserDefinedFields)__envelope.get(j,UserDefinedFields.class,false);
                    }
                    continue;
                }
                if (info.name.equals("substituteScopeOfCover"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.substituteScopeOfCover = (ClaimScopeOfCoverSubstituteInformation)__envelope.get(j,ClaimScopeOfCoverSubstituteInformation.class,false);
                    }
                    continue;
                }
                if (info.name.equals("scopeOfCoverReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.scopeOfCoverReference = (SicsScopeOfCoverReference)__envelope.get(j,SicsScopeOfCoverReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reviewDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reviewDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.reviewDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("share"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.share = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.share = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("numberOfAdvises"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.numberOfAdvises = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.numberOfAdvises = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lastAdvisedDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lastAdvisedDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.lastAdvisedDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimStatusList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimStatusList = new ClaimStatusReadList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("claimDispositionList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimDispositionList = new ClaimDispositionReadList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("limitConditionList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.limitConditionList = new ClaimLimitConditionReadList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("shareConditionList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.shareConditionList = new ClaimShareConditionReadList(j,__envelope);
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
            return this.sectionSpecificClassificationList!=null?this.sectionSpecificClassificationList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.claimAdvisedDate!=null?Helper.getDateFormat().format(this.claimAdvisedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.claimActionDate!=null?Helper.getDateFormat().format(this.claimActionDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.actionComment!=null?this.actionComment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.adviceReceivedDate!=null?Helper.getDateFormat().format(this.adviceReceivedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.adviceAmountCurrency!=null?this.adviceAmountCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.claimReferenceList!=null?this.claimReferenceList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.isIndexed!=null?this.isIndexed:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.isAutomaticIndexCalculation!=null?this.isAutomaticIndexCalculation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.baseIndex!=null?this.baseIndex:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.protectionAllocationOccList!=null?this.protectionAllocationOccList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.protectionAllocationPpList!=null?this.protectionAllocationPpList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.scopeOfCoverToClaimToCPP!=null?this.scopeOfCoverToClaimToCPP:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.insuredClaimantList!=null?this.insuredClaimantList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.variousClaimDetailList!=null?this.variousClaimDetailList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.claimGroupRelationshipList!=null?this.claimGroupRelationshipList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.reportingUnitList!=null?this.reportingUnitList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.transferToLedger!=null?this.transferToLedger:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.businessPartnerList!=null?this.businessPartnerList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.mainCurrency!=null?this.mainCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.amountFromGroundUp!=null?this.amountFromGroundUp.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.amountPolicyLimit!=null?this.amountPolicyLimit.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+22)
        {
            return this.amountExpenses!=null?this.amountExpenses.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+23)
        {
            return this.amountOurGroundUp!=null?this.amountOurGroundUp.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+24)
        {
            return this.amountMaxIncurred!=null?this.amountMaxIncurred.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+25)
        {
            return this.accountingYear!=null?this.accountingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+26)
        {
            return this.isAggregateDeductible!=null?this.isAggregateDeductible:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+27)
        {
            return this.claimFundingObjectList!=null?this.claimFundingObjectList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+28)
        {
            return this.userDefinedFieldsCondition!=null?this.userDefinedFieldsCondition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+29)
        {
            return this.substituteScopeOfCover!=null?this.substituteScopeOfCover:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+30)
        {
            return this.scopeOfCoverReference!=null?this.scopeOfCoverReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+31)
        {
            return this.reviewDate!=null?Helper.getDateFormat().format(this.reviewDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+32)
        {
            return this.share!=null?this.share.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+33)
        {
            return this.numberOfAdvises!=null?this.numberOfAdvises.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+34)
        {
            return this.lastAdvisedDate!=null?Helper.getDateFormat().format(this.lastAdvisedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+35)
        {
            return this.claimStatusList!=null?this.claimStatusList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+36)
        {
            return this.claimDispositionList!=null?this.claimDispositionList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+37)
        {
            return this.limitConditionList!=null?this.limitConditionList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+38)
        {
            return this.shareConditionList!=null?this.shareConditionList:SoapPrimitive.NullSkip;
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
            info.type = SectionSpecificClassificationList.class;
            info.name = "sectionSpecificClassificationList";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimAdvisedDate";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimActionDate";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "actionComment";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "adviceReceivedDate";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = AdviceMonetaryAmount.class;
            info.name = "adviceAmountCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "claimReferenceList";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isIndexed";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAutomaticIndexCalculation";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = SicsCountryIndexRowReference.class;
            info.name = "baseIndex";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "protectionAllocationOccList";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "protectionAllocationPpList";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = ClaimProgramPeriodReference.class;
            info.name = "scopeOfCoverToClaimToCPP";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "insuredClaimantList";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "variousClaimDetailList";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "claimGroupRelationshipList";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = ReportingUnitRelationList.class;
            info.name = "reportingUnitList";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "transferToLedger";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "businessPartnerList";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "mainCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amountFromGroundUp";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amountPolicyLimit";
            info.namespace= "";
        }
        if(propertyIndex==count+22)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amountExpenses";
            info.namespace= "";
        }
        if(propertyIndex==count+23)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amountOurGroundUp";
            info.namespace= "";
        }
        if(propertyIndex==count+24)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amountMaxIncurred";
            info.namespace= "";
        }
        if(propertyIndex==count+25)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "accountingYear";
            info.namespace= "";
        }
        if(propertyIndex==count+26)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAggregateDeductible";
            info.namespace= "";
        }
        if(propertyIndex==count+27)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "claimFundingObjectList";
            info.namespace= "";
        }
        if(propertyIndex==count+28)
        {
            info.type = UserDefinedFields.class;
            info.name = "userDefinedFieldsCondition";
            info.namespace= "";
        }
        if(propertyIndex==count+29)
        {
            info.type = ClaimScopeOfCoverSubstituteInformation.class;
            info.name = "substituteScopeOfCover";
            info.namespace= "";
        }
        if(propertyIndex==count+30)
        {
            info.type = SicsScopeOfCoverReference.class;
            info.name = "scopeOfCoverReference";
            info.namespace= "";
        }
        if(propertyIndex==count+31)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reviewDate";
            info.namespace= "";
        }
        if(propertyIndex==count+32)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "share";
            info.namespace= "";
        }
        if(propertyIndex==count+33)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "numberOfAdvises";
            info.namespace= "";
        }
        if(propertyIndex==count+34)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lastAdvisedDate";
            info.namespace= "";
        }
        if(propertyIndex==count+35)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "claimStatusList";
            info.namespace= "";
        }
        if(propertyIndex==count+36)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "claimDispositionList";
            info.namespace= "";
        }
        if(propertyIndex==count+37)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "limitConditionList";
            info.namespace= "";
        }
        if(propertyIndex==count+38)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "shareConditionList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

