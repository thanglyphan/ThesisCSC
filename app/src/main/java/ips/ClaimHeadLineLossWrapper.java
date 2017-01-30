package ips;

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

public class ClaimHeadLineLossWrapper extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public Boolean isActive;
    
    public String headlineLossId;
    
    public String headlineLossName;
    
    public java.util.Date dateOfLossFrom;
    
    public java.util.Date dateOfLossTo;

    public ClaimHeadLineLossWrapper ()
    {
    }

    public ClaimHeadLineLossWrapper (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("isActive"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isActive = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isActive = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("headlineLossId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.headlineLossId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.headlineLossId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("headlineLossName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.headlineLossName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.headlineLossName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateOfLossFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfLossFrom = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfLossFrom = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateOfLossTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfLossTo = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfLossTo = (java.util.Date)obj;
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
            return this.isActive!=null?this.isActive:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.headlineLossId!=null?this.headlineLossId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.headlineLossName!=null?this.headlineLossName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.dateOfLossFrom!=null?Helper.getDateTimeFormat().format(this.dateOfLossFrom):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.dateOfLossTo!=null?Helper.getDateTimeFormat().format(this.dateOfLossTo):SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isActive";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "headlineLossId";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "headlineLossName";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfLossFrom";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfLossTo";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

