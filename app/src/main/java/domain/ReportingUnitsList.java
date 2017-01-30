package domain;

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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class ReportingUnitsList extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public Boolean selectAll;
    
    public ArrayList< SicsReportingUnitReference> reportingUnit =new ArrayList<SicsReportingUnitReference >();

    public ReportingUnitsList ()
    {
    }

    public ReportingUnitsList (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("selectAll"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.selectAll = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.selectAll = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reportingUnit"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.reportingUnit==null)
                        {
                            this.reportingUnit = new ArrayList< SicsReportingUnitReference>();
                        }
                        java.lang.Object j =obj;
                        SicsReportingUnitReference j1= (SicsReportingUnitReference)__envelope.get(j,SicsReportingUnitReference.class,false);
                        this.reportingUnit.add(j1);
                   
        
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
            return this.selectAll!=null?this.selectAll:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.reportingUnit.size())
        {
            return this.reportingUnit.get(propertyIndex-(1));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+reportingUnit.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "selectAll";
            info.namespace= "";
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.reportingUnit.size())
        {
            info.type = SicsReportingUnitReference.class;
            info.name = "reportingUnit";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

