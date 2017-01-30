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

public class AcordPlacingMessage extends AbstractAcordPCReinsuranceMessage implements KvmSerializable,java.io.Serializable
{

    
    public AcordCode contractNature;
    
    public AcordCode treatyFac;
    
    public java.util.Date contractPeriodStartDate;
    
    public java.util.Date contractPeriodEndDate;

    public AcordPlacingMessage ()
    {
    }

    public AcordPlacingMessage (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("contractNature"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.contractNature = (AcordCode)__envelope.get(j,AcordCode.class,false);
                    }
                    continue;
                }
                if (info.name.equals("treatyFac"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.treatyFac = (AcordCode)__envelope.get(j,AcordCode.class,false);
                    }
                    continue;
                }
                if (info.name.equals("contractPeriodStartDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.contractPeriodStartDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.contractPeriodStartDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("contractPeriodEndDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.contractPeriodEndDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.contractPeriodEndDate = (java.util.Date)obj;
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
            return this.contractNature!=null?this.contractNature:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.treatyFac!=null?this.treatyFac:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.contractPeriodStartDate!=null?Helper.getDateFormat().format(this.contractPeriodStartDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.contractPeriodEndDate!=null?Helper.getDateFormat().format(this.contractPeriodEndDate):SoapPrimitive.NullSkip;
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
            info.type = AcordCode.class;
            info.name = "contractNature";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = AcordCode.class;
            info.name = "treatyFac";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "contractPeriodStartDate";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "contractPeriodEndDate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

