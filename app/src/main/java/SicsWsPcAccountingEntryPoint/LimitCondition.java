package SicsWsPcAccountingEntryPoint;

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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class LimitCondition extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* A non persistent web service identifer number, only valid for one unit of work. All limits will be deleted and added for update / create / delete
	*/
    public Integer identifierNumber=0;
    
	/**
	* Used by the "update" Condition Web Service: set to "true" if this component of the condition should be removed.
	*/
    public Boolean isToBeDeleted;
    
	/**
	* isOriginal will determine if the limits should be added to the original tab
	*                XXXXXX
	*/
    public Boolean isOriginal=false;
    
	/**
	* SubclassNumber: 542.    CODE: TOTAL_SUM |  UNKNOWN.  Controls where the limits will be added. e.g. TOTAL_SUM will add a main mimit. might be that this is specific per type of business
	*                XXXXXX
	*/
    public SicsReferenceDataReference refConditionPer;
    
	/**
	* XXXXXX
	*                (Limits)
	*/
    public ArrayList< Limit_1> limit =new ArrayList<Limit_1 >();
    
	/**
	* XXXXXX
	*                (Time/Measurement)
	*/
    public ArrayList< Measurement> measurement =new ArrayList<Measurement >();
    
	/**
	* XXXXXX
	*                (Key Amount)
	*/
    public ArrayList< KeyAmount> keyAmount =new ArrayList<KeyAmount >();
    
	/**
	* Only valid when refConditionPer: UNKNOWN
	*                XXXXXX
	*/
    public String refConditionPerComment;
    
	/**
	* This element is mandatory in case of Direct business
	*                XXXXXX
	*/
    public Boolean refConditionPerUseLimitIndex;
    
	/**
	* XXXXXX
	*                XXXXXX
	*/
    public SicsCurrencyReference refConditionPerCurrency;

    public LimitCondition ()
    {
    }

    public LimitCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("identifierNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifierNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.identifierNumber = (Integer)obj;
                        }
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
                if (info.name.equals("isOriginal"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isOriginal = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isOriginal = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refConditionPer"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refConditionPer = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("limit"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.limit==null)
                        {
                            this.limit = new ArrayList< Limit_1>();
                        }
                        java.lang.Object j =obj;
                        Limit_1 j1= (Limit_1)__envelope.get(j,Limit_1.class,false);
                        this.limit.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("measurement"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.measurement==null)
                        {
                            this.measurement = new ArrayList< Measurement>();
                        }
                        java.lang.Object j =obj;
                        Measurement j1= (Measurement)__envelope.get(j,Measurement.class,false);
                        this.measurement.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("keyAmount"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.keyAmount==null)
                        {
                            this.keyAmount = new ArrayList< KeyAmount>();
                        }
                        java.lang.Object j =obj;
                        KeyAmount j1= (KeyAmount)__envelope.get(j,KeyAmount.class,false);
                        this.keyAmount.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("refConditionPerComment"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.refConditionPerComment = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.refConditionPerComment = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refConditionPerUseLimitIndex"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.refConditionPerUseLimitIndex = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.refConditionPerUseLimitIndex = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refConditionPerCurrency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refConditionPerCurrency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
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
            return identifierNumber;
        }
        if(propertyIndex==1)
        {
            return this.isToBeDeleted!=null?this.isToBeDeleted:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return isOriginal;
        }
        if(propertyIndex==3)
        {
            return refConditionPer;
        }
        if(propertyIndex>=4 && propertyIndex < 4+this.limit.size())
        {
            return this.limit.get(propertyIndex-(4));
        }
        if(propertyIndex>=4+this.limit.size() && propertyIndex < 4+this.limit.size()+this.measurement.size())
        {
            return this.measurement.get(propertyIndex-(4+this.limit.size()));
        }
        if(propertyIndex>=4+this.limit.size()+this.measurement.size() && propertyIndex < 4+this.limit.size()+this.measurement.size()+this.keyAmount.size())
        {
            return this.keyAmount.get(propertyIndex-(4+this.limit.size()+this.measurement.size()));
        }
        if(propertyIndex==4+this.limit.size()+this.measurement.size()+this.keyAmount.size())
        {
            return this.refConditionPerComment!=null?this.refConditionPerComment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5+this.limit.size()+this.measurement.size()+this.keyAmount.size())
        {
            return this.refConditionPerUseLimitIndex!=null?this.refConditionPerUseLimitIndex:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6+this.limit.size()+this.measurement.size()+this.keyAmount.size())
        {
            return this.refConditionPerCurrency!=null?this.refConditionPerCurrency:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 7+limit.size()+measurement.size()+keyAmount.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "identifierNumber";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isToBeDeleted";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isOriginal";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refConditionPer";
            info.namespace= "";
        }
        if(propertyIndex>=4 && propertyIndex < 4+this.limit.size())
        {
            info.type = Limit_1.class;
            info.name = "limit";
            info.namespace= "";
        }
        if(propertyIndex>=4+this.limit.size() && propertyIndex < 4+this.limit.size()+this.measurement.size())
        {
            info.type = Measurement.class;
            info.name = "measurement";
            info.namespace= "";
        }
        if(propertyIndex>=4+this.limit.size()+this.measurement.size() && propertyIndex < 4+this.limit.size()+this.measurement.size()+this.keyAmount.size())
        {
            info.type = KeyAmount.class;
            info.name = "keyAmount";
            info.namespace= "";
        }
        if(propertyIndex==4+this.limit.size()+this.measurement.size()+this.keyAmount.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "refConditionPerComment";
            info.namespace= "";
        }
        if(propertyIndex==5+this.limit.size()+this.measurement.size()+this.keyAmount.size())
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "refConditionPerUseLimitIndex";
            info.namespace= "";
        }
        if(propertyIndex==6+this.limit.size()+this.measurement.size()+this.keyAmount.size())
        {
            info.type = SicsCurrencyReference.class;
            info.name = "refConditionPerCurrency";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

