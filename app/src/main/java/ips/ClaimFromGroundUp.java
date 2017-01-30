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

public class ClaimFromGroundUp extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public PolicyDeductibleList policyDeductibleList;
    
    public CoInsuranceList coInsuranceList;
    
    public InuringRecoveryList inuringRecoveryList;
    
	/**
	* SubclassNumber: 1066. Codes: ANY.
	*/
    public SicsReferenceDataReference interestCalculationMethod;
    
    public ClaimFGUAdvisoryReadList fguAdvisoryList;
    
    public ReductionReadList reductionList;
    
    public ClaimFGUQuotationFiguresReadList fguQuotationFiguresList;

    public ClaimFromGroundUp ()
    {
    }

    public ClaimFromGroundUp (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("policyDeductibleList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.policyDeductibleList = new PolicyDeductibleList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("coInsuranceList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.coInsuranceList = new CoInsuranceList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("inuringRecoveryList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.inuringRecoveryList = new InuringRecoveryList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("interestCalculationMethod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.interestCalculationMethod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("fguAdvisoryList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.fguAdvisoryList = new ClaimFGUAdvisoryReadList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("reductionList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reductionList = new ReductionReadList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("fguQuotationFiguresList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.fguQuotationFiguresList = new ClaimFGUQuotationFiguresReadList(j,__envelope);
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
            return this.policyDeductibleList!=null?this.policyDeductibleList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.coInsuranceList!=null?this.coInsuranceList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.inuringRecoveryList!=null?this.inuringRecoveryList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.interestCalculationMethod!=null?this.interestCalculationMethod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.fguAdvisoryList!=null?this.fguAdvisoryList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.reductionList!=null?this.reductionList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.fguQuotationFiguresList!=null?this.fguQuotationFiguresList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "policyDeductibleList";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "coInsuranceList";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "inuringRecoveryList";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "interestCalculationMethod";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "fguAdvisoryList";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "reductionList";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "fguQuotationFiguresList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
