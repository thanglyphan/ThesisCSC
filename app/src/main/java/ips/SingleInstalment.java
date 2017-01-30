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

public class SingleInstalment extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* 1->99.  Only required when removing an instalment
	*                      No.
	*/
    public Integer number;
    
	/**
	* Used in conjunction with "number" when removing/updating a single instalment and when adding a single instalment
	*                      Currency
	*/
    public SicsCurrencyReference currency;
    
	/**
	* Used when adding a single instalment. If not present is assumed to be 0.
	*                      Amendment
	*/
    public Integer amendmentNumber;
    
	/**
	* Due Date
	*/
    public java.util.Date dueDate;
    
	/**
	* Accounting Period From - To  column
	*/
    public SicsWsDatespanReference accountingPeriodFromTo;
    
	/**
	* Payment Date
	*/
    public java.util.Date paymentDate;
    
	/**
	* Premium
	*/
    public BigDecimal premiumAmount;
    
	/**
	* Net Premium
	*                      NB: This element should only be used for domain retrieval as this is a computed value.
	*/
    public BigDecimal netPremiumAmount;
    
	/**
	* Autom. Booked/Man. Booked
	*/
    public Boolean isBooked;
    
	/**
	* Man. Booked
	*                      MARK: Should only be used for domain retrieval.
	*/
    public Boolean manuallyBooked;
    
	/**
	* Changed
	*                      NB: This element should only be used for domain retrieval.
	*/
    public Boolean isChanged;
    
	/**
	* Paid
	*                      NB: This element should only be used for domain retrieval.
	*/
    public Boolean isPaid;
    
	/**
	* Paid %
	*                      NB: This element should only be used for domain retrieval.
	*/
    public Integer percentPaid;
    
    public BigDecimal vatPercent;
    
	/**
	* Remark
	*/
    public String remark;
    
	/**
	* Extended Payment Date
	*/
    public java.util.Date extendedPaymentDate;
    
	/**
	* NB: Should only be used for Domain Retrieval.  
	*                      Special Status
	*/
    public String specialStatus;

    public SingleInstalment ()
    {
    }

    public SingleInstalment (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("number"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.number = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.number = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("currency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.currency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("amendmentNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amendmentNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.amendmentNumber = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dueDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dueDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dueDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accountingPeriodFromTo"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accountingPeriodFromTo = (SicsWsDatespanReference)__envelope.get(j,SicsWsDatespanReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paymentDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.paymentDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.paymentDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premiumAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premiumAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premiumAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("netPremiumAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.netPremiumAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.netPremiumAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isBooked"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isBooked = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isBooked = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("manuallyBooked"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.manuallyBooked = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.manuallyBooked = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isChanged"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isChanged = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isChanged = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isPaid"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isPaid = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isPaid = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("percentPaid"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.percentPaid = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.percentPaid = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("vatPercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.vatPercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.vatPercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("remark"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.remark = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.remark = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("extendedPaymentDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.extendedPaymentDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.extendedPaymentDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("specialStatus"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.specialStatus = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.specialStatus = (String)obj;
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
            return this.number!=null?this.number:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return currency;
        }
        if(propertyIndex==count+2)
        {
            return this.amendmentNumber!=null?this.amendmentNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.dueDate!=null?Helper.getDateFormat().format(this.dueDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.accountingPeriodFromTo!=null?this.accountingPeriodFromTo:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.paymentDate!=null?Helper.getDateFormat().format(this.paymentDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.premiumAmount!=null?this.premiumAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.netPremiumAmount!=null?this.netPremiumAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.isBooked!=null?this.isBooked:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.manuallyBooked!=null?this.manuallyBooked:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.isChanged!=null?this.isChanged:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.isPaid!=null?this.isPaid:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.percentPaid!=null?this.percentPaid:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.vatPercent!=null?this.vatPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.remark!=null?this.remark:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.extendedPaymentDate!=null?Helper.getDateFormat().format(this.extendedPaymentDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.specialStatus!=null?this.specialStatus:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+17;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "number";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "amendmentNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dueDate";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsWsDatespanReference.class;
            info.name = "accountingPeriodFromTo";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paymentDate";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premiumAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "netPremiumAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isBooked";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "manuallyBooked";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isChanged";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isPaid";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "percentPaid";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "vatPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "remark";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "extendedPaymentDate";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "specialStatus";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

