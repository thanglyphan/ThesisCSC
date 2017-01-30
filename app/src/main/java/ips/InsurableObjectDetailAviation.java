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

public class InsurableObjectDetailAviation extends InsurableObjectDetailAviationOrSpace implements KvmSerializable,java.io.Serializable
{

    
	/**
	* No. of Crew
	*/
    public Long numberOfCrew;
    
	/**
	* Flag
	*/
    public SicsCountryReference flaggedInCountry;
    
	/**
	* SubclassNumber: 142. SicsRefAviationType
	*                Aircraft
	*/
    public SicsReferenceDataReference model;
    
	/**
	* SubclassNumber: 141. SicsRefAviationTradeType
	*                Trade of Aircraft
	*/
    public SicsReferenceDataReference tradeType;
    
    public SicsCountryReference tradingLimits;
    
    public SicsCountryReference usualLocation;
    
    public Integer yearlyFlyingHours;
    
	/**
	* Total no. of Pilots
	*/
    public Integer totalNumberOfPilots;
    
	/**
	* SubclassNumber: 140. SicsRefAviationPropulsion
	*                Propulsion Type
	*/
    public SicsReferenceDataReference propulsion;
    
	/**
	* SubclassNumber: 508. SicsRefAviationCapacityType
	*/
    public SicsReferenceDataReference capacityType;
    
	/**
	* Capacity Value - Field
	*/
    public BigDecimal capacity;
    
	/**
	* SubclassNumber: 509. SicsRefAviationCapacityUnit
	*                Capacity Value - Drop down
	*/
    public SicsReferenceDataReference capacityUnit;
    
	/**
	* Speed - Field
	*/
    public BigDecimal speed;
    
	/**
	* SubclassNumber: 119. SicsRefSpeedMeasurement
	*                Speed - Drop down
	*/
    public SicsReferenceDataReference speedUnit;
    
	/**
	* No. of Engines
	*/
    public Integer numberOfEngines;
    
	/**
	* SubclassNumber: 143. SicsRefAviationLandingGear
	*/
    public SicsReferenceDataReference landingGear;
    
	/**
	* Weight / Unit - Field
	*/
    public Integer weight;
    
	/**
	* SubclassNumber: 184. SicsRefWeightMeasurement
	*                Weight / Unit - Drop down
	*/
    public SicsReferenceDataReference weightUnit;
    
	/**
	* Notes tab
	*/
    public String technicalNote;

    public InsurableObjectDetailAviation ()
    {
    }

    public InsurableObjectDetailAviation (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("numberOfCrew"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.numberOfCrew = new Long(j.toString());
                            }
                        }
                        else if (obj instanceof Long){
                            this.numberOfCrew = (Long)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("flaggedInCountry"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.flaggedInCountry = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("model"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.model = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("tradeType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.tradeType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("tradingLimits"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.tradingLimits = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("usualLocation"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.usualLocation = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("yearlyFlyingHours"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.yearlyFlyingHours = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.yearlyFlyingHours = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("totalNumberOfPilots"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.totalNumberOfPilots = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.totalNumberOfPilots = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("propulsion"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.propulsion = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("capacityType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.capacityType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("capacity"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.capacity = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.capacity = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("capacityUnit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.capacityUnit = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("speed"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.speed = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.speed = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("speedUnit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.speedUnit = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("numberOfEngines"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.numberOfEngines = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.numberOfEngines = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("landingGear"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.landingGear = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("weight"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.weight = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.weight = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("weightUnit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.weightUnit = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("technicalNote"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.technicalNote = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.technicalNote = (String)obj;
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
            return this.numberOfCrew!=null?this.numberOfCrew:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.flaggedInCountry!=null?this.flaggedInCountry:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.model!=null?this.model:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.tradeType!=null?this.tradeType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.tradingLimits!=null?this.tradingLimits:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.usualLocation!=null?this.usualLocation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.yearlyFlyingHours!=null?this.yearlyFlyingHours:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.totalNumberOfPilots!=null?this.totalNumberOfPilots:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.propulsion!=null?this.propulsion:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.capacityType!=null?this.capacityType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.capacity!=null?this.capacity.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.capacityUnit!=null?this.capacityUnit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.speed!=null?this.speed.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.speedUnit!=null?this.speedUnit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.numberOfEngines!=null?this.numberOfEngines:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.landingGear!=null?this.landingGear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.weight!=null?this.weight:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.weightUnit!=null?this.weightUnit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.technicalNote!=null?this.technicalNote:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+19;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "numberOfCrew";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsCountryReference.class;
            info.name = "flaggedInCountry";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "model";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "tradeType";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsCountryReference.class;
            info.name = "tradingLimits";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = SicsCountryReference.class;
            info.name = "usualLocation";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "yearlyFlyingHours";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "totalNumberOfPilots";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "propulsion";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "capacityType";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "capacity";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "capacityUnit";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "speed";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "speedUnit";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "numberOfEngines";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "landingGear";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "weight";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "weightUnit";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "technicalNote";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

