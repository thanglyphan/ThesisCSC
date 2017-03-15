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

public class LedgerBalanceForBusinessPartner extends LedgerBalance implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Accounting Classification
	*/
    public SicsAccountingClassificationReference accountingClassification;
    
	/**
	* SubclassNumber:555. SicsRefShareStatus
	*                      Share Status
	*/
    public SicsReferenceDataReference shareStatus;
    
	/**
	* Payable Part
	*/
    public BigDecimal payableAmount;
    
	/**
	* Type of Date
	*/
    public String dateType;
    
	/**
	* Wks Origin
	*/
    public SicsBusinessPartnerReference worksheetOriginString;
    
	/**
	* Business Title
	*/
    public String businessTitle;
    
	/**
	* Section Name
	*/
    public String sectionName;

    public LedgerBalanceForBusinessPartner ()
    {
    }

    public LedgerBalanceForBusinessPartner (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("accountingClassification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accountingClassification = (SicsAccountingClassificationReference)__envelope.get(j,SicsAccountingClassificationReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("shareStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.shareStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("payableAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.payableAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.payableAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateType"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateType = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateType = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("worksheetOriginString"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.worksheetOriginString = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessTitle"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessTitle = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessTitle = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("sectionName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sectionName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.sectionName = (String)obj;
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
            return this.accountingClassification!=null?this.accountingClassification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.shareStatus!=null?this.shareStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.payableAmount!=null?this.payableAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return dateType;
        }
        if(propertyIndex==count+4)
        {
            return this.worksheetOriginString!=null?this.worksheetOriginString:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.businessTitle!=null?this.businessTitle:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.sectionName!=null?this.sectionName:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsAccountingClassificationReference.class;
            info.name = "accountingClassification";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "shareStatus";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "payableAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateType";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "worksheetOriginString";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessTitle";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sectionName";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

