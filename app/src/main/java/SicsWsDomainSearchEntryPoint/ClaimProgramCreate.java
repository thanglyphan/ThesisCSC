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

public class ClaimProgramCreate extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public String name;
    
	/**
	* SubclassNumber: 00019.
	*/
    public SicsReferenceDataReference mcob;
    
	/**
	* SubclassNumber: 00003.
	*/
    public SicsReferenceDataReference cob;
    
	/**
	* SubclassNumber: 00050.
	*/
    public SicsReferenceDataReference scob;
    
	/**
	* SubclassNumber: 00051,00265,00266,00267,00268,00269,00270,00271,00271,00273,00274,00275,00276,00277,00278,00053,00214,00216,00218,00261,00262,00263,00264,00052,00054,00215,00217,00219.
	*/
    public SicsReferenceDataReference additionalClassification;
    
	/**
	* SubclassNumber: 00066.
	*/
    public SicsReferenceDataReference cessionBasis;
    
    public SicsLegalAreaReference country;
    
    public Boolean isActive;
    
    public String note;
    
    public ClaimsClaimProgramCPPeriodCreate cpPeriod;

    public ClaimProgramCreate ()
    {
    }

    public ClaimProgramCreate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("mcob"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.mcob = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("cob"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.cob = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("scob"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.scob = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("additionalClassification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.additionalClassification = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("cessionBasis"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.cessionBasis = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("country"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.country = (SicsLegalAreaReference)__envelope.get(j,SicsLegalAreaReference.class,false);
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
                if (info.name.equals("cpPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.cpPeriod = (ClaimsClaimProgramCPPeriodCreate)__envelope.get(j,ClaimsClaimProgramCPPeriodCreate.class,false);
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
            return this.name!=null?this.name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.mcob!=null?this.mcob:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.cob!=null?this.cob:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.scob!=null?this.scob:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.additionalClassification!=null?this.additionalClassification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.cessionBasis!=null?this.cessionBasis:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.country!=null?this.country:SoapPrimitive.NullSkip;
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
            return cpPeriod;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "name";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "mcob";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "cob";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "scob";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "additionalClassification";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "cessionBasis";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsLegalAreaReference.class;
            info.name = "country";
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
            info.type = ClaimsClaimProgramCPPeriodCreate.class;
            info.name = "cpPeriod";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

