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

public class AccountingClassificationByReferenceData extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* The "Name" column in the Accounting Classification list-screen in SICS/nt.
	*                   Also called "Accounting Classification Name" in the create/edit screen in SICS/nt.
	*                   If not provided by the client a name is generated by the system.
	*/
    public String classificationName;
    
	/**
	* The "Classification Items" column in the Accounting Classification list-screen in SICS/nt.
	*/
    public AccountingClassificationTuple classificationContent;
    
	/**
	* The "RU 1" column in the Accounting Classification list-screen in SICS/nt.
	*                   Also called "Reporting Unit 1 (Profit Center)" in the create/edit screen in SICS/nt
	*/
    public SicsReportingUnitReference reportingUnit1;
    
	/**
	* The "RU 2" column in the Accounting Classification list-screen in SICS/nt.
	*                   Also called "Reporting Unit 2 (Segment Code)" in the create/edit screen in SICS/nt
	*/
    public SicsReportingUnitReference reportingUnit2;
    
	/**
	* The "RU 3" column in the Accounting Classification list-screen in SICS/nt.
	*                   Also called "Reporting Unit 3 (Person)" in the create/edit screen in SICS/nt
	*/
    public SicsReportingUnitReference reportingUnit3;

    public AccountingClassificationByReferenceData ()
    {
    }

    public AccountingClassificationByReferenceData (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("classificationName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.classificationName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.classificationName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("classificationContent"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.classificationContent = (AccountingClassificationTuple)__envelope.get(j,AccountingClassificationTuple.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reportingUnit1"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reportingUnit1 = (SicsReportingUnitReference)__envelope.get(j,SicsReportingUnitReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reportingUnit2"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reportingUnit2 = (SicsReportingUnitReference)__envelope.get(j,SicsReportingUnitReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reportingUnit3"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reportingUnit3 = (SicsReportingUnitReference)__envelope.get(j,SicsReportingUnitReference.class,false);
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
            return this.classificationName!=null?this.classificationName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return classificationContent;
        }
        if(propertyIndex==2)
        {
            return this.reportingUnit1!=null?this.reportingUnit1:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.reportingUnit2!=null?this.reportingUnit2:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.reportingUnit3!=null?this.reportingUnit3:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "classificationName";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = AccountingClassificationTuple.class;
            info.name = "classificationContent";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsReportingUnitReference.class;
            info.name = "reportingUnit1";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsReportingUnitReference.class;
            info.name = "reportingUnit2";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = SicsReportingUnitReference.class;
            info.name = "reportingUnit3";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

