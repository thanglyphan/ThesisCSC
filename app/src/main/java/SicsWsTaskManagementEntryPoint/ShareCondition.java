package SicsWsTaskManagementEntryPoint;

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
import java.math.BigInteger;
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class ShareCondition extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 537. CODE= "PCT" | "UNT" | "AMOUNT".  For PROPTTY business, if the participation is Quota Share or Surplus, "Expressed as" = "PCT", otherwise "Expressed as" = "PCT" | "UNT". For other types of business, if it"s (FAC + not Direct + NONPROP + Unlimited Cover, "Expressed as" = "PCT" | "AMOUNT", otherwise "Expressed as" = "PCT"
	*                      Expressed as
	*/
    public SicsReferenceDataReference expressedAs;
    
	/**
	* "Total Units" is only used for business where "Expressed as" = "UNT"
	*                      Total Units
	*/
    public BigDecimal totalUnits;
    
	/**
	* "Alt. Share On Tech. Acc." is only used for Proportional Retention Participation and Intermediary Placements.
	*                      Alt. Share On Tech. Acc.
	*/
    public BigDecimal alternativeShareOnTechnicalAccount;
    
	/**
	* "Main Limit" is used for PROPFAC business "Expressed as" = "AMOUNT".  This figure updates, and where necessary results in the creation of, the Limit Premium Condition.
	*                      Main Limit
	*/
    public BigInteger mainLimitAmount;
    
	/**
	* "Cover 100%" is used for NONPROPFAC business "Expressed as" = "AMOUNT".  This figure updates, and where necessary results in the creation of, the Limit Premium Condition.
	*                      Cover 100%
	*/
    public BigInteger premiumLimitCoverAmount;
    
	/**
	* Co-Reinsurance
	*/
    public BigDecimal coReinsurance;
    
	/**
	* Original Participation
	*/
    public BigDecimal originalParticipation;
    
	/**
	* Ceded
	*/
    public BigDecimal ceded;
    
	/**
	* Ceded Of 100%
	*/
    public BigDecimal cededOf100;
    
	/**
	* Broker"s Order
	*/
    public BigDecimal brokersOrder;
    
	/**
	* Broker"s Order Of 100%
	*/
    public BigDecimal brokersOrderOf100;
    
	/**
	* Broker"s Order Of Original
	*/
    public BigDecimal brokersOrderOfOriginalParticipation;
    
	/**
	* Broker"s Order Of Ceded Of 100%
	*/
    public BigDecimal brokersOrderOfCededOf100;
    
	/**
	* Net of Gross
	*/
    public BigDecimal netOfGross;
    
	/**
	* Order
	*/
    public BigDecimal order;
    
	/**
	* Signed
	*/
    public BigDecimal signedShareAmount;
    
	/**
	* Estimated Signed
	*/
    public BigDecimal estimatedSignedShareAmount;
    
	/**
	* Written
	*/
    public BigDecimal writtenShareAmount;
    
	/**
	* Offered
	*/
    public BigDecimal offeredShareAmount;
    
	/**
	* Signed (%)
	*/
    public BigDecimal signedSharePercent;
    
	/**
	* Estimated Signed (%)
	*/
    public BigDecimal estimatedSignedSharePercent;
    
	/**
	* Written (%)
	*/
    public BigDecimal writtenSharePercent;
    
	/**
	* Offered (%)
	*/
    public BigDecimal offeredSharePercent;
    
	/**
	* Time stamp when signed share was fIrst entered
	*/
    public java.util.Date signedShareFirstRegistered;
    
	/**
	* Written Share Frozen
	*/
    public Boolean isWrittenShareFrozen;
    
	/**
	* (Detailed Share Figures)
	*/
    public ArrayList< DetailedShareFigures> detailedShareFigures =new ArrayList<DetailedShareFigures >();
    
	/**
	* Used to specify changes in instalment condition and instalments which may change as a consequence of
	*                      changing the share figures.
	*/
    public InstalmentRecalculationSpecification instalmentRecalculationSpecification;
    
	/**
	* Notes
	*/
    public String note;

    public ShareCondition ()
    {
    }

    public ShareCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("expressedAs"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.expressedAs = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("totalUnits"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.totalUnits = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.totalUnits = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("alternativeShareOnTechnicalAccount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.alternativeShareOnTechnicalAccount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.alternativeShareOnTechnicalAccount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("mainLimitAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.mainLimitAmount = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.mainLimitAmount = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premiumLimitCoverAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premiumLimitCoverAmount = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.premiumLimitCoverAmount = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("coReinsurance"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.coReinsurance = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.coReinsurance = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("originalParticipation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.originalParticipation = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.originalParticipation = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ceded"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ceded = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.ceded = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("cededOf100"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cededOf100 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.cededOf100 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("brokersOrder"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.brokersOrder = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.brokersOrder = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("brokersOrderOf100"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.brokersOrderOf100 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.brokersOrderOf100 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("brokersOrderOfOriginalParticipation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.brokersOrderOfOriginalParticipation = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.brokersOrderOfOriginalParticipation = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("brokersOrderOfCededOf100"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.brokersOrderOfCededOf100 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.brokersOrderOfCededOf100 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("netOfGross"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.netOfGross = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.netOfGross = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("order"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.order = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.order = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("signedShareAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.signedShareAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.signedShareAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("estimatedSignedShareAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.estimatedSignedShareAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.estimatedSignedShareAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("writtenShareAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.writtenShareAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.writtenShareAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("offeredShareAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.offeredShareAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.offeredShareAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("signedSharePercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.signedSharePercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.signedSharePercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("estimatedSignedSharePercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.estimatedSignedSharePercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.estimatedSignedSharePercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("writtenSharePercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.writtenSharePercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.writtenSharePercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("offeredSharePercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.offeredSharePercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.offeredSharePercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("signedShareFirstRegistered"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.signedShareFirstRegistered = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.signedShareFirstRegistered = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isWrittenShareFrozen"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isWrittenShareFrozen = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isWrittenShareFrozen = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("detailedShareFigures"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.detailedShareFigures==null)
                        {
                            this.detailedShareFigures = new ArrayList< DetailedShareFigures>();
                        }
                        java.lang.Object j =obj;
                        DetailedShareFigures j1= (DetailedShareFigures)__envelope.get(j,DetailedShareFigures.class,false);
                        this.detailedShareFigures.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("instalmentRecalculationSpecification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.instalmentRecalculationSpecification = (InstalmentRecalculationSpecification)__envelope.get(j,InstalmentRecalculationSpecification.class,false);
                    }
                    continue;
                }
                if (info.name.equals("note"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.note = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.note = (String)obj;
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
            return expressedAs;
        }
        if(propertyIndex==count+1)
        {
            return this.totalUnits!=null?this.totalUnits.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.alternativeShareOnTechnicalAccount!=null?this.alternativeShareOnTechnicalAccount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.mainLimitAmount!=null?this.mainLimitAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.premiumLimitCoverAmount!=null?this.premiumLimitCoverAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.coReinsurance!=null?this.coReinsurance.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.originalParticipation!=null?this.originalParticipation.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.ceded!=null?this.ceded.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.cededOf100!=null?this.cededOf100.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.brokersOrder!=null?this.brokersOrder.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.brokersOrderOf100!=null?this.brokersOrderOf100.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.brokersOrderOfOriginalParticipation!=null?this.brokersOrderOfOriginalParticipation.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.brokersOrderOfCededOf100!=null?this.brokersOrderOfCededOf100.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.netOfGross!=null?this.netOfGross.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.order!=null?this.order.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.signedShareAmount!=null?this.signedShareAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.estimatedSignedShareAmount!=null?this.estimatedSignedShareAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.writtenShareAmount!=null?this.writtenShareAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.offeredShareAmount!=null?this.offeredShareAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.signedSharePercent!=null?this.signedSharePercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.estimatedSignedSharePercent!=null?this.estimatedSignedSharePercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.writtenSharePercent!=null?this.writtenSharePercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+22)
        {
            return this.offeredSharePercent!=null?this.offeredSharePercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+23)
        {
            return this.signedShareFirstRegistered!=null?Helper.getDateTimeFormat().format(this.signedShareFirstRegistered):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+24)
        {
            return this.isWrittenShareFrozen!=null?this.isWrittenShareFrozen:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+25 && propertyIndex < count+25+this.detailedShareFigures.size())
        {
            return this.detailedShareFigures.get(propertyIndex-(count+25));
        }
        if(propertyIndex==count+25+this.detailedShareFigures.size())
        {
            return this.instalmentRecalculationSpecification!=null?this.instalmentRecalculationSpecification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+26+this.detailedShareFigures.size())
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+27+detailedShareFigures.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "expressedAs";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "totalUnits";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "alternativeShareOnTechnicalAccount";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "mainLimitAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premiumLimitCoverAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "coReinsurance";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "originalParticipation";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ceded";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cededOf100";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "brokersOrder";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "brokersOrderOf100";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "brokersOrderOfOriginalParticipation";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "brokersOrderOfCededOf100";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "netOfGross";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "order";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "signedShareAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "estimatedSignedShareAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "writtenShareAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "offeredShareAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "signedSharePercent";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "estimatedSignedSharePercent";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "writtenSharePercent";
            info.namespace= "";
        }
        if(propertyIndex==count+22)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "offeredSharePercent";
            info.namespace= "";
        }
        if(propertyIndex==count+23)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "signedShareFirstRegistered";
            info.namespace= "";
        }
        if(propertyIndex==count+24)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isWrittenShareFrozen";
            info.namespace= "";
        }
        if(propertyIndex>=count+25 && propertyIndex < count+25+this.detailedShareFigures.size())
        {
            info.type = DetailedShareFigures.class;
            info.name = "detailedShareFigures";
            info.namespace= "";
        }
        if(propertyIndex==count+25+this.detailedShareFigures.size())
        {
            info.type = InstalmentRecalculationSpecification.class;
            info.name = "instalmentRecalculationSpecification";
            info.namespace= "";
        }
        if(propertyIndex==count+26+this.detailedShareFigures.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
