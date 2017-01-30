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
import java.math.BigDecimal;

public class LightBusinessRetrocession extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* ID
	*/
    public String identifier;
    
    public String title;
    
    public java.util.Date beginDateTime;
    
    public SicsBusinessPartnerReference businessPartner;
    
	/**
	* SubclassNumber: 225. SicsRefAccountGroup
	*/
    public SicsReferenceDataReference accountGroup;
    
	/**
	* retrocessionaire
	*/
    public String reinsurerName;
    
    public SicsBusinessPartnerReference broker;
    
	/**
	* SubclassNumber: 411. SicsRefProtectionCoverBasis   
	*                   CODE: GR | NAAP | NAPPBR | NAPPNPO | NANPPBR | NAFSP | NAFP | NANPFP | NAPP | NANPFAPP | NAPFSP | NAPFP.
	*                   Cover Basis
	*/
    public String coverBasis;
    
	/**
	* Retroceded (G)
	*/
    public BigDecimal grossRetrocededPercentage;
    
	/**
	* Protected %
	*/
    public BigDecimal protectedPercentage;
    
	/**
	* SubclassNumber: 90. SicsRefAgreementLifeCycleStatus
	*/
    public SicsReferenceDataReference lifeCycleStatus;
    
	/**
	* Order
	*/
    public Integer seqNr;

    public LightBusinessRetrocession ()
    {
    }

    public LightBusinessRetrocession (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("title"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.title = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.title = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("beginDateTime"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.beginDateTime = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.beginDateTime = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessPartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartner = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("accountGroup"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accountGroup = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reinsurerName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reinsurerName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.reinsurerName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("broker"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.broker = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("coverBasis"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.coverBasis = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.coverBasis = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("grossRetrocededPercentage"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.grossRetrocededPercentage = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.grossRetrocededPercentage = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("protectedPercentage"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.protectedPercentage = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.protectedPercentage = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lifeCycleStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lifeCycleStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("seqNr"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.seqNr = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.seqNr = (Integer)obj;
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
            return this.identifier!=null?this.identifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.title!=null?this.title:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.beginDateTime!=null?Helper.getDateTimeFormat().format(this.beginDateTime):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.businessPartner!=null?this.businessPartner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.accountGroup!=null?this.accountGroup:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return reinsurerName;
        }
        if(propertyIndex==count+6)
        {
            return this.broker!=null?this.broker:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.coverBasis!=null?this.coverBasis:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.grossRetrocededPercentage!=null?this.grossRetrocededPercentage.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.protectedPercentage!=null?this.protectedPercentage.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.lifeCycleStatus!=null?this.lifeCycleStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.seqNr!=null?this.seqNr:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+12;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifier";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "title";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "beginDateTime";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "businessPartner";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accountGroup";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reinsurerName";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "broker";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "coverBasis";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "grossRetrocededPercentage";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "protectedPercentage";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "lifeCycleStatus";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "seqNr";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

