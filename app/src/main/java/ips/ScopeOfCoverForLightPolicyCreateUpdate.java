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

public class ScopeOfCoverForLightPolicyCreateUpdate extends AbstractScopeOfCoverForLightPolicyCreateUpdate implements KvmSerializable,java.io.Serializable
{

    
    public BigDecimal sharePercent;
    
    public BigInteger informationalLimit1;
    
    public UserDefinedFields userDefinedData;

    public ScopeOfCoverForLightPolicyCreateUpdate ()
    {
    }

    public ScopeOfCoverForLightPolicyCreateUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("sharePercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sharePercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.sharePercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("informationalLimit1"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.informationalLimit1 = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.informationalLimit1 = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("userDefinedData"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.userDefinedData = (UserDefinedFields)__envelope.get(j,UserDefinedFields.class,false);
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
            return this.sharePercent!=null?this.sharePercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.informationalLimit1!=null?this.informationalLimit1.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.userDefinedData!=null?this.userDefinedData:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sharePercent";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "informationalLimit1";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = UserDefinedFields.class;
            info.name = "userDefinedData";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
