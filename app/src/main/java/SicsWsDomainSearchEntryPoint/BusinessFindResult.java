package SicsWsDomainSearchEntryPoint;

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
import java.math.BigInteger;

public class BusinessFindResult extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public String identifier;
    
    public String businessId;
    
    public BigInteger underwritingYear;
    
    public SicsReferenceDataReference lifeCycleStatus;
    
	/**
	* SubclassNumber: 45. SicsRefBusinessDirection
	*/
    public SicsLifeCyclePhaseReference lifeCyclePhase;
    
    public String title;
    
    public SicsInsuredPeriodReference insuredPeriod;
    
	/**
	* SubclassNumber: 45. SicsRefBusinessDirection
	*/
    public SicsReferenceDataReference levelOfBusiness;
    
	/**
	* SubclassNumber: 46. SicsRefTypeOfBusiness
	*/
    public SicsReferenceDataReference typeOfBusiness;
    
    public SicsReferenceDataReference status;
    
    public MainClassOfBusinessesList mainClassOfBusinessesList;
    
    public ClassOfBusinessesList_1 classOfBusinessesList;
    
    public SubClassOfBusinessesList subClassOfBusinessesList;
    
    public Boolean ceasedAccounting;
    
    public String cancellationString;
    
    public String formerIdentifier;
    
    public BusinessPartnerFindPartial cedent;
    
    public String cedentReference;
    
    public OriginalCedentsList originalCedentsList;
    
    public BusinessPartnerFindPartial baseCompany;
    
    public BusinessPartnerFindPartial reinsurer;
    
    public BusinessPartnerFindPartial broker;
    
    public BusinessPartnerFindPartial insured;
    
    public SicsCountryReference insuredCountry;
    
    public SicsWsTimespanReference latestInsuredPeriodTimeSpan;

    public BusinessFindResult ()
    {
    }

    public BusinessFindResult (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("identifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.identifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("underwritingYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.underwritingYear = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.underwritingYear = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lifeCycleStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lifeCycleStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("lifeCyclePhase"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lifeCyclePhase = (SicsLifeCyclePhaseReference)__envelope.get(j,SicsLifeCyclePhaseReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("title"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.title = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.title = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredPeriod = (SicsInsuredPeriodReference)__envelope.get(j,SicsInsuredPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("levelOfBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.levelOfBusiness = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("typeOfBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfBusiness = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("status"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.status = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("mainClassOfBusinessesList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.mainClassOfBusinessesList = new MainClassOfBusinessesList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("classOfBusinessesList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.classOfBusinessesList = new ClassOfBusinessesList_1(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("subClassOfBusinessesList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.subClassOfBusinessesList = new SubClassOfBusinessesList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("ceasedAccounting"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ceasedAccounting = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.ceasedAccounting = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("cancellationString"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cancellationString = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.cancellationString = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("formerIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.formerIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.formerIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("cedent"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.cedent = (BusinessPartnerFindPartial)__envelope.get(j,BusinessPartnerFindPartial.class,false);
                    }
                    continue;
                }
                if (info.name.equals("cedentReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cedentReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.cedentReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("originalCedentsList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.originalCedentsList = new OriginalCedentsList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("baseCompany"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.baseCompany = (BusinessPartnerFindPartial)__envelope.get(j,BusinessPartnerFindPartial.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reinsurer"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reinsurer = (BusinessPartnerFindPartial)__envelope.get(j,BusinessPartnerFindPartial.class,false);
                    }
                    continue;
                }
                if (info.name.equals("broker"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.broker = (BusinessPartnerFindPartial)__envelope.get(j,BusinessPartnerFindPartial.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insured"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insured = (BusinessPartnerFindPartial)__envelope.get(j,BusinessPartnerFindPartial.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insuredCountry"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredCountry = (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("latestInsuredPeriodTimeSpan"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.latestInsuredPeriodTimeSpan = (SicsWsTimespanReference)__envelope.get(j,SicsWsTimespanReference.class,false);
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
            return this.identifier!=null?this.identifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.businessId!=null?this.businessId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.underwritingYear!=null?this.underwritingYear.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.lifeCycleStatus!=null?this.lifeCycleStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.lifeCyclePhase!=null?this.lifeCyclePhase:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.title!=null?this.title:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.insuredPeriod!=null?this.insuredPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.levelOfBusiness!=null?this.levelOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.typeOfBusiness!=null?this.typeOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.status!=null?this.status:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.mainClassOfBusinessesList!=null?this.mainClassOfBusinessesList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.classOfBusinessesList!=null?this.classOfBusinessesList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.subClassOfBusinessesList!=null?this.subClassOfBusinessesList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.ceasedAccounting!=null?this.ceasedAccounting:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==14)
        {
            return this.cancellationString!=null?this.cancellationString:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==15)
        {
            return this.formerIdentifier!=null?this.formerIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==16)
        {
            return this.cedent!=null?this.cedent:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==17)
        {
            return this.cedentReference!=null?this.cedentReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==18)
        {
            return this.originalCedentsList!=null?this.originalCedentsList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==19)
        {
            return this.baseCompany!=null?this.baseCompany:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==20)
        {
            return this.reinsurer!=null?this.reinsurer:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==21)
        {
            return this.broker!=null?this.broker:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==22)
        {
            return this.insured!=null?this.insured:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==23)
        {
            return this.insuredCountry!=null?this.insuredCountry:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==24)
        {
            return this.latestInsuredPeriodTimeSpan!=null?this.latestInsuredPeriodTimeSpan:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 25;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifier";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessId";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "underwritingYear";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "lifeCycleStatus";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = SicsLifeCyclePhaseReference.class;
            info.name = "lifeCyclePhase";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "title";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = SicsInsuredPeriodReference.class;
            info.name = "insuredPeriod";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "levelOfBusiness";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfBusiness";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "status";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "mainClassOfBusinessesList";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "classOfBusinessesList";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "subClassOfBusinessesList";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "ceasedAccounting";
            info.namespace= "";
        }
        if(propertyIndex==14)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cancellationString";
            info.namespace= "";
        }
        if(propertyIndex==15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "formerIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==16)
        {
            info.type = BusinessPartnerFindPartial.class;
            info.name = "cedent";
            info.namespace= "";
        }
        if(propertyIndex==17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cedentReference";
            info.namespace= "";
        }
        if(propertyIndex==18)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "originalCedentsList";
            info.namespace= "";
        }
        if(propertyIndex==19)
        {
            info.type = BusinessPartnerFindPartial.class;
            info.name = "baseCompany";
            info.namespace= "";
        }
        if(propertyIndex==20)
        {
            info.type = BusinessPartnerFindPartial.class;
            info.name = "reinsurer";
            info.namespace= "";
        }
        if(propertyIndex==21)
        {
            info.type = BusinessPartnerFindPartial.class;
            info.name = "broker";
            info.namespace= "";
        }
        if(propertyIndex==22)
        {
            info.type = BusinessPartnerFindPartial.class;
            info.name = "insured";
            info.namespace= "";
        }
        if(propertyIndex==23)
        {
            info.type = SicsCountryReference.class;
            info.name = "insuredCountry";
            info.namespace= "";
        }
        if(propertyIndex==24)
        {
            info.type = SicsWsTimespanReference.class;
            info.name = "latestInsuredPeriodTimeSpan";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

