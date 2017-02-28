package SicsWsDomainSearchEntryPoint;

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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class Business extends BusinessCommonUpdateAndCreate implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< SicsGroupReference> businessGroup =new ArrayList<SicsGroupReference >();
    
    public String identifier;
    
    public String identifierPrefix;
    
    public Long identifierSerieNumber;
    
    public String identifierSuffix;
    
	/**
	* SubclassNumber: 45. SicsRefBusinessDirection (restriction: code value "IAB" only)
	*/
    public SicsReferenceDataReference businessDirection;
    
	/**
	* SubclassNumber: 46. SicsRefTypeOfBusiness (restriction: prop/np fac/treaty)
	*/
    public SicsReferenceDataReference typeOfBusiness;
    
    public java.util.Date inceptionDate;
    
    public ArrayList< InsuredPeriod> insuredPeriod =new ArrayList<InsuredPeriod >();
    
	/**
	* SubclassNumber: 1074. SicsRefExternalSystemName
	*/
    public SicsReferenceDataReference primarySystem;

    public Business ()
    {
    }

    public Business (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("businessGroup"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.businessGroup==null)
                        {
                            this.businessGroup = new ArrayList< SicsGroupReference>();
                        }
                        java.lang.Object j =obj;
                        SicsGroupReference j1= (SicsGroupReference)__envelope.get(j,SicsGroupReference.class,false);
                        this.businessGroup.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("identifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.identifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("identifierPrefix"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifierPrefix = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.identifierPrefix = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("identifierSerieNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifierSerieNumber = new Long(j.toString());
                            }
                        }
                        else if (obj instanceof Long){
                            this.identifierSerieNumber = (Long)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("identifierSuffix"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifierSuffix = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.identifierSuffix = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessDirection"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessDirection = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("typeOfBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfBusiness = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("inceptionDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.inceptionDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.inceptionDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriod"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.insuredPeriod==null)
                        {
                            this.insuredPeriod = new ArrayList< InsuredPeriod>();
                        }
                        java.lang.Object j =obj;
                        InsuredPeriod j1= (InsuredPeriod)__envelope.get(j,InsuredPeriod.class,false);
                        this.insuredPeriod.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("primarySystem"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.primarySystem = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.businessGroup.size())
        {
            return this.businessGroup.get(propertyIndex-(count+0));
        }
        if(propertyIndex==count+0+this.businessGroup.size())
        {
            return this.identifier!=null?this.identifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1+this.businessGroup.size())
        {
            return this.identifierPrefix!=null?this.identifierPrefix:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2+this.businessGroup.size())
        {
            return this.identifierSerieNumber!=null?this.identifierSerieNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3+this.businessGroup.size())
        {
            return this.identifierSuffix!=null?this.identifierSuffix:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4+this.businessGroup.size())
        {
            return businessDirection;
        }
        if(propertyIndex==count+5+this.businessGroup.size())
        {
            return this.typeOfBusiness!=null?this.typeOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6+this.businessGroup.size())
        {
            return this.inceptionDate!=null?Helper.getDateFormat().format(this.inceptionDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+7+this.businessGroup.size() && propertyIndex < count+7+this.businessGroup.size()+this.insuredPeriod.size())
        {
            return this.insuredPeriod.get(propertyIndex-(count+7+this.businessGroup.size()));
        }
        if(propertyIndex==count+7+this.businessGroup.size()+this.insuredPeriod.size())
        {
            return this.primarySystem!=null?this.primarySystem:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+8+businessGroup.size()+insuredPeriod.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.businessGroup.size())
        {
            info.type = SicsGroupReference.class;
            info.name = "businessGroup";
            info.namespace= "";
        }
        if(propertyIndex==count+0+this.businessGroup.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifier";
            info.namespace= "";
        }
        if(propertyIndex==count+1+this.businessGroup.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifierPrefix";
            info.namespace= "";
        }
        if(propertyIndex==count+2+this.businessGroup.size())
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "identifierSerieNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+3+this.businessGroup.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifierSuffix";
            info.namespace= "";
        }
        if(propertyIndex==count+4+this.businessGroup.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "businessDirection";
            info.namespace= "";
        }
        if(propertyIndex==count+5+this.businessGroup.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfBusiness";
            info.namespace= "";
        }
        if(propertyIndex==count+6+this.businessGroup.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "inceptionDate";
            info.namespace= "";
        }
        if(propertyIndex>=count+7+this.businessGroup.size() && propertyIndex < count+7+this.businessGroup.size()+this.insuredPeriod.size())
        {
            info.type = InsuredPeriod.class;
            info.name = "insuredPeriod";
            info.namespace= "";
        }
        if(propertyIndex==count+7+this.businessGroup.size()+this.insuredPeriod.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "primarySystem";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

