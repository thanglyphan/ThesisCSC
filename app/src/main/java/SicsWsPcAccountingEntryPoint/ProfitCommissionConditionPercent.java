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

public class ProfitCommissionConditionPercent extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Profit Commission Percent
	*/
    public BigDecimal profitCommissionPercent;
    
	/**
	* Super Profit Commission
	*/
    public Boolean superProfitCommission;
    
	/**
	* Entry Code Group where category = (SUBCLASS=223, CODE= "PLOSS") 
	*                      Profit Loss Basis
	*/
    public SicsAccountingEntryCodeGroupReference profitLossBasis;
    
	/**
	* To Extinction
	*/
    public Boolean toExtinction;
    
	/**
	* Only used when "toExtinction" = "No" (false)
	*                      Insured Periods
	*/
    public Integer lossesForwardedPeriods;
    
	/**
	* SUBCLASS=125, CODE= "UNDEFINED" | "NONE" | "PERCENT" 
	*                      (Deduction Method)
	*/
    public SicsReferenceDataReference deductionMethod;
    
	/**
	* Only used when "deductionMethod" = "PERCENT" 
	*                      (Management Expenses)
	*/
    public BigDecimal managementExpenses;
    
	/**
	* Entry Code Group where category = (SUBCLASS=223, CODE= "PME")
	*                      Premium Basis
	*/
    public SicsAccountingEntryCodeGroupReference premiumBasis;
    
	/**
	* No / Yes
	*/
    public Boolean useAverageBasis;
    
	/**
	* Only used when "useAverageBasis" = "Yes"
	*                      Result Avg. Periods
	*/
    public Integer resultAveragePeriods;
    
	/**
	* Only used when "useAverageBasis" = "Yes"
	*                      (Rating Period) From
	*/
    public java.util.Date ratingPeriodFromDate;
    
	/**
	* Only used when "useAverageBasis" = "Yes"
	*                      (Rating Period) To
	*/
    public java.util.Date ratingPeriodToDate;
    
	/**
	* "M" | "Y" only, 0->99
	*                      First Calculation After
	*/
    public SicsWsTimeDurationReference firstCalculationPeriod;
    
	/**
	* "M" | "Y" only, 0->99
	*                      Subsequent Calc. Every
	*/
    public SicsWsTimeDurationReference subsequentCalculationFrequency;
    
	/**
	* Subsequent Calculation On Account
	*/
    public Boolean areSubsequentCalculationsOnAccount;

    public ProfitCommissionConditionPercent ()
    {
    }

    public ProfitCommissionConditionPercent (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("profitCommissionPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.profitCommissionPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.profitCommissionPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("superProfitCommission"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.superProfitCommission = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.superProfitCommission = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("profitLossBasis"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.profitLossBasis = (SicsAccountingEntryCodeGroupReference)__envelope.get(j,SicsAccountingEntryCodeGroupReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("toExtinction"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.toExtinction = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.toExtinction = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lossesForwardedPeriods"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lossesForwardedPeriods = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.lossesForwardedPeriods = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deductionMethod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deductionMethod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("managementExpenses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.managementExpenses = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.managementExpenses = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premiumBasis"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premiumBasis = (SicsAccountingEntryCodeGroupReference)__envelope.get(j,SicsAccountingEntryCodeGroupReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("useAverageBasis"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.useAverageBasis = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.useAverageBasis = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("resultAveragePeriods"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.resultAveragePeriods = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.resultAveragePeriods = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ratingPeriodFromDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ratingPeriodFromDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.ratingPeriodFromDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ratingPeriodToDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ratingPeriodToDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.ratingPeriodToDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("firstCalculationPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.firstCalculationPeriod = (SicsWsTimeDurationReference)__envelope.get(j,SicsWsTimeDurationReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("subsequentCalculationFrequency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.subsequentCalculationFrequency = (SicsWsTimeDurationReference)__envelope.get(j,SicsWsTimeDurationReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("areSubsequentCalculationsOnAccount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.areSubsequentCalculationsOnAccount = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.areSubsequentCalculationsOnAccount = (Boolean)obj;
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
            return this.profitCommissionPercent!=null?this.profitCommissionPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.superProfitCommission!=null?this.superProfitCommission:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.profitLossBasis!=null?this.profitLossBasis:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.toExtinction!=null?this.toExtinction:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.lossesForwardedPeriods!=null?this.lossesForwardedPeriods:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.deductionMethod!=null?this.deductionMethod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.managementExpenses!=null?this.managementExpenses.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.premiumBasis!=null?this.premiumBasis:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.useAverageBasis!=null?this.useAverageBasis:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.resultAveragePeriods!=null?this.resultAveragePeriods:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.ratingPeriodFromDate!=null?Helper.getDateFormat().format(this.ratingPeriodFromDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.ratingPeriodToDate!=null?Helper.getDateFormat().format(this.ratingPeriodToDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.firstCalculationPeriod!=null?this.firstCalculationPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.subsequentCalculationFrequency!=null?this.subsequentCalculationFrequency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.areSubsequentCalculationsOnAccount!=null?this.areSubsequentCalculationsOnAccount:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+15;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "profitCommissionPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "superProfitCommission";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsAccountingEntryCodeGroupReference.class;
            info.name = "profitLossBasis";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "toExtinction";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "lossesForwardedPeriods";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "deductionMethod";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "managementExpenses";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsAccountingEntryCodeGroupReference.class;
            info.name = "premiumBasis";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "useAverageBasis";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "resultAveragePeriods";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ratingPeriodFromDate";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ratingPeriodToDate";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = SicsWsTimeDurationReference.class;
            info.name = "firstCalculationPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = SicsWsTimeDurationReference.class;
            info.name = "subsequentCalculationFrequency";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "areSubsequentCalculationsOnAccount";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

