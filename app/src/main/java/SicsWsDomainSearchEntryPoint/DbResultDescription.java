package SicsWsDomainSearchEntryPoint;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 29/01/2017
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class DbResultDescription extends Vector< String> implements KvmSerializable,java.io.Serializable,HasAttributes
{
    
    public DbResultDescription(){}
    
    public DbResultDescription(java.lang.Object inObj,ExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        if(inObj instanceof Vector)
        {
            Vector list=(Vector)inObj;
            for (int i0=0;i0< list.size();i0++)
            {
                java.lang.Object j = list.get(i0);
                if (j!=null )
                {
                    String j1= j.toString();
                    add(j1);
                }
            }
        }
        else
        {
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            java.lang.Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                String j1= j.toString();
                add(j1);
            }
        }
        }
}
    
    @Override
    public java.lang.Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "string";
        info.type = PropertyInfo.STRING_CLASS;
    	info.namespace= "http://www.w3.org/2001/XMLSchema";
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

    @Override
    public int getAttributeCount() {
        return 4;
    }

    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if(index==0)
        {
            info.name = "type";
            info.namespace= "http://www.w3.org/2001/XMLSchema-instance";
            info.setValue("xx2:DbResultDescription");
        }
        if(index==1)
        {
            info.name = "arrayType";
            info.namespace= "http://schemas.xmlsoap.org/soap/encoding/";
            info.setValue("xx1:string[]");
        }
        if(index==2)
        {
            info.name = "xmlns:xx1";
            info.namespace= "";
            info.setValue("http://www.w3.org/2001/XMLSchema");
        }
        if(index==3)
        {
            info.name = "xmlns:xx2";
            info.namespace= "";
            info.setValue("http://www.SicsNt.com/DomainSearch");
        }
    }

    @Override
    public void getAttribute(int i, AttributeInfo attributeInfo) {

    }

    @Override
    public void setAttribute(AttributeInfo attributeInfo) {

    }
    
}