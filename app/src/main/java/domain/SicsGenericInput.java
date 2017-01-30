package domain;

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

public class SicsGenericInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Uniquely identifies the message, not the particular invocation. Allows for resending a message.
	*/
    public String messageId;
    
	/**
	* Value must be true when resending a message. Default value is false.
	*/
    public Boolean resend;
    
	/**
	* Any reference the caller may wish to associate with the message. Could be non-unique.
	*/
    public String callerReference;
    
	/**
	* SICS/nt userId to be used for logging of database changes. Size matches that of CNU_USER.USER_ID
	*/
    public String userIdForLogging;
    
	/**
	* Value must be true when no commit to the database is wanted (even if data are OK). Default value is false.
	*/
    public Boolean dryRun;
    
	/**
	* If present the value will be checked against the XmlCompatiblityType from the web.xml.
	*                If not the same a soap fault will be returned.
	*                Intended to be used by the client to ensure the SICS Server is running with the correct xml compatiblity files.
	*                Legal values are the same as in the web.xml file: 
	*                    %NONE%  - for default compatiblity
	*                    Axis    - for Axis client compatiblity
	*                    DotNet  - for Microsoft.NET compatiblity
	*                    JAXWS   - for JAX-WS compatiblity
	*                    JAXWS_DOC - for JAX-WS Document/Literal Wrapped compatiblity
	*/
    public String requiredXmlCompatibilityType;
    
	/**
	* Informational element specifying the version of SICS Server which the client is
	*                based upon. Intended usage is troubleshooting and compatibility checks.
	*                NB! This element is automatically added if you use the proxy files provided
	*                by CSC for JAXWS, JAXWS_DOC, Axis and Microsoft.NET. If you use one of these and want to
	*                avoid sending the element you should set it to null in your client code.
	*/
    public String sicsServerBaseVersion;
    
    public SicsInteractiveMessageResponses interactiveMessageResponses;
    
    public AuthenticationToken authenticationToken;

    public SicsGenericInput ()
    {
    }

    public SicsGenericInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("messageId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.messageId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.messageId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("resend"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.resend = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.resend = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("callerReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.callerReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.callerReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("userIdForLogging"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.userIdForLogging = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.userIdForLogging = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dryRun"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dryRun = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.dryRun = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("requiredXmlCompatibilityType"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.requiredXmlCompatibilityType = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.requiredXmlCompatibilityType = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("sicsServerBaseVersion"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sicsServerBaseVersion = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.sicsServerBaseVersion = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("interactiveMessageResponses"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.interactiveMessageResponses = (SicsInteractiveMessageResponses)__envelope.get(j,SicsInteractiveMessageResponses.class,false);
                    }
                    continue;
                }
                if (info.name.equals("authenticationToken"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.authenticationToken = (AuthenticationToken)__envelope.get(j,AuthenticationToken.class,false);
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
            return this.messageId!=null?this.messageId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.resend!=null?this.resend:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.callerReference!=null?this.callerReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.userIdForLogging!=null?this.userIdForLogging:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.dryRun!=null?this.dryRun:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.requiredXmlCompatibilityType!=null?this.requiredXmlCompatibilityType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.sicsServerBaseVersion!=null?this.sicsServerBaseVersion:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.interactiveMessageResponses!=null?this.interactiveMessageResponses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.authenticationToken!=null?this.authenticationToken:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "messageId";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "resend";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "callerReference";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "userIdForLogging";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "dryRun";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "requiredXmlCompatibilityType";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sicsServerBaseVersion";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = SicsInteractiveMessageResponses.class;
            info.name = "interactiveMessageResponses";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = AuthenticationToken.class;
            info.name = "authenticationToken";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

