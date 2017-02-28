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

public class InsurableObjectStatus extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public InsurableObjectAmendmentDetail insurableObjectAmendment;
    
	/**
	* SubclassNumber: 113. SicsRefInsurableObjectStatus
	*/
    public SicsReferenceDataReference status;
    
    public String locationName;
    
    public Address address;
    
    public InsurableObjectVoyage voyage;
    
	/**
	* Notes tab
	*/
    public String statusNote;

    public InsurableObjectStatus ()
    {
    }

    public InsurableObjectStatus (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("insurableObjectAmendment"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectAmendment = (InsurableObjectAmendmentDetail)__envelope.get(j,InsurableObjectAmendmentDetail.class,false);
                    }
                    continue;
                }
                if (info.name.equals("status"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.status = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("locationName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.locationName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.locationName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("address"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.address = (Address)__envelope.get(j,Address.class,false);
                    }
                    continue;
                }
                if (info.name.equals("voyage"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.voyage = (InsurableObjectVoyage)__envelope.get(j,InsurableObjectVoyage.class,false);
                    }
                    continue;
                }
                if (info.name.equals("statusNote"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.statusNote = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.statusNote = (String)obj;
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
            return insurableObjectAmendment;
        }
        if(propertyIndex==count+1)
        {
            return status;
        }
        if(propertyIndex==count+2)
        {
            return this.locationName!=null?this.locationName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.address!=null?this.address:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.voyage!=null?this.voyage:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.statusNote!=null?this.statusNote:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = InsurableObjectAmendmentDetail.class;
            info.name = "insurableObjectAmendment";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "status";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "locationName";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = Address.class;
            info.name = "address";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = InsurableObjectVoyage.class;
            info.name = "voyage";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "statusNote";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

