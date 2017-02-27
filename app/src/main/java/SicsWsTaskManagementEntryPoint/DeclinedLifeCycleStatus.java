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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class DeclinedLifeCycleStatus extends LifeCycleStatus implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 106. SicsRefDeclinationReason.Use either refDecinationReason or refDeclinationReasons, but not both at the same time.
	*/
    public SicsReferenceDataReference refDeclinationReason;
    
	/**
	* SubclassNumber: 106. SicsRefDeclinationReason.Use either refDecinationReason or refDeclinationReasons, but not both at the same time.
	*/
    public ArrayList< SicsReferenceDataReference> refDeclinationReasons =new ArrayList<SicsReferenceDataReference >();
    
    public String declinationIdentifier;

    public DeclinedLifeCycleStatus ()
    {
    }

    public DeclinedLifeCycleStatus (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("refDeclinationReason"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.refDeclinationReason = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("refDeclinationReasons"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.refDeclinationReasons==null)
                        {
                            this.refDeclinationReasons = new ArrayList< SicsReferenceDataReference>();
                        }
                        java.lang.Object j =obj;
                        SicsReferenceDataReference j1= (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                        this.refDeclinationReasons.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("declinationIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.declinationIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.declinationIdentifier = (String)obj;
                        }
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
            return this.refDeclinationReason!=null?this.refDeclinationReason:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.refDeclinationReasons.size())
        {
            return this.refDeclinationReasons.get(propertyIndex-(count+1));
        }
        if(propertyIndex==count+1+this.refDeclinationReasons.size())
        {
            return this.declinationIdentifier!=null?this.declinationIdentifier:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2+refDeclinationReasons.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refDeclinationReason";
            info.namespace= "";
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.refDeclinationReasons.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refDeclinationReasons";
            info.namespace= "";
        }
        if(propertyIndex==count+1+this.refDeclinationReasons.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "declinationIdentifier";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

