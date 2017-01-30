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
import java.math.BigDecimal;

public class BusinessRetrocessionFacRetrocessionairePlacementCreate extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Share of 100%
	*/
    public Integer shareAmount=0;
    
	/**
	* SubclassNumber: 125. SicsRefDeductionMethod
	*                         Deduction
	*/
    public SicsReferenceDataReference deductionMethod;
    
	/**
	* Overrider%
	*/
    public Integer overriderPercent=0;
    
    public SicsAccountingEntryCodeGroupReference overriderCalculationBasis;
    
    public SicsBusinessPartnerReference businessPartner;
    
	/**
	* Retroceded (G)
	*/
    public BigDecimal grossRetrocededPercentage;
    
	/**
	* SubclassNumber: 90. SicsRefAgreementLifeCycleStatus
	*/
    public SicsReferenceDataReference refLifeCycleStatus;
    
	/**
	* SubclassNumber: 225. SicsRefAccountGroup
	*/
    public SicsReferenceDataReference accountGroup;

    public BusinessRetrocessionFacRetrocessionairePlacementCreate ()
    {
    }

    public BusinessRetrocessionFacRetrocessionairePlacementCreate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("shareAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.shareAmount = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.shareAmount = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deductionMethod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deductionMethod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("overriderPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.overriderPercent = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.overriderPercent = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("overriderCalculationBasis"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.overriderCalculationBasis = (SicsAccountingEntryCodeGroupReference)__envelope.get(j,SicsAccountingEntryCodeGroupReference.class,false);
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
                if (info.name.equals("refLifeCycleStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refLifeCycleStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
            return shareAmount;
        }
        if(propertyIndex==count+1)
        {
            return deductionMethod;
        }
        if(propertyIndex==count+2)
        {
            return overriderPercent;
        }
        if(propertyIndex==count+3)
        {
            return overriderCalculationBasis;
        }
        if(propertyIndex==count+4)
        {
            return this.businessPartner!=null?this.businessPartner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.grossRetrocededPercentage!=null?this.grossRetrocededPercentage.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.refLifeCycleStatus!=null?this.refLifeCycleStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.accountGroup!=null?this.accountGroup:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "shareAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "deductionMethod";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "overriderPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsAccountingEntryCodeGroupReference.class;
            info.name = "overriderCalculationBasis";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "businessPartner";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "grossRetrocededPercentage";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refLifeCycleStatus";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accountGroup";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

