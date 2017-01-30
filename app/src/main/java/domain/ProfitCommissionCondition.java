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

public class ProfitCommissionCondition extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SUBCLASS=125, CODE= (see choice below).  Note: For Proportional Treaty business, the Commission Type dictates what further data may be entered.  For Non-Proportional Treaty and Facultative business, data as per "profitCommissionConditionPercent" may be entered.
	*                      Profit Commission Type
	*/
    public SicsReferenceDataReference profitCommissionType;
    
	/**
	* CODE= "UNDEFINED"
	*                         <Undefined>
	*/
    public ProfitCommissionConditionUndefined profitCommissionConditionUndefined;
    
	/**
	* CODE= "NONE"
	*                         <None>
	*/
    public ProfitCommissionConditionNone profitCommissionConditionNone;
    
	/**
	* CODE= "ORIGINAL"
	*                         Original
	*/
    public ProfitCommissionConditionOriginal profitCommissionConditionOriginal;
    
	/**
	* CODE= "PERCENT"
	*                         Percent
	*/
    public ProfitCommissionConditionPercent profitCommissionConditionPercent;
    
	/**
	* CODE= "SS"
	*                         Sliding Scale
	*/
    public ProfitCommissionConditionSlidingScale profitCommissionConditionSlidingScale;
    
	/**
	* CODE= "SSS"
	*                         Stepped Sliding Scale
	*/
    public ProfitCommissionConditionSteppedSlidingScale profitCommissionConditionSteppedSlidingScale;
    
	/**
	* Comment
	*/
    public String comment;
    
	/**
	* Notes
	*/
    public String note;

    public ProfitCommissionCondition ()
    {
    }

    public ProfitCommissionCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("profitCommissionType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.profitCommissionType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("profitCommissionConditionUndefined"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.profitCommissionConditionUndefined = (ProfitCommissionConditionUndefined)__envelope.get(j,ProfitCommissionConditionUndefined.class,false);
                    }
                    continue;
                }
                if (info.name.equals("profitCommissionConditionNone"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.profitCommissionConditionNone = (ProfitCommissionConditionNone)__envelope.get(j,ProfitCommissionConditionNone.class,false);
                    }
                    continue;
                }
                if (info.name.equals("profitCommissionConditionOriginal"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.profitCommissionConditionOriginal = (ProfitCommissionConditionOriginal)__envelope.get(j,ProfitCommissionConditionOriginal.class,false);
                    }
                    continue;
                }
                if (info.name.equals("profitCommissionConditionPercent"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.profitCommissionConditionPercent = (ProfitCommissionConditionPercent)__envelope.get(j,ProfitCommissionConditionPercent.class,false);
                    }
                    continue;
                }
                if (info.name.equals("profitCommissionConditionSlidingScale"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.profitCommissionConditionSlidingScale = (ProfitCommissionConditionSlidingScale)__envelope.get(j,ProfitCommissionConditionSlidingScale.class,false);
                    }
                    continue;
                }
                if (info.name.equals("profitCommissionConditionSteppedSlidingScale"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.profitCommissionConditionSteppedSlidingScale = (ProfitCommissionConditionSteppedSlidingScale)__envelope.get(j,ProfitCommissionConditionSteppedSlidingScale.class,false);
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
            return profitCommissionType;
        }
        if(propertyIndex==count+1)
        {
            return this.profitCommissionConditionUndefined!=null?this.profitCommissionConditionUndefined:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.profitCommissionConditionNone!=null?this.profitCommissionConditionNone:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.profitCommissionConditionOriginal!=null?this.profitCommissionConditionOriginal:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.profitCommissionConditionPercent!=null?this.profitCommissionConditionPercent:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.profitCommissionConditionSlidingScale!=null?this.profitCommissionConditionSlidingScale:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.profitCommissionConditionSteppedSlidingScale!=null?this.profitCommissionConditionSteppedSlidingScale:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.comment!=null?this.comment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
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
            info.type = SicsReferenceDataReference.class;
            info.name = "profitCommissionType";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = ProfitCommissionConditionUndefined.class;
            info.name = "profitCommissionConditionUndefined";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = ProfitCommissionConditionNone.class;
            info.name = "profitCommissionConditionNone";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = ProfitCommissionConditionOriginal.class;
            info.name = "profitCommissionConditionOriginal";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = ProfitCommissionConditionPercent.class;
            info.name = "profitCommissionConditionPercent";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = ProfitCommissionConditionSlidingScale.class;
            info.name = "profitCommissionConditionSlidingScale";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = ProfitCommissionConditionSteppedSlidingScale.class;
            info.name = "profitCommissionConditionSteppedSlidingScale";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "comment";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
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

