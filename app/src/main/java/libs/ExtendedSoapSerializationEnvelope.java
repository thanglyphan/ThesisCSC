package ting;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 29/01/2017
//
//---------------------------------------------------



import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.*;
import org.kxml2.io.KXmlParser;
import org.kxml2.kdom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Vector;
import java.io.StringReader;
import java.io.StringWriter;

//If you have a compilation error here then you have to add a reference to ExKsoap2.jar to your project (you can find it in Libs folder in the generated zip file)
public class ExtendedSoapSerializationEnvelope extends com.easywsdl.exksoap2.serialization.ExSoapSerializationEnvelope {
    static HashMap< java.lang.String,java.lang.Class> classNames = new HashMap< java.lang.String, java.lang.Class>();
    static {
        classNames.put("http://www.SicsNt.com/CommonTypes^^DomainObjectReference",DomainObjectReference.class);
        classNames.put("http://www.SicsNt.com/CommonTypes^^DomainObjectOrOperationReference",DomainObjectOrOperationReference.class);
        classNames.put("http://www.SicsNt.com/SystemTypes^^SicsInteractiveMessageResponses",SicsInteractiveMessageResponses.class);
        classNames.put("http://www.SicsNt.com/SystemTypes^^SicsGenericInput",SicsGenericInput.class);
        classNames.put("http://www.SicsNt.com/SystemTypes^^AuthenticationToken",AuthenticationToken.class);
        classNames.put("http://www.SicsNt.com/SystemTypes^^SicsFaultDetails",SicsFaultDetails.class);
        classNames.put("http://www.SicsNt.com/SicsSearch^^ReindexObjectInput",ReindexObjectInput.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAbstractExchangeRateReference",SicsAbstractExchangeRateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsExchangeRateReference",SicsExchangeRateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsExchangeDayRateReference",SicsExchangeDayRateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsExchangeYearRateReference",SicsExchangeYearRateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsExchangePeriodRateReference",SicsExchangePeriodRateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsExchangeRateByObjectIdReference",SicsExchangeRateByObjectIdReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsSystemParameterRegistryReference",SicsSystemParameterRegistryReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLegalAreaReference",SicsLegalAreaReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsCountryReference",SicsCountryReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsCityReference",SicsCityReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsStateReference",SicsStateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAreaGroupCountryReference",SicsAreaGroupCountryReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAreaGroupStateReference",SicsAreaGroupStateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsCountryIndexRowReference",SicsCountryIndexRowReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsCurrencyReference",SicsCurrencyReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAccountingCurrencyTermReference",SicsAccountingCurrencyTermReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsReferenceDataReference",SicsReferenceDataReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAbstractReferenceDataTypeReference",SicsAbstractReferenceDataTypeReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsReferenceDataTypeReference",SicsReferenceDataTypeReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsReferenceDataTypeByCodeReference",SicsReferenceDataTypeByCodeReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAccountingEntryCodeGroupReference",SicsAccountingEntryCodeGroupReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAccountingEntryCodeTermReference",SicsAccountingEntryCodeTermReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsBusinessPartnerReference",SicsBusinessPartnerReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPartyReference",SicsPartyReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsReportingUnitReference",SicsReportingUnitReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAbstractInsurableObjectReference",SicsAbstractInsurableObjectReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsInsurableObjectReferenceByName",SicsInsurableObjectReferenceByName.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsInsurableObjectReference",SicsInsurableObjectReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsUserReference",SicsUserReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsEMessagingXmlMessageReference",SicsEMessagingXmlMessageReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsBusinessReference",SicsBusinessReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsInsuredPeriodReference",SicsInsuredPeriodReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLifeCyclePhaseReference",SicsLifeCyclePhaseReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsScopeOfCoverReference",SicsScopeOfCoverReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsChildScopeOfCoverReference",SicsChildScopeOfCoverReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsReinsuranceProgramTreatyPartReference",SicsReinsuranceProgramTreatyPartReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAbstractAccountingClassificationReference",SicsAbstractAccountingClassificationReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAccountingClassificationReference",SicsAccountingClassificationReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAccountingClassificationByObjectIdReference",SicsAccountingClassificationByObjectIdReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAccountingClassificationByReferenceDataReference",SicsAccountingClassificationByReferenceDataReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsGroupReference",SicsGroupReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLfAbstractInsurableObjectReference",SicsLfAbstractInsurableObjectReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLfJointLifeInsurableObjectReference",SicsLfJointLifeInsurableObjectReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLfIndividualInsurableObjectReference",SicsLfIndividualInsurableObjectReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLfAbstractBenefitGroupReference",SicsLfAbstractBenefitGroupReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLfAbstractCessionReference",SicsLfAbstractCessionReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAccountingEntryCodeReference",SicsAccountingEntryCodeReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAccountingWorksheetReference",SicsAccountingWorksheetReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsBookingYearPeriodReference",SicsBookingYearPeriodReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^CnuSecurityUserCategoryReference",CnuSecurityUserCategoryReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsInsurablePerilReference",SicsInsurablePerilReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPcClaimReference",SicsPcClaimReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPcClaimProgramReference",SicsPcClaimProgramReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsHeadlineLossReference",SicsHeadlineLossReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAbstractPcSocToClaimReference",SicsAbstractPcSocToClaimReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPcSocToClaimReference",SicsPcSocToClaimReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPcSubstituteSocToClaimReference",SicsPcSubstituteSocToClaimReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPcClaimProgramPeriodReference",SicsPcClaimProgramPeriodReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPcClaimGroupReference",SicsPcClaimGroupReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsRiskZoneReference",SicsRiskZoneReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAmendmentReference",SicsAmendmentReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsCountryIndexPointReference",SicsCountryIndexPointReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAccountingClaimWorksheetReference",SicsAccountingClaimWorksheetReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLedgerRemittanceBalanceReference",SicsLedgerRemittanceBalanceReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsBankAccountReference",SicsBankAccountReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsFGUAdvisoryReference",SicsFGUAdvisoryReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsProtectionAssignmentReference",SicsProtectionAssignmentReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLedgerBalanceReference",SicsLedgerBalanceReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLedgerBalanceLinkToRemittanceReference",SicsLedgerBalanceLinkToRemittanceReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLedgerBalanceByObjectIdReference",SicsLedgerBalanceByObjectIdReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLedgerBalancePairingWrapperReference",SicsLedgerBalancePairingWrapperReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsAbstractLedgerBalanceReference",SicsAbstractLedgerBalanceReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLedgerDetailReference",SicsLedgerDetailReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsCessionInsurablePerilReference",SicsCessionInsurablePerilReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPcClaimFromGroundUpReference",SicsPcClaimFromGroundUpReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsBusinessPartnerGroupReference",SicsBusinessPartnerGroupReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsInsuredsGroupReference",SicsInsuredsGroupReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLfClaimReference",SicsLfClaimReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLfGroupInsurableObjectReference",SicsLfGroupInsurableObjectReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^BusinessPartnerFindPartial",BusinessPartnerFindPartial.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPolicyLightBusinessReference",SicsPolicyLightBusinessReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLightInsuredPeriodReference",SicsLightInsuredPeriodReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLightScopeOfCoverReference",SicsLightScopeOfCoverReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLightSocToClaimReference",SicsLightSocToClaimReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLightClaimReference",SicsLightClaimReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsClassificationForLightPolicyReference",SicsClassificationForLightPolicyReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsPcHeadlineLossGroupReference",SicsPcHeadlineLossGroupReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsProcessIDReference",SicsProcessIDReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsBusinessStampReference",SicsBusinessStampReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsTaskManagementProcessReference",SicsTaskManagementProcessReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsTaskManagementActivityReference",SicsTaskManagementActivityReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsTaskManagementProcessTemplateReference",SicsTaskManagementProcessTemplateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsTaskManagementProcessTemplateVersionReference",SicsTaskManagementProcessTemplateVersionReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsTaskManagementActivityTemplateVersionReference",SicsTaskManagementActivityTemplateVersionReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsTaskManagementActivityTemplateReference",SicsTaskManagementActivityTemplateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsTaskManagementUserGroupReference",SicsTaskManagementUserGroupReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsTaskManagementEscalationTemplateReference",SicsTaskManagementEscalationTemplateReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^EstimatedItemReference",EstimatedItemReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLedgerGroupingBalanceReference",SicsLedgerGroupingBalanceReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLedgerAbstractBalanceGenerateRemittanceReference",SicsLedgerAbstractBalanceGenerateRemittanceReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsLedgerTechnicalBalanceGenerateRemittanceReference",SicsLedgerTechnicalBalanceGenerateRemittanceReference.class);
        classNames.put("http://www.SicsNt.com/ReferenceItems^^SicsModelSectionReference",SicsModelSectionReference.class);
    }   

    protected static final int QNAME_NAMESPACE = 0;
    private static final String TYPE_LABEL = "type";

    public ExtendedSoapSerializationEnvelope() {
        this(SoapEnvelope.VER11);
    }

    public ExtendedSoapSerializationEnvelope(int soapVersion) {
        super(soapVersion);
        implicitTypes = true;
        setAddAdornments(false);
        new MarshalGuid().register(this);
        new MarshalFloat().register(this);
    }

    

    @Override
    protected void writeProperty(XmlSerializer writer, java.lang.Object obj, PropertyInfo type) throws IOException {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if (obj == null || obj== SoapPrimitive.NullNilElement) {
            writer.attribute(xsi, version >= VER12 ? NIL_LABEL : NULL_LABEL, "true");
            return;
        }
        if(writeReferenceObject(writer,obj))
        {
            return;
        }
        java.lang.Object[] qName = getInfo(null, obj);
        if (!type.multiRef && qName[2] == null )
        {

            if (!implicitTypes || (obj.getClass() != type.type && !(obj instanceof Vector ) && type.type!=java.lang.String.class  )) {
                java.lang.String xmlName=Helper.getKeyByValue(classNames,obj.getClass());
                if(xmlName!=null) {
                    java.lang.String[] parts = xmlName.split("\\^\\^");
                    java.lang.String prefix = writer.getPrefix(parts[0], true);
                    writer.attribute(xsi, TYPE_LABEL, prefix + ":" + parts[1]);
                }
                else
                {
                    if(type.type instanceof String) {
                        java.lang.String xsdPrefix = writer.getPrefix(xsd, true);
                        java.lang.String myType = (java.lang.String) type.type;
                        java.lang.String[] parts = myType.split("\\^\\^");
                        if (parts.length == 2) {
                            xsdPrefix = writer.getPrefix(parts[0], true);
                            myType = parts[1];
                        }

                        writer.attribute(xsi, TYPE_LABEL, xsdPrefix + ":" + myType);
                    }
                    else
                    {
                        java.lang.String prefix = writer.getPrefix(type.namespace, true);
                        writer.attribute(xsi, TYPE_LABEL, prefix + ":" + obj.getClass().getSimpleName());
                    }

                }
            }
            //super.writeProperty(writer,obj,type);

            //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
            //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
            writeElement(writer, obj, type, qName[QNAME_MARSHAL]);
        }
        else {
            super.writeProperty(writer, obj, type);
        }
    }
    public SoapObject GetExceptionDetail(Element detailElement,java.lang.String exceptionElementNS,java.lang.String exceptionElementName)
    {
        int index=detailElement.indexOf(exceptionElementNS,exceptionElementName,0);
        if(index>-1)
        {
            Element errorElement=detailElement.getElement(index);
            return GetSoapObject(errorElement);
        }
        return null;
    }

    public SoapObject GetSoapObject(Element detailElement) {
        try{
            XmlSerializer xmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
            StringWriter writer = new StringWriter();
            xmlSerializer.setOutput(writer);
            detailElement.write(xmlSerializer);
            xmlSerializer.flush();

            XmlPullParser xpp = new KXmlParser();
            xpp.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);

            xpp.setInput(new StringReader(writer.toString()));
            xpp.nextTag();
            SoapObject soapObj = new SoapObject(detailElement.getNamespace(),detailElement.getName());
            readSerializable(xpp,soapObj);
            return soapObj;
        }
        catch (java.lang.Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }

    public java.lang.Object GetHeader(Element detailElement) {
        if(detailElement.getChildCount()>0 && detailElement.getText(0)!=null)
        {
            SoapPrimitive primitive = new SoapPrimitive(detailElement.getNamespace(),detailElement.getName(),detailElement.getText(0));
            return  primitive;
        }
    
        return GetSoapObject(detailElement);
    }
    
    public java.lang.Object get(java.lang.Object soap,java.lang.Class cl,boolean typeFromClass)
    {
        if(soap==null)
        {
            return null;
        }
        try
        {
            if(soap instanceof Vector || typeFromClass)
            {
                Constructor ctor = cl.getConstructor(java.lang.Object.class,ExtendedSoapSerializationEnvelope.class);
                return ctor.newInstance(soap,this);
            }
            java.lang.Object refAttr=getReference(soap);
            if (refAttr != null)
            {
                return refAttr;
            }
            else
            {
                if(soap instanceof SoapObject)
                {
                    if(cl ==SoapObject.class)
                    {
                        return soap;
                    }
                    java.lang.String key=String.format("%s^^%s",((SoapObject)soap).getNamespace(),((SoapObject)soap).getName());
                    if(classNames.containsKey(key))
                    {
                        cl=classNames.get(key);
                    }
                }
                Constructor ctor = cl.getConstructor(java.lang.Object.class,ExtendedSoapSerializationEnvelope.class);
                return ctor.newInstance(soap,this);
            }
        }
        catch (java.lang.Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

    public java.lang.Object getSpecificType(java.lang.Object obj)
    {
        if(obj==null)
        {
            return null;
        }
        if(obj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)obj;
            java.lang.String key=soapObject.getNamespace()+"^^"+soapObject.getName();
            if(classNames.containsKey(key))
            {
                java.lang.Class cl=classNames.get(key);
                try
                {
                    java.lang.reflect.Constructor ctor  = cl.getConstructor(java.lang.Object.class,ExtendedSoapSerializationEnvelope.class);
                    return ctor.newInstance(soapObject,this);
                } 
                catch (java.lang.Exception e)
                {
                    e.printStackTrace();
                }
            }
        }

        return obj;
    }

    public static java.lang.Object getXSDType(java.lang.Object param)
    {
        if(param==null)
        {
            return null;
        }
        java.lang.Class obj=param.getClass();
        if(obj.equals(java.lang.String.class))
        {
            return "string";
        }
        if(obj.equals(int.class) || obj.equals(java.lang.Integer.class))
        {
            return "int";
        }
        if(obj.equals(float.class) || obj.equals(java.lang.Float.class))
        {
            return "float";
        }
        if(obj.equals(double.class) || obj.equals(java.lang.Double.class))
        {
            return "double";
        }
        if(obj.equals(java.math.BigDecimal.class))
        {
            return "decimal";
        }
        if(obj.equals(short.class) || obj.equals(java.lang.Short.class))
        {
            return "short";
        }
        if(obj.equals(long.class) || obj.equals(java.lang.Long.class))
        {
            return "long";
        }
        if(obj.equals(boolean.class) || obj.equals(java.lang.Boolean.class))
        {
            return "boolean";
        }
        java.lang.String xmlName=Helper.getKeyByValue(classNames,obj);
        if(xmlName==null)
        {
            return obj;
        }
        return xmlName;
    }
} 

