package SicsWsAdministrationEntryPoint;

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

public class DepositItem extends AbstractPremium implements KvmSerializable,java.io.Serializable
{

    
	/**
	* NB! Do not use this element for DomainRetrieval; Use the element currencyForLimitPremium defined
	*                       in AbstractPremium.
	*                      Currency
	*/
    public SicsCurrencyReference currency;
    
	/**
	* Not Flat Premium
	*                      Minimum %
	*/
    public BigDecimal minimumPercent;
    
	/**
	* Not Flat Premium
	*                      Minimum 100%
	*/
    public BigDecimal minimumHundredPercent;
    
	/**
	* Not Flat Premium
	*                      Deposit %
	*/
    public BigDecimal depositPercent;
    
	/**
	* Not Flat Premium
	*                      Deposit 100%
	*/
    public BigDecimal depositHundredPercent;
    
	/**
	* Not Flat Premium
	*                      Read only tag used for output only 
	*                      Deposit 100%
	*/
    public BigDecimal depositCurrentEffectivePeriodAmount;
    
	/**
	* Not Flat Premium
	*                      Minimum Our Share [X%]
	*/
    public BigDecimal minimumOurShare;
    
	/**
	* Not Flat Premium
	*                      Deposit Our Share [X%]
	*/
    public BigDecimal depositOurShare;
    
	/**
	* Flat Premium
	*                      Annual 100%
	*/
    public BigDecimal annualHundredPercent;
    
	/**
	* Flat Premium
	*                      Annual Our Sahre [X%]
	*/
    public BigDecimal annualOurShare;
    
	/**
	* Flat Premium
	*                      Period 100%
	*/
    public BigDecimal periodHundredPercent;
    
	/**
	* Flat Premium
	*                      Period Our Share [X%]
	*/
    public BigDecimal periodOurShare;
    
	/**
	* Flat Premium
	*                      Net Premium 100%
	*/
    public BigDecimal netPremiumHundredPercent;
    
	/**
	* Flat Premium
	*                      Net Premium Our Share [X%]
	*/
    public BigDecimal netPremiumOurShare;
    
	/**
	* Sum Up
	*/
    public Boolean isAdded;
    
	/**
	* Is Sum
	*/
    public Boolean isSum;
    
	/**
	* Flat Premium
	*                      Not Flat Premium: Deposit amount
	*                      Valid for retrieval only
	*/
    public BigDecimal historicEffectivePeriodAmount;
    
	/**
	* Flat Premium
	*                      Not Flat Premium: Deposit Amount
	*                      Valid for retrieval only
	*/
    public BigDecimal insuredPeriodAmount;
    
	/**
	* Flat Premium
	*                      Not Flat Premium: Deposit Amount
	*                      Valid for retrieval only
	*                   Read only tag used for output only
	*/
    public BigDecimal depositInsuredPeriodAmount;
    
	/**
	* Not Flat Premium
	*                      Valid for retrieval only
	*/
    public BigDecimal minimumCurrentEffectivePeriodAmount;
    
	/**
	* Not Flat Premium
	*                      Valid for retrieval only
	*/
    public BigDecimal minimumHistoricEffectivePeriodAmount;
    
	/**
	* Not Flat Premium
	*                      Valid for retrieval only
	*/
    public BigDecimal minimumHistoricPercent;
    
	/**
	* Not Flat Premium
	*                      Valid for retrieval only
	*/
    public BigDecimal premiumHistoricPercent;
    
	/**
	* Not Flat Premium
	*                      Valid for retrieval only
	*/
    public BigDecimal minimumInsuredPeriodAmount;

    public DepositItem ()
    {
    }

    public DepositItem (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("currency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.currency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("minimumPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.minimumPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.minimumPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("minimumHundredPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.minimumHundredPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.minimumHundredPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("depositPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.depositPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.depositPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("depositHundredPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.depositHundredPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.depositHundredPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("depositCurrentEffectivePeriodAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.depositCurrentEffectivePeriodAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.depositCurrentEffectivePeriodAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("minimumOurShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.minimumOurShare = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.minimumOurShare = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("depositOurShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.depositOurShare = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.depositOurShare = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("annualHundredPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.annualHundredPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.annualHundredPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("annualOurShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.annualOurShare = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.annualOurShare = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("periodHundredPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.periodHundredPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.periodHundredPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("periodOurShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.periodOurShare = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.periodOurShare = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("netPremiumHundredPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.netPremiumHundredPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.netPremiumHundredPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("netPremiumOurShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.netPremiumOurShare = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.netPremiumOurShare = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isAdded"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAdded = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAdded = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isSum"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isSum = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isSum = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("historicEffectivePeriodAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.historicEffectivePeriodAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.historicEffectivePeriodAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriodAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredPeriodAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.insuredPeriodAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("depositInsuredPeriodAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.depositInsuredPeriodAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.depositInsuredPeriodAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("minimumCurrentEffectivePeriodAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.minimumCurrentEffectivePeriodAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.minimumCurrentEffectivePeriodAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("minimumHistoricEffectivePeriodAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.minimumHistoricEffectivePeriodAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.minimumHistoricEffectivePeriodAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("minimumHistoricPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.minimumHistoricPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.minimumHistoricPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premiumHistoricPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premiumHistoricPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premiumHistoricPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("minimumInsuredPeriodAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.minimumInsuredPeriodAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.minimumInsuredPeriodAmount = (BigDecimal)obj;
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
            return currency;
        }
        if(propertyIndex==count+1)
        {
            return this.minimumPercent!=null?this.minimumPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.minimumHundredPercent!=null?this.minimumHundredPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.depositPercent!=null?this.depositPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.depositHundredPercent!=null?this.depositHundredPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.depositCurrentEffectivePeriodAmount!=null?this.depositCurrentEffectivePeriodAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.minimumOurShare!=null?this.minimumOurShare.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.depositOurShare!=null?this.depositOurShare.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.annualHundredPercent!=null?this.annualHundredPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.annualOurShare!=null?this.annualOurShare.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.periodHundredPercent!=null?this.periodHundredPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.periodOurShare!=null?this.periodOurShare.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.netPremiumHundredPercent!=null?this.netPremiumHundredPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.netPremiumOurShare!=null?this.netPremiumOurShare.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.isAdded!=null?this.isAdded:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.isSum!=null?this.isSum:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.historicEffectivePeriodAmount!=null?this.historicEffectivePeriodAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.insuredPeriodAmount!=null?this.insuredPeriodAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.depositInsuredPeriodAmount!=null?this.depositInsuredPeriodAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.minimumCurrentEffectivePeriodAmount!=null?this.minimumCurrentEffectivePeriodAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.minimumHistoricEffectivePeriodAmount!=null?this.minimumHistoricEffectivePeriodAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.minimumHistoricPercent!=null?this.minimumHistoricPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+22)
        {
            return this.premiumHistoricPercent!=null?this.premiumHistoricPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+23)
        {
            return this.minimumInsuredPeriodAmount!=null?this.minimumInsuredPeriodAmount.toString():SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+24;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "minimumPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "minimumHundredPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "depositPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "depositHundredPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "depositCurrentEffectivePeriodAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "minimumOurShare";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "depositOurShare";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "annualHundredPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "annualOurShare";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "periodHundredPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "periodOurShare";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "netPremiumHundredPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "netPremiumOurShare";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAdded";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isSum";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "historicEffectivePeriodAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredPeriodAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "depositInsuredPeriodAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "minimumCurrentEffectivePeriodAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "minimumHistoricEffectivePeriodAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "minimumHistoricPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+22)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premiumHistoricPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+23)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "minimumInsuredPeriodAmount";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

