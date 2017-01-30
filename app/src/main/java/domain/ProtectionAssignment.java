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

public class ProtectionAssignment extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Mandatory for scope of cover and section related web services
	*/
    public String scopeOfCoverName;
    
	/**
	* Mandatory for scope of cover and  section related webserivces
	*/
    public RetrocessionInterBusinessRelationshipList propProtectionAssignment;
    
	/**
	* Mandatory for scope of cover and  section related webserivces
	*/
    public RetrocessionInterBusinessRelationshipList nonPropProtectionAssignment;
    
    public ProtectionAssignmentChildrenList protectionAssignmentChildrenList;

    public ProtectionAssignment ()
    {
    }

    public ProtectionAssignment (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("scopeOfCoverName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.scopeOfCoverName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.scopeOfCoverName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("propProtectionAssignment"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.propProtectionAssignment = new RetrocessionInterBusinessRelationshipList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("nonPropProtectionAssignment"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.nonPropProtectionAssignment = new RetrocessionInterBusinessRelationshipList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("protectionAssignmentChildrenList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.protectionAssignmentChildrenList = new ProtectionAssignmentChildrenList(j,__envelope);
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
            return this.scopeOfCoverName!=null?this.scopeOfCoverName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.propProtectionAssignment!=null?this.propProtectionAssignment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.nonPropProtectionAssignment!=null?this.nonPropProtectionAssignment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.protectionAssignmentChildrenList!=null?this.protectionAssignmentChildrenList:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "scopeOfCoverName";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "propProtectionAssignment";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "nonPropProtectionAssignment";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "protectionAssignmentChildrenList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
