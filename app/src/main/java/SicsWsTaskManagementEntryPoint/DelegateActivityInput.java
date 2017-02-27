package SicsWsTaskManagementEntryPoint;

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

public class DelegateActivityInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsTaskManagementActivityReference activityReference;
    
	/**
	* List of potential owners of the activity.
	*                If this element is not present the current list of potential users
	*                will not be changed, so to remove all potential users an empty
	*                list should be used.
	*/
    public PotentialOwnerUpdateList potentialOwnerList;
    
	/**
	* List of user groups which are potential owner groups of the activity.
	*                If this element is not present the current list of potential owner groups
	*                will not be changed, so to remove all potential user groups an empty
	*                list should be used.
	*/
    public PotentialOwnerGroupUpdateList potentialOwnerGroupList;

    public DelegateActivityInput ()
    {
    }

    public DelegateActivityInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("activityReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.activityReference = (SicsTaskManagementActivityReference)__envelope.get(j,SicsTaskManagementActivityReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("potentialOwnerList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.potentialOwnerList = (PotentialOwnerUpdateList)__envelope.get(j,PotentialOwnerUpdateList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("potentialOwnerGroupList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.potentialOwnerGroupList = (PotentialOwnerGroupUpdateList)__envelope.get(j,PotentialOwnerGroupUpdateList.class,false);
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
            return activityReference;
        }
        if(propertyIndex==1)
        {
            return this.potentialOwnerList!=null?this.potentialOwnerList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.potentialOwnerGroupList!=null?this.potentialOwnerGroupList:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsTaskManagementActivityReference.class;
            info.name = "activityReference";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PotentialOwnerUpdateList.class;
            info.name = "potentialOwnerList";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PotentialOwnerGroupUpdateList.class;
            info.name = "potentialOwnerGroupList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

