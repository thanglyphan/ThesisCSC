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
import java.math.BigDecimal;

public class ClaimClaimGroupRelationship extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Required to be sent when in Create/Update Claim Group.
	*/
    public SicsPcSocToClaimReference claimToSocReference;
    
	/**
	* Required to be sent when in Update Claim.
	*/
    public SicsPcClaimGroupReference claimGroup;
    
    public BigDecimal allocationPercentage;

    public ClaimClaimGroupRelationship ()
    {
    }

    public ClaimClaimGroupRelationship (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("claimToSocReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimToSocReference = (SicsPcSocToClaimReference)__envelope.get(j,SicsPcSocToClaimReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimGroup"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimGroup = (SicsPcClaimGroupReference)__envelope.get(j,SicsPcClaimGroupReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("allocationPercentage"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.allocationPercentage = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.allocationPercentage = (BigDecimal)obj;
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
            return this.claimToSocReference!=null?this.claimToSocReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.claimGroup!=null?this.claimGroup:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.allocationPercentage!=null?this.allocationPercentage.toString():SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsPcSocToClaimReference.class;
            info.name = "claimToSocReference";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsPcClaimGroupReference.class;
            info.name = "claimGroup";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "allocationPercentage";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
