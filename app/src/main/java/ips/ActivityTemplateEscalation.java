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

public class ActivityTemplateEscalation extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public String internalName;
    
    public SicsTaskManagementActivityTemplateReference template;
    
    public SicsReferenceDataReference escalationType;
    
    public SicsReferenceDataReference unitOfTime;
    
    public Integer duration=0;
    
    public TaskManagementDocumentationList documentationList;

    public ActivityTemplateEscalation ()
    {
    }

    public ActivityTemplateEscalation (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("template"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.template = (SicsTaskManagementActivityTemplateReference)__envelope.get(j,SicsTaskManagementActivityTemplateReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("escalationType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.escalationType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("unitOfTime"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.unitOfTime = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("duration"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.duration = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.duration = (Integer)obj;
                        }
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
            return template;
        }
        if(propertyIndex==count+2)
        {
            return escalationType;
        }
        if(propertyIndex==count+3)
        {
            return unitOfTime;
        }
        if(propertyIndex==count+4)
        {
            return duration;
        }
        if(propertyIndex==count+5)
        {
            return this.documentationList!=null?this.documentationList:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "internalName";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsTaskManagementActivityTemplateReference.class;
            info.name = "template";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "escalationType";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "unitOfTime";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "duration";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "documentationList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
