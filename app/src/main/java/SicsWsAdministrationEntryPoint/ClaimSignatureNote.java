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

public class ClaimSignatureNote extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date signatureDate;
    
    public String description;
    
	/**
	* SubclassNumber: 1120.
	*/
    public SicsReferenceDataReference signatureNoteType;
    
	/**
	* SubclassNumber: 1121.
	*/
    public SicsReferenceDataReference signatureNoteSubType;
    
    public Boolean isLocked;
    
    public String note;
    
    public SicsUserReference signature;

    public ClaimSignatureNote ()
    {
    }

    public ClaimSignatureNote (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("signatureDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.signatureDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.signatureDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("description"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.description = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.description = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("signatureNoteType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.signatureNoteType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("signatureNoteSubType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.signatureNoteSubType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("isLocked"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isLocked = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isLocked = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("note"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.note = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.note = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("signature"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.signature = (SicsUserReference)__envelope.get(j,SicsUserReference.class,false);
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
            return this.signatureDate!=null?Helper.getDateFormat().format(this.signatureDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.description!=null?this.description:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.signatureNoteType!=null?this.signatureNoteType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.signatureNoteSubType!=null?this.signatureNoteSubType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.isLocked!=null?this.isLocked:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.signature!=null?this.signature:SoapPrimitive.NullSkip;
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
            info.name = "signatureDate";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "description";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "signatureNoteType";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "signatureNoteSubType";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isLocked";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsUserReference.class;
            info.name = "signature";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

