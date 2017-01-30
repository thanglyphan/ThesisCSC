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

public class BouquetCalculationGroupUpdate extends GroupUpdate implements KvmSerializable,java.io.Serializable
{

    
    public Boolean isForProfitCommission;
    
    public Boolean isForSlidingScaleCommission;
    
    public LifeCyclePhaseReferenceList lifeCyclePhaseReferenceList;
    
    public LifeCyclePhaseReferenceListUpdate lifeCyclePhaseReferenceListUpdate;

    public BouquetCalculationGroupUpdate ()
    {
    }

    public BouquetCalculationGroupUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("isForProfitCommission"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isForProfitCommission = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isForProfitCommission = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isForSlidingScaleCommission"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isForSlidingScaleCommission = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isForSlidingScaleCommission = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lifeCyclePhaseReferenceList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lifeCyclePhaseReferenceList = new LifeCyclePhaseReferenceList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("lifeCyclePhaseReferenceListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lifeCyclePhaseReferenceListUpdate = (LifeCyclePhaseReferenceListUpdate)__envelope.get(j,LifeCyclePhaseReferenceListUpdate.class,false);
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
            return this.isForProfitCommission!=null?this.isForProfitCommission:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.isForSlidingScaleCommission!=null?this.isForSlidingScaleCommission:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.lifeCyclePhaseReferenceList!=null?this.lifeCyclePhaseReferenceList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.lifeCyclePhaseReferenceListUpdate!=null?this.lifeCyclePhaseReferenceListUpdate:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isForProfitCommission";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isForSlidingScaleCommission";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "lifeCyclePhaseReferenceList";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = LifeCyclePhaseReferenceListUpdate.class;
            info.name = "lifeCyclePhaseReferenceListUpdate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

