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

public class CreateProfitCommissionConditionInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsScopeOfCoverReference scopeOfCoverReference;
    
    public SicsAmendmentForConditionReference amendmentReference;
    
    public ProfitCommissionCondition profitCommissionCondition;

    public CreateProfitCommissionConditionInput ()
    {
    }

    public CreateProfitCommissionConditionInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("scopeOfCoverReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.scopeOfCoverReference = (SicsScopeOfCoverReference)__envelope.get(j,SicsScopeOfCoverReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("amendmentReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.amendmentReference = (SicsAmendmentForConditionReference)__envelope.get(j,SicsAmendmentForConditionReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("profitCommissionCondition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.profitCommissionCondition = (ProfitCommissionCondition)__envelope.get(j,ProfitCommissionCondition.class,false);
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
            return scopeOfCoverReference;
        }
        if(propertyIndex==1)
        {
            return this.amendmentReference!=null?this.amendmentReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return profitCommissionCondition;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsScopeOfCoverReference.class;
            info.name = "scopeOfCoverReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsAmendmentForConditionReference.class;
            info.name = "amendmentReference";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = ProfitCommissionCondition.class;
            info.name = "profitCommissionCondition";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

