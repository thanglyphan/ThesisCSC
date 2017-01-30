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

public class Amendment extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* amendmentNumber is ignored when creating an Amendment or Extension
	*/
    public Integer amendmentNumber;
    
	/**
	* fromDate is ignored for Extensions (isExtension = true)
	*                       it is mandatory for creating Amendments
	*/
    public java.util.Date fromDate;
    
	/**
	* toDate is ignored for Amendments (isExtension = false)
	*                       it is mandatory for creating Extensions
	*/
    public java.util.Date toDate;
    
	/**
	* default value for amendetAt = today
	*/
    public java.util.Date amendetAt;
    
    public SicsUserReference underwriter;
    
	/**
	* SUBCLASS=1043, CODE= CORREC | ENDORS | NONE
	*/
    public SicsReferenceDataReference amendmentType;
    
    public String reference;
    
	/**
	* isActive default value = true
	*/
    public Boolean isActive;
    
    public String note;
    
	/**
	* isExtension default value = false
	*/
    public Boolean isExtension;

    public Amendment ()
    {
    }

    public Amendment (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("amendmentNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amendmentNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.amendmentNumber = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("fromDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fromDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.fromDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("toDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.toDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.toDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("amendetAt"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amendetAt = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.amendetAt = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("underwriter"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.underwriter = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("amendmentType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.amendmentType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.reference = (String)obj;
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
                if (info.name.equals("isExtension"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isExtension = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isExtension = (Boolean)obj;
                        }
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
            return this.amendmentNumber!=null?this.amendmentNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.fromDate!=null?Helper.getDateFormat().format(this.fromDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.toDate!=null?Helper.getDateFormat().format(this.toDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.amendetAt!=null?Helper.getDateFormat().format(this.amendetAt):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return underwriter;
        }
        if(propertyIndex==count+5)
        {
            return this.amendmentType!=null?this.amendmentType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.reference!=null?this.reference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.isActive!=null?this.isActive:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.isExtension!=null?this.isExtension:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+10;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "amendmentNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fromDate";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "toDate";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amendetAt";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsUserReference.class;
            info.name = "underwriter";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "amendmentType";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reference";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isActive";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isExtension";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

