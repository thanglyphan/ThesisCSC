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

public class ClaimReportingUnitRelation extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public SicsReportingUnitReference reportingUnit;
    
	/**
	* SubclassNumber: 00042. Codes: ANY.
	*/
    public SicsReferenceDataReference reportingUnitCategory;
    
    public ReportingUnitDatespan validPeriod;

    public ClaimReportingUnitRelation ()
    {
    }

    public ClaimReportingUnitRelation (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("reportingUnit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reportingUnit = (SicsReportingUnitReference)__envelope.get(j,SicsReportingUnitReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reportingUnitCategory"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reportingUnitCategory = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("validPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.validPeriod = (ReportingUnitDatespan)__envelope.get(j,ReportingUnitDatespan.class,false);
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
            return reportingUnit;
        }
        if(propertyIndex==count+1)
        {
            return reportingUnitCategory;
        }
        if(propertyIndex==count+2)
        {
            return this.validPeriod!=null?this.validPeriod:SoapPrimitive.NullSkip;
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
            info.type = SicsReportingUnitReference.class;
            info.name = "reportingUnit";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "reportingUnitCategory";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = ReportingUnitDatespan.class;
            info.name = "validPeriod";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

