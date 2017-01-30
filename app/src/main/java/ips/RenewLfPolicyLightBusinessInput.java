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

public class RenewLfPolicyLightBusinessInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsLightInsuredPeriodReference insuredPeriodReference;
    
    public Boolean copyPreviousInsuredPeriod;
    
    public LfInsuredPeriodOfPolicyLightCreate insuredPeriodOfPolicyLight;

    public RenewLfPolicyLightBusinessInput ()
    {
    }

    public RenewLfPolicyLightBusinessInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("insuredPeriodReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredPeriodReference = (SicsLightInsuredPeriodReference)__envelope.get(j,SicsLightInsuredPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("copyPreviousInsuredPeriod"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.copyPreviousInsuredPeriod = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.copyPreviousInsuredPeriod = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriodOfPolicyLight"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredPeriodOfPolicyLight = (LfInsuredPeriodOfPolicyLightCreate)__envelope.get(j,LfInsuredPeriodOfPolicyLightCreate.class,false);
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
            return insuredPeriodReference;
        }
        if(propertyIndex==1)
        {
            return this.copyPreviousInsuredPeriod!=null?this.copyPreviousInsuredPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return insuredPeriodOfPolicyLight;
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
            info.type = SicsLightInsuredPeriodReference.class;
            info.name = "insuredPeriodReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "copyPreviousInsuredPeriod";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = LfInsuredPeriodOfPolicyLightCreate.class;
            info.name = "insuredPeriodOfPolicyLight";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
