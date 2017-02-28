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

public class ClaimHeadlineLossCriteria extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public HeadlineLossProperties properties;
    
    public ClaimLegalAreaCriteria locations;
    
    public ClaimCriteria classification;

    public ClaimHeadlineLossCriteria ()
    {
    }

    public ClaimHeadlineLossCriteria (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("properties"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.properties = (HeadlineLossProperties)__envelope.get(j,HeadlineLossProperties.class,false);
                    }
                    continue;
                }
                if (info.name.equals("locations"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.locations = (ClaimLegalAreaCriteria)__envelope.get(j,ClaimLegalAreaCriteria.class,false);
                    }
                    continue;
                }
                if (info.name.equals("classification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.classification = (ClaimCriteria)__envelope.get(j,ClaimCriteria.class,false);
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
            return this.properties!=null?this.properties:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.locations!=null?this.locations:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.classification!=null?this.classification:SoapPrimitive.NullSkip;
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
            info.type = HeadlineLossProperties.class;
            info.name = "properties";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = ClaimLegalAreaCriteria.class;
            info.name = "locations";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = ClaimCriteria.class;
            info.name = "classification";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

