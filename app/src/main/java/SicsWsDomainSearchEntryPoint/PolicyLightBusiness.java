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

public class PolicyLightBusiness extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public String identifier;
    
	/**
	* SubclassNumber: 01074. SicsRefExternalSystemName
	*/
    public SicsReferenceDataReference primarySystem;
    
    public SicsGroupReference riskUnitGroup;
    
    public String title;
    
    public String formerIdentifier;
    
    public InsuredPeriodOfPolicyLightList insuredPeriodOfPolicyLightList=new InsuredPeriodOfPolicyLightList();

    public PolicyLightBusiness ()
    {
    }

    public PolicyLightBusiness (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("identifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.identifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("primarySystem"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.primarySystem = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("riskUnitGroup"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.riskUnitGroup = (SicsGroupReference)__envelope.get(j,SicsGroupReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("title"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.title = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.title = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("formerIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.formerIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.formerIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriodOfPolicyLightList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.insuredPeriodOfPolicyLightList = new InsuredPeriodOfPolicyLightList(j,__envelope);
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
            return identifier;
        }
        if(propertyIndex==count+1)
        {
            return this.primarySystem!=null?this.primarySystem:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.riskUnitGroup!=null?this.riskUnitGroup:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.title!=null?this.title:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.formerIdentifier!=null?this.formerIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return insuredPeriodOfPolicyLightList;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifier";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "primarySystem";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsGroupReference.class;
            info.name = "riskUnitGroup";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "title";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "formerIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "insuredPeriodOfPolicyLightList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

