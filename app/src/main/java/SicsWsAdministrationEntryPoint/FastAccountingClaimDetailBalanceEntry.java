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

public class FastAccountingClaimDetailBalanceEntry extends FastAccountingDetailBalanceEntry implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Row column
	*                       identifes a row of properties
	*/
    public Integer row=0;
    
	/**
	* As Of Date column
	*/
    public java.util.Date asOfDate;
    
	/**
	* London Market Reference
	*                       Not directly visible on GUI.
	*/
    public String londonMarketReference;
    
	/**
	* London Market Bulk Reference
	*                       Not directly visible on GUI.
	*/
    public String bulkReference;
    
	/**
	* Our Sequence Number
	*                       Not directly visible on GUI.
	*/
    public Integer ourSequenceNumber;
    
	/**
	* Broker Sequence Number
	*                       Not directly visible on GUI.
	*/
    public Integer brokerSequenceNumber;

    public FastAccountingClaimDetailBalanceEntry ()
    {
    }

    public FastAccountingClaimDetailBalanceEntry (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("row"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.row = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.row = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("asOfDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.asOfDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.asOfDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("londonMarketReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.londonMarketReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.londonMarketReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bulkReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bulkReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.bulkReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ourSequenceNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ourSequenceNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.ourSequenceNumber = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("brokerSequenceNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.brokerSequenceNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.brokerSequenceNumber = (Integer)obj;
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
            return row;
        }
        if(propertyIndex==count+1)
        {
            return this.asOfDate!=null?Helper.getDateFormat().format(this.asOfDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.londonMarketReference!=null?this.londonMarketReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.bulkReference!=null?this.bulkReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.ourSequenceNumber!=null?this.ourSequenceNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.brokerSequenceNumber!=null?this.brokerSequenceNumber:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "row";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "asOfDate";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "londonMarketReference";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "bulkReference";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "ourSequenceNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "brokerSequenceNumber";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

