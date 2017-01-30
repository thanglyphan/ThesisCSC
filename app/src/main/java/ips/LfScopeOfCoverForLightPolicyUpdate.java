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

public class LfScopeOfCoverForLightPolicyUpdate extends ScopeOfCoverForLightPolicyUpdate implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber:  1131.
	*/
    public SicsReferenceDataReference transactionType;
    
	/**
	* SubclassNumber:  1133.
	*/
    public SicsReferenceDataReference smokerStatus;
    
	/**
	* SubclassNumber:  1134
	*/
    public SicsReferenceDataReference occupationClass;
    
	/**
	* SubclassNumber:  1128
	*/
    public SicsReferenceDataReference riskClass;
    
	/**
	* SubclassNumber:  1129
	*/
    public SicsReferenceDataReference disabilityClass;
    
    public Integer age;
    
    public Integer normalRetirementAge;
    
    public SicsReferenceDataReference escalation;
    
    public BigDecimal extraPerCentOfSarPremium;
    
    public BigDecimal extraPerMilleOfSarPremium;
    
    public BigDecimal extraFactorOfSarPremium;
    
	/**
	* Extra Mortality/Morbidity Percentage
	*/
    public BigDecimal extraPremium;

    public LfScopeOfCoverForLightPolicyUpdate ()
    {
    }

    public LfScopeOfCoverForLightPolicyUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("transactionType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.transactionType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("smokerStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.smokerStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("occupationClass"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.occupationClass = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("riskClass"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.riskClass = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("disabilityClass"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.disabilityClass = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("age"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.age = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.age = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("normalRetirementAge"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.normalRetirementAge = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.normalRetirementAge = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("escalation"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.escalation = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("extraPerCentOfSarPremium"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.extraPerCentOfSarPremium = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.extraPerCentOfSarPremium = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("extraPerMilleOfSarPremium"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.extraPerMilleOfSarPremium = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.extraPerMilleOfSarPremium = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("extraFactorOfSarPremium"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.extraFactorOfSarPremium = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.extraFactorOfSarPremium = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("extraPremium"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.extraPremium = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.extraPremium = (BigDecimal)obj;
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
            return this.transactionType!=null?this.transactionType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.smokerStatus!=null?this.smokerStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.occupationClass!=null?this.occupationClass:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.riskClass!=null?this.riskClass:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.disabilityClass!=null?this.disabilityClass:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.age!=null?this.age:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.normalRetirementAge!=null?this.normalRetirementAge:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.escalation!=null?this.escalation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.extraPerCentOfSarPremium!=null?this.extraPerCentOfSarPremium.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.extraPerMilleOfSarPremium!=null?this.extraPerMilleOfSarPremium.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.extraFactorOfSarPremium!=null?this.extraFactorOfSarPremium.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.extraPremium!=null?this.extraPremium.toString():SoapPrimitive.NullSkip;
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
            info.type = SicsReferenceDataReference.class;
            info.name = "transactionType";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "smokerStatus";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "occupationClass";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "riskClass";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "disabilityClass";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "age";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "normalRetirementAge";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "escalation";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "extraPerCentOfSarPremium";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "extraPerMilleOfSarPremium";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "extraFactorOfSarPremium";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "extraPremium";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

