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

public class InsurableObjectHierarchyLinkUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Optional in Update, mandatory in Create
	*                Valid From
	*/
    public java.util.Date validFromDate;
    
	/**
	* Valid To
	*/
    public java.util.Date validToDate;
    
	/**
	* Top Location (tickbox)
	*/
    public Boolean isTopLocation;

    public InsurableObjectHierarchyLinkUpdate ()
    {
    }

    public InsurableObjectHierarchyLinkUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("validFromDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.validFromDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.validFromDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("validToDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.validToDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.validToDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isTopLocation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isTopLocation = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isTopLocation = (Boolean)obj;
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
            return this.validFromDate!=null?Helper.getDateFormat().format(this.validFromDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.validToDate!=null?Helper.getDateFormat().format(this.validToDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.isTopLocation!=null?this.isTopLocation:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "validFromDate";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "validToDate";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isTopLocation";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

