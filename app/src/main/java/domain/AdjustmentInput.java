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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class AdjustmentInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* XXXXXX
	*                Create -> Adjustments
	*/
    public AdjustmentSpecification adjustmentSpecification;
    
	/**
	* Used by the "update" Condition Web Service: set to "true" if all adjustments should be removed.
	*                Remove All
	*/
    public Boolean removeAllAdjustments;
    
	/**
	* Currently only used to specify Adjustments which should be removed.
	*/
    public ArrayList< Adjustment> adjustment =new ArrayList<Adjustment >();
    
	/**
	* Should only be used in domainRetrieval to fetch all adjustments.
	*/
    public ArrayList< SingleAdjustment> adjustmentForDomainRetrieval =new ArrayList<SingleAdjustment >();

    public AdjustmentInput ()
    {
    }

    public AdjustmentInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("adjustmentSpecification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.adjustmentSpecification = (AdjustmentSpecification)__envelope.get(j,AdjustmentSpecification.class,false);
                    }
                    continue;
                }
                if (info.name.equals("removeAllAdjustments"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.removeAllAdjustments = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.removeAllAdjustments = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("adjustment"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.adjustment==null)
                        {
                            this.adjustment = new ArrayList< Adjustment>();
                        }
                        java.lang.Object j =obj;
                        Adjustment j1= (Adjustment)__envelope.get(j,Adjustment.class,false);
                        this.adjustment.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("adjustmentForDomainRetrieval"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.adjustmentForDomainRetrieval==null)
                        {
                            this.adjustmentForDomainRetrieval = new ArrayList< SingleAdjustment>();
                        }
                        java.lang.Object j =obj;
                        SingleAdjustment j1= (SingleAdjustment)__envelope.get(j,SingleAdjustment.class,false);
                        this.adjustmentForDomainRetrieval.add(j1);
                   
        
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
            return this.adjustmentSpecification!=null?this.adjustmentSpecification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.removeAllAdjustments!=null?this.removeAllAdjustments:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=2 && propertyIndex < 2+this.adjustment.size())
        {
            return this.adjustment.get(propertyIndex-(2));
        }
        if(propertyIndex>=2+this.adjustment.size() && propertyIndex < 2+this.adjustment.size()+this.adjustmentForDomainRetrieval.size())
        {
            return this.adjustmentForDomainRetrieval.get(propertyIndex-(2+this.adjustment.size()));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2+adjustment.size()+adjustmentForDomainRetrieval.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = AdjustmentSpecification.class;
            info.name = "adjustmentSpecification";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "removeAllAdjustments";
            info.namespace= "";
        }
        if(propertyIndex>=2 && propertyIndex < 2+this.adjustment.size())
        {
            info.type = Adjustment.class;
            info.name = "adjustment";
            info.namespace= "";
        }
        if(propertyIndex>=2+this.adjustment.size() && propertyIndex < 2+this.adjustment.size()+this.adjustmentForDomainRetrieval.size())
        {
            info.type = SingleAdjustment.class;
            info.name = "adjustmentForDomainRetrieval";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

