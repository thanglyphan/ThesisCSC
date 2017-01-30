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

public class BusinessMassRenewalInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsInsuredPeriodReference insuredPeriodReference;
    
    public Boolean renewAll;
    
	/**
	* SubclassNumber: 90. SicsRefAgreementLifeCycleStatus. CODE: RO | OA. 
	*                 This is relevent ( and mandatory) only if the "renewAll" flag is true.
	*/
    public SicsReferenceDataReference refLifeCycleStatus;
    
	/**
	* This is relevent ( and mandatory) only if the "renewAll" flag is false.
	*/
    public BusinessRenewalList businessRenewalList;

    public BusinessMassRenewalInput ()
    {
    }

    public BusinessMassRenewalInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                        this.insuredPeriodReference = (SicsInsuredPeriodReference)__envelope.get(j,SicsInsuredPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("renewAll"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.renewAll = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.renewAll = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refLifeCycleStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refLifeCycleStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessRenewalList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessRenewalList = new BusinessRenewalList(j,__envelope);
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
            return this.renewAll!=null?this.renewAll:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.refLifeCycleStatus!=null?this.refLifeCycleStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.businessRenewalList!=null?this.businessRenewalList:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsInsuredPeriodReference.class;
            info.name = "insuredPeriodReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "renewAll";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refLifeCycleStatus";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "businessRenewalList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

