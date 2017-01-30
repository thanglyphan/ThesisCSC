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

public class ActivityTemplate extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public String internalName;
    
    public SicsTaskManagementActivityTemplateReference parentActivityTemplate;
    
    public ActivityTemplateList activityList;
    
    public Integer priority=0;
    
    public TaskManagementDescriptionList descriptionList;
    
    public TaskManagementDocumentationList documentationList;
    
    public TaskManagementPeopleAssignmentList peopleAssignmentList=new TaskManagementPeopleAssignmentList();
    
    public ActivityTemplateEscalationList startEscalationList;
    
    public ActivityTemplateEscalationList completionEscalationList;
    
    public ActivityTemplateInputDataFieldList inputDataFieldList;
    
    public ActivityTemplateEventActionList eventActionList;
    
    public ActivityTemplateRevisionList revisionList;

    public ActivityTemplate ()
    {
    }

    public ActivityTemplate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("internalName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.internalName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.internalName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("parentActivityTemplate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.parentActivityTemplate = (SicsTaskManagementActivityTemplateReference)__envelope.get(j,SicsTaskManagementActivityTemplateReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("activityList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.activityList = new ActivityTemplateList(j,__envelope);
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
                if (info.name.equals("descriptionList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.descriptionList = new TaskManagementDescriptionList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("documentationList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.documentationList = new TaskManagementDocumentationList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("peopleAssignmentList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.peopleAssignmentList = new TaskManagementPeopleAssignmentList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("startEscalationList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.startEscalationList = new ActivityTemplateEscalationList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("completionEscalationList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.completionEscalationList = new ActivityTemplateEscalationList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("inputDataFieldList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.inputDataFieldList = new ActivityTemplateInputDataFieldList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("eventActionList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.eventActionList = new ActivityTemplateEventActionList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("revisionList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.revisionList = new ActivityTemplateRevisionList(j,__envelope);
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
            return internalName;
        }
        if(propertyIndex==count+1)
        {
            return this.parentActivityTemplate!=null?this.parentActivityTemplate:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==count+2)
        {
            return this.activityList!=null?this.activityList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return priority;
        }
        if(propertyIndex==count+4)
        {
            return this.descriptionList!=null?this.descriptionList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.documentationList!=null?this.documentationList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return peopleAssignmentList;
        }
        if(propertyIndex==count+7)
        {
            return this.startEscalationList!=null?this.startEscalationList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.completionEscalationList!=null?this.completionEscalationList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.inputDataFieldList!=null?this.inputDataFieldList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.eventActionList!=null?this.eventActionList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.revisionList!=null?this.revisionList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+12;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "internalName";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsTaskManagementActivityTemplateReference.class;
            info.name = "parentActivityTemplate";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "activityList";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "priority";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "descriptionList";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "documentationList";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "peopleAssignmentList";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "startEscalationList";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "completionEscalationList";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "inputDataFieldList";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "eventActionList";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "revisionList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

