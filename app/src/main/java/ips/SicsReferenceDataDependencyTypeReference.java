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

public class SicsReferenceDataDependencyTypeReference extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsAbstractReferenceDataTypeReference parentType;
    
    public SicsAbstractReferenceDataTypeReference childType;

    public SicsReferenceDataDependencyTypeReference ()
    {
    }

    public SicsReferenceDataDependencyTypeReference (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("parentType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.parentType = (SicsAbstractReferenceDataTypeReference)__envelope.get(j,SicsAbstractReferenceDataTypeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("childType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.childType = (SicsAbstractReferenceDataTypeReference)__envelope.get(j,SicsAbstractReferenceDataTypeReference.class,false);
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
            return parentType;
        }
        if(propertyIndex==1)
        {
            return childType;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsAbstractReferenceDataTypeReference.class;
            info.name = "parentType";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsAbstractReferenceDataTypeReference.class;
            info.name = "childType";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

