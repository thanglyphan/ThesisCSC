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

public class BrandedProductDetail extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsReferenceData brandedProduct;
    
    public java.util.Date validFrom;
    
    public java.util.Date validTo;
    
    public BrandedProductClassification brandedProductClassification=new BrandedProductClassification();

    public BrandedProductDetail ()
    {
    }

    public BrandedProductDetail (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("brandedProduct"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.brandedProduct = (SicsReferenceData)__envelope.get(j,SicsReferenceData.class,false);
                    }
                    continue;
                }
                if (info.name.equals("validFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.validFrom = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.validFrom = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("validTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.validTo = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.validTo = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("brandedProductClassification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.brandedProductClassification = new BrandedProductClassification(j,__envelope);
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
            return brandedProduct;
        }
        if(propertyIndex==1)
        {
            return this.validFrom!=null?Helper.getDateFormat().format(this.validFrom):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.validTo!=null?Helper.getDateFormat().format(this.validTo):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return brandedProductClassification;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsReferenceData.class;
            info.name = "brandedProduct";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "validFrom";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "validTo";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "brandedProductClassification";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

