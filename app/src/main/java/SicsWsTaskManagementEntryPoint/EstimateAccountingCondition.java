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

public class EstimateAccountingCondition extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date asAtDate;
    
    public BigDecimal claimsHandlingPercent;
    
    public BigDecimal discountFactorPercent;
    
    public BigDecimal generalProvisionPercent;
    
    public BigDecimal periodEndPercent;
    
    public BigDecimal signDownPercent;
    
    public BigDecimal specificProvisionPercent;
    
    public BigDecimal sufficiencyMarginPercent;

    public EstimateAccountingCondition ()
    {
    }

    public EstimateAccountingCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("asAtDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.asAtDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.asAtDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimsHandlingPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimsHandlingPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.claimsHandlingPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("discountFactorPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.discountFactorPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.discountFactorPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("generalProvisionPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.generalProvisionPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.generalProvisionPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("periodEndPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.periodEndPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.periodEndPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("signDownPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.signDownPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.signDownPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("specificProvisionPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.specificProvisionPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.specificProvisionPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("sufficiencyMarginPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sufficiencyMarginPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.sufficiencyMarginPercent = (BigDecimal)obj;
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
            return this.asAtDate!=null?Helper.getDateFormat().format(this.asAtDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.claimsHandlingPercent!=null?this.claimsHandlingPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.discountFactorPercent!=null?this.discountFactorPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.generalProvisionPercent!=null?this.generalProvisionPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.periodEndPercent!=null?this.periodEndPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.signDownPercent!=null?this.signDownPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.specificProvisionPercent!=null?this.specificProvisionPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.sufficiencyMarginPercent!=null?this.sufficiencyMarginPercent.toString():SoapPrimitive.NullSkip;
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
            info.name = "asAtDate";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimsHandlingPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "discountFactorPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "generalProvisionPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "periodEndPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "signDownPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "specificProvisionPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sufficiencyMarginPercent";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
