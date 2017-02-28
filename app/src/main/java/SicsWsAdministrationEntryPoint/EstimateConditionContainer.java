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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class EstimateConditionContainer extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< PeriodEstimatesCondition> adjustmentPeriodEstimate =new ArrayList<PeriodEstimatesCondition >();
    
    public ArrayList< EstimateAccountingCondition> businessEstimateAccounting =new ArrayList<EstimateAccountingCondition >();
    
    public ArrayList< PeriodEstimatesCondition> convertedCurrencyPeriodEstimate =new ArrayList<PeriodEstimatesCondition >();
    
    public ArrayList< PeriodEstimatesCondition> multiGaapPeriodEstimate =new ArrayList<PeriodEstimatesCondition >();
    
    public ArrayList< PeriodEstimatesCondition> periodEstimate =new ArrayList<PeriodEstimatesCondition >();
    
    public ArrayList< PeriodEstimatesCondition> pricingPeriodEstimate =new ArrayList<PeriodEstimatesCondition >();
    
    public ArrayList< PeriodEstimatesCondition> projectionPeriodEstimate =new ArrayList<PeriodEstimatesCondition >();
    
    public ModelSectionList modelSectionList;

    public EstimateConditionContainer ()
    {
    }

    public EstimateConditionContainer (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("adjustmentPeriodEstimate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.adjustmentPeriodEstimate==null)
                        {
                            this.adjustmentPeriodEstimate = new ArrayList< PeriodEstimatesCondition>();
                        }
                        java.lang.Object j =obj;
                        PeriodEstimatesCondition j1= (PeriodEstimatesCondition)__envelope.get(j,PeriodEstimatesCondition.class,false);
                        this.adjustmentPeriodEstimate.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("businessEstimateAccounting"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.businessEstimateAccounting==null)
                        {
                            this.businessEstimateAccounting = new ArrayList< EstimateAccountingCondition>();
                        }
                        java.lang.Object j =obj;
                        EstimateAccountingCondition j1= (EstimateAccountingCondition)__envelope.get(j,EstimateAccountingCondition.class,false);
                        this.businessEstimateAccounting.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("convertedCurrencyPeriodEstimate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.convertedCurrencyPeriodEstimate==null)
                        {
                            this.convertedCurrencyPeriodEstimate = new ArrayList< PeriodEstimatesCondition>();
                        }
                        java.lang.Object j =obj;
                        PeriodEstimatesCondition j1= (PeriodEstimatesCondition)__envelope.get(j,PeriodEstimatesCondition.class,false);
                        this.convertedCurrencyPeriodEstimate.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("multiGaapPeriodEstimate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.multiGaapPeriodEstimate==null)
                        {
                            this.multiGaapPeriodEstimate = new ArrayList< PeriodEstimatesCondition>();
                        }
                        java.lang.Object j =obj;
                        PeriodEstimatesCondition j1= (PeriodEstimatesCondition)__envelope.get(j,PeriodEstimatesCondition.class,false);
                        this.multiGaapPeriodEstimate.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("periodEstimate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.periodEstimate==null)
                        {
                            this.periodEstimate = new ArrayList< PeriodEstimatesCondition>();
                        }
                        java.lang.Object j =obj;
                        PeriodEstimatesCondition j1= (PeriodEstimatesCondition)__envelope.get(j,PeriodEstimatesCondition.class,false);
                        this.periodEstimate.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("pricingPeriodEstimate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.pricingPeriodEstimate==null)
                        {
                            this.pricingPeriodEstimate = new ArrayList< PeriodEstimatesCondition>();
                        }
                        java.lang.Object j =obj;
                        PeriodEstimatesCondition j1= (PeriodEstimatesCondition)__envelope.get(j,PeriodEstimatesCondition.class,false);
                        this.pricingPeriodEstimate.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("projectionPeriodEstimate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.projectionPeriodEstimate==null)
                        {
                            this.projectionPeriodEstimate = new ArrayList< PeriodEstimatesCondition>();
                        }
                        java.lang.Object j =obj;
                        PeriodEstimatesCondition j1= (PeriodEstimatesCondition)__envelope.get(j,PeriodEstimatesCondition.class,false);
                        this.projectionPeriodEstimate.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("modelSectionList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.modelSectionList = new ModelSectionList(j,__envelope);
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.adjustmentPeriodEstimate.size())
        {
            return this.adjustmentPeriodEstimate.get(propertyIndex-(count+0));
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size())
        {
            return this.businessEstimateAccounting.get(propertyIndex-(count+0+this.adjustmentPeriodEstimate.size()));
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size())
        {
            return this.convertedCurrencyPeriodEstimate.get(propertyIndex-(count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()));
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size())
        {
            return this.multiGaapPeriodEstimate.get(propertyIndex-(count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()));
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size())
        {
            return this.periodEstimate.get(propertyIndex-(count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()));
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()+this.pricingPeriodEstimate.size())
        {
            return this.pricingPeriodEstimate.get(propertyIndex-(count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()));
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()+this.pricingPeriodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()+this.pricingPeriodEstimate.size()+this.projectionPeriodEstimate.size())
        {
            return this.projectionPeriodEstimate.get(propertyIndex-(count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()+this.pricingPeriodEstimate.size()));
        }
        if(propertyIndex==count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()+this.pricingPeriodEstimate.size()+this.projectionPeriodEstimate.size())
        {
            return this.modelSectionList!=null?this.modelSectionList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+1+adjustmentPeriodEstimate.size()+businessEstimateAccounting.size()+convertedCurrencyPeriodEstimate.size()+multiGaapPeriodEstimate.size()+periodEstimate.size()+pricingPeriodEstimate.size()+projectionPeriodEstimate.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.adjustmentPeriodEstimate.size())
        {
            info.type = PeriodEstimatesCondition.class;
            info.name = "adjustmentPeriodEstimate";
            info.namespace= "";
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size())
        {
            info.type = EstimateAccountingCondition.class;
            info.name = "businessEstimateAccounting";
            info.namespace= "";
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size())
        {
            info.type = PeriodEstimatesCondition.class;
            info.name = "convertedCurrencyPeriodEstimate";
            info.namespace= "";
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size())
        {
            info.type = PeriodEstimatesCondition.class;
            info.name = "multiGaapPeriodEstimate";
            info.namespace= "";
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size())
        {
            info.type = PeriodEstimatesCondition.class;
            info.name = "periodEstimate";
            info.namespace= "";
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()+this.pricingPeriodEstimate.size())
        {
            info.type = PeriodEstimatesCondition.class;
            info.name = "pricingPeriodEstimate";
            info.namespace= "";
        }
        if(propertyIndex>=count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()+this.pricingPeriodEstimate.size() && propertyIndex < count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()+this.pricingPeriodEstimate.size()+this.projectionPeriodEstimate.size())
        {
            info.type = PeriodEstimatesCondition.class;
            info.name = "projectionPeriodEstimate";
            info.namespace= "";
        }
        if(propertyIndex==count+0+this.adjustmentPeriodEstimate.size()+this.businessEstimateAccounting.size()+this.convertedCurrencyPeriodEstimate.size()+this.multiGaapPeriodEstimate.size()+this.periodEstimate.size()+this.pricingPeriodEstimate.size()+this.projectionPeriodEstimate.size())
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "modelSectionList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

