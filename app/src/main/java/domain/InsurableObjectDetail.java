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

public class InsurableObjectDetail extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Notes tab
	*/
    public String detailSpecificNote;
    
    public UserDefinedFields userDefinedFieldsCondition;
    
    public InsurableObjectAmendmentDetail insurableObjectAmendment;

    public InsurableObjectDetail ()
    {
    }

    public InsurableObjectDetail (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("detailSpecificNote"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.detailSpecificNote = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.detailSpecificNote = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("userDefinedFieldsCondition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.userDefinedFieldsCondition = (UserDefinedFields)__envelope.get(j,UserDefinedFields.class,false);
                    }
                    continue;
                }
                if (info.name.equals("insurableObjectAmendment"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insurableObjectAmendment = (InsurableObjectAmendmentDetail)__envelope.get(j,InsurableObjectAmendmentDetail.class,false);
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
            return this.detailSpecificNote!=null?this.detailSpecificNote:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.userDefinedFieldsCondition!=null?this.userDefinedFieldsCondition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.insurableObjectAmendment!=null?this.insurableObjectAmendment:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "detailSpecificNote";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = UserDefinedFields.class;
            info.name = "userDefinedFieldsCondition";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = InsurableObjectAmendmentDetail.class;
            info.name = "insurableObjectAmendment";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
