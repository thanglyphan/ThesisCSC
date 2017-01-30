package ting;

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

public class SicsLegalAreaReference extends DomainObjectReference implements KvmSerializable,java.io.Serializable
{

    
    public SicsCountryReference sicsCountryReference;
    
    public SicsStateReference sicsStateReference;
    
    public SicsAreaGroupCountryReference sicsAreaGroupCountryReference;
    
    public SicsAreaGroupStateReference sicsAreaGroupStateReference;
    
    public SicsCityReference sicsCityReference;

    public SicsLegalAreaReference ()
    {
    }

    public SicsLegalAreaReference (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("sicsCountryReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.sicsCountryReference = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("sicsStateReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.sicsStateReference = (SicsStateReference)__envelope.get(j,SicsStateReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("sicsAreaGroupCountryReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.sicsAreaGroupCountryReference = (SicsAreaGroupCountryReference)__envelope.get(j,SicsAreaGroupCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("sicsAreaGroupStateReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.sicsAreaGroupStateReference = (SicsAreaGroupStateReference)__envelope.get(j,SicsAreaGroupStateReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("sicsCityReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.sicsCityReference = (SicsCityReference)__envelope.get(j,SicsCityReference.class,false);
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
            return this.sicsCountryReference!=null?this.sicsCountryReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.sicsStateReference!=null?this.sicsStateReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.sicsAreaGroupCountryReference!=null?this.sicsAreaGroupCountryReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.sicsAreaGroupStateReference!=null?this.sicsAreaGroupStateReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.sicsCityReference!=null?this.sicsCityReference:SoapPrimitive.NullSkip;
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
            info.type = SicsCountryReference.class;
            info.name = "sicsCountryReference";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsStateReference.class;
            info.name = "sicsStateReference";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsAreaGroupCountryReference.class;
            info.name = "sicsAreaGroupCountryReference";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsAreaGroupStateReference.class;
            info.name = "sicsAreaGroupStateReference";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsCityReference.class;
            info.name = "sicsCityReference";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

