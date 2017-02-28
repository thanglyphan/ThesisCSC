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

public class BusinessPartnerMembershipUpdateElement extends ListUpdateElement implements KvmSerializable,java.io.Serializable
{

    
    public BusinessPartnerMembershipKey businessPartnerMembershipKey;
    
    public BusinessPartnerMembershipUpdate businessPartnerMembership;

    public BusinessPartnerMembershipUpdateElement ()
    {
    }

    public BusinessPartnerMembershipUpdateElement (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("businessPartnerMembershipKey"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartnerMembershipKey = (BusinessPartnerMembershipKey)__envelope.get(j,BusinessPartnerMembershipKey.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerMembership"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartnerMembership = (BusinessPartnerMembershipUpdate)__envelope.get(j,BusinessPartnerMembershipUpdate.class,false);
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
            return businessPartnerMembershipKey;
        }
        if(propertyIndex==count+1)
        {
            return this.businessPartnerMembership!=null?this.businessPartnerMembership:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = BusinessPartnerMembershipKey.class;
            info.name = "businessPartnerMembershipKey";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = BusinessPartnerMembershipUpdate.class;
            info.name = "businessPartnerMembership";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

