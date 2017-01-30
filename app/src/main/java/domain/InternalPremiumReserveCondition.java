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

public class InternalPremiumReserveCondition extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 250. 
	*                    EE Linear Over Accounting Period
	*                    PA Parabola Over Extended Ins Per
	*                    LE Linear Over Extended Accounting Period
	*                    LP Linear Over Selected Period
	*                    PB Earning Based On Pattern
	*                 Calculation Option
	*/
    public SicsReferenceDataReference unearnedPremiumReserveCalculationOption;
    
    public Integer numberOfMonthsExtended;
    
    public Boolean overrideSysParEarningMethods;
    
    public Boolean overrideCeaseAccounting;
    
    public BusinessPortfolioEarningCurve portfolioEarningCurve;
    
	/**
	* Relevant only when unearnedPremiumReserveCalculationOption is LP or PB.
	*                 Earning Methods
	*/
    public ArrayList< BusinessIPRConditionEarningMethod> earningMethod =new ArrayList<BusinessIPRConditionEarningMethod >();
    
    public String note;

    public InternalPremiumReserveCondition ()
    {
    }

    public InternalPremiumReserveCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("unearnedPremiumReserveCalculationOption"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.unearnedPremiumReserveCalculationOption = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("numberOfMonthsExtended"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.numberOfMonthsExtended = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.numberOfMonthsExtended = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("overrideSysParEarningMethods"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.overrideSysParEarningMethods = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.overrideSysParEarningMethods = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("overrideCeaseAccounting"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.overrideCeaseAccounting = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.overrideCeaseAccounting = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("portfolioEarningCurve"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.portfolioEarningCurve = (BusinessPortfolioEarningCurve)__envelope.get(j,BusinessPortfolioEarningCurve.class,false);
                    }
                    continue;
                }
                if (info.name.equals("earningMethod"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.earningMethod==null)
                        {
                            this.earningMethod = new ArrayList< BusinessIPRConditionEarningMethod>();
                        }
                        java.lang.Object j =obj;
                        BusinessIPRConditionEarningMethod j1= (BusinessIPRConditionEarningMethod)__envelope.get(j,BusinessIPRConditionEarningMethod.class,false);
                        this.earningMethod.add(j1);
                   
        
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
            return unearnedPremiumReserveCalculationOption;
        }
        if(propertyIndex==count+1)
        {
            return this.numberOfMonthsExtended!=null?this.numberOfMonthsExtended:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.overrideSysParEarningMethods!=null?this.overrideSysParEarningMethods:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.overrideCeaseAccounting!=null?this.overrideCeaseAccounting:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.portfolioEarningCurve!=null?this.portfolioEarningCurve:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+5 && propertyIndex < count+5+this.earningMethod.size())
        {
            return this.earningMethod.get(propertyIndex-(count+5));
        }
        if(propertyIndex==count+5+this.earningMethod.size())
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6+earningMethod.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "unearnedPremiumReserveCalculationOption";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "numberOfMonthsExtended";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "overrideSysParEarningMethods";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "overrideCeaseAccounting";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = BusinessPortfolioEarningCurve.class;
            info.name = "portfolioEarningCurve";
            info.namespace= "";
        }
        if(propertyIndex>=count+5 && propertyIndex < count+5+this.earningMethod.size())
        {
            info.type = BusinessIPRConditionEarningMethod.class;
            info.name = "earningMethod";
            info.namespace= "";
        }
        if(propertyIndex==count+5+this.earningMethod.size())
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

