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

public class ClaimMultipleTableWrapperObject extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Identifier
	*/
    public String claimIdentifier;
    
    public String formerClaimIdentifier;
    
    public BusinessPartnerFindPartial cedent;
    
	/**
	* Name
	*/
    public String lossName;
    
	/**
	* SubclassNumber: 517. SicsRefClaimStatus
	*/
    public SicsReferenceDataReference claimStatus;
    
	/**
	* SubclassNumber: 527. SicsRefClaimType
	*/
    public SicsReferenceDataReference claimType;
    
    public String responsibleClaimHandler;
    
    public SicsUserReference responsibleClaimHandlerReference;
    
    public String claimAnalyst;
    
    public SicsUserReference claimAnalystReference;
    
    public String mainClassOfBusiness;
    
    public String businessIdentifier;
    
    public String businessFormerIdentifier;
    
	/**
	* SubclassNumber: 46. SicsRefTypeOfBusiness
	*/
    public SicsReferenceDataReference typeOfBusiness;
    
    public String businessTitle;
    
    public java.util.Date lossStartingDate;
    
    public java.util.Date lossEndingDate;
    
    public java.util.Date claimsTriggerDate;
    
	/**
	* SubclassNumber: 523. SicsRefClaimCauseOfLoss
	*/
    public SicsReferenceDataReference causeOfLoss;
    
    public SicsReferenceDataReference typeOfRisk;
    
    public SicsReferenceDataReference claimClassification;
    
	/**
	* SubclassNumber: 524. SicsRefClaimConsequenceOfLoss.
	*                    Consequences Of Loss
	*/
    public SicsReferenceDataReference refConsequenceOfLoss;
    
    public ClaimantsList claimantsList;
    
    public String policyId;

    public ClaimMultipleTableWrapperObject ()
    {
    }

    public ClaimMultipleTableWrapperObject (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("formerClaimIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.formerClaimIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.formerClaimIdentifier = (String)obj;
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
                if (info.name.equals("claimStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
                if (info.name.equals("responsibleClaimHandler"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.responsibleClaimHandler = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.responsibleClaimHandler = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("responsibleClaimHandlerReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.responsibleClaimHandlerReference = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimAnalyst"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimAnalyst = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.claimAnalyst = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimAnalystReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimAnalystReference = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("mainClassOfBusiness"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.mainClassOfBusiness = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.mainClassOfBusiness = (String)obj;
                        }
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
                if (info.name.equals("businessFormerIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessFormerIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessFormerIdentifier = (String)obj;
                        }
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
                if (info.name.equals("lossStartingDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lossStartingDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.lossStartingDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lossEndingDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lossEndingDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.lossEndingDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimsTriggerDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.claimsTriggerDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.claimsTriggerDate = (java.util.Date)obj;
                        }
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
                if (info.name.equals("typeOfRisk"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfRisk = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimClassification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimClassification = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("refConsequenceOfLoss"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refConsequenceOfLoss = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimantsList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimantsList = new ClaimantsList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("policyId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.policyId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.policyId = (String)obj;
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
            return this.formerClaimIdentifier!=null?this.formerClaimIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.cedent!=null?this.cedent:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.lossName!=null?this.lossName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.claimStatus!=null?this.claimStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.claimType!=null?this.claimType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.responsibleClaimHandler!=null?this.responsibleClaimHandler:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.responsibleClaimHandlerReference!=null?this.responsibleClaimHandlerReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.claimAnalyst!=null?this.claimAnalyst:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.claimAnalystReference!=null?this.claimAnalystReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.mainClassOfBusiness!=null?this.mainClassOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.businessIdentifier!=null?this.businessIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.businessFormerIdentifier!=null?this.businessFormerIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.typeOfBusiness!=null?this.typeOfBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==14)
        {
            return this.businessTitle!=null?this.businessTitle:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==15)
        {
            return this.lossStartingDate!=null?Helper.getDateFormat().format(this.lossStartingDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==16)
        {
            return this.lossEndingDate!=null?Helper.getDateFormat().format(this.lossEndingDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==17)
        {
            return this.claimsTriggerDate!=null?Helper.getDateFormat().format(this.claimsTriggerDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==18)
        {
            return this.causeOfLoss!=null?this.causeOfLoss:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==19)
        {
            return this.typeOfRisk!=null?this.typeOfRisk:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==20)
        {
            return this.claimClassification!=null?this.claimClassification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==21)
        {
            return this.refConsequenceOfLoss!=null?this.refConsequenceOfLoss:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==22)
        {
            return this.claimantsList!=null?this.claimantsList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==23)
        {
            return this.policyId!=null?this.policyId:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "formerClaimIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = BusinessPartnerFindPartial.class;
            info.name = "cedent";
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
            info.name = "claimStatus";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "claimType";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "responsibleClaimHandler";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = SicsUserReference.class;
            info.name = "responsibleClaimHandlerReference";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimAnalyst";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = SicsUserReference.class;
            info.name = "claimAnalystReference";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "mainClassOfBusiness";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessFormerIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfBusiness";
            info.namespace= "";
        }
        if(propertyIndex==14)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessTitle";
            info.namespace= "";
        }
        if(propertyIndex==15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lossStartingDate";
            info.namespace= "";
        }
        if(propertyIndex==16)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lossEndingDate";
            info.namespace= "";
        }
        if(propertyIndex==17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimsTriggerDate";
            info.namespace= "";
        }
        if(propertyIndex==18)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "causeOfLoss";
            info.namespace= "";
        }
        if(propertyIndex==19)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfRisk";
            info.namespace= "";
        }
        if(propertyIndex==20)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "claimClassification";
            info.namespace= "";
        }
        if(propertyIndex==21)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refConsequenceOfLoss";
            info.namespace= "";
        }
        if(propertyIndex==22)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "claimantsList";
            info.namespace= "";
        }
        if(propertyIndex==23)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "policyId";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

