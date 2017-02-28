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

public class DeductibleUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public BigDecimal deductiblePercent;
    
    public BigDecimal deductibleMinimumAmount;
    
    public BigDecimal deductibleMaximumAmount;

    public DeductibleUpdate ()
    {
    }

    public DeductibleUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("deductiblePercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deductiblePercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.deductiblePercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deductibleMinimumAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deductibleMinimumAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.deductibleMinimumAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deductibleMaximumAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deductibleMaximumAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.deductibleMaximumAmount = (BigDecimal)obj;
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
            return this.deductiblePercent!=null?this.deductiblePercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.deductibleMinimumAmount!=null?this.deductibleMinimumAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.deductibleMaximumAmount!=null?this.deductibleMaximumAmount.toString():SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "deductiblePercent";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "deductibleMinimumAmount";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "deductibleMaximumAmount";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

