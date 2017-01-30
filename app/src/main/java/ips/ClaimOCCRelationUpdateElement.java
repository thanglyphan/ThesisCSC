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

public class ClaimOCCRelationUpdateElement extends ListUpdateElement implements KvmSerializable,java.io.Serializable
{

    
    public ClaimPARelationKey protectionAllocationOccKey;
    
    public ClaimProtectionAllocationRelationUpdate protectionAllocationOcc;

    public ClaimOCCRelationUpdateElement ()
    {
    }

    public ClaimOCCRelationUpdateElement (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("protectionAllocationOccKey"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.protectionAllocationOccKey = (ClaimPARelationKey)__envelope.get(j,ClaimPARelationKey.class,false);
                    }
                    continue;
                }
                if (info.name.equals("protectionAllocationOcc"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.protectionAllocationOcc = (ClaimProtectionAllocationRelationUpdate)__envelope.get(j,ClaimProtectionAllocationRelationUpdate.class,false);
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
            return protectionAllocationOccKey;
        }
        if(propertyIndex==count+1)
        {
            return this.protectionAllocationOcc!=null?this.protectionAllocationOcc:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = ClaimPARelationKey.class;
            info.name = "protectionAllocationOccKey";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = ClaimProtectionAllocationRelationUpdate.class;
            info.name = "protectionAllocationOcc";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

