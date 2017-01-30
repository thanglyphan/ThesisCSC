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

public class ClaimProperties extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public String claimIdentifier;
    
	/**
	* SubclassNumber: 548. SicsRefClaimReferenceType
	*/
    public SicsReferenceDataReference referenceType;
    
    public String reference;
    
	/**
	* Claim Name
	*/
    public String lossName;
    
	/**
	* SubclassNumber: 188. SicsRefClaimDateType
	*/
    public SicsReferenceDataReference dateType;
    
    public java.util.Date fromLossTimeStamp;
    
    public java.util.Date toLossTimeStamp;
    
    public java.util.Date claimTriggerTimeStamp;
    
	/**
	* SubclassNumber: 527. SicsRefClaimType
	*/
    public SicsReferenceDataReference claimType;
    
    public SicsRiskZoneReference riskZone;
    
    public String businessIdentifier;
    
    public SicsBusinessPartnerReference businessPartner;
    
	/**
	* SubclassNumber: 529. SicsRefClaimBusinessPartnerRole.
	*                    Business Partner Role
	*/
    public SicsReferenceDataReference businessPartnerRole;
    
    public String businessPartnerTextName;
    
	/**
	* SubclassNumber: 517. SicsRefClaimStatus
	*/
    public SicsReferenceDataReference status;
    
    public SicsPartyReference insured;
    
	/**
	* SubclassNumber: 515. SicsRefClaimDisposition
	*/
    public SicsReferenceDataReference disposition;
    
    public String insuredClaimantTextName;
    
	/**
	* SubclassNumber: 501. SicsRefClaimInsuredRole.
	*                    Insured/Claimant Role
	*/
    public SicsReferenceDataReference insuredClaimantRole;
    
    public SicsHeadlineLossReference headlineLoss;
    
	/**
	* Claim Manager
	*/
    public SicsUserReference responsibleClaimHandler;
    
    public SicsUserReference claimAnalyst;
    
    public Enums.SelectedClaimFlagStatuses selectedClaimFlagStatuses;
    
    public Boolean isActive;

    public ClaimProperties ()
    {
    }

    public ClaimProperties (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("claimIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.claimIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("referenceType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.referenceType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.reference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lossName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lossName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.lossName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.dateType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("fromLossTimeStamp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fromLossTimeStamp = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.fromLossTimeStamp = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("toLossTimeStamp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.toLossTimeStamp = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.toLossTimeStamp = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimTriggerTimeStamp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimTriggerTimeStamp = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.claimTriggerTimeStamp = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("riskZone"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.riskZone = (SicsRiskZoneReference)__envelope.get(j,SicsRiskZoneReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessPartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartner = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerRole"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartnerRole = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerTextName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessPartnerTextName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessPartnerTextName = (String)obj;
                        }
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
                if (info.name.equals("insured"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insured = (SicsPartyReference)__envelope.get(j,SicsPartyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("disposition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.disposition = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insuredClaimantTextName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredClaimantTextName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.insuredClaimantTextName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredClaimantRole"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredClaimantRole = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("headlineLoss"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.headlineLoss = (SicsHeadlineLossReference)__envelope.get(j,SicsHeadlineLossReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("responsibleClaimHandler"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.responsibleClaimHandler = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimAnalyst"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimAnalyst = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("selectedClaimFlagStatuses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.selectedClaimFlagStatuses = Enums.SelectedClaimFlagStatuses.fromString(j.toString());
                            }
                        }
                        else if (obj instanceof Enums.SelectedClaimFlagStatuses){
                            this.selectedClaimFlagStatuses = (Enums.SelectedClaimFlagStatuses)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isActive"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isActive = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isActive = (Boolean)obj;
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
            return this.claimIdentifier!=null?this.claimIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.referenceType!=null?this.referenceType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.reference!=null?this.reference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.lossName!=null?this.lossName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.dateType!=null?this.dateType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.fromLossTimeStamp!=null?Helper.getDateFormat().format(this.fromLossTimeStamp):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.toLossTimeStamp!=null?Helper.getDateFormat().format(this.toLossTimeStamp):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.claimTriggerTimeStamp!=null?Helper.getDateFormat().format(this.claimTriggerTimeStamp):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.claimType!=null?this.claimType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.riskZone!=null?this.riskZone:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.businessIdentifier!=null?this.businessIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.businessPartner!=null?this.businessPartner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.businessPartnerRole!=null?this.businessPartnerRole:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.businessPartnerTextName!=null?this.businessPartnerTextName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==14)
        {
            return this.status!=null?this.status:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==15)
        {
            return this.insured!=null?this.insured:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==16)
        {
            return this.disposition!=null?this.disposition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==17)
        {
            return this.insuredClaimantTextName!=null?this.insuredClaimantTextName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==18)
        {
            return this.insuredClaimantRole!=null?this.insuredClaimantRole:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==19)
        {
            return this.headlineLoss!=null?this.headlineLoss:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==20)
        {
            return this.responsibleClaimHandler!=null?this.responsibleClaimHandler:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==21)
        {
            return this.claimAnalyst!=null?this.claimAnalyst:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==22)
        {
            return this.selectedClaimFlagStatuses!=null?this.selectedClaimFlagStatuses.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==23)
        {
            return this.isActive!=null?this.isActive:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 24;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "referenceType";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reference";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lossName";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "dateType";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fromLossTimeStamp";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "toLossTimeStamp";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimTriggerTimeStamp";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "claimType";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = SicsRiskZoneReference.class;
            info.name = "riskZone";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "businessPartner";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "businessPartnerRole";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessPartnerTextName";
            info.namespace= "";
        }
        if(propertyIndex==14)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "status";
            info.namespace= "";
        }
        if(propertyIndex==15)
        {
            info.type = SicsPartyReference.class;
            info.name = "insured";
            info.namespace= "";
        }
        if(propertyIndex==16)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "disposition";
            info.namespace= "";
        }
        if(propertyIndex==17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredClaimantTextName";
            info.namespace= "";
        }
        if(propertyIndex==18)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "insuredClaimantRole";
            info.namespace= "";
        }
        if(propertyIndex==19)
        {
            info.type = SicsHeadlineLossReference.class;
            info.name = "headlineLoss";
            info.namespace= "";
        }
        if(propertyIndex==20)
        {
            info.type = SicsUserReference.class;
            info.name = "responsibleClaimHandler";
            info.namespace= "";
        }
        if(propertyIndex==21)
        {
            info.type = SicsUserReference.class;
            info.name = "claimAnalyst";
            info.namespace= "";
        }
        if(propertyIndex==22)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "selectedClaimFlagStatuses";
            info.namespace= "";
        }
        if(propertyIndex==23)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isActive";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

