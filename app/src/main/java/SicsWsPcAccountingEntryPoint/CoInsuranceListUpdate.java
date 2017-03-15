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

public class CoInsuranceListUpdate extends ListUpdate implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< ClaimFromGroundUpCoInsuranceUpdateElement> coInsuranceUpdate =new ArrayList<ClaimFromGroundUpCoInsuranceUpdateElement >();

    public CoInsuranceListUpdate ()
    {
    }

    public CoInsuranceListUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("coInsuranceUpdate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.coInsuranceUpdate==null)
                        {
                            this.coInsuranceUpdate = new ArrayList< ClaimFromGroundUpCoInsuranceUpdateElement>();
                        }
                        java.lang.Object j =obj;
                        ClaimFromGroundUpCoInsuranceUpdateElement j1= (ClaimFromGroundUpCoInsuranceUpdateElement)__envelope.get(j,ClaimFromGroundUpCoInsuranceUpdateElement.class,false);
                        this.coInsuranceUpdate.add(j1);
                   
        
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.coInsuranceUpdate.size())
        {
            return this.coInsuranceUpdate.get(propertyIndex-(count+0));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+0+coInsuranceUpdate.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.coInsuranceUpdate.size())
        {
            info.type = ClaimFromGroundUpCoInsuranceUpdateElement.class;
            info.name = "coInsuranceUpdate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

