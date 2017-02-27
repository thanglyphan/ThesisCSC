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
import java.math.BigDecimal;

/**
* Referring to Sics/nt reinstatement GUI: One such element updates exchageRateForReinstatement 
*             on limitPremium condition.
*/
public class ReinstatementFixedExchangeRate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Currency from the Limit/Premium condition.
	*/
    public SicsCurrencyReference currency;
    
	/**
	* ExchangeRate for currency above.
	*/
    public BigDecimal exchangeRateForReinstatement;
    
	/**
	* comment for exchangeRate above.
	*/
    public String exchangeRateNote;

    public ReinstatementFixedExchangeRate ()
    {
    }

    public ReinstatementFixedExchangeRate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("exchangeRateForReinstatement"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.exchangeRateForReinstatement = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.exchangeRateForReinstatement = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("exchangeRateNote"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.exchangeRateNote = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.exchangeRateNote = (String)obj;
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
            return currency;
        }
        if(propertyIndex==1)
        {
            return this.exchangeRateForReinstatement!=null?this.exchangeRateForReinstatement.toString():SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==2)
        {
            return this.exchangeRateNote!=null?this.exchangeRateNote:SoapPrimitive.NullNilElement;
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
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "exchangeRateForReinstatement";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "exchangeRateNote";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

