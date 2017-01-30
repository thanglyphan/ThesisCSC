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

public class OCCAndRPClosureSet extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public Integer earlyClosureYear;
    
    public SicsReferenceDataReference earlyClosurePeriod;
    
    public ArrayList< SicsBusinessReference> closureSetComponent =new ArrayList<SicsBusinessReference >();

    public OCCAndRPClosureSet ()
    {
    }

    public OCCAndRPClosureSet (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("earlyClosureYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.earlyClosureYear = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.earlyClosureYear = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("earlyClosurePeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.earlyClosurePeriod = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("closureSetComponent"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.closureSetComponent==null)
                        {
                            this.closureSetComponent = new ArrayList< SicsBusinessReference>();
                        }
                        java.lang.Object j =obj;
                        SicsBusinessReference j1= (SicsBusinessReference)__envelope.get(j,SicsBusinessReference.class,false);
                        this.closureSetComponent.add(j1);
                   
        
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
            return this.earlyClosureYear!=null?this.earlyClosureYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.earlyClosurePeriod!=null?this.earlyClosurePeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+2 && propertyIndex < count+2+this.closureSetComponent.size())
        {
            return this.closureSetComponent.get(propertyIndex-(count+2));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2+closureSetComponent.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "earlyClosureYear";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "earlyClosurePeriod";
            info.namespace= "";
        }
        if(propertyIndex>=count+2 && propertyIndex < count+2+this.closureSetComponent.size())
        {
            info.type = SicsBusinessReference.class;
            info.name = "closureSetComponent";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

