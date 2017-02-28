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

public class BusinessPartnerMembershipListUpdate extends ListUpdate implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< BusinessPartnerMembershipUpdateElement> businessPartnerMembershipUpdate =new ArrayList<BusinessPartnerMembershipUpdateElement >();

    public BusinessPartnerMembershipListUpdate ()
    {
    }

    public BusinessPartnerMembershipListUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("businessPartnerMembershipUpdate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.businessPartnerMembershipUpdate==null)
                        {
                            this.businessPartnerMembershipUpdate = new ArrayList< BusinessPartnerMembershipUpdateElement>();
                        }
                        java.lang.Object j =obj;
                        BusinessPartnerMembershipUpdateElement j1= (BusinessPartnerMembershipUpdateElement)__envelope.get(j,BusinessPartnerMembershipUpdateElement.class,false);
                        this.businessPartnerMembershipUpdate.add(j1);
                   
        
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.businessPartnerMembershipUpdate.size())
        {
            return this.businessPartnerMembershipUpdate.get(propertyIndex-(count+0));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+0+businessPartnerMembershipUpdate.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.businessPartnerMembershipUpdate.size())
        {
            info.type = BusinessPartnerMembershipUpdateElement.class;
            info.name = "businessPartnerMembershipUpdate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

