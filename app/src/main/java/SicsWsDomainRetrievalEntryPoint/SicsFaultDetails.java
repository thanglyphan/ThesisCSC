package SicsWsDomainRetrievalEntryPoint;

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

public class SicsFaultDetails extends java.lang.Exception implements KvmSerializable,java.io.Serializable
{

    
	/**
	* The date the error occurred.
	*/
    public java.util.Date date;
    
	/**
	* The time the error occurred.
	*/
    public String time;
    
	/**
	* Current operationId if part of a chainedOperation.
	*/
    public String currentOperationId;
    
	/**
	* XPath to the element with error (if applicable).
	*/
    public String xpath;
    
	/**
	* Error message from SICS. Same as faultString of the SOAPFault
	*/
    public String explanation;

    public SicsFaultDetails ()
    {
    }

    public SicsFaultDetails (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("date"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.date = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.date = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("time"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.time = j.toString();
                            }
                        }
                        else{
                            this.time = obj.toString();
                        }
                    }
                    continue;
                }
                if (info.name.equals("currentOperationId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.currentOperationId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.currentOperationId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("xpath"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.xpath = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.xpath = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("explanation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.explanation = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.explanation = (String)obj;
                        }
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
            return this.date!=null?Helper.getDateFormat().format(this.date):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return time;
        }
        if(propertyIndex==2)
        {
            return this.currentOperationId!=null?this.currentOperationId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.xpath!=null?this.xpath:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return explanation;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "date";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "time";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "currentOperationId";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "xpath";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "explanation";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
