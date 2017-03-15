package SicsWsPcAccountingEntryPoint;

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

public class ClaimShareCondition extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date claimAppliedShare;
    
    public SicsUserReference claimUserShare;
    
    public java.util.Date claimLimitShareAdviceDateAsDate;
    
    public BigDecimal claimShareFrom100=BigDecimal.ZERO;
    
    public BigDecimal claimShareOfField1;
    
    public BigDecimal claimShareOfField2;
    
    public BigDecimal claimShareOfField3;

    public ClaimShareCondition ()
    {
    }

    public ClaimShareCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
	    
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
                if (info.name.equals("claimAppliedShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimAppliedShare = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.claimAppliedShare = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimUserShare"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimUserShare = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimLimitShareAdviceDateAsDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimLimitShareAdviceDateAsDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.claimLimitShareAdviceDateAsDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimShareFrom100"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimShareFrom100 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimShareFrom100 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimShareOfField1"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimShareOfField1 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimShareOfField1 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimShareOfField2"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimShareOfField2 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimShareOfField2 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimShareOfField3"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimShareOfField3 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimShareOfField3 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.claimAppliedShare!=null?Helper.getDateFormat().format(this.claimAppliedShare):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.claimUserShare!=null?this.claimUserShare:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.claimLimitShareAdviceDateAsDate!=null?Helper.getDateFormat().format(this.claimLimitShareAdviceDateAsDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.claimShareFrom100!=null?this.claimShareFrom100.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.claimShareOfField1!=null?this.claimShareOfField1.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.claimShareOfField2!=null?this.claimShareOfField2.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.claimShareOfField3!=null?this.claimShareOfField3.toString():SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimAppliedShare";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsUserReference.class;
            info.name = "claimUserShare";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimLimitShareAdviceDateAsDate";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimShareFrom100";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimShareOfField1";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimShareOfField2";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimShareOfField3";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

