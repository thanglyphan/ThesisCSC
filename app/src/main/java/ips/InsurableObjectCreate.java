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

public class InsurableObjectCreate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Name
	*/
    public String insurableObjectName;
    
    public InsurableObjectGeneralCreate insurableObjectGeneral;
    
    public InsurableObjectDetailCreate insurableObjectDetail;
    
	/**
	* SubclassNumber: 128. SicsRefTypeOfInsurableObject
	*/
    public SicsReferenceDataReference typeOfInsurableObject;
    
    public InsurableObjectStatusUpdate insurableObjectStatus;
    
	/**
	* Unassigned and Delete related functionality should not use in case of Create IO.
	*/
    public AccumulationGroupListUpdate accumulationGroupListUpdate;
    
    public InsurableObjectHierarchyLinkForParent insurableObjectHierarchyLinkForParent;
    
    public InsurableObjectHierarchyLinkForChildrenList insurableObjectHierarchyLinkForChildrenList;
    
    public InsurableObjectSurveyList insurableObjectSurveyList;
    
    public InsurableObjectLossList insurableObjectLossList;
    
    public AccumulationGroupList accumulationGroupList;

    public InsurableObjectCreate ()
    {
    }

    public InsurableObjectCreate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("insurableObjectName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insurableObjectName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.insurableObjectName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectGeneral"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectGeneral = (InsurableObjectGeneralCreate)__envelope.get(j,InsurableObjectGeneralCreate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectDetail"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectDetail = (InsurableObjectDetailCreate)__envelope.get(j,InsurableObjectDetailCreate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("typeOfInsurableObject"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfInsurableObject = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectStatus = (InsurableObjectStatusUpdate)__envelope.get(j,InsurableObjectStatusUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("accumulationGroupListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accumulationGroupListUpdate = (AccumulationGroupListUpdate)__envelope.get(j,AccumulationGroupListUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectHierarchyLinkForParent"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectHierarchyLinkForParent = (InsurableObjectHierarchyLinkForParent)__envelope.get(j,InsurableObjectHierarchyLinkForParent.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectHierarchyLinkForChildrenList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectHierarchyLinkForChildrenList = new InsurableObjectHierarchyLinkForChildrenList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectSurveyList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectSurveyList = new InsurableObjectSurveyList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectLossList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectLossList = new InsurableObjectLossList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("accumulationGroupList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accumulationGroupList = new AccumulationGroupList(j,__envelope);
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
            return insurableObjectName;
        }
        if(propertyIndex==1)
        {
            return this.insurableObjectGeneral!=null?this.insurableObjectGeneral:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.insurableObjectDetail!=null?this.insurableObjectDetail:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return typeOfInsurableObject;
        }
        if(propertyIndex==4)
        {
            return this.insurableObjectStatus!=null?this.insurableObjectStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.accumulationGroupListUpdate!=null?this.accumulationGroupListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.insurableObjectHierarchyLinkForParent!=null?this.insurableObjectHierarchyLinkForParent:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.insurableObjectHierarchyLinkForChildrenList!=null?this.insurableObjectHierarchyLinkForChildrenList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.insurableObjectSurveyList!=null?this.insurableObjectSurveyList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.insurableObjectLossList!=null?this.insurableObjectLossList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.accumulationGroupList!=null?this.accumulationGroupList:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 11;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insurableObjectName";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = InsurableObjectGeneralCreate.class;
            info.name = "insurableObjectGeneral";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = InsurableObjectDetailCreate.class;
            info.name = "insurableObjectDetail";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfInsurableObject";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = InsurableObjectStatusUpdate.class;
            info.name = "insurableObjectStatus";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = AccumulationGroupListUpdate.class;
            info.name = "accumulationGroupListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = InsurableObjectHierarchyLinkForParent.class;
            info.name = "insurableObjectHierarchyLinkForParent";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "insurableObjectHierarchyLinkForChildrenList";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "insurableObjectSurveyList";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "insurableObjectLossList";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "accumulationGroupList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

