package SicsWsAdministrationEntryPoint;

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

public class RenewBusiness extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 90. SicsRefAgreementLifeCycleStatus. 
	*                       To add details of life cycle status enter values in insuredPeriod->lifeCyclePhase->lifeCycleStatus tag.
	*/
    public SicsReferenceDataReference lifeCycleStatus;
    
	/**
	* false: accountingClassifications NOT copied on renewal. Default is true.
	*/
    public Boolean copyAccountingClassificationsOnRenewal;
    
	/**
	* true:Business conditions  copied on renewal. Default is false.
	*/
    public Boolean copyBusinessConditions;

    public RenewBusiness ()
    {
    }

    public RenewBusiness (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("lifeCycleStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lifeCycleStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("copyAccountingClassificationsOnRenewal"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.copyAccountingClassificationsOnRenewal = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.copyAccountingClassificationsOnRenewal = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("copyBusinessConditions"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.copyBusinessConditions = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.copyBusinessConditions = (Boolean)obj;
                        }
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
            return this.lifeCycleStatus!=null?this.lifeCycleStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.copyAccountingClassificationsOnRenewal!=null?this.copyAccountingClassificationsOnRenewal:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.copyBusinessConditions!=null?this.copyBusinessConditions:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "lifeCycleStatus";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "copyAccountingClassificationsOnRenewal";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "copyBusinessConditions";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

