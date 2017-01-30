package domain;

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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class ClassificationConditionalExclusion extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public SicsCountryReference country;
    
    public SicsStateReference state;
    
	/**
	* SubclassNumber: 44.
	*/
    public ArrayList< SicsReferenceDataReference> excludedPeril =new ArrayList<SicsReferenceDataReference >();

    public ClassificationConditionalExclusion ()
    {
    }

    public ClassificationConditionalExclusion (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("country"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.country = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("state"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.state = (SicsStateReference)__envelope.get(j,SicsStateReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("excludedPeril"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.excludedPeril==null)
                        {
                            this.excludedPeril = new ArrayList< SicsReferenceDataReference>();
                        }
                        java.lang.Object j =obj;
                        SicsReferenceDataReference j1= (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                        this.excludedPeril.add(j1);
                   
        
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
            return this.country!=null?this.country:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.state!=null?this.state:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+2 && propertyIndex < count+2+this.excludedPeril.size())
        {
            return this.excludedPeril.get(propertyIndex-(count+2));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2+excludedPeril.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsCountryReference.class;
            info.name = "country";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsStateReference.class;
            info.name = "state";
            info.namespace= "";
        }
        if(propertyIndex>=count+2 && propertyIndex < count+2+this.excludedPeril.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "excludedPeril";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

