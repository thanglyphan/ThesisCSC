package SicsWsDomainSearchEntryPoint;

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

public class InstalmentConditionDetail extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* XXXXXX
	*                      (Currencies)
	*/
    public SicsCurrencyReference currency;
    
	/**
	* -9->99
	*                      Number of Instalments
	*/
    public Integer numberOfInstalments;
    
	/**
	* SubclassNumber:  83. SicsRefMiscellaneous
	*                      In Advance / In Arrears
	*/
    public SicsReferenceDataReference instalmentType;
    
	/**
	* XXXXXX
	*                      Payment of first Instalment
	*/
    public SicsWsTimeDurationReference paymentOfFirstInstalment;
    
	/**
	* XXXXXX
	*                      Payment of subsequent Instalment
	*/
    public SicsWsTimeDurationReference paymentOfSubsequentInstalment;

    public InstalmentConditionDetail ()
    {
    }

    public InstalmentConditionDetail (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("numberOfInstalments"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.numberOfInstalments = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.numberOfInstalments = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("instalmentType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.instalmentType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paymentOfFirstInstalment"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paymentOfFirstInstalment = (SicsWsTimeDurationReference)__envelope.get(j,SicsWsTimeDurationReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paymentOfSubsequentInstalment"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paymentOfSubsequentInstalment = (SicsWsTimeDurationReference)__envelope.get(j,SicsWsTimeDurationReference.class,false);
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
            return this.numberOfInstalments!=null?this.numberOfInstalments:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.instalmentType!=null?this.instalmentType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.paymentOfFirstInstalment!=null?this.paymentOfFirstInstalment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.paymentOfSubsequentInstalment!=null?this.paymentOfSubsequentInstalment:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+5;
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
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "numberOfInstalments";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "instalmentType";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsWsTimeDurationReference.class;
            info.name = "paymentOfFirstInstalment";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsWsTimeDurationReference.class;
            info.name = "paymentOfSubsequentInstalment";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

