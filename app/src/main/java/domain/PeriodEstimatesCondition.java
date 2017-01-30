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

public class PeriodEstimatesCondition extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date asAtDate;
    
    public SicsCurrencyReference currency;
    
    public SicsReferenceDataReference estimateType;
    
    public Boolean isComplete;
    
    public ArrayList< SingleEstimate> singleEstimate =new ArrayList<SingleEstimate >();
    
    public String estimateNote;

    public PeriodEstimatesCondition ()
    {
    }

    public PeriodEstimatesCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("asAtDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.asAtDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.asAtDate = (java.util.Date)obj;
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
                if (info.name.equals("estimateType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.estimateType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("isComplete"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isComplete = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isComplete = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("singleEstimate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.singleEstimate==null)
                        {
                            this.singleEstimate = new ArrayList< SingleEstimate>();
                        }
                        java.lang.Object j =obj;
                        SingleEstimate j1= (SingleEstimate)__envelope.get(j,SingleEstimate.class,false);
                        this.singleEstimate.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("estimateNote"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.estimateNote = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.estimateNote = (String)obj;
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
            return this.asAtDate!=null?Helper.getDateTimeFormat().format(this.asAtDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.currency!=null?this.currency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.estimateType!=null?this.estimateType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.isComplete!=null?this.isComplete:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+4 && propertyIndex < count+4+this.singleEstimate.size())
        {
            return this.singleEstimate.get(propertyIndex-(count+4));
        }
        if(propertyIndex==count+4+this.singleEstimate.size())
        {
            return this.estimateNote!=null?this.estimateNote:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+5+singleEstimate.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "asAtDate";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "estimateType";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isComplete";
            info.namespace= "";
        }
        if(propertyIndex>=count+4 && propertyIndex < count+4+this.singleEstimate.size())
        {
            info.type = SingleEstimate.class;
            info.name = "singleEstimate";
            info.namespace= "";
        }
        if(propertyIndex==count+4+this.singleEstimate.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "estimateNote";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
