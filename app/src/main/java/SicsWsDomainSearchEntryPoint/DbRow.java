package SicsWsDomainSearchEntryPoint;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 29/01/2017
//
//---------------------------------------------------



import android.util.Log;

import org.ksoap2.serialization.*;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Hashtable;

import thesiscsc.thesiscsc.model.User;


public class DbRow extends Vector< String> implements KvmSerializable,java.io.Serializable
{
    String value;

    public DbRow(){}

    public DbRow(java.lang.Object inObj,ExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;

        ArrayList names = new ArrayList<User>();

        value = inObj.toString();

        Log.d("DBROWS", inObj.toString());

        /*
        SoapObject soapObject=(String)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            java.lang.Object obj = soapObject.getProperty(i0);
            Log.d("DBROW", obj.toString());
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                String j1= j.toString();
                add(j1);
            }
        }
        */
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
        info.name = "value";
        info.type = PropertyInfo.STRING_CLASS;
        info.namespace= "";
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

    @Override
    public String toString(){
        return value;
    }

}