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

public class CreateProcessInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsTaskManagementProcessTemplateReference processTemplateReference;
    
    public SicsUserReference processInitiator;
    
	/**
	* Set this value to xsi:nil="true" if you don't want to suggest any process owner.
	*                Omit this element if you want the user from generic input. If this element is omitted and no user in generic
	*                input the user logged in to SICS Server will be used (which is probably not what you want).
	*/
    public SicsUserReference suggestedActualProcessOwner;
    
	/**
	* Set this value to xsi:nil="true" if you don't want to suggest any owner for the active task.
	*                Omit this element if you want the user from generic input. If this element is omitted and no user in generic
	*                input the user logged in to SICS Server will be used (which is probably not what you want).
	*/
    public SicsUserReference suggestedActualTaskOwner;
    
	/**
	* true: Will try to start the task (ie. set status to INPROGRESS) if possible.
	*                false: Will not try to start the task even if possible.
	*                If suggestedActualOwner is set to xsi:nil="true" the task will not be
	*                started unless the list of potential owners is equal to 1.
	*/
    public Boolean startActiveTaskIfPossible=false;
    
    public ActivityInformationList activityInformationList;

    public CreateProcessInput ()
    {
    }

    public CreateProcessInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("processTemplateReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.processTemplateReference = (SicsTaskManagementProcessTemplateReference)__envelope.get(j,SicsTaskManagementProcessTemplateReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("processInitiator"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.processInitiator = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("suggestedActualProcessOwner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.suggestedActualProcessOwner = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("suggestedActualTaskOwner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.suggestedActualTaskOwner = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("startActiveTaskIfPossible"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.startActiveTaskIfPossible = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.startActiveTaskIfPossible = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("activityInformationList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.activityInformationList = new ActivityInformationList(j,__envelope);
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
            return processTemplateReference;
        }
        if(propertyIndex==1)
        {
            return this.processInitiator!=null?this.processInitiator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.suggestedActualProcessOwner!=null?this.suggestedActualProcessOwner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.suggestedActualTaskOwner!=null?this.suggestedActualTaskOwner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return startActiveTaskIfPossible;
        }
        if(propertyIndex==5)
        {
            return this.activityInformationList!=null?this.activityInformationList:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsTaskManagementProcessTemplateReference.class;
            info.name = "processTemplateReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsUserReference.class;
            info.name = "processInitiator";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsUserReference.class;
            info.name = "suggestedActualProcessOwner";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsUserReference.class;
            info.name = "suggestedActualTaskOwner";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "startActiveTaskIfPossible";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "activityInformationList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

