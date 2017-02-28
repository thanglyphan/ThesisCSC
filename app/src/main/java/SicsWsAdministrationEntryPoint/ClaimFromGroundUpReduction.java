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
import java.math.BigDecimal;

public class ClaimFromGroundUpReduction extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date asOfDate;
    
	/**
	* SubclassNumber: 561. Codes: ANY.
	*/
    public SicsReferenceDataReference fguReductionApplication;
    
    public BigDecimal fguReductionPercentage=BigDecimal.ZERO;
    
    public String fguReductionRemark;
    
    public SicsScopeOfCoverReference scopeOfCover;

    public ClaimFromGroundUpReduction ()
    {
    }

    public ClaimFromGroundUpReduction (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("asOfDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.asOfDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.asOfDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("fguReductionApplication"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.fguReductionApplication = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("fguReductionPercentage"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fguReductionPercentage = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.fguReductionPercentage = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("fguReductionRemark"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fguReductionRemark = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.fguReductionRemark = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("scopeOfCover"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.scopeOfCover = (SicsScopeOfCoverReference)__envelope.get(j,SicsScopeOfCoverReference.class,false);
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
            return this.asOfDate!=null?Helper.getDateFormat().format(this.asOfDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return fguReductionApplication;
        }
        if(propertyIndex==count+2)
        {
            return this.fguReductionPercentage!=null?this.fguReductionPercentage.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.fguReductionRemark!=null?this.fguReductionRemark:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.scopeOfCover!=null?this.scopeOfCover:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "asOfDate";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "fguReductionApplication";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fguReductionPercentage";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fguReductionRemark";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsScopeOfCoverReference.class;
            info.name = "scopeOfCover";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

