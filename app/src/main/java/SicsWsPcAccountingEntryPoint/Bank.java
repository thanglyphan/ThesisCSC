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

public class Bank extends Party implements KvmSerializable,java.io.Serializable
{

    
    public OrganisationName currentName;
    
    public OrganisationNameList alternativeNameList;
    
    public OrganisationNameList formerNameList;
    
	/**
	* SubclassNumber: 235. Code: NONE ,PROVISIONAL ,INACTIVE ,APPROVED.
	*                      Completeness
	*/
    public SicsReferenceDataReference status;

    public Bank ()
    {
    }

    public Bank (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("currentName"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.currentName = (OrganisationName)__envelope.get(j,OrganisationName.class,false);
                    }
                    continue;
                }
                if (info.name.equals("alternativeNameList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.alternativeNameList = new OrganisationNameList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("formerNameList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.formerNameList = new OrganisationNameList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("status"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.status = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
            return currentName;
        }
        if(propertyIndex==count+1)
        {
            return this.alternativeNameList!=null?this.alternativeNameList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.formerNameList!=null?this.formerNameList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return status;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = OrganisationName.class;
            info.name = "currentName";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "alternativeNameList";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "formerNameList";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "status";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

