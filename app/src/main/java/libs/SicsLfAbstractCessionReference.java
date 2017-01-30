package ting;

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

public class SicsLfAbstractCessionReference extends SicsLfAbstractBenefitGroupReference implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 975.
	*/
    public ArrayList< SicsReferenceDataReference> coveredBenefits =new ArrayList<SicsReferenceDataReference >();
    
	/**
	* SubclassNumber: 976.
	*/
    public SicsReferenceDataReference insuranceProduct;

    public SicsLfAbstractCessionReference ()
    {
    }

    public SicsLfAbstractCessionReference (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("coveredBenefits"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.coveredBenefits==null)
                        {
                            this.coveredBenefits = new ArrayList< SicsReferenceDataReference>();
                        }
                        java.lang.Object j =obj;
                        SicsReferenceDataReference j1= (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                        this.coveredBenefits.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("insuranceProduct"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuranceProduct = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.coveredBenefits.size())
        {
            return this.coveredBenefits.get(propertyIndex-(count+0));
        }
        if(propertyIndex==count+0+this.coveredBenefits.size())
        {
            return insuranceProduct;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+1+coveredBenefits.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.coveredBenefits.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "coveredBenefits";
            info.namespace= "";
        }
        if(propertyIndex==count+0+this.coveredBenefits.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "insuranceProduct";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

