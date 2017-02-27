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

public class ClaimSignatureNoteCreateUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
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

    public ClaimSignatureNoteCreateUpdate ()
    {
    }

    public ClaimSignatureNoteCreateUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.signatureDate!=null?Helper.getDateFormat().format(this.signatureDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.description!=null?this.description:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.signatureNoteType!=null?this.signatureNoteType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.signatureNoteSubType!=null?this.signatureNoteSubType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.isLocked!=null?this.isLocked:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "signatureDate";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "description";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "signatureNoteType";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "signatureNoteSubType";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isLocked";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

