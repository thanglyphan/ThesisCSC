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

public class BusinessPartnerGroup extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Optional in Update, mandatory in Create
	*/
    public String code;
    
	/**
	* Optional in Update, mandatory in Create
	*/
    public String name;
    
	/**
	* Countries
	*/
    public CountryList countryList;
    
	/**
	* States
	*/
    public StateList stateList;
    
	/**
	* Main Class Of Business
	*/
    public ClassOfBusinessesList classOfBusinessesList;
    
	/**
	* Notes tab
	*/
    public String note;
    
	/**
	* Members tab
	*/
    public BusinessPartnerMembershipList businessPartnerMembershipList;

    public BusinessPartnerGroup ()
    {
    }

    public BusinessPartnerGroup (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("code"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.code = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.code = (String)obj;
                        }
                    }
                    continue;
                }
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
                if (info.name.equals("countryList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.countryList = (CountryList)__envelope.get(j,CountryList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("stateList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.stateList = (StateList)__envelope.get(j,StateList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("classOfBusinessesList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.classOfBusinessesList = (ClassOfBusinessesList)__envelope.get(j,ClassOfBusinessesList.class,false);
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
                if (info.name.equals("businessPartnerMembershipList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartnerMembershipList = new BusinessPartnerMembershipList(j,__envelope);
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
            return this.code!=null?this.code:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.name!=null?this.name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.countryList!=null?this.countryList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.stateList!=null?this.stateList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.classOfBusinessesList!=null?this.classOfBusinessesList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.businessPartnerMembershipList!=null?this.businessPartnerMembershipList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "code";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "name";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = CountryList.class;
            info.name = "countryList";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = StateList.class;
            info.name = "stateList";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = ClassOfBusinessesList.class;
            info.name = "classOfBusinessesList";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "businessPartnerMembershipList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

