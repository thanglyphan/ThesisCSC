package SicsWsTaskManagementEntryPoint;

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

public class UpdateActivityInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsTaskManagementActivityReference activityReference;
    
	/**
	* Note that even if the activity doesn't have an explicit discriminator the activity
	*                will display a value in the discriminator field in workstation taken from input data.
	*                So if the activity (or ancestor of the activity) has input data one should consider
	*                if this is a discriminator good enough.
	*/
    public String discriminator;
    
	/**
	* priority must be a number between 0 and 9 (inclusive)
	*                where 0 is highest priority and 9 is lowest.
	*/
    public Integer priority;
    
    public ActivityInputDataList inputDataList;
    
    public ActivityAttachmentList attachmentList;
    
    public ActivityCommentList commentList;
    
	/**
	* Set this element if you want to remove all parameter values, i.e. set the value to null
	*                for all parameters. This parameter is processed before the inputDataList, so it's possible to remove
	*                all values and then setting the ones you need to set.
	*/
    public Boolean removeAllInputDataParameterValues;
    
    public ActivityAttachmentUpdateList attachmentUpdateList;
    
    public ActivityCommentUpdateList commentUpdateList;

    public UpdateActivityInput ()
    {
    }

    public UpdateActivityInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("activityReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.activityReference = (SicsTaskManagementActivityReference)__envelope.get(j,SicsTaskManagementActivityReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("discriminator"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.discriminator = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.discriminator = (String)obj;
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
                if (info.name.equals("inputDataList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.inputDataList = new ActivityInputDataList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("attachmentList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.attachmentList = new ActivityAttachmentList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("commentList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.commentList = new ActivityCommentList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("removeAllInputDataParameterValues"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.removeAllInputDataParameterValues = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.removeAllInputDataParameterValues = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("attachmentUpdateList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.attachmentUpdateList = (ActivityAttachmentUpdateList)__envelope.get(j,ActivityAttachmentUpdateList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("commentUpdateList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.commentUpdateList = (ActivityCommentUpdateList)__envelope.get(j,ActivityCommentUpdateList.class,false);
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
            return activityReference;
        }
        if(propertyIndex==1)
        {
            return this.discriminator!=null?this.discriminator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.priority!=null?this.priority:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.inputDataList!=null?this.inputDataList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.attachmentList!=null?this.attachmentList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.commentList!=null?this.commentList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.removeAllInputDataParameterValues!=null?this.removeAllInputDataParameterValues:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.attachmentUpdateList!=null?this.attachmentUpdateList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.commentUpdateList!=null?this.commentUpdateList:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 9;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsTaskManagementActivityReference.class;
            info.name = "activityReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "discriminator";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "priority";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "inputDataList";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "attachmentList";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "commentList";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "removeAllInputDataParameterValues";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = ActivityAttachmentUpdateList.class;
            info.name = "attachmentUpdateList";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = ActivityCommentUpdateList.class;
            info.name = "commentUpdateList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

