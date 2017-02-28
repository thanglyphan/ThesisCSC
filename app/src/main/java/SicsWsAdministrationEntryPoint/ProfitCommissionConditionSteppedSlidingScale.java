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

public class ProfitCommissionConditionSteppedSlidingScale extends ProfitCommissionConditionSlidingScale implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Used by "update" web service to delete all existing steps before adding new ones.  Otherwise, the new set of steps will be added to the existing set.
	*                      (Delete All)
	*/
    public Boolean deleteAll;
    
	/**
	* Specification for Adding Steps
	*/
    public ArrayList< ProfitCommissionConditionSpecificationForAddingSteps> specificationForAddingSteps =new ArrayList<ProfitCommissionConditionSpecificationForAddingSteps >();

    public ProfitCommissionConditionSteppedSlidingScale ()
    {
    }

    public ProfitCommissionConditionSteppedSlidingScale (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("deleteAll"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deleteAll = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.deleteAll = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("specificationForAddingSteps"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.specificationForAddingSteps==null)
                        {
                            this.specificationForAddingSteps = new ArrayList< ProfitCommissionConditionSpecificationForAddingSteps>();
                        }
                        java.lang.Object j =obj;
                        ProfitCommissionConditionSpecificationForAddingSteps j1= (ProfitCommissionConditionSpecificationForAddingSteps)__envelope.get(j,ProfitCommissionConditionSpecificationForAddingSteps.class,false);
                        this.specificationForAddingSteps.add(j1);
                   
        
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
            return this.deleteAll!=null?this.deleteAll:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.specificationForAddingSteps.size())
        {
            return this.specificationForAddingSteps.get(propertyIndex-(count+1));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+1+specificationForAddingSteps.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "deleteAll";
            info.namespace= "";
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.specificationForAddingSteps.size())
        {
            info.type = ProfitCommissionConditionSpecificationForAddingSteps.class;
            info.name = "specificationForAddingSteps";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

