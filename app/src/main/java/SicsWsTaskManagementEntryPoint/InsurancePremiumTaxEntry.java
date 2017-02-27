package SicsWsTaskManagementEntryPoint;

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

public class InsurancePremiumTaxEntry extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public Integer amendmentNumber=0;
    
    public Integer instalmentNumber=0;
    
    public SicsCurrencyReference currency;
    
    public SicsCountryReference taxCountry;
    
	/**
	* SubclassNumber: 272.
	*                 Class Of Insurance/Risk
	*/
    public SicsReferenceDataReference insuranceRisk;

    public InsurancePremiumTaxEntry ()
    {
    }

    public InsurancePremiumTaxEntry (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("amendmentNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amendmentNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.amendmentNumber = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("instalmentNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.instalmentNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.instalmentNumber = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("currency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.currency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("taxCountry"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.taxCountry = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insuranceRisk"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuranceRisk = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
            return amendmentNumber;
        }
        if(propertyIndex==1)
        {
            return instalmentNumber;
        }
        if(propertyIndex==2)
        {
            return currency;
        }
        if(propertyIndex==3)
        {
            return this.taxCountry!=null?this.taxCountry:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==4)
        {
            return this.insuranceRisk!=null?this.insuranceRisk:SoapPrimitive.NullNilElement;
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
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "amendmentNumber";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "instalmentNumber";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsCountryReference.class;
            info.name = "taxCountry";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "insuranceRisk";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

