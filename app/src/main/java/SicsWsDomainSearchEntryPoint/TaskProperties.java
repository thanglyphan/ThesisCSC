package SicsWsDomainSearchEntryPoint;

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

public class TaskProperties extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Process ID
	*/
    public String processIdentifier;
    
	/**
	* Task Name
	*/
    public String taskName;
    
	/**
	* SubclassNumber: 1148. SicsRefTaskManagementActivityHistoryType
	*                  Event Type
	*/
    public SicsReferenceDataReference eventType;
    
	/**
	* Event Type - From
	*/
    public java.util.Date eventTypeCreatedFrom;
    
	/**
	* Event Type - To
	*/
    public java.util.Date eventTypeCreatedTo;
    
	/**
	* If set to false will find all tasks if the user has the right to find all tasks,
	*                  that is if the user has assigned use case:
	*                  "SICS Task Management Find All Task Execute"
	*                  If not (i.e. has not assigned the use case) and element set to false it will be ignored.
	*                  Find Only Own Tasks
	*/
    public Boolean findOnlyOwnTasks;
    
	/**
	* List of: SubclassNumber: 1146. SicsRefTaskManagementActivityStatus
	*                  Task Status
	*/
    public TaskStatusList taskStatusList;

    public TaskProperties ()
    {
    }

    public TaskProperties (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("taskName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.taskName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.taskName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("eventType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.eventType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("eventTypeCreatedFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.eventTypeCreatedFrom = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.eventTypeCreatedFrom = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("eventTypeCreatedTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.eventTypeCreatedTo = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.eventTypeCreatedTo = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("findOnlyOwnTasks"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.findOnlyOwnTasks = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.findOnlyOwnTasks = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("taskStatusList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.taskStatusList = new TaskStatusList(j,__envelope);
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
            return this.taskName!=null?this.taskName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.eventType!=null?this.eventType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.eventTypeCreatedFrom!=null?Helper.getDateFormat().format(this.eventTypeCreatedFrom):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.eventTypeCreatedTo!=null?Helper.getDateFormat().format(this.eventTypeCreatedTo):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.findOnlyOwnTasks!=null?this.findOnlyOwnTasks:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.taskStatusList!=null?this.taskStatusList:SoapPrimitive.NullSkip;
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
            info.name = "taskName";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "eventType";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "eventTypeCreatedFrom";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "eventTypeCreatedTo";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "findOnlyOwnTasks";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "taskStatusList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

