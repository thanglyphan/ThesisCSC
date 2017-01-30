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
import java.math.BigInteger;

public class PcScopeOfCoverForLightPolicyCreate extends ScopeOfCoverForLightPolicyCreate implements KvmSerializable,java.io.Serializable
{

    
    public BigDecimal parentPercentage;
    
	/**
	* SubclassNumber:  1004. CODE: EML | MPL | PML | SUMINS | PARTLOSS |  TOTLOSS | UNKNOWN | ANNUAL | ANNUAL_PF | FOR_MAC | DAMAGE | PERHULL | OF_LOSS | OF_SUPI | TOT_LOSS_DEF | PAR_LOSS_DEF | DAYS | MONTHS | NL | GL | U
	*/
    public SicsReferenceDataReference mainLimitType;
    
    public BigDecimal totalGrossPremium;
    
	/**
	* SubclassNumber:  1004. CODE: EML | MPL | PML | SUMINS | PARTLOSS |  TOTLOSS | UNKNOWN | ANNUAL | ANNUAL_PF | FOR_MAC | DAMAGE | PERHULL | OF_LOSS | OF_SUPI | TOT_LOSS_DEF | PAR_LOSS_DEF | DAYS | MONTHS | NL | GL | U
	*/
    public SicsReferenceDataReference informationalLimitType1;
    
    public BigInteger informationalLimit2;
    
	/**
	* SubclassNumber:  1004. CODE: EML | MPL | PML | SUMINS | PARTLOSS |  TOTLOSS | UNKNOWN | ANNUAL | ANNUAL_PF | FOR_MAC | DAMAGE | PERHULL | OF_LOSS | OF_SUPI | TOT_LOSS_DEF | PAR_LOSS_DEF | DAYS | MONTHS | NL | GL | U
	*/
    public SicsReferenceDataReference informationalLimitType2;
    
    public AllClaimBasisList allClaimBasisList;
    
    public DeclarationForLightPolicyCreateList declarationList;

    public PcScopeOfCoverForLightPolicyCreate ()
    {
    }

    public PcScopeOfCoverForLightPolicyCreate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("parentPercentage"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.parentPercentage = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.parentPercentage = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("mainLimitType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.mainLimitType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("totalGrossPremium"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.totalGrossPremium = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.totalGrossPremium = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("informationalLimitType1"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.informationalLimitType1 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("informationalLimit2"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.informationalLimit2 = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.informationalLimit2 = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("informationalLimitType2"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.informationalLimitType2 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("allClaimBasisList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.allClaimBasisList = (AllClaimBasisList)__envelope.get(j,AllClaimBasisList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("declarationList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.declarationList = new DeclarationForLightPolicyCreateList(j,__envelope);
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
            return this.parentPercentage!=null?this.parentPercentage.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.mainLimitType!=null?this.mainLimitType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.totalGrossPremium!=null?this.totalGrossPremium.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.informationalLimitType1!=null?this.informationalLimitType1:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.informationalLimit2!=null?this.informationalLimit2.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.informationalLimitType2!=null?this.informationalLimitType2:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.allClaimBasisList!=null?this.allClaimBasisList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.declarationList!=null?this.declarationList:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "parentPercentage";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "mainLimitType";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "totalGrossPremium";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "informationalLimitType1";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "informationalLimit2";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "informationalLimitType2";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = AllClaimBasisList.class;
            info.name = "allClaimBasisList";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "declarationList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
