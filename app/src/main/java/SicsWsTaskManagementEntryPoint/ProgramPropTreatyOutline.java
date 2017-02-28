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

public class ProgramPropTreatyOutline extends ProgramTreatyOutline implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Proportional Limit
	*/
    public Integer limit;
    
    public Integer surplusNumber;
    
	/**
	* Underlying Top Limit
	*/
    public Integer retention;
    
    public Integer liabilityOneLine;
    
    public Integer lines;
    
	/**
	* QS Percent
	*/
    public Integer quotaShare;

    public ProgramPropTreatyOutline ()
    {
    }

    public ProgramPropTreatyOutline (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("limit"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.limit = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.limit = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("surplusNumber"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.surplusNumber = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.surplusNumber = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("retention"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.retention = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.retention = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("liabilityOneLine"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.liabilityOneLine = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.liabilityOneLine = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lines"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lines = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.lines = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("quotaShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.quotaShare = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.quotaShare = (Integer)obj;
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
            return this.limit!=null?this.limit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.surplusNumber!=null?this.surplusNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.retention!=null?this.retention:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.liabilityOneLine!=null?this.liabilityOneLine:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.lines!=null?this.lines:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.quotaShare!=null?this.quotaShare:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "limit";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "surplusNumber";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "retention";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "liabilityOneLine";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "lines";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "quotaShare";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
