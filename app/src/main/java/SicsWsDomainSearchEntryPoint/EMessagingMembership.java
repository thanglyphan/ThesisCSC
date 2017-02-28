package SicsWsDomainSearchEntryPoint;

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

public class EMessagingMembership extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsAcordCodeReference agency;
    
    public String identifier;
    
	/**
	* SubclassNumber: 211.
	*/
    public SicsReferenceDataReference processingAction;
    
    public Boolean isDefaultForOutput;
    
	/**
	* SubclassNumber: 1109.
	*/
    public SicsReferenceDataReference receiverAcordRole;
    
    public Boolean isLloydsSyndicate;

    public EMessagingMembership ()
    {
    }

    public EMessagingMembership (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("agency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.agency = (SicsAcordCodeReference)__envelope.get(j,SicsAcordCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("identifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.identifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("processingAction"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.processingAction = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("isDefaultForOutput"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isDefaultForOutput = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isDefaultForOutput = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("receiverAcordRole"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.receiverAcordRole = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("isLloydsSyndicate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isLloydsSyndicate = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isLloydsSyndicate = (Boolean)obj;
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
            return this.agency!=null?this.agency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.identifier!=null?this.identifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return processingAction;
        }
        if(propertyIndex==3)
        {
            return this.isDefaultForOutput!=null?this.isDefaultForOutput:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.receiverAcordRole!=null?this.receiverAcordRole:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.isLloydsSyndicate!=null?this.isLloydsSyndicate:SoapPrimitive.NullSkip;
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
            info.type = SicsAcordCodeReference.class;
            info.name = "agency";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifier";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "processingAction";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isDefaultForOutput";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "receiverAcordRole";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isLloydsSyndicate";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

