package ips;

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

public class ClaimStatusList extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* This represents "Add Status All Sections..." popup menu choice.
	*/
    public Boolean applyToAllSections;
    
    public ArrayList< ClaimStatusCreateUpdate> claimStatus =new ArrayList<ClaimStatusCreateUpdate >();

    public ClaimStatusList ()
    {
    }

    public ClaimStatusList (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("applyToAllSections"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.applyToAllSections = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.applyToAllSections = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("claimStatus"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.claimStatus==null)
                        {
                            this.claimStatus = new ArrayList< ClaimStatusCreateUpdate>();
                        }
                        java.lang.Object j =obj;
                        ClaimStatusCreateUpdate j1= (ClaimStatusCreateUpdate)__envelope.get(j,ClaimStatusCreateUpdate.class,false);
                        this.claimStatus.add(j1);
                   
        
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
            return this.applyToAllSections!=null?this.applyToAllSections:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.claimStatus.size())
        {
            return this.claimStatus.get(propertyIndex-(1));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+claimStatus.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "applyToAllSections";
            info.namespace= "";
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.claimStatus.size())
        {
            info.type = ClaimStatusCreateUpdate.class;
            info.name = "claimStatus";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

