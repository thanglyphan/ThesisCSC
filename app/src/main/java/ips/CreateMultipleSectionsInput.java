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

public class CreateMultipleSectionsInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public SicsScopeOfCoverReference scopeOfCoverReference;
    
    public Integer amendmentNumber;
    
    public String prefix;
    
    public String suffix;
    
    public TypeClassificationList typeClassificationList;

    public CreateMultipleSectionsInput ()
    {
    }

    public CreateMultipleSectionsInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("scopeOfCoverReference"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.scopeOfCoverReference = (SicsScopeOfCoverReference)__envelope.get(j,SicsScopeOfCoverReference.class,false);
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
                if (info.name.equals("prefix"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.prefix = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.prefix = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("suffix"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.suffix = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.suffix = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("typeClassificationList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeClassificationList = (TypeClassificationList)__envelope.get(j,TypeClassificationList.class,false);
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
            return scopeOfCoverReference;
        }
        if(propertyIndex==1)
        {
            return this.amendmentNumber!=null?this.amendmentNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.prefix!=null?this.prefix:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.suffix!=null?this.suffix:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.typeClassificationList!=null?this.typeClassificationList:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsScopeOfCoverReference.class;
            info.name = "scopeOfCoverReference";
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "prefix";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "suffix";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = TypeClassificationList.class;
            info.name = "typeClassificationList";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

