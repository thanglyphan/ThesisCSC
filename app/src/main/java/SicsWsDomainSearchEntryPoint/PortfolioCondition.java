package SicsWsDomainSearchEntryPoint;

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

public class PortfolioCondition extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public Boolean managePortfolioAsReserve;
    
    public PremiumReserveCondition claimsEntryPortfolioCondition;
    
    public PremiumReserveCondition claimsWithdrawalPortfolioCondition;
    
    public PremiumEntryPortfolioCondition premiumEntryPortfolioCondition;
    
    public PremiumReserveCondition premiumWithdrawalPortfolioCondition;

    public PortfolioCondition ()
    {
    }

    public PortfolioCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("managePortfolioAsReserve"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.managePortfolioAsReserve = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.managePortfolioAsReserve = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimsEntryPortfolioCondition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimsEntryPortfolioCondition = (PremiumReserveCondition)__envelope.get(j,PremiumReserveCondition.class,false);
                    }
                    continue;
                }
                if (info.name.equals("claimsWithdrawalPortfolioCondition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimsWithdrawalPortfolioCondition = (PremiumReserveCondition)__envelope.get(j,PremiumReserveCondition.class,false);
                    }
                    continue;
                }
                if (info.name.equals("premiumEntryPortfolioCondition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premiumEntryPortfolioCondition = (PremiumEntryPortfolioCondition)__envelope.get(j,PremiumEntryPortfolioCondition.class,false);
                    }
                    continue;
                }
                if (info.name.equals("premiumWithdrawalPortfolioCondition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premiumWithdrawalPortfolioCondition = (PremiumReserveCondition)__envelope.get(j,PremiumReserveCondition.class,false);
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
            return this.managePortfolioAsReserve!=null?this.managePortfolioAsReserve:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.claimsEntryPortfolioCondition!=null?this.claimsEntryPortfolioCondition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.claimsWithdrawalPortfolioCondition!=null?this.claimsWithdrawalPortfolioCondition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.premiumEntryPortfolioCondition!=null?this.premiumEntryPortfolioCondition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.premiumWithdrawalPortfolioCondition!=null?this.premiumWithdrawalPortfolioCondition:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "managePortfolioAsReserve";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PremiumReserveCondition.class;
            info.name = "claimsEntryPortfolioCondition";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PremiumReserveCondition.class;
            info.name = "claimsWithdrawalPortfolioCondition";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PremiumEntryPortfolioCondition.class;
            info.name = "premiumEntryPortfolioCondition";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PremiumReserveCondition.class;
            info.name = "premiumWithdrawalPortfolioCondition";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

