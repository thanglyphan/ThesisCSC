package domain;

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

public class DetailedMarketEstimate extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date createdAtDate;
    
    public SicsCurrencyReference currency;
    
	/**
	* SubclassNumber: 019.
	*/
    public SicsReferenceDataReference mainClassOfBusiness;
    
	/**
	* SubclassNumber: 03.
	*/
    public SicsReferenceDataReference classOfBusiness;
    
	/**
	* SubclassNumber: 050.
	*/
    public SicsReferenceDataReference subClassOfBusiness;
    
	/**
	* SubclassNumber: 523.
	*/
    public SicsReferenceDataReference causeOfLoss;
    
    public SicsBusinessPartnerReference insured;
    
    public DetailedMarketEstimateAmendmentsReadList detailedMarketEstimateAmendmentsList=new DetailedMarketEstimateAmendmentsReadList();

    public DetailedMarketEstimate ()
    {
    }

    public DetailedMarketEstimate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("createdAtDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.createdAtDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.createdAtDate = (java.util.Date)obj;
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
                if (info.name.equals("mainClassOfBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.mainClassOfBusiness = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
                if (info.name.equals("subClassOfBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.subClassOfBusiness = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("causeOfLoss"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.causeOfLoss = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insured"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insured = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("detailedMarketEstimateAmendmentsList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.detailedMarketEstimateAmendmentsList = new DetailedMarketEstimateAmendmentsReadList(j,__envelope);
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
            return this.createdAtDate!=null?Helper.getDateFormat().format(this.createdAtDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return currency;
        }
        if(propertyIndex==count+2)
        {
            return this.mainClassOfBusiness!=null?this.mainClassOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.classOfBusiness!=null?this.classOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.subClassOfBusiness!=null?this.subClassOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.causeOfLoss!=null?this.causeOfLoss:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.insured!=null?this.insured:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return detailedMarketEstimateAmendmentsList;
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
            info.name = "createdAtDate";
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
            info.type = SicsReferenceDataReference.class;
            info.name = "mainClassOfBusiness";
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
            info.type = SicsReferenceDataReference.class;
            info.name = "subClassOfBusiness";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "causeOfLoss";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "insured";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "detailedMarketEstimateAmendmentsList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

