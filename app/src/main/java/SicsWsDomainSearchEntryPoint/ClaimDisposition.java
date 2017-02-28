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

public class ClaimDisposition extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date dateOfChange;
    
    public String changeReason;
    
	/**
	* SubclassNumber: 0515. Codes: ANY.
	*/
    public SicsReferenceDataReference claimDisposition;
    
	/**
	* SubclassNumber: 0516. Codes: ANY.
	*/
    public SicsReferenceDataReference claimSubDisposition;

    public ClaimDisposition ()
    {
    }

    public ClaimDisposition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("dateOfChange"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateOfChange = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dateOfChange = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("changeReason"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.changeReason = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.changeReason = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimDisposition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimDisposition = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimSubDisposition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimSubDisposition = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
            return this.dateOfChange!=null?Helper.getDateFormat().format(this.dateOfChange):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.changeReason!=null?this.changeReason:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.claimDisposition!=null?this.claimDisposition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.claimSubDisposition!=null?this.claimSubDisposition:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateOfChange";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "changeReason";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "claimDisposition";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "claimSubDisposition";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

