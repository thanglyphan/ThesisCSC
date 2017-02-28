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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class InsurableObjectLossListUpdate extends ListUpdate implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< InsurableObjectLossUpdateElement> insurableObjectLossUpdate =new ArrayList<InsurableObjectLossUpdateElement >();

    public InsurableObjectLossListUpdate ()
    {
    }

    public InsurableObjectLossListUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("insurableObjectLossUpdate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.insurableObjectLossUpdate==null)
                        {
                            this.insurableObjectLossUpdate = new ArrayList< InsurableObjectLossUpdateElement>();
                        }
                        java.lang.Object j =obj;
                        InsurableObjectLossUpdateElement j1= (InsurableObjectLossUpdateElement)__envelope.get(j,InsurableObjectLossUpdateElement.class,false);
                        this.insurableObjectLossUpdate.add(j1);
                   
        
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.insurableObjectLossUpdate.size())
        {
            return this.insurableObjectLossUpdate.get(propertyIndex-(count+0));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+0+insurableObjectLossUpdate.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.insurableObjectLossUpdate.size())
        {
            info.type = InsurableObjectLossUpdateElement.class;
            info.name = "insurableObjectLossUpdate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

