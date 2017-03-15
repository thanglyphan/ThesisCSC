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

public class InsurableObjectDetailLiveAndBloodStock extends InsurableObjectDetail implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 534. SicsRefInsurableObjectOccupation
	*                Occupation
	*/
    public SicsReferenceDataReference production;
    
	/**
	* SubclassNumber: 535. SicsRefInsurableObjectClassification
	*                Classification
	*/
    public SicsReferenceDataReference productionClassification;
    
	/**
	* SubclassNumber: 149. SicsRefLiveAndBloodStockType
	*                Type
	*/
    public SicsReferenceDataReference typeOfLiveAndBloodStock;
    
	/**
	* SubclassNumber: 500. SicsRefLiveAndBloodStockCategory
	*                Category
	*/
    public SicsReferenceDataReference liveAndBloodStockCategory;
    
	/**
	* SubclassNumber: 150. SicsRefLiveAndBloodStockAnimalType
	*                Animal type
	*/
    public SicsReferenceDataReference typeOfAnimal;
    
	/**
	* No. of Animals
	*/
    public Long numberOfAnimals;
    
    public java.util.Date dateOfBirth;
    
	/**
	* State Compensates the Loss
	*/
    public Boolean hasStateCompensation;
    
    public BigDecimal percentOfLoss;
    
    public BigDecimal amountOfLoss;

    public InsurableObjectDetailLiveAndBloodStock ()
    {
    }

    public InsurableObjectDetailLiveAndBloodStock (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("production"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.production = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("productionClassification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.productionClassification = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("typeOfLiveAndBloodStock"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfLiveAndBloodStock = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("liveAndBloodStockCategory"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.liveAndBloodStockCategory = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("typeOfAnimal"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfAnimal = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("numberOfAnimals"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.numberOfAnimals = new Long(j.toString());
                            }
                        }
                        else if (obj instanceof Long){
                            this.numberOfAnimals = (Long)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateOfBirth"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfBirth = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfBirth = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("hasStateCompensation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.hasStateCompensation = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.hasStateCompensation = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("percentOfLoss"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.percentOfLoss = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.percentOfLoss = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("amountOfLoss"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amountOfLoss = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.amountOfLoss = (BigDecimal)obj;
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
            return this.production!=null?this.production:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.productionClassification!=null?this.productionClassification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.typeOfLiveAndBloodStock!=null?this.typeOfLiveAndBloodStock:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.liveAndBloodStockCategory!=null?this.liveAndBloodStockCategory:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.typeOfAnimal!=null?this.typeOfAnimal:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.numberOfAnimals!=null?this.numberOfAnimals:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.dateOfBirth!=null?Helper.getDateFormat().format(this.dateOfBirth):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.hasStateCompensation!=null?this.hasStateCompensation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.percentOfLoss!=null?this.percentOfLoss.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.amountOfLoss!=null?this.amountOfLoss.toString():SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+10;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "production";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "productionClassification";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfLiveAndBloodStock";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "liveAndBloodStockCategory";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfAnimal";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "numberOfAnimals";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfBirth";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "hasStateCompensation";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "percentOfLoss";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "amountOfLoss";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

