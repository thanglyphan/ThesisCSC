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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;
import java.math.BigDecimal;

public class ClaimSpecificClassificationUpdateList extends ListUpdate implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< ClaimSpecificClassificationUpdateElement> claimSpecificClassificationUpdate =new ArrayList<ClaimSpecificClassificationUpdateElement >();
    
    public ClaimCategoryLimitUpdateElement claimCategoryLimitUpdate;
    
    public BigDecimal subPrioThresholdPercentageUpdate;

    public ClaimSpecificClassificationUpdateList ()
    {
    }

    public ClaimSpecificClassificationUpdateList (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("claimSpecificClassificationUpdate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.claimSpecificClassificationUpdate==null)
                        {
                            this.claimSpecificClassificationUpdate = new ArrayList< ClaimSpecificClassificationUpdateElement>();
                        }
                        java.lang.Object j =obj;
                        ClaimSpecificClassificationUpdateElement j1= (ClaimSpecificClassificationUpdateElement)__envelope.get(j,ClaimSpecificClassificationUpdateElement.class,false);
                        this.claimSpecificClassificationUpdate.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("claimCategoryLimitUpdate"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.claimCategoryLimitUpdate = (ClaimCategoryLimitUpdateElement)__envelope.get(j,ClaimCategoryLimitUpdateElement.class,false);
                    }
                    continue;
                }
                if (info.name.equals("subPrioThresholdPercentageUpdate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.subPrioThresholdPercentageUpdate = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.subPrioThresholdPercentageUpdate = (BigDecimal)obj;
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.claimSpecificClassificationUpdate.size())
        {
            return this.claimSpecificClassificationUpdate.get(propertyIndex-(count+0));
        }
        if(propertyIndex==count+0+this.claimSpecificClassificationUpdate.size())
        {
            return this.claimCategoryLimitUpdate!=null?this.claimCategoryLimitUpdate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1+this.claimSpecificClassificationUpdate.size())
        {
            return this.subPrioThresholdPercentageUpdate!=null?this.subPrioThresholdPercentageUpdate.toString():SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2+claimSpecificClassificationUpdate.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.claimSpecificClassificationUpdate.size())
        {
            info.type = ClaimSpecificClassificationUpdateElement.class;
            info.name = "claimSpecificClassificationUpdate";
            info.namespace= "";
        }
        if(propertyIndex==count+0+this.claimSpecificClassificationUpdate.size())
        {
            info.type = ClaimCategoryLimitUpdateElement.class;
            info.name = "claimCategoryLimitUpdate";
            info.namespace= "";
        }
        if(propertyIndex==count+1+this.claimSpecificClassificationUpdate.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "subPrioThresholdPercentageUpdate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

