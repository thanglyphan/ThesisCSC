package SicsWsTaskManagementEntryPoint;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 30/01/2017
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class ClaimToInsuredClaimantRelationship extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 0501. Codes: INS, CLA.
	*/
    public SicsReferenceDataReference insuredRole;
    
    public SicsBusinessPartnerReference insured;
    
    public String insuredClaimantTextName;
    
	/**
	* SubclassNumber: 0524. Codes: ANY.
	*/
    public SicsReferenceDataReference consequenceOfLoss;
    
	/**
	* Only available for Individual claims on Policy Ceded.
	*/
    public String insuredClaimantIdentifier;
    
	/**
	* Only available for Individual claims on Policy Ceded.
	*/
    public String insuredClaimantCity;
    
	/**
	* Only available for Individual claims on Policy Ceded.
	*/
    public SicsCountryReference insuredClaimantCountry;

    public ClaimToInsuredClaimantRelationship ()
    {
    }

    public ClaimToInsuredClaimantRelationship (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("insuredRole"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredRole = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insured"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insured = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insuredClaimantTextName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredClaimantTextName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.insuredClaimantTextName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("consequenceOfLoss"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.consequenceOfLoss = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insuredClaimantIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredClaimantIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.insuredClaimantIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredClaimantCity"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredClaimantCity = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.insuredClaimantCity = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredClaimantCountry"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredClaimantCountry = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
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
            return this.insuredRole!=null?this.insuredRole:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.insured!=null?this.insured:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.insuredClaimantTextName!=null?this.insuredClaimantTextName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.consequenceOfLoss!=null?this.consequenceOfLoss:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.insuredClaimantIdentifier!=null?this.insuredClaimantIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.insuredClaimantCity!=null?this.insuredClaimantCity:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.insuredClaimantCountry!=null?this.insuredClaimantCountry:SoapPrimitive.NullSkip;
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
            info.type = SicsReferenceDataReference.class;
            info.name = "insuredRole";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "insured";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredClaimantTextName";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "consequenceOfLoss";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredClaimantIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredClaimantCity";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsCountryReference.class;
            info.name = "insuredClaimantCountry";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
