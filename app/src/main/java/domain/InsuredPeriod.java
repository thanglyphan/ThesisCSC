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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class InsuredPeriod extends InsuredPeriodCommonUpdateAndCreate implements KvmSerializable,java.io.Serializable
{

    
    public Boolean isCoinsurance;
    
	/**
	* OBSOLETE.
	*/
    public ArrayList< BusinessPartnerRelationshipForInsuredPeriod> businessPartnerRelationship =new ArrayList<BusinessPartnerRelationshipForInsuredPeriod >();
    
	/**
	* This element should be used to represent all the current valid business partner relationships.
	*                      If this element is present then businessPartnerRelationship will be ignored.
	*/
    public BusinessPartnerRelationshipList businessPartnerRelationshipList;
    
    public ArrayList< LifeCyclePhase> lifeCyclePhase =new ArrayList<LifeCyclePhase >();
    
	/**
	* For Domain Retrieval only
	*/
    public Cancellation cancellation;
    
	/**
	* For Domain Retrieval only
	*/
    public Boolean hasBookings;
    
	/**
	* For Domain Retrieval only
	*/
    public Boolean isLatest;
    
	/**
	* For level of business Policy Ceded only
	*/
    public java.util.Date creationTimestamp;
    
	/**
	* For Domain retrieval Only
	*/
    public SicsInsuredPeriodReference ipOfCedentsContract;
    
	/**
	* For Domain retrieval Only
	*/
    public InsuredPeriodOfParticipantOfCedentsContractList ipOfParticipantOfCedentsContractList;
    
	/**
	* For Domain retrieval Only
	*/
    public SicsInsuredPeriodReference insuredPeriodOfCedentProgram;
    
	/**
	* For Domain retrieval Only
	*/
    public InsuredPeriodOfAssumedBusinessOfCedentProgramList insuredPeriodOfCedentProgramAssumedBusinessList;

    public InsuredPeriod ()
    {
    }

    public InsuredPeriod (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("isCoinsurance"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isCoinsurance = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isCoinsurance = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerRelationship"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.businessPartnerRelationship==null)
                        {
                            this.businessPartnerRelationship = new ArrayList< BusinessPartnerRelationshipForInsuredPeriod>();
                        }
                        java.lang.Object j =obj;
                        BusinessPartnerRelationshipForInsuredPeriod j1= (BusinessPartnerRelationshipForInsuredPeriod)__envelope.get(j,BusinessPartnerRelationshipForInsuredPeriod.class,false);
                        this.businessPartnerRelationship.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerRelationshipList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartnerRelationshipList = (BusinessPartnerRelationshipList)__envelope.get(j,BusinessPartnerRelationshipList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("lifeCyclePhase"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.lifeCyclePhase==null)
                        {
                            this.lifeCyclePhase = new ArrayList< LifeCyclePhase>();
                        }
                        java.lang.Object j =obj;
                        LifeCyclePhase j1= (LifeCyclePhase)__envelope.get(j,LifeCyclePhase.class,false);
                        this.lifeCyclePhase.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("cancellation"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.cancellation = (Cancellation)__envelope.get(j,Cancellation.class,false);
                    }
                    continue;
                }
                if (info.name.equals("hasBookings"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.hasBookings = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.hasBookings = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isLatest"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isLatest = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isLatest = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("creationTimestamp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.creationTimestamp = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.creationTimestamp = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ipOfCedentsContract"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.ipOfCedentsContract = (SicsInsuredPeriodReference)__envelope.get(j,SicsInsuredPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("ipOfParticipantOfCedentsContractList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.ipOfParticipantOfCedentsContractList = new InsuredPeriodOfParticipantOfCedentsContractList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriodOfCedentProgram"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredPeriodOfCedentProgram = (SicsInsuredPeriodReference)__envelope.get(j,SicsInsuredPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriodOfCedentProgramAssumedBusinessList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredPeriodOfCedentProgramAssumedBusinessList = new InsuredPeriodOfAssumedBusinessOfCedentProgramList(j,__envelope);
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
            return this.isCoinsurance!=null?this.isCoinsurance:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.businessPartnerRelationship.size())
        {
            return this.businessPartnerRelationship.get(propertyIndex-(count+1));
        }
        if(propertyIndex==count+1+this.businessPartnerRelationship.size())
        {
            return this.businessPartnerRelationshipList!=null?this.businessPartnerRelationshipList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+2+this.businessPartnerRelationship.size() && propertyIndex < count+2+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            return this.lifeCyclePhase.get(propertyIndex-(count+2+this.businessPartnerRelationship.size()));
        }
        if(propertyIndex==count+2+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            return this.cancellation!=null?this.cancellation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            return this.hasBookings!=null?this.hasBookings:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            return this.isLatest!=null?this.isLatest:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            return this.creationTimestamp!=null?Helper.getDateTimeFormat().format(this.creationTimestamp):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            return this.ipOfCedentsContract!=null?this.ipOfCedentsContract:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            return this.ipOfParticipantOfCedentsContractList!=null?this.ipOfParticipantOfCedentsContractList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            return this.insuredPeriodOfCedentProgram!=null?this.insuredPeriodOfCedentProgram:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            return this.insuredPeriodOfCedentProgramAssumedBusinessList!=null?this.insuredPeriodOfCedentProgramAssumedBusinessList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+10+businessPartnerRelationship.size()+lifeCyclePhase.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isCoinsurance";
            info.namespace= "";
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.businessPartnerRelationship.size())
        {
            info.type = BusinessPartnerRelationshipForInsuredPeriod.class;
            info.name = "businessPartnerRelationship";
            info.namespace= "";
        }
        if(propertyIndex==count+1+this.businessPartnerRelationship.size())
        {
            info.type = BusinessPartnerRelationshipList.class;
            info.name = "businessPartnerRelationshipList";
            info.namespace= "";
        }
        if(propertyIndex>=count+2+this.businessPartnerRelationship.size() && propertyIndex < count+2+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            info.type = LifeCyclePhase.class;
            info.name = "lifeCyclePhase";
            info.namespace= "";
        }
        if(propertyIndex==count+2+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            info.type = Cancellation.class;
            info.name = "cancellation";
            info.namespace= "";
        }
        if(propertyIndex==count+3+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "hasBookings";
            info.namespace= "";
        }
        if(propertyIndex==count+4+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isLatest";
            info.namespace= "";
        }
        if(propertyIndex==count+5+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "creationTimestamp";
            info.namespace= "";
        }
        if(propertyIndex==count+6+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            info.type = SicsInsuredPeriodReference.class;
            info.name = "ipOfCedentsContract";
            info.namespace= "";
        }
        if(propertyIndex==count+7+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "ipOfParticipantOfCedentsContractList";
            info.namespace= "";
        }
        if(propertyIndex==count+8+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            info.type = SicsInsuredPeriodReference.class;
            info.name = "insuredPeriodOfCedentProgram";
            info.namespace= "";
        }
        if(propertyIndex==count+9+this.businessPartnerRelationship.size()+this.lifeCyclePhase.size())
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "insuredPeriodOfCedentProgramAssumedBusinessList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

