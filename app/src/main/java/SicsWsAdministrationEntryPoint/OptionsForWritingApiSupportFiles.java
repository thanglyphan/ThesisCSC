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

public class OptionsForWritingApiSupportFiles extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public String filePath;
    
	/**
	* Is used to create http server port and web services port. 
	*         The http server port will be (7700 + serverPortOffset)
	*         The web services port will be (7500 + serverPortOffset) for all services.
	*/
    public Integer serverPortOffset;
    
	/**
	* This will be used to generate wsdls for the HTTP protocol.
	*/
    public Boolean httpSupport;
    
	/**
	* This will be used to generate wsdls for the HTTPS protocol.
	*/
    public Boolean httpsSupport;
    
	/**
	* Is used to create HTTPS server port and web services port. 
	*         The http server port will be (7700 + serverPortOffset + httpsPortOffset)
	*         The web services port will be (7500 + serverPortOffset + httpsPortOffset) for all services.
	*/
    public Integer httpsPortOffset;

    public OptionsForWritingApiSupportFiles ()
    {
    }

    public OptionsForWritingApiSupportFiles (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("filePath"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.filePath = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.filePath = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("serverPortOffset"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.serverPortOffset = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.serverPortOffset = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("httpSupport"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.httpSupport = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.httpSupport = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("httpsSupport"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.httpsSupport = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.httpsSupport = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("httpsPortOffset"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.httpsPortOffset = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.httpsPortOffset = (Integer)obj;
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
            return filePath;
        }
        if(propertyIndex==1)
        {
            return this.serverPortOffset!=null?this.serverPortOffset:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.httpSupport!=null?this.httpSupport:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.httpsSupport!=null?this.httpsSupport:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.httpsPortOffset!=null?this.httpsPortOffset:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "filePath";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "serverPortOffset";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "httpSupport";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "httpsSupport";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "httpsPortOffset";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
