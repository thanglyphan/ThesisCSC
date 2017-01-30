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

public class ElementSpecification extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public String elementType;
    
    public String name;
    
    public ArrayList< ElementSpecification> elementSpecification =new ArrayList<ElementSpecification >();

    public ElementSpecification ()
    {
    }

    public ElementSpecification (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("elementType"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.elementType = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.elementType = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("name"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.name = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.name = (String)obj;
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

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.elementType!=null?this.elementType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return name;
        }
        if(propertyIndex>=2 && propertyIndex < 2+this.elementSpecification.size())
        {
            return this.elementSpecification.get(propertyIndex-(2));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2+elementSpecification.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "elementType";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "name";
            info.namespace= "";
        }
        if(propertyIndex>=2 && propertyIndex < 2+this.elementSpecification.size())
        {
            info.type = ElementSpecification.class;
            info.name = "elementSpecification";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

