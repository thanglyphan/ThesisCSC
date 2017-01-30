package ips;

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

public class ClaimLimitCondition extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date claimAppliedLimits;
    
    public SicsUserReference claimUserLimits;
    
    public Boolean hasUnlimitedCover;
    
    public BigDecimal claimLimitIncurredCoverAmountOurShare;
    
    public java.util.Date claimLimitShareAdviceDateAsDate;
    
    public Boolean automaticCalculationOfCoverOrExcess;
    
    public SicsCurrencyReference claimLimitIncurredCurrency;
    
    public BigDecimal claimLimitIncurredCoverAmount=BigDecimal.ZERO;
    
    public BigDecimal claimLimitIncurredExcessPointAmount;
    
    public SicsCurrencyReference claimLimitPaymentCurrency;
    
    public BigDecimal claimLimitPaymentCoverAmount=BigDecimal.ZERO;
    
    public BigDecimal claimLimitPaymentExcessPointAmount;

    public ClaimLimitCondition ()
    {
    }

    public ClaimLimitCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("claimAppliedLimits"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimAppliedLimits = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.claimAppliedLimits = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimUserLimits"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimUserLimits = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("hasUnlimitedCover"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.hasUnlimitedCover = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.hasUnlimitedCover = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimLimitIncurredCoverAmountOurShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimLimitIncurredCoverAmountOurShare = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimLimitIncurredCoverAmountOurShare = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimLimitShareAdviceDateAsDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimLimitShareAdviceDateAsDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.claimLimitShareAdviceDateAsDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("automaticCalculationOfCoverOrExcess"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.automaticCalculationOfCoverOrExcess = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.automaticCalculationOfCoverOrExcess = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimLimitIncurredCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimLimitIncurredCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimLimitIncurredCoverAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimLimitIncurredCoverAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimLimitIncurredCoverAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimLimitIncurredExcessPointAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimLimitIncurredExcessPointAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimLimitIncurredExcessPointAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimLimitPaymentCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimLimitPaymentCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimLimitPaymentCoverAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimLimitPaymentCoverAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimLimitPaymentCoverAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimLimitPaymentExcessPointAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimLimitPaymentExcessPointAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimLimitPaymentExcessPointAmount = (BigDecimal)obj;
                        }
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
            return this.claimAppliedLimits!=null?Helper.getDateFormat().format(this.claimAppliedLimits):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.claimUserLimits!=null?this.claimUserLimits:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.hasUnlimitedCover!=null?this.hasUnlimitedCover:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.claimLimitIncurredCoverAmountOurShare!=null?this.claimLimitIncurredCoverAmountOurShare.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.claimLimitShareAdviceDateAsDate!=null?Helper.getDateFormat().format(this.claimLimitShareAdviceDateAsDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.automaticCalculationOfCoverOrExcess!=null?this.automaticCalculationOfCoverOrExcess:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.claimLimitIncurredCurrency!=null?this.claimLimitIncurredCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.claimLimitIncurredCoverAmount!=null?this.claimLimitIncurredCoverAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.claimLimitIncurredExcessPointAmount!=null?this.claimLimitIncurredExcessPointAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.claimLimitPaymentCurrency!=null?this.claimLimitPaymentCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.claimLimitPaymentCoverAmount!=null?this.claimLimitPaymentCoverAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.claimLimitPaymentExcessPointAmount!=null?this.claimLimitPaymentExcessPointAmount.toString():SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 12;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimAppliedLimits";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsUserReference.class;
            info.name = "claimUserLimits";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "hasUnlimitedCover";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimLimitIncurredCoverAmountOurShare";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimLimitShareAdviceDateAsDate";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "automaticCalculationOfCoverOrExcess";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "claimLimitIncurredCurrency";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimLimitIncurredCoverAmount";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimLimitIncurredExcessPointAmount";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "claimLimitPaymentCurrency";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimLimitPaymentCoverAmount";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimLimitPaymentExcessPointAmount";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

