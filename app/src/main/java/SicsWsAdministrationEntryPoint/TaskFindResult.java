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

public class TaskFindResult extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Process Id
	*/
    public String processIdentifier;
    
	/**
	* Sub Process Name
	*/
    public String subProcess;
    
	/**
	* Task Name
	*/
    public String nlsName;
    
	/**
	* Priority
	*/
    public Integer priority;
    
	/**
	* Status
	*              SubclassNumber: 1146. SicsRefTaskManagementActivityStatus
	*/
    public SicsReferenceDataReference status;
    
	/**
	* Actual Owner
	*/
    public SicsUserReference actualOwner;
    
	/**
	* Date Last Updated
	*/
    public java.util.Date lastUpdatedTimeStamp;

    public TaskFindResult ()
    {
    }

    public TaskFindResult (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("processIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.processIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.processIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("subProcess"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.subProcess = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.subProcess = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("nlsName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.nlsName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.nlsName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("priority"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.priority = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.priority = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("status"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.status = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("actualOwner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.actualOwner = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("lastUpdatedTimeStamp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lastUpdatedTimeStamp = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.lastUpdatedTimeStamp = (java.util.Date)obj;
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
            return this.processIdentifier!=null?this.processIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.subProcess!=null?this.subProcess:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.nlsName!=null?this.nlsName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.priority!=null?this.priority:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.status!=null?this.status:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.actualOwner!=null?this.actualOwner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.lastUpdatedTimeStamp!=null?Helper.getDateTimeFormat().format(this.lastUpdatedTimeStamp):SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "processIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "subProcess";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "nlsName";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "priority";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "status";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = SicsUserReference.class;
            info.name = "actualOwner";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lastUpdatedTimeStamp";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

