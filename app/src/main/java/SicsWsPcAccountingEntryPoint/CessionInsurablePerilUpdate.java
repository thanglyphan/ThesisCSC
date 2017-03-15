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

public class CessionInsurablePerilUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsCurrencyReference currency;
    
    public BigDecimal exposure;
    
    public BigDecimal ourExposure;
    
    public BigDecimal cedentExposure;
    
    public BigDecimal grossLiability;
    
    public BigDecimal ourGrossLiability;
    
    public BigDecimal percent;
    
    public java.util.Date attachmentPeriodStartDate;
    
    public java.util.Date attachmentPeriodEndDate;
    
    public Boolean isAnnualPremium;
    
    public Boolean isLocationUsedForCalculation;
    
    public TimeMeasurementList timeMeasurementList;
    
    public DeductibleList deductibleList;
    
    public LimitList limitList;
    
    public PremiumList premiumList;
    
	/**
	* SubclassNumber: 01044. Code : TSI , ALL .SicsRefLimitPremiumOptionalField.
	*/
    public SicsReferenceDataReference coInsuranceApplicableOn;
    
    public Coinsurance coinsurance;
    
    public TimeMeasurementListUpdate timeMeasurementListUpdate;
    
    public DeductibleListUpdate deductibleListUpdate;
    
    public LimitListUpdate limitListUpdate;
    
    public PremiumListUpdate premiumListUpdate;

    public CessionInsurablePerilUpdate ()
    {
    }

    public CessionInsurablePerilUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
	    
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
                if (info.name.equals("exposure"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.exposure = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.exposure = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ourExposure"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ourExposure = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.ourExposure = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("cedentExposure"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cedentExposure = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.cedentExposure = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("grossLiability"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.grossLiability = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.grossLiability = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ourGrossLiability"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ourGrossLiability = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.ourGrossLiability = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("percent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.percent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.percent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("attachmentPeriodStartDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.attachmentPeriodStartDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.attachmentPeriodStartDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("attachmentPeriodEndDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.attachmentPeriodEndDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.attachmentPeriodEndDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isAnnualPremium"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAnnualPremium = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAnnualPremium = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isLocationUsedForCalculation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isLocationUsedForCalculation = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isLocationUsedForCalculation = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("timeMeasurementList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.timeMeasurementList = new TimeMeasurementList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("deductibleList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deductibleList = new DeductibleList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("limitList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.limitList = new LimitList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("premiumList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premiumList = new PremiumList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("coInsuranceApplicableOn"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.coInsuranceApplicableOn = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("coinsurance"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.coinsurance = (Coinsurance)__envelope.get(j,Coinsurance.class,false);
                    }
                    continue;
                }
                if (info.name.equals("timeMeasurementListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.timeMeasurementListUpdate = (TimeMeasurementListUpdate)__envelope.get(j,TimeMeasurementListUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("deductibleListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deductibleListUpdate = (DeductibleListUpdate)__envelope.get(j,DeductibleListUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("limitListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.limitListUpdate = (LimitListUpdate)__envelope.get(j,LimitListUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("premiumListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premiumListUpdate = (PremiumListUpdate)__envelope.get(j,PremiumListUpdate.class,false);
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.currency!=null?this.currency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.exposure!=null?this.exposure.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.ourExposure!=null?this.ourExposure.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.cedentExposure!=null?this.cedentExposure.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.grossLiability!=null?this.grossLiability.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.ourGrossLiability!=null?this.ourGrossLiability.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.percent!=null?this.percent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.attachmentPeriodStartDate!=null?Helper.getDateFormat().format(this.attachmentPeriodStartDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.attachmentPeriodEndDate!=null?Helper.getDateFormat().format(this.attachmentPeriodEndDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.isAnnualPremium!=null?this.isAnnualPremium:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.isLocationUsedForCalculation!=null?this.isLocationUsedForCalculation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.timeMeasurementList!=null?this.timeMeasurementList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.deductibleList!=null?this.deductibleList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.limitList!=null?this.limitList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==14)
        {
            return this.premiumList!=null?this.premiumList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==15)
        {
            return this.coInsuranceApplicableOn!=null?this.coInsuranceApplicableOn:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==16)
        {
            return this.coinsurance!=null?this.coinsurance:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==17)
        {
            return this.timeMeasurementListUpdate!=null?this.timeMeasurementListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==18)
        {
            return this.deductibleListUpdate!=null?this.deductibleListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==19)
        {
            return this.limitListUpdate!=null?this.limitListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==20)
        {
            return this.premiumListUpdate!=null?this.premiumListUpdate:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 21;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "exposure";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ourExposure";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cedentExposure";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "grossLiability";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ourGrossLiability";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "percent";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "attachmentPeriodStartDate";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "attachmentPeriodEndDate";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAnnualPremium";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isLocationUsedForCalculation";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "timeMeasurementList";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "deductibleList";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "limitList";
            info.namespace= "";
        }
        if(propertyIndex==14)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "premiumList";
            info.namespace= "";
        }
        if(propertyIndex==15)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "coInsuranceApplicableOn";
            info.namespace= "";
        }
        if(propertyIndex==16)
        {
            info.type = Coinsurance.class;
            info.name = "coinsurance";
            info.namespace= "";
        }
        if(propertyIndex==17)
        {
            info.type = TimeMeasurementListUpdate.class;
            info.name = "timeMeasurementListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==18)
        {
            info.type = DeductibleListUpdate.class;
            info.name = "deductibleListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==19)
        {
            info.type = LimitListUpdate.class;
            info.name = "limitListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==20)
        {
            info.type = PremiumListUpdate.class;
            info.name = "premiumListUpdate";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

