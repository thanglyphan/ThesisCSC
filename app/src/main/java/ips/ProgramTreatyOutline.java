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

public class ProgramTreatyOutline extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 22. Code: ANY.                       
	*                            Reinsurance Product/Type of Participation
	*/
    public SicsReferenceDataReference typeOfParticipation;
    
	/**
	* SubclassNumber: 01004. Code: EML,SUMINS,MPL,PML.
	*/
    public SicsReferenceDataReference limitType;
    
	/**
	* Proportional Top Limit
	*/
    public Integer topLimit;
    
	/**
	* This element maps with the realisedBusiness element in the argument
	*                      Id + Insured Period
	*/
    public SicsInsuredPeriodReference realisedBusinessInsured;
    
	/**
	* This is used to realize treaty. It is not required for creating Reinsurance Program from Assumed Business.
	*/
    public RealizeTreatyOutlineDetails realizeTreatyOutlineDetails;
    
	/**
	* Used only for retrieval of reinsurance treaty Part
	*                      Realised
	*/
    public Boolean isRealised;

    public ProgramTreatyOutline ()
    {
    }

    public ProgramTreatyOutline (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("typeOfParticipation"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfParticipation = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("limitType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.limitType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("topLimit"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.topLimit = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.topLimit = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("realisedBusinessInsured"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.realisedBusinessInsured = (SicsInsuredPeriodReference)__envelope.get(j,SicsInsuredPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("realizeTreatyOutlineDetails"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.realizeTreatyOutlineDetails = (RealizeTreatyOutlineDetails)__envelope.get(j,RealizeTreatyOutlineDetails.class,false);
                    }
                    continue;
                }
                if (info.name.equals("isRealised"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isRealised = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isRealised = (Boolean)obj;
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
            return typeOfParticipation;
        }
        if(propertyIndex==count+1)
        {
            return limitType;
        }
        if(propertyIndex==count+2)
        {
            return this.topLimit!=null?this.topLimit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.realisedBusinessInsured!=null?this.realisedBusinessInsured:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.realizeTreatyOutlineDetails!=null?this.realizeTreatyOutlineDetails:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.isRealised!=null?this.isRealised:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfParticipation";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "limitType";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "topLimit";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsInsuredPeriodReference.class;
            info.name = "realisedBusinessInsured";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = RealizeTreatyOutlineDetails.class;
            info.name = "realizeTreatyOutlineDetails";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isRealised";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

