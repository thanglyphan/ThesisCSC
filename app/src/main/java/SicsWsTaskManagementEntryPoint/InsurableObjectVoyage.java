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

public class InsurableObjectVoyage extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Voyage: From
	*/
    public String fromLocation;
    
	/**
	* Voyage: To
	*/
    public String toLocation;
    
	/**
	* Voyage: Via
	*/
    public String viaLocation;
    
	/**
	* SubclassNumber: 547. SicsRefFormOfTransportation
	*/
    public SicsReferenceDataReference formOfTransportation;
    
	/**
	* Insurable Object
	*/
    public SicsAbstractInsurableObjectReference transportedByInsurableObjectReference;
    
    public String carrier;
    
    public SicsWsTimeDurationReference duration;

    public InsurableObjectVoyage ()
    {
    }

    public InsurableObjectVoyage (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("fromLocation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fromLocation = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.fromLocation = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("toLocation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.toLocation = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.toLocation = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("viaLocation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.viaLocation = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.viaLocation = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("formOfTransportation"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.formOfTransportation = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("transportedByInsurableObjectReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.transportedByInsurableObjectReference = (SicsAbstractInsurableObjectReference)__envelope.get(j,SicsAbstractInsurableObjectReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("carrier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.carrier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.carrier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("duration"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.duration = (SicsWsTimeDurationReference)__envelope.get(j,SicsWsTimeDurationReference.class,false);
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
            return this.fromLocation!=null?this.fromLocation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.toLocation!=null?this.toLocation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.viaLocation!=null?this.viaLocation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.formOfTransportation!=null?this.formOfTransportation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.transportedByInsurableObjectReference!=null?this.transportedByInsurableObjectReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.carrier!=null?this.carrier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.duration!=null?this.duration:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fromLocation";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "toLocation";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "viaLocation";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "formOfTransportation";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsAbstractInsurableObjectReference.class;
            info.name = "transportedByInsurableObjectReference";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "carrier";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsWsTimeDurationReference.class;
            info.name = "duration";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
