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
import java.math.BigDecimal;

public class InsurablePeril extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 511.
	*/
    public SicsReferenceDataReference exposureBasis;
    
	/**
	* SubclassNumber: 512.
	*/
    public SicsReferenceDataReference exposureBasisEvent;
    
	/**
	* SubclassNumber: 44. Code: Fire , Flood etc .
	*/
    public SicsReferenceDataReference perilTypeReference;
    
    public BigDecimal pmlFactor;
    
    public java.util.Date validFromDate;
    
    public java.util.Date validToDate;
    
    public SicsRiskZoneReference riskZoneReference;
    
    public String displayName;

    public InsurablePeril ()
    {
    }

    public InsurablePeril (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("exposureBasis"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.exposureBasis = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("exposureBasisEvent"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.exposureBasisEvent = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("perilTypeReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.perilTypeReference = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("pmlFactor"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.pmlFactor = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.pmlFactor = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("validFromDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.validFromDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.validFromDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("validToDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.validToDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.validToDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("riskZoneReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.riskZoneReference = (SicsRiskZoneReference)__envelope.get(j,SicsRiskZoneReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("displayName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.displayName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.displayName = (String)obj;
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
            return this.exposureBasis!=null?this.exposureBasis:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.exposureBasisEvent!=null?this.exposureBasisEvent:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return perilTypeReference;
        }
        if(propertyIndex==count+3)
        {
            return this.pmlFactor!=null?this.pmlFactor.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.validFromDate!=null?Helper.getDateFormat().format(this.validFromDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.validToDate!=null?Helper.getDateFormat().format(this.validToDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return riskZoneReference;
        }
        if(propertyIndex==count+7)
        {
            return this.displayName!=null?this.displayName:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "exposureBasis";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "exposureBasisEvent";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "perilTypeReference";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "pmlFactor";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "validFromDate";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "validToDate";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsRiskZoneReference.class;
            info.name = "riskZoneReference";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "displayName";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

