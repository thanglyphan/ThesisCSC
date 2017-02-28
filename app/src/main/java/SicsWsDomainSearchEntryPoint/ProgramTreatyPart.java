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
import java.math.BigInteger;

public class ProgramTreatyPart extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public SicsCurrencyReference currency;
    
	/**
	* Program Retention
	*/
    public BigInteger programLowerLimit=BigInteger.ZERO;
    
	/**
	* Program Limit
	*/
    public BigInteger programUpperLimit;
    
	/**
	* Program Limit Unlimited
	*/
    public Boolean isUnlimited;
    
	/**
	* Element is relevant only when business is a protectionProgram.                   
	*                            Automatic Recovery Calculation
	*/
    public Boolean isAutomaticRecoveryCalculation;
    
	/**
	* SubclassNumber: 79. Code: ANY.                      
	*                            Limit Expressed As
	*/
    public SicsReferenceDataReference insuredBasis;

    public ProgramTreatyPart ()
    {
    }

    public ProgramTreatyPart (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("currency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.currency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("programLowerLimit"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.programLowerLimit = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.programLowerLimit = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("programUpperLimit"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.programUpperLimit = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.programUpperLimit = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isUnlimited"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isUnlimited = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isUnlimited = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isAutomaticRecoveryCalculation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAutomaticRecoveryCalculation = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAutomaticRecoveryCalculation = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredBasis"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredBasis = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
            return currency;
        }
        if(propertyIndex==count+1)
        {
            return this.programLowerLimit!=null?this.programLowerLimit.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.programUpperLimit!=null?this.programUpperLimit.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.isUnlimited!=null?this.isUnlimited:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.isAutomaticRecoveryCalculation!=null?this.isAutomaticRecoveryCalculation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.insuredBasis!=null?this.insuredBasis:SoapPrimitive.NullSkip;
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
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "programLowerLimit";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "programUpperLimit";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isUnlimited";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAutomaticRecoveryCalculation";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "insuredBasis";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

