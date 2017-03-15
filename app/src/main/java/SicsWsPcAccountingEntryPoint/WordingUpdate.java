package SicsWsPcAccountingEntryPoint;

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

public class WordingUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date counterSignatureReturnedDate;
    
	/**
	* SubclassNumber: 01048. SicsRefPendingParty
	*/
    public SicsReferenceDataReference pendingPartyReference;
    
    public java.util.Date replayToInquiryReceivedDate;
    
    public java.util.Date wordingDate;
    
    public WordingDetailList wordingDetailList;
    
    public java.util.Date wordingSentDate;
    
	/**
	* SubclassNumber: 84. SicsRefWordingStatus
	*/
    public SicsReferenceDataReference wordingStatus;

    public WordingUpdate ()
    {
    }

    public WordingUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("counterSignatureReturnedDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.counterSignatureReturnedDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.counterSignatureReturnedDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("pendingPartyReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.pendingPartyReference = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("replayToInquiryReceivedDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.replayToInquiryReceivedDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.replayToInquiryReceivedDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("wordingDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.wordingDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.wordingDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("wordingDetailList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.wordingDetailList = (WordingDetailList)__envelope.get(j,WordingDetailList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("wordingSentDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.wordingSentDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.wordingSentDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("wordingStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.wordingStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
            return this.counterSignatureReturnedDate!=null?Helper.getDateFormat().format(this.counterSignatureReturnedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.pendingPartyReference!=null?this.pendingPartyReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.replayToInquiryReceivedDate!=null?Helper.getDateFormat().format(this.replayToInquiryReceivedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.wordingDate!=null?Helper.getDateFormat().format(this.wordingDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.wordingDetailList!=null?this.wordingDetailList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.wordingSentDate!=null?Helper.getDateFormat().format(this.wordingSentDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.wordingStatus!=null?this.wordingStatus:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "counterSignatureReturnedDate";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "pendingPartyReference";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "replayToInquiryReceivedDate";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "wordingDate";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = WordingDetailList.class;
            info.name = "wordingDetailList";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "wordingSentDate";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "wordingStatus";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

