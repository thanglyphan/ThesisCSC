package SicsWsPcAccountingEntryPoint;

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

public class WorksheetBalanceInformation extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Balance Detail tab: Cedent/Broker
	*/
    public String businessPartnerReference;
    
	/**
	* Used to be called processId
	*                More Information tab: CL Process ID
	*/
    public String clProcessId;
    
	/**
	* Used to be called documentId
	*                More Information tab: TA Process ID
	*/
    public String taProcessId;
    
	/**
	* Notes tab
	*/
    public String note;

    public WorksheetBalanceInformation ()
    {
    }

    public WorksheetBalanceInformation (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("businessPartnerReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessPartnerReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessPartnerReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("clProcessId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.clProcessId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.clProcessId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("taProcessId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.taProcessId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.taProcessId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("note"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.note = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.note = (String)obj;
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
            return this.businessPartnerReference!=null?this.businessPartnerReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.clProcessId!=null?this.clProcessId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.taProcessId!=null?this.taProcessId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessPartnerReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "clProcessId";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "taProcessId";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

