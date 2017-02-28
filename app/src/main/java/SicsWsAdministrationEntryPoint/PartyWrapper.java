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

public class PartyWrapper extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public String name;
    
    public Boolean isActive;
    
    public String location;
    
    public BusinessPartnerCategoryList businessPartnerCategoryList;
    
    public SicsPartyReference defaultIdentifier;
    
    public String employerNameString;
    
    public String employmentPosition;
    
    public Address address;
    
    public SicsCountryReference homeCountry;
    
    public SicsStateReference homeState;
    
    public String shortName;

    public PartyWrapper ()
    {
    }

    public PartyWrapper (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("location"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.location = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.location = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerCategoryList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartnerCategoryList = new BusinessPartnerCategoryList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("defaultIdentifier"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.defaultIdentifier = (SicsPartyReference)__envelope.get(j,SicsPartyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("employerNameString"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.employerNameString = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.employerNameString = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("employmentPosition"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.employmentPosition = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.employmentPosition = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("address"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.address = (Address)__envelope.get(j,Address.class,false);
                    }
                    continue;
                }
                if (info.name.equals("homeCountry"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.homeCountry = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("homeState"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.homeState = (SicsStateReference)__envelope.get(j,SicsStateReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("shortName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.shortName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.shortName = (String)obj;
                        }
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
            return this.location!=null?this.location:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.businessPartnerCategoryList!=null?this.businessPartnerCategoryList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.defaultIdentifier!=null?this.defaultIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.employerNameString!=null?this.employerNameString:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.employmentPosition!=null?this.employmentPosition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.address!=null?this.address:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.homeCountry!=null?this.homeCountry:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.homeState!=null?this.homeState:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.shortName!=null?this.shortName:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "location";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "businessPartnerCategoryList";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = SicsPartyReference.class;
            info.name = "defaultIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "employerNameString";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "employmentPosition";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = Address.class;
            info.name = "address";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = SicsCountryReference.class;
            info.name = "homeCountry";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = SicsStateReference.class;
            info.name = "homeState";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "shortName";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

