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

public class WordingUpdateElement extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public Boolean editWithOldVersion=false;
    
    public WordingKey wordingKey;
    
    public WordingUpdate wording;

    public WordingUpdateElement ()
    {
    }

    public WordingUpdateElement (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("editWithOldVersion"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.editWithOldVersion = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.editWithOldVersion = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("wordingKey"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.wordingKey = (WordingKey)__envelope.get(j,WordingKey.class,false);
                    }
                    continue;
                }
                if (info.name.equals("wording"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.wording = (WordingUpdate)__envelope.get(j,WordingUpdate.class,false);
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
            return editWithOldVersion;
        }
        if(propertyIndex==1)
        {
            return wordingKey;
        }
        if(propertyIndex==2)
        {
            return wording;
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
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "editWithOldVersion";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = WordingKey.class;
            info.name = "wordingKey";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = WordingUpdate.class;
            info.name = "wording";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
