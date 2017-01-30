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

public class HeadlineLoss extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Mandatory for Create (when System Parameter 'Assign Manual Headline Loss Identifier' is set), optional for Update
	*/
    public String claimIdentifier;
    
	/**
	* Mandatory for Create, optional for Update
	*/
    public String lossName;
    
	/**
	* Mandatory for Create, optional for Update
	*/
    public java.util.Date lossStartingDate;
    
    public java.util.Date lossEndingDate;
    
    public java.util.Date fxDateOfLoss;
    
    public java.util.Date occurrenceDate;
    
    public Boolean isActive;
    
    public SicsRiskZoneReference riskZone;
    
    public String shortDescription;
    
    public Boolean worksheetClosingSecurityLimitation;
    
    public LegalAreaList locationList;
    
    public LegalAreaList legalAreaList;
    
    public String estimateComment;
    
    public ClaimSpecificClassificationList claimSpecificClassifications;
    
    public ReferenceList referenceList;
    
    public ClaimSignatureNoteList claimSignatureNoteList;
    
    public UserDefinedFields userDefinedFieldsCondition;
    
    public SicsCurrencyReference mainCurrency;
    
    public DetailedMarketEstimateReadList detailedMarketEstimateList;
    
    public CompanyEstimateReadList companyEstimateList;

    public HeadlineLoss ()
    {
    }

    public HeadlineLoss (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("fxDateOfLoss"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fxDateOfLoss = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.fxDateOfLoss = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("occurrenceDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.occurrenceDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.occurrenceDate = (java.util.Date)obj;
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
                if (info.name.equals("riskZone"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.riskZone = (SicsRiskZoneReference)__envelope.get(j,SicsRiskZoneReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("shortDescription"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.shortDescription = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.shortDescription = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("worksheetClosingSecurityLimitation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.worksheetClosingSecurityLimitation = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.worksheetClosingSecurityLimitation = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("locationList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.locationList = (LegalAreaList)__envelope.get(j,LegalAreaList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("legalAreaList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.legalAreaList = (LegalAreaList)__envelope.get(j,LegalAreaList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("estimateComment"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.estimateComment = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.estimateComment = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimSpecificClassifications"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimSpecificClassifications = (ClaimSpecificClassificationList)__envelope.get(j,ClaimSpecificClassificationList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("referenceList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.referenceList = new ReferenceList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("claimSignatureNoteList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimSignatureNoteList = new ClaimSignatureNoteList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("userDefinedFieldsCondition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.userDefinedFieldsCondition = (UserDefinedFields)__envelope.get(j,UserDefinedFields.class,false);
                    }
                    continue;
                }
                if (info.name.equals("mainCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.mainCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("detailedMarketEstimateList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.detailedMarketEstimateList = new DetailedMarketEstimateReadList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("companyEstimateList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.companyEstimateList = new CompanyEstimateReadList(j,__envelope);
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
            return this.claimIdentifier!=null?this.claimIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.lossName!=null?this.lossName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.lossStartingDate!=null?Helper.getDateFormat().format(this.lossStartingDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.lossEndingDate!=null?Helper.getDateFormat().format(this.lossEndingDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.fxDateOfLoss!=null?Helper.getDateFormat().format(this.fxDateOfLoss):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.occurrenceDate!=null?Helper.getDateFormat().format(this.occurrenceDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.isActive!=null?this.isActive:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.riskZone!=null?this.riskZone:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.shortDescription!=null?this.shortDescription:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.worksheetClosingSecurityLimitation!=null?this.worksheetClosingSecurityLimitation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.locationList!=null?this.locationList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.legalAreaList!=null?this.legalAreaList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.estimateComment!=null?this.estimateComment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.claimSpecificClassifications!=null?this.claimSpecificClassifications:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.referenceList!=null?this.referenceList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.claimSignatureNoteList!=null?this.claimSignatureNoteList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.userDefinedFieldsCondition!=null?this.userDefinedFieldsCondition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.mainCurrency!=null?this.mainCurrency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.detailedMarketEstimateList!=null?this.detailedMarketEstimateList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.companyEstimateList!=null?this.companyEstimateList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+20;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "claimIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lossName";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lossStartingDate";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lossEndingDate";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fxDateOfLoss";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "occurrenceDate";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isActive";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsRiskZoneReference.class;
            info.name = "riskZone";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "shortDescription";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "worksheetClosingSecurityLimitation";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = LegalAreaList.class;
            info.name = "locationList";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = LegalAreaList.class;
            info.name = "legalAreaList";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "estimateComment";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = ClaimSpecificClassificationList.class;
            info.name = "claimSpecificClassifications";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "referenceList";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "claimSignatureNoteList";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = UserDefinedFields.class;
            info.name = "userDefinedFieldsCondition";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "mainCurrency";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "detailedMarketEstimateList";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "companyEstimateList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

