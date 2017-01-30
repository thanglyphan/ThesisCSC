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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class LifeCycleStatusDefinite extends LifeCycleStatus implements KvmSerializable,java.io.Serializable
{

    
    public WordingListUpdate wordingListUpdate;
    
	/**
	* For Domain Retrieval Only
	*/
    public ArrayList< Wording> wording =new ArrayList<Wording >();

    public LifeCycleStatusDefinite ()
    {
    }

    public LifeCycleStatusDefinite (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("wordingListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.wordingListUpdate = new WordingListUpdate(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("wording"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.wording==null)
                        {
                            this.wording = new ArrayList< Wording>();
                        }
                        java.lang.Object j =obj;
                        Wording j1= (Wording)__envelope.get(j,Wording.class,false);
                        this.wording.add(j1);
                   
        
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
            return this.wordingListUpdate!=null?this.wordingListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.wording.size())
        {
            return this.wording.get(propertyIndex-(count+1));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+1+wording.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "wordingListUpdate";
            info.namespace= "";
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.wording.size())
        {
            info.type = Wording.class;
            info.name = "wording";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
