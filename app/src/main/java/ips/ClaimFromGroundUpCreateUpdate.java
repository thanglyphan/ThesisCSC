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

public class ClaimFromGroundUpCreateUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public PolicyDeductibleList policyDeductibleList;
    
    public CoInsuranceList coInsuranceList;
    
    public InuringRecoveryList inuringRecoveryList;
    
	/**
	* SubclassNumber: 1066. Codes: ANY.
	*/
    public SicsReferenceDataReference interestCalculationMethod;
    
    public ClaimFGUAdvisoryList fguAdvisoryList;
    
    public ClaimFGUAdvisoryListUpdate fguAdvisoryListUpdate;
    
    public ReductionList reductionList;
    
    public ReductionListUpdate reductionListUpdate;
    
    public PolicyDeductibleListUpdate policyDeductibleListUpdate;
    
    public CoInsuranceListUpdate coInsuranceListUpdate;
    
    public InuringRecoveryListUpdate inuringRecoveryListUpdate;
    
    public ClaimFGUQuotationFiguresList fguQuotationFiguresList;
    
    public ClaimFGUQuotationFiguresListUpdate fguQuotationFiguresListUpdate;

    public ClaimFromGroundUpCreateUpdate ()
    {
    }

    public ClaimFromGroundUpCreateUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                        this.fguAdvisoryList = new ClaimFGUAdvisoryList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("fguAdvisoryListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.fguAdvisoryListUpdate = (ClaimFGUAdvisoryListUpdate)__envelope.get(j,ClaimFGUAdvisoryListUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reductionList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reductionList = new ReductionList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("reductionListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reductionListUpdate = (ReductionListUpdate)__envelope.get(j,ReductionListUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("policyDeductibleListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.policyDeductibleListUpdate = (PolicyDeductibleListUpdate)__envelope.get(j,PolicyDeductibleListUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("coInsuranceListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.coInsuranceListUpdate = (CoInsuranceListUpdate)__envelope.get(j,CoInsuranceListUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("inuringRecoveryListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.inuringRecoveryListUpdate = (InuringRecoveryListUpdate)__envelope.get(j,InuringRecoveryListUpdate.class,false);
                    }
                    continue;
                }
                if (info.name.equals("fguQuotationFiguresList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.fguQuotationFiguresList = new ClaimFGUQuotationFiguresList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("fguQuotationFiguresListUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.fguQuotationFiguresListUpdate = (ClaimFGUQuotationFiguresListUpdate)__envelope.get(j,ClaimFGUQuotationFiguresListUpdate.class,false);
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
            return this.policyDeductibleList!=null?this.policyDeductibleList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.coInsuranceList!=null?this.coInsuranceList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.inuringRecoveryList!=null?this.inuringRecoveryList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.interestCalculationMethod!=null?this.interestCalculationMethod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.fguAdvisoryList!=null?this.fguAdvisoryList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.fguAdvisoryListUpdate!=null?this.fguAdvisoryListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.reductionList!=null?this.reductionList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.reductionListUpdate!=null?this.reductionListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.policyDeductibleListUpdate!=null?this.policyDeductibleListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.coInsuranceListUpdate!=null?this.coInsuranceListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.inuringRecoveryListUpdate!=null?this.inuringRecoveryListUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.fguQuotationFiguresList!=null?this.fguQuotationFiguresList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.fguQuotationFiguresListUpdate!=null?this.fguQuotationFiguresListUpdate:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 13;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "policyDeductibleList";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "coInsuranceList";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "inuringRecoveryList";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "interestCalculationMethod";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "fguAdvisoryList";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = ClaimFGUAdvisoryListUpdate.class;
            info.name = "fguAdvisoryListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "reductionList";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = ReductionListUpdate.class;
            info.name = "reductionListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PolicyDeductibleListUpdate.class;
            info.name = "policyDeductibleListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = CoInsuranceListUpdate.class;
            info.name = "coInsuranceListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = InuringRecoveryListUpdate.class;
            info.name = "inuringRecoveryListUpdate";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "fguQuotationFiguresList";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = ClaimFGUQuotationFiguresListUpdate.class;
            info.name = "fguQuotationFiguresListUpdate";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

