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

public class MarketGroundUpLoss extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public Boolean marketGroundUpLossReview;
    
    public Boolean isMarketLoss;
    
    public SicsCurrencyReference marketLossCurrency;
    
    public BigDecimal paidLossGroundUp;
    
    public BigDecimal paidExpenseGroundUp;

    public MarketGroundUpLoss ()
    {
    }

    public MarketGroundUpLoss (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("marketGroundUpLossReview"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.marketGroundUpLossReview = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.marketGroundUpLossReview = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isMarketLoss"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isMarketLoss = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isMarketLoss = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("marketLossCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.marketLossCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paidLossGroundUp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.paidLossGroundUp = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.paidLossGroundUp = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("paidExpenseGroundUp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.paidExpenseGroundUp = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.paidExpenseGroundUp = (BigDecimal)obj;
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
            return this.marketGroundUpLossReview!=null?this.marketGroundUpLossReview:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.isMarketLoss!=null?this.isMarketLoss:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.marketLossCurrency!=null?this.marketLossCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.paidLossGroundUp!=null?this.paidLossGroundUp.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.paidExpenseGroundUp!=null?this.paidExpenseGroundUp.toString():SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "marketGroundUpLossReview";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isMarketLoss";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "marketLossCurrency";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paidLossGroundUp";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paidExpenseGroundUp";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
