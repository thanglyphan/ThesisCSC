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

public class EMessaging extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public Boolean receiveAcknowledgements;
    
    public Boolean receiveSingleAcknowledgements;
    
    public Boolean createBillingStatement;
    
    public Boolean noClaimMovementMessages;
    
    public Boolean sendAcknowledgements;
    
    public EMessagingMembershipList membershipList;

    public EMessaging ()
    {
    }

    public EMessaging (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("receiveAcknowledgements"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.receiveAcknowledgements = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.receiveAcknowledgements = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("receiveSingleAcknowledgements"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.receiveSingleAcknowledgements = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.receiveSingleAcknowledgements = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("createBillingStatement"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.createBillingStatement = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.createBillingStatement = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("noClaimMovementMessages"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.noClaimMovementMessages = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.noClaimMovementMessages = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("sendAcknowledgements"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sendAcknowledgements = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.sendAcknowledgements = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("membershipList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.membershipList = new EMessagingMembershipList(j,__envelope);
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
            return this.receiveAcknowledgements!=null?this.receiveAcknowledgements:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.receiveSingleAcknowledgements!=null?this.receiveSingleAcknowledgements:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.createBillingStatement!=null?this.createBillingStatement:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.noClaimMovementMessages!=null?this.noClaimMovementMessages:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.sendAcknowledgements!=null?this.sendAcknowledgements:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.membershipList!=null?this.membershipList:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "receiveAcknowledgements";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "receiveSingleAcknowledgements";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "createBillingStatement";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "noClaimMovementMessages";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "sendAcknowledgements";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "membershipList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

