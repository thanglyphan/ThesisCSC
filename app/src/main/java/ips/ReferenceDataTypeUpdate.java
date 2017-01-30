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

public class ReferenceDataTypeUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* The string length should be in the range of 1 to 60.
	*                This element is mandatory for Create Reference Data Type
	*/
    public String name;
    
	/**
	* Active
	*/
    public Boolean isActive;
    
	/**
	* Cache (Read) Values at Login
	*/
    public Boolean cacheValuesOnLogin;
    
	/**
	* Used in PC
	*/
    public Boolean isForPc;
    
	/**
	* Used in Life
	*/
    public Boolean isForLife;
    
	/**
	* Notes tab
	*/
    public String note;
    
	/**
	* Dependency Types tab
	*/
    public ReferenceDataDependencyTypeList childDependencyTypeList;
    
    public RemoveReferenceDataDependencyTypeList removeChildDependencyTypeList;

    public ReferenceDataTypeUpdate ()
    {
    }

    public ReferenceDataTypeUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("name"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.name = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.name = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isActive"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isActive = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isActive = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("cacheValuesOnLogin"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cacheValuesOnLogin = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.cacheValuesOnLogin = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isForPc"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isForPc = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isForPc = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isForLife"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isForLife = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isForLife = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("note"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.note = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.note = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("childDependencyTypeList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.childDependencyTypeList = new ReferenceDataDependencyTypeList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("removeChildDependencyTypeList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.removeChildDependencyTypeList = new RemoveReferenceDataDependencyTypeList(j,__envelope);
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
            return this.name!=null?this.name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.isActive!=null?this.isActive:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.cacheValuesOnLogin!=null?this.cacheValuesOnLogin:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.isForPc!=null?this.isForPc:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.isForLife!=null?this.isForLife:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.childDependencyTypeList!=null?this.childDependencyTypeList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.removeChildDependencyTypeList!=null?this.removeChildDependencyTypeList:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "name";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isActive";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "cacheValuesOnLogin";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isForPc";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isForLife";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "childDependencyTypeList";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "removeChildDependencyTypeList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

