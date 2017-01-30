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

public class PersonCreate extends Party implements KvmSerializable,java.io.Serializable
{

    
    public String firstName;
    
    public String lastName;
    
    public String middleNames;
    
	/**
	* SubclassNumber: 206.
	*/
    public SicsReferenceDataReference title;
    
    public java.util.Date dateOfBirth;
    
    public java.util.Date dateOfDeath;
    
	/**
	* SubclassNumber: 15.
	*/
    public SicsReferenceDataReference sex;
    
	/**
	* SubclassNumber: 34.
	*/
    public SicsReferenceDataReference maritalStatus;
    
    public SicsCountryReference nationality;

    public PersonCreate ()
    {
    }

    public PersonCreate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("firstName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.firstName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.firstName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lastName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lastName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.lastName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("middleNames"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.middleNames = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.middleNames = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("title"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.title = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("dateOfBirth"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfBirth = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfBirth = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateOfDeath"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfDeath = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfDeath = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("sex"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.sex = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("maritalStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.maritalStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("nationality"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.nationality = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
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
            return firstName;
        }
        if(propertyIndex==count+1)
        {
            return lastName;
        }
        if(propertyIndex==count+2)
        {
            return middleNames;
        }
        if(propertyIndex==count+3)
        {
            return title;
        }
        if(propertyIndex==count+4)
        {
            return this.dateOfBirth!=null?Helper.getDateFormat().format(this.dateOfBirth):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.dateOfDeath!=null?Helper.getDateFormat().format(this.dateOfDeath):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.sex!=null?this.sex:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.maritalStatus!=null?this.maritalStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.nationality!=null?this.nationality:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+9;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "firstName";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lastName";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "middleNames";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "title";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfBirth";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfDeath";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "sex";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "maritalStatus";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = SicsCountryReference.class;
            info.name = "nationality";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
