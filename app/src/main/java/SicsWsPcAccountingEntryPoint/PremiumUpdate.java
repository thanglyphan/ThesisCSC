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

public class PremiumUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public BigDecimal premiumAnnualAmount;
    
    public BigDecimal premiumAnnualAmountOurShare;
    
    public BigDecimal premiumPeriodAmount;
    
    public BigDecimal premiumPeriodAmountOurShare;
    
    public SicsRateReference premiumRate;

    public PremiumUpdate ()
    {
    }

    public PremiumUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("premiumAnnualAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premiumAnnualAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premiumAnnualAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premiumAnnualAmountOurShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premiumAnnualAmountOurShare = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premiumAnnualAmountOurShare = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premiumPeriodAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premiumPeriodAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premiumPeriodAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premiumPeriodAmountOurShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premiumPeriodAmountOurShare = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premiumPeriodAmountOurShare = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premiumRate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premiumRate = (SicsRateReference)__envelope.get(j,SicsRateReference.class,false);
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
            return this.premiumAnnualAmount!=null?this.premiumAnnualAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.premiumAnnualAmountOurShare!=null?this.premiumAnnualAmountOurShare.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.premiumPeriodAmount!=null?this.premiumPeriodAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.premiumPeriodAmountOurShare!=null?this.premiumPeriodAmountOurShare.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.premiumRate!=null?this.premiumRate:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premiumAnnualAmount";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premiumAnnualAmountOurShare";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premiumPeriodAmount";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premiumPeriodAmountOurShare";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = SicsRateReference.class;
            info.name = "premiumRate";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

