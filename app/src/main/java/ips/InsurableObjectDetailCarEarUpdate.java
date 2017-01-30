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

public class InsurableObjectDetailCarEarUpdate extends InsurableObjectDetailUpdate implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 534. SicsRefInsurableObjectOccupation
	*                Occupation
	*/
    public SicsReferenceDataReference engineeringOccupation;
    
	/**
	* SubclassNumber: 535. SicsRefInsurableObjectClassification
	*                Classification
	*/
    public SicsReferenceDataReference engineeringOccupationClassification;
    
	/**
	* SubclassNumber: 506. SicsRefEngineeringConstructionType
	*/
    public SicsReferenceDataReference typeOfConstruction;
    
	/**
	* SubclassNumber: 507. SicsRefEngineeringConstructionCategory
	*/
    public SicsReferenceDataReference constructionCategory;
    
    public InsurableObjectDetailCarEarRoleList insurableObjectDetailCarEarRoleList;
    
    public InsurableObjectDetailCarEarRoleListUpdate insurableObjectDetailCarEarRoleListUpdate;

    public InsurableObjectDetailCarEarUpdate ()
    {
    }

    public InsurableObjectDetailCarEarUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("engineeringOccupation"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.engineeringOccupation = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("engineeringOccupationClassification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.engineeringOccupationClassification = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("typeOfConstruction"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfConstruction = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("constructionCategory"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.constructionCategory = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectDetailCarEarRoleList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectDetailCarEarRoleList = new InsurableObjectDetailCarEarRoleList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectDetailCarEarRoleListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectDetailCarEarRoleListUpdate = (InsurableObjectDetailCarEarRoleListUpdate)__envelope.get(j,InsurableObjectDetailCarEarRoleListUpdate.class,false);
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
            return this.engineeringOccupation!=null?this.engineeringOccupation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.engineeringOccupationClassification!=null?this.engineeringOccupationClassification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.typeOfConstruction!=null?this.typeOfConstruction:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.constructionCategory!=null?this.constructionCategory:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.insurableObjectDetailCarEarRoleList!=null?this.insurableObjectDetailCarEarRoleList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.insurableObjectDetailCarEarRoleListUpdate!=null?this.insurableObjectDetailCarEarRoleListUpdate:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "engineeringOccupation";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "engineeringOccupationClassification";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfConstruction";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "constructionCategory";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "insurableObjectDetailCarEarRoleList";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = InsurableObjectDetailCarEarRoleListUpdate.class;
            info.name = "insurableObjectDetailCarEarRoleListUpdate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

