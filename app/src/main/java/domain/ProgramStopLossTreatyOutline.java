package domain;

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

public class ProgramStopLossTreatyOutline extends ProgramTreatyOutline implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Layer
	*/
    public Integer layerNumber;
    
    public Integer cover;
    
    public Integer excess;

    public ProgramStopLossTreatyOutline ()
    {
    }

    public ProgramStopLossTreatyOutline (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("layerNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.layerNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.layerNumber = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("cover"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cover = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.cover = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("excess"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.excess = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.excess = (Integer)obj;
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
            return this.layerNumber!=null?this.layerNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.cover!=null?this.cover:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.excess!=null?this.excess:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "layerNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "cover";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "excess";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

