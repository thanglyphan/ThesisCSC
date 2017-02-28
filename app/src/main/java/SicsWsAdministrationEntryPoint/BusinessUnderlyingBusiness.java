package SicsWsAdministrationEntryPoint;

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

public class BusinessUnderlyingBusiness extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* To Remove Preceeding Business xsi:nil attribute should be true in soap message.
	*/
    public SicsBusinessReference preceedingBusiness;
    
    public String preceedingBusinessTitleId;
    
    public SicsCurrencyReference currency;
    
    public Boolean layeredPoliciesCovered;
    
    public Boolean maxTableAttached;
    
    public Boolean riskProfileAttached;
    
    public Boolean highDeductiblePoliciesCovered;
    
    public String note;
    
    public ConditionPerLimitList conditionPerLimitList;

    public BusinessUnderlyingBusiness ()
    {
    }

    public BusinessUnderlyingBusiness (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("preceedingBusiness"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.preceedingBusiness = (SicsBusinessReference)__envelope.get(j,SicsBusinessReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("preceedingBusinessTitleId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.preceedingBusinessTitleId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.preceedingBusinessTitleId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("currency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.currency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("layeredPoliciesCovered"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.layeredPoliciesCovered = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.layeredPoliciesCovered = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("maxTableAttached"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.maxTableAttached = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.maxTableAttached = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("riskProfileAttached"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.riskProfileAttached = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.riskProfileAttached = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("highDeductiblePoliciesCovered"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.highDeductiblePoliciesCovered = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.highDeductiblePoliciesCovered = (Boolean)obj;
                        }
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
                if (info.name.equals("conditionPerLimitList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.conditionPerLimitList = new ConditionPerLimitList(j,__envelope);
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
            return this.preceedingBusiness!=null?this.preceedingBusiness:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.preceedingBusinessTitleId!=null?this.preceedingBusinessTitleId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.currency!=null?this.currency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.layeredPoliciesCovered!=null?this.layeredPoliciesCovered:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.maxTableAttached!=null?this.maxTableAttached:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.riskProfileAttached!=null?this.riskProfileAttached:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.highDeductiblePoliciesCovered!=null?this.highDeductiblePoliciesCovered:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.conditionPerLimitList!=null?this.conditionPerLimitList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+9;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsBusinessReference.class;
            info.name = "preceedingBusiness";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "preceedingBusinessTitleId";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "layeredPoliciesCovered";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "maxTableAttached";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "riskProfileAttached";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "highDeductiblePoliciesCovered";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "conditionPerLimitList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

