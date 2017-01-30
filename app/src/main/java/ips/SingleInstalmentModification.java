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

public class SingleInstalmentModification extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Used to locate the correct instalment (for currency and amendment).
	*                Must be in the range of existing numbers.
	*                No.
	*/
    public Integer number;
    
	/**
	* Due Date
	*/
    public java.util.Date dueDate;
    
	/**
	* Payment Date
	*/
    public java.util.Date paymentDate;
    
	/**
	* Premium
	*/
    public BigDecimal premiumAmount;
    
	/**
	* Remark
	*/
    public String remark;

    public SingleInstalmentModification ()
    {
    }

    public SingleInstalmentModification (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.number!=null?this.number:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.dueDate!=null?Helper.getDateFormat().format(this.dueDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.paymentDate!=null?Helper.getDateFormat().format(this.paymentDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.premiumAmount!=null?this.premiumAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.remark!=null?this.remark:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "number";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dueDate";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paymentDate";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premiumAmount";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "remark";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

