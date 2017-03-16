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

public class ChangeTaskStatusInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsTaskManagementProcessReference processReference;
    
	/**
	* SubclassNumber: 1146. SicsRefTaskManagementActivityStatus
	*                The new status for the currently active task.
	*                Valid transistions are:
	*                   From        To
	*                   READY       RESERVED, INPROGRESS, COMPLETED, FAILED, SKIPPED
	*                   RESERVED    READY, INPROGRESS, COMPLETED, FAILED, SKIPPED
	*                   INPROGRESS  READY, RESERVED, COMPLETED, FAILED, SKIPPED
	*/
    public SicsReferenceDataReference status;
    
	/**
	* The suggested acutual owner of the currently active task if the value change from READY to RESERVED or INPROGRESS.
	*                If the status is changed to COMPLETED or FAILED it's a suggestion for the next task (if any) that will be activated.
	*/
    public SicsUserReference suggestedActualOwner;

    public ChangeTaskStatusInput ()
    {
    }

    public ChangeTaskStatusInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("processReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.processReference = (SicsTaskManagementProcessReference)__envelope.get(j,SicsTaskManagementProcessReference.class,false);
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
                if (info.name.equals("suggestedActualOwner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.suggestedActualOwner = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
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
            return processReference;
        }
        if(propertyIndex==1)
        {
            return status;
        }
        if(propertyIndex==2)
        {
            return this.suggestedActualOwner!=null?this.suggestedActualOwner:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsTaskManagementProcessReference.class;
            info.name = "processReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "status";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsUserReference.class;
            info.name = "suggestedActualOwner xsi:type=\"ns4:SicsUserReference\" xsi:nil=\"true\"";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

