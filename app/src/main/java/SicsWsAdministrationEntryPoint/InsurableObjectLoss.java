package SicsWsAdministrationEntryPoint;

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

public class InsurableObjectLoss extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Optional in Update, mandatory in Create / key
	*/
    public String name;
    
	/**
	* Optional in Update, mandatory in Create / key
	*                Date of Loss
	*/
    public java.util.Date lossDate;
    
	/**
	* SubclassNumber: 523. SicsRefClaimCauseOfLoss
	*/
    public SicsReferenceDataReference lossCause;
    
	/**
	* SubclassNumber: 3. SicsRefClassOfBusiness
	*/
    public SicsReferenceDataReference classOfBusiness;
    
    public SicsCurrencyReference currency;
    
	/**
	* Amount f.g.u.
	*/
    public BigDecimal amount;
    
	/**
	* Notes tab
	*/
    public String lossNote;

    public InsurableObjectLoss ()
    {
    }

    public InsurableObjectLoss (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("name"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.name = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.name = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lossDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lossDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.lossDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lossCause"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lossCause = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("classOfBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.classOfBusiness = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
                if (info.name.equals("amount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.amount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lossNote"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lossNote = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.lossNote = (String)obj;
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
            return this.name!=null?this.name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.lossDate!=null?Helper.getDateFormat().format(this.lossDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.lossCause!=null?this.lossCause:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.classOfBusiness!=null?this.classOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.currency!=null?this.currency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.amount!=null?this.amount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.lossNote!=null?this.lossNote:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "name";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lossDate";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "lossCause";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "classOfBusiness";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amount";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lossNote";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

