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

public class LfInsuredPeriodOfPolicyLightUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Mandatory for create/renew service.
	*/
    public java.util.Date beginDateTime;
    
	/**
	* Mandatory for create/renew service.
	*/
    public java.util.Date endDateTime;
    
    public SicsWsDatespanReference originalPolicyInsuredPeriod;
    
    public String underwritingYear;
    
    public Boolean canBeAutoProtected;
    
	/**
	* SubclassNumber: 01073. SicsRefReasonForManualProtection
	*/
    public SicsReferenceDataReference reasonForManualProtection;
    
    public String insuredName;
    
    public String insuredIdentifier;
    
    public String insuredReference;
    
	/**
	* Applicable for relationship type Insurer.
	*/
    public SicsBusinessPartnerReference baseCompany;
    
    public String baseCompanyReference;
    
	/**
	* SubclassNumber: 90. SicsRefAgreementLifeCycleStatus
	*/
    public SicsReferenceDataReference refAgreementLifeCycleStatus;
    
    public SicsGroupReference businessGroup;
    
    public LfScopeOfCoverForLightPolicyCreateList scopeOfCoverList;
    
    public LfScopeOfCoverForLightPolicyListUpdate scopeOfCoverListUpdate;
    
    public LfScopeOfCoverForLightPolicyListSplit scopeOfCoverListSplit;

    public LfInsuredPeriodOfPolicyLightUpdate ()
    {
    }

    public LfInsuredPeriodOfPolicyLightUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("beginDateTime"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.beginDateTime = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.beginDateTime = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("endDateTime"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.endDateTime = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.endDateTime = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("originalPolicyInsuredPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.originalPolicyInsuredPeriod = (SicsWsDatespanReference)__envelope.get(j,SicsWsDatespanReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("underwritingYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.underwritingYear = j.toString();
                            }
                        }
                        else{
                            this.underwritingYear = obj.toString();
                        }
                    }
                    continue;
                }
                if (info.name.equals("canBeAutoProtected"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.canBeAutoProtected = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.canBeAutoProtected = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reasonForManualProtection"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reasonForManualProtection = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insuredName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.insuredName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.insuredIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.insuredReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("baseCompany"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.baseCompany = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("baseCompanyReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.baseCompanyReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.baseCompanyReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("refAgreementLifeCycleStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refAgreementLifeCycleStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessGroup"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessGroup = (SicsGroupReference)__envelope.get(j,SicsGroupReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("scopeOfCoverList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.scopeOfCoverList = new LfScopeOfCoverForLightPolicyCreateList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("scopeOfCoverListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.scopeOfCoverListUpdate = new LfScopeOfCoverForLightPolicyListUpdate(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("scopeOfCoverListSplit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.scopeOfCoverListSplit = new LfScopeOfCoverForLightPolicyListSplit(j,__envelope);
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
            return this.beginDateTime!=null?Helper.getDateTimeFormat().format(this.beginDateTime):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.endDateTime!=null?Helper.getDateTimeFormat().format(this.endDateTime):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.originalPolicyInsuredPeriod!=null?this.originalPolicyInsuredPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.underwritingYear!=null?this.underwritingYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.canBeAutoProtected!=null?this.canBeAutoProtected:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.reasonForManualProtection!=null?this.reasonForManualProtection:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.insuredName!=null?this.insuredName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.insuredIdentifier!=null?this.insuredIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.insuredReference!=null?this.insuredReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return baseCompany;
        }
        if(propertyIndex==10)
        {
            return this.baseCompanyReference!=null?this.baseCompanyReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.refAgreementLifeCycleStatus!=null?this.refAgreementLifeCycleStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.businessGroup!=null?this.businessGroup:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.scopeOfCoverList!=null?this.scopeOfCoverList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==14)
        {
            return this.scopeOfCoverListUpdate!=null?this.scopeOfCoverListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==15)
        {
            return this.scopeOfCoverListSplit!=null?this.scopeOfCoverListSplit:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 16;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "beginDateTime";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "endDateTime";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsWsDatespanReference.class;
            info.name = "originalPolicyInsuredPeriod";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "underwritingYear";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "canBeAutoProtected";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "reasonForManualProtection";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredName";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredReference";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "baseCompany";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "baseCompanyReference";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refAgreementLifeCycleStatus";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = SicsGroupReference.class;
            info.name = "businessGroup";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "scopeOfCoverList";
            info.namespace= "";
        }
        if(propertyIndex==14)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "scopeOfCoverListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==15)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "scopeOfCoverListSplit";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
