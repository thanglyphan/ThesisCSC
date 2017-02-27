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

public class DeductionElement extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SUBCLASS=1011. The Deduction Type selected must be applicable to the type of business to which the condition is being applied. Brokerage types are only applicable when there is a broker present on the business.
	*                      Deduction Type
	*/
    public SicsReferenceDataReference deductionType;
    
	/**
	* Used by "update" Deduction Condition Web Service: set to "true" if the element for the deduction type specified should be removed from the condition.
	*                      (To Be Deleted)
	*/
    public Boolean isToBeDeleted;
    
	/**
	* SUBCLASS=125.
	*                      Calculation Method
	*/
    public SicsReferenceDataReference calculationMethod;
    
	/**
	* Only applicable to "Other Deduction" in SICS/nt Global Risk.
	*                      Factor
	*/
    public BigDecimal factor;
    
	/**
	* Only applicable to "Other Deduction" in SICS/nt Global Risk.
	*                      Pro Rata Amount
	*/
    public BigDecimal proRataAmount;
    
	/**
	* Note: for "Other Deduction" in SICS/nt Global Risk, the heading is "Percent \ (Base * Factor)".
	*                Percent
	*/
    public BigDecimal percent;
    
	/**
	* For Non-Prop Business Entry Code Group where category = (SUBCLASS= 223, CODE= "SUPINP"). Otherwise Entry Code Group where category = (SUBCLASS= 223, CODE= "SUPIP").
	*                Calculation Basis
	*/
    public SicsAccountingEntryCodeGroupReference calculationBasis;
    
	/**
	* Amount-Currency
	*/
    public SicsMonetaryAmountReference amount;
    
	/**
	* Comment
	*                      Comment
	*/
    public String comment;
    
	/**
	* The Business Partner specified must be present on the business
	*                      Paid To
	*/
    public SicsBusinessPartnerReference businessPartner;
    
	/**
	* Used when "Calculation Method" CODE="SS"
	*                      Sliding Scale
	*/
    public DeductionConditionSlidingScale slidingScale;
    
	/**
	* Used when "Calculation Method" CODE="SSS"
	*                      Stepped Sliding Scale
	*/
    public DeductionConditionSteppedSlidingScale steppedSlidingScale;

    public DeductionElement ()
    {
    }

    public DeductionElement (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("deductionType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deductionType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("isToBeDeleted"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isToBeDeleted = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isToBeDeleted = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("calculationMethod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.calculationMethod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("factor"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.factor = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.factor = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("proRataAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.proRataAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.proRataAmount = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("percent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.percent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.percent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("calculationBasis"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.calculationBasis = (SicsAccountingEntryCodeGroupReference)__envelope.get(j,SicsAccountingEntryCodeGroupReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("amount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.amount = (SicsMonetaryAmountReference)__envelope.get(j,SicsMonetaryAmountReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("comment"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.comment = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.comment = (String)obj;
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
                if (info.name.equals("slidingScale"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.slidingScale = (DeductionConditionSlidingScale)__envelope.get(j,DeductionConditionSlidingScale.class,false);
                    }
                    continue;
                }
                if (info.name.equals("steppedSlidingScale"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.steppedSlidingScale = (DeductionConditionSteppedSlidingScale)__envelope.get(j,DeductionConditionSteppedSlidingScale.class,false);
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
            return deductionType;
        }
        if(propertyIndex==count+1)
        {
            return this.isToBeDeleted!=null?this.isToBeDeleted:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return calculationMethod;
        }
        if(propertyIndex==count+3)
        {
            return this.factor!=null?this.factor.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.proRataAmount!=null?this.proRataAmount.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.percent!=null?this.percent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.calculationBasis!=null?this.calculationBasis:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.amount!=null?this.amount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.comment!=null?this.comment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.businessPartner!=null?this.businessPartner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.slidingScale!=null?this.slidingScale:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.steppedSlidingScale!=null?this.steppedSlidingScale:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+12;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "deductionType";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isToBeDeleted";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "calculationMethod";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "factor";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "proRataAmount";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "percent";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsAccountingEntryCodeGroupReference.class;
            info.name = "calculationBasis";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsMonetaryAmountReference.class;
            info.name = "amount";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "comment";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "businessPartner";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = DeductionConditionSlidingScale.class;
            info.name = "slidingScale";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = DeductionConditionSteppedSlidingScale.class;
            info.name = "steppedSlidingScale";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

