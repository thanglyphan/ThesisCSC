package SicsWsPcAccountingEntryPoint;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 30/01/2017
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class InstalmentCondition extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Instalment Details for currencies
	*/
    public ArrayList< InstalmentConditionDetail> instalmentDetailsForCurrency =new ArrayList<InstalmentConditionDetail >();

    public InstalmentCondition ()
    {
    }

    public InstalmentCondition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("instalmentDetailsForCurrency"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.instalmentDetailsForCurrency==null)
                        {
                            this.instalmentDetailsForCurrency = new ArrayList< InstalmentConditionDetail>();
                        }
                        java.lang.Object j =obj;
                        InstalmentConditionDetail j1= (InstalmentConditionDetail)__envelope.get(j,InstalmentConditionDetail.class,false);
                        this.instalmentDetailsForCurrency.add(j1);
                   
        
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.instalmentDetailsForCurrency.size())
        {
            return this.instalmentDetailsForCurrency.get(propertyIndex-(count+0));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+0+instalmentDetailsForCurrency.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.instalmentDetailsForCurrency.size())
        {
            info.type = InstalmentConditionDetail.class;
            info.name = "instalmentDetailsForCurrency";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

