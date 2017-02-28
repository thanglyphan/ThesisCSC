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

public class UpdateBusinessSingleAccountCondition extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SingleAccountReference singleAccountReference;
    
    public SingleAccountCondition singleAccount;

    public UpdateBusinessSingleAccountCondition ()
    {
    }

    public UpdateBusinessSingleAccountCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("singleAccountReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.singleAccountReference = (SingleAccountReference)__envelope.get(j,SingleAccountReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("singleAccount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.singleAccount = (SingleAccountCondition)__envelope.get(j,SingleAccountCondition.class,false);
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
            return singleAccountReference;
        }
        if(propertyIndex==1)
        {
            return singleAccount;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SingleAccountReference.class;
            info.name = "singleAccountReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SingleAccountCondition.class;
            info.name = "singleAccount";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

