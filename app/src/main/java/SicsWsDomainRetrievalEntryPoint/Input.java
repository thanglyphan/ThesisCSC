package SicsWsDomainRetrievalEntryPoint;

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

public class Input extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public DomainObjectReference referenceObject;
    
    public Integer amendmentNumber;
    
    public Specification specification;

    public Input ()
    {
    }

    public Input (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("referenceObject"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.referenceObject = (DomainObjectReference)__envelope.get(j,DomainObjectReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("amendmentNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.amendmentNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.amendmentNumber = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("specification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.specification = (Specification)__envelope.get(j,Specification.class,false);
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
            return referenceObject;
        }
        if(propertyIndex==1)
        {
            return this.amendmentNumber!=null?this.amendmentNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return specification;
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
            info.type = DomainObjectReference.class;
            info.name = "referenceObject";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "amendmentNumber";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = Specification.class;
            info.name = "specification";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

