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

public class CurrencyCreate extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* The string length should not exceed 3.
	*/
    public String isoAlpha;
    
	/**
	* This element is mandatory for Create Currency.
	*/
    public String isoNameEnglish;
    
	/**
	* Alternate Code
	*/
    public String alternateId;
    
	/**
	* This element is mandatory for Create Currency.
	*/
    public Integer isoNumeric;
    
    public BigDecimal factor;
    
	/**
	* Warning Limit
	*/
    public BigDecimal warningLimitPercent;
    
	/**
	* This element is mandatory for Create Currency.Any Numeric Value from 0 to 8.
	*/
    public Integer numberOfDecimals;
    
    public Boolean isEMUCurrency;
    
	/**
	* As From Date
	*/
    public java.util.Date eMUDate;
    
    public Boolean isActive;
    
    public Boolean isOftenUsed;
    
	/**
	* Primary Currency
	*/
    public Boolean isPrimary;
    
    public Boolean isForeignInPrimary;

    public CurrencyCreate ()
    {
    }

    public CurrencyCreate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("isoAlpha"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isoAlpha = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.isoAlpha = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isoNameEnglish"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isoNameEnglish = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.isoNameEnglish = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("alternateId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.alternateId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.alternateId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isoNumeric"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isoNumeric = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.isoNumeric = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("factor"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.factor = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.factor = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("warningLimitPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.warningLimitPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.warningLimitPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("numberOfDecimals"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.numberOfDecimals = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.numberOfDecimals = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isEMUCurrency"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isEMUCurrency = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isEMUCurrency = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("eMUDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.eMUDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.eMUDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isActive"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isActive = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isActive = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isOftenUsed"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isOftenUsed = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isOftenUsed = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isPrimary"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isPrimary = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isPrimary = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isForeignInPrimary"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isForeignInPrimary = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isForeignInPrimary = (Boolean)obj;
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
            return isoAlpha;
        }
        if(propertyIndex==count+1)
        {
            return this.isoNameEnglish!=null?this.isoNameEnglish:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.alternateId!=null?this.alternateId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.isoNumeric!=null?this.isoNumeric:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.factor!=null?this.factor.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.warningLimitPercent!=null?this.warningLimitPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.numberOfDecimals!=null?this.numberOfDecimals:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.isEMUCurrency!=null?this.isEMUCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.eMUDate!=null?Helper.getDateFormat().format(this.eMUDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.isActive!=null?this.isActive:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.isOftenUsed!=null?this.isOftenUsed:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.isPrimary!=null?this.isPrimary:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.isForeignInPrimary!=null?this.isForeignInPrimary:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+13;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "isoAlpha";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "isoNameEnglish";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "alternateId";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "isoNumeric";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "factor";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "warningLimitPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "numberOfDecimals";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isEMUCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "eMUDate";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isActive";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isOftenUsed";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isPrimary";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isForeignInPrimary";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

