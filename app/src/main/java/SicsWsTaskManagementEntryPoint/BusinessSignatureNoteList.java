package SicsWsTaskManagementEntryPoint;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 30/01/2017
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class BusinessSignatureNoteList extends Vector< BusinessSignatureNoteCreateUpdate> implements KvmSerializable,java.io.Serializable
{
    
    public BusinessSignatureNoteList(){}
    
    public BusinessSignatureNoteList(java.lang.Object inObj,ExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            java.lang.Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                BusinessSignatureNoteCreateUpdate j1= (BusinessSignatureNoteCreateUpdate)__envelope.get(j,BusinessSignatureNoteCreateUpdate.class,false);
                add(j1);
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
        info.name = "businessSignatureNote";
        info.type = BusinessSignatureNoteCreateUpdate.class;
    	info.namespace= "";
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

    
}