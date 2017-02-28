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

public class BusinessFromBRTFindCriteria extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public BusinessProperties properties;
    
    public PeriodAndStatus periodAndStatus;
    
    public Classification_1 classification;
    
    public ClassificationReferenceDataList additionalClassification;
    
    public InternalStructure internalStructure;

    public BusinessFromBRTFindCriteria ()
    {
    }

    public BusinessFromBRTFindCriteria (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                        this.properties = (BusinessProperties)__envelope.get(j,BusinessProperties.class,false);
                    }
                    continue;
                }
                if (info.name.equals("periodAndStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.periodAndStatus = (PeriodAndStatus)__envelope.get(j,PeriodAndStatus.class,false);
                    }
                    continue;
                }
                if (info.name.equals("classification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.classification = (Classification_1)__envelope.get(j,Classification_1.class,false);
                    }
                    continue;
                }
                if (info.name.equals("additionalClassification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.additionalClassification = new ClassificationReferenceDataList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("internalStructure"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.internalStructure = (InternalStructure)__envelope.get(j,InternalStructure.class,false);
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
            return this.periodAndStatus!=null?this.periodAndStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.classification!=null?this.classification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.additionalClassification!=null?this.additionalClassification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.internalStructure!=null?this.internalStructure:SoapPrimitive.NullSkip;
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
            info.type = BusinessProperties.class;
            info.name = "properties";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PeriodAndStatus.class;
            info.name = "periodAndStatus";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = Classification_1.class;
            info.name = "classification";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "additionalClassification";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = InternalStructure.class;
            info.name = "internalStructure";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

