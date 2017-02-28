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

public class InsurableObjectDetailAviationOrSpace extends InsurableObjectDetail implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 535. SicsRefInsurableObjectClassification
	*/
    public SicsReferenceDataReference classification;
    
	/**
	* Type (in Aviation)Launch Type (in Space)
	*/
    public String aircraftType;
    
    public SicsCountryReference countryBuilt;
    
	/**
	* SubclassNumber: 510. SicsRefAviationBuilder
	*                Manufacturer
	*/
    public SicsReferenceDataReference builtBy;
    
	/**
	* Construction No.
	*/
    public String constructionNumber;
    
    public Integer yearBuilt;

    public InsurableObjectDetailAviationOrSpace ()
    {
    }

    public InsurableObjectDetailAviationOrSpace (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("classification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.classification = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("aircraftType"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.aircraftType = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.aircraftType = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("countryBuilt"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.countryBuilt = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("builtBy"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.builtBy = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("constructionNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.constructionNumber = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.constructionNumber = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("yearBuilt"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.yearBuilt = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.yearBuilt = (Integer)obj;
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
            return this.classification!=null?this.classification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.aircraftType!=null?this.aircraftType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.countryBuilt!=null?this.countryBuilt:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.builtBy!=null?this.builtBy:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.constructionNumber!=null?this.constructionNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.yearBuilt!=null?this.yearBuilt:SoapPrimitive.NullSkip;
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
            info.name = "classification";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "aircraftType";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsCountryReference.class;
            info.name = "countryBuilt";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "builtBy";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "constructionNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "yearBuilt";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

