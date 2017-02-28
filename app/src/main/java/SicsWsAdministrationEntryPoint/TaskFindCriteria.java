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

public class TaskFindCriteria extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public TaskProperties taskProperties;
    
    public ActualOwnerProperties actualOwnerProperties;
    
    public ProcessInitiatorProperties processInitiatorProperties;
    
    public InputOutputValuesProperties inputOutputValuesProperties;

    public TaskFindCriteria ()
    {
    }

    public TaskFindCriteria (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("taskProperties"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.taskProperties = (TaskProperties)__envelope.get(j,TaskProperties.class,false);
                    }
                    continue;
                }
                if (info.name.equals("actualOwnerProperties"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.actualOwnerProperties = (ActualOwnerProperties)__envelope.get(j,ActualOwnerProperties.class,false);
                    }
                    continue;
                }
                if (info.name.equals("processInitiatorProperties"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.processInitiatorProperties = (ProcessInitiatorProperties)__envelope.get(j,ProcessInitiatorProperties.class,false);
                    }
                    continue;
                }
                if (info.name.equals("inputOutputValuesProperties"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.inputOutputValuesProperties = (InputOutputValuesProperties)__envelope.get(j,InputOutputValuesProperties.class,false);
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
            return this.taskProperties!=null?this.taskProperties:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.actualOwnerProperties!=null?this.actualOwnerProperties:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.processInitiatorProperties!=null?this.processInitiatorProperties:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.inputOutputValuesProperties!=null?this.inputOutputValuesProperties:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = TaskProperties.class;
            info.name = "taskProperties";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = ActualOwnerProperties.class;
            info.name = "actualOwnerProperties";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = ProcessInitiatorProperties.class;
            info.name = "processInitiatorProperties";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = InputOutputValuesProperties.class;
            info.name = "inputOutputValuesProperties";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

