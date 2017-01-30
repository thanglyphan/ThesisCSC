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

public class Specification extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public Boolean retrieveAll;
    
	/**
	* To be used if retrieveAll is set to false.
	*                Used to specify elements to be explicitly excluded from the result.
	*                If retreiveAll is set to true this element will be ignored.
	*/
    public ArrayList< ElementSpecification> elementSpecification =new ArrayList<ElementSpecification >();
    
	/**
	* To be used if retrieveAll is set to true.
	*                Used to specify elements to be explicitly excluded from the result.
	*                If retreiveAll is set to false this element will be ignored.
	*/
    public ArrayList< ElementSpecification> elementSpecificationsForExclusion =new ArrayList<ElementSpecification >();

    public Specification ()
    {
    }

    public Specification (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("retrieveAll"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.retrieveAll = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.retrieveAll = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("elementSpecification"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.elementSpecification==null)
                        {
                            this.elementSpecification = new ArrayList< ElementSpecification>();
                        }
                        java.lang.Object j =obj;
                        ElementSpecification j1= (ElementSpecification)__envelope.get(j,ElementSpecification.class,false);
                        this.elementSpecification.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("elementSpecificationsForExclusion"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.elementSpecificationsForExclusion==null)
                        {
                            this.elementSpecificationsForExclusion = new ArrayList< ElementSpecification>();
                        }
                        java.lang.Object j =obj;
                        ElementSpecification j1= (ElementSpecification)__envelope.get(j,ElementSpecification.class,false);
                        this.elementSpecificationsForExclusion.add(j1);
                   
        
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
            return this.retrieveAll!=null?this.retrieveAll:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.elementSpecification.size())
        {
            return this.elementSpecification.get(propertyIndex-(1));
        }
        if(propertyIndex>=1+this.elementSpecification.size() && propertyIndex < 1+this.elementSpecification.size()+this.elementSpecificationsForExclusion.size())
        {
            return this.elementSpecificationsForExclusion.get(propertyIndex-(1+this.elementSpecification.size()));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+elementSpecification.size()+elementSpecificationsForExclusion.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "retrieveAll";
            info.namespace= "";
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.elementSpecification.size())
        {
            info.type = ElementSpecification.class;
            info.name = "elementSpecification";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.elementSpecification.size() && propertyIndex < 1+this.elementSpecification.size()+this.elementSpecificationsForExclusion.size())
        {
            info.type = ElementSpecification.class;
            info.name = "elementSpecificationsForExclusion";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

