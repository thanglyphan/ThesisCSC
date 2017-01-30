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
import java.math.BigDecimal;

public class WorksheetWorkingInformation extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* 100 % Figures
	*/
    public Boolean oneHundredPercentFigures;
    
	/**
	* Fiugres for our Share
	*/
    public Boolean figuresForOurShare;
    
	/**
	* Share %
	*                                 Only available if figuresForOurShare is true.
	*/
    public BigDecimal sharePercent;
    
	/**
	* Figures from Share Conditions
	*/
    public Boolean figuresFromShareConditions;
    
	/**
	* Share Cond.  
	*                                 SubclassNumber: 553. SicsRefShareItem. Only available if selectedShareConditionType is true.
	*/
    public SicsReferenceDataReference selectedShareConditionType;
    
	/**
	* Received (Accounting information tab)
	*/
    public java.util.Date receivedDate;
    
	/**
	* Received Internal(Accounting information tab)
	*/
    public java.util.Date receivedInternalDate;
    
    public Boolean replacementValues;

    public WorksheetWorkingInformation ()
    {
    }

    public WorksheetWorkingInformation (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("oneHundredPercentFigures"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.oneHundredPercentFigures = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.oneHundredPercentFigures = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("figuresForOurShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.figuresForOurShare = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.figuresForOurShare = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("sharePercent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sharePercent = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.sharePercent = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("figuresFromShareConditions"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.figuresFromShareConditions = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.figuresFromShareConditions = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("selectedShareConditionType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.selectedShareConditionType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("receivedDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.receivedDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.receivedDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("receivedInternalDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.receivedInternalDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.receivedInternalDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("replacementValues"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.replacementValues = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.replacementValues = (Boolean)obj;
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
            return this.oneHundredPercentFigures!=null?this.oneHundredPercentFigures:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.figuresForOurShare!=null?this.figuresForOurShare:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.sharePercent!=null?this.sharePercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.figuresFromShareConditions!=null?this.figuresFromShareConditions:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.selectedShareConditionType!=null?this.selectedShareConditionType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.receivedDate!=null?Helper.getDateFormat().format(this.receivedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.receivedInternalDate!=null?Helper.getDateFormat().format(this.receivedInternalDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.replacementValues!=null?this.replacementValues:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "oneHundredPercentFigures";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "figuresForOurShare";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sharePercent";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "figuresFromShareConditions";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "selectedShareConditionType";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "receivedDate";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "receivedInternalDate";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "replacementValues";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

