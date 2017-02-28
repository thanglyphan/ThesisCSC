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

public class InstalmentContainer extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< SingleInstalment> instalment =new ArrayList<SingleInstalment >();
    
    public InstalmentHistoryList instalmentHistoryList;
    
    public ArrayList< SingleAdjustment> adjustment =new ArrayList<SingleAdjustment >();
    
    public AdjustmentHistoryList adjustmentHistoryList;
    
    public ArrayList< SingleInstalment> specialAcceptancePremium =new ArrayList<SingleInstalment >();
    
    public SpecialAcceptancePremiumHistoryList specialAcceptancePremiumHistoryList;

    public InstalmentContainer ()
    {
    }

    public InstalmentContainer (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("instalment"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.instalment==null)
                        {
                            this.instalment = new ArrayList< SingleInstalment>();
                        }
                        java.lang.Object j =obj;
                        SingleInstalment j1= (SingleInstalment)__envelope.get(j,SingleInstalment.class,false);
                        this.instalment.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("instalmentHistoryList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.instalmentHistoryList = new InstalmentHistoryList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("adjustment"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.adjustment==null)
                        {
                            this.adjustment = new ArrayList< SingleAdjustment>();
                        }
                        java.lang.Object j =obj;
                        SingleAdjustment j1= (SingleAdjustment)__envelope.get(j,SingleAdjustment.class,false);
                        this.adjustment.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("adjustmentHistoryList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.adjustmentHistoryList = new AdjustmentHistoryList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("specialAcceptancePremium"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.specialAcceptancePremium==null)
                        {
                            this.specialAcceptancePremium = new ArrayList< SingleInstalment>();
                        }
                        java.lang.Object j =obj;
                        SingleInstalment j1= (SingleInstalment)__envelope.get(j,SingleInstalment.class,false);
                        this.specialAcceptancePremium.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("specialAcceptancePremiumHistoryList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.specialAcceptancePremiumHistoryList = new SpecialAcceptancePremiumHistoryList(j,__envelope);
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.instalment.size())
        {
            return this.instalment.get(propertyIndex-(count+0));
        }
        if(propertyIndex==count+0+this.instalment.size())
        {
            return this.instalmentHistoryList!=null?this.instalmentHistoryList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+1+this.instalment.size() && propertyIndex < count+1+this.instalment.size()+this.adjustment.size())
        {
            return this.adjustment.get(propertyIndex-(count+1+this.instalment.size()));
        }
        if(propertyIndex==count+1+this.instalment.size()+this.adjustment.size())
        {
            return this.adjustmentHistoryList!=null?this.adjustmentHistoryList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+2+this.instalment.size()+this.adjustment.size() && propertyIndex < count+2+this.instalment.size()+this.adjustment.size()+this.specialAcceptancePremium.size())
        {
            return this.specialAcceptancePremium.get(propertyIndex-(count+2+this.instalment.size()+this.adjustment.size()));
        }
        if(propertyIndex==count+2+this.instalment.size()+this.adjustment.size()+this.specialAcceptancePremium.size())
        {
            return this.specialAcceptancePremiumHistoryList!=null?this.specialAcceptancePremiumHistoryList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+3+instalment.size()+adjustment.size()+specialAcceptancePremium.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.instalment.size())
        {
            info.type = SingleInstalment.class;
            info.name = "instalment";
            info.namespace= "";
        }
        if(propertyIndex==count+0+this.instalment.size())
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "instalmentHistoryList";
            info.namespace= "";
        }
        if(propertyIndex>=count+1+this.instalment.size() && propertyIndex < count+1+this.instalment.size()+this.adjustment.size())
        {
            info.type = SingleAdjustment.class;
            info.name = "adjustment";
            info.namespace= "";
        }
        if(propertyIndex==count+1+this.instalment.size()+this.adjustment.size())
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "adjustmentHistoryList";
            info.namespace= "";
        }
        if(propertyIndex>=count+2+this.instalment.size()+this.adjustment.size() && propertyIndex < count+2+this.instalment.size()+this.adjustment.size()+this.specialAcceptancePremium.size())
        {
            info.type = SingleInstalment.class;
            info.name = "specialAcceptancePremium";
            info.namespace= "";
        }
        if(propertyIndex==count+2+this.instalment.size()+this.adjustment.size()+this.specialAcceptancePremium.size())
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "specialAcceptancePremiumHistoryList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

