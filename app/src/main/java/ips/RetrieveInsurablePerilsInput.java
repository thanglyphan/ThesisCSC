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

public class RetrieveInsurablePerilsInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< SicsCountryReference> countries =new ArrayList<SicsCountryReference >();
    
    public ArrayList< SicsAreaGroupCountryReference> countryGroups =new ArrayList<SicsAreaGroupCountryReference >();

    public RetrieveInsurablePerilsInput ()
    {
    }

    public RetrieveInsurablePerilsInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("countries"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.countries==null)
                        {
                            this.countries = new ArrayList< SicsCountryReference>();
                        }
                        java.lang.Object j =obj;
                        SicsCountryReference j1= (SicsCountryReference)__envelope.get(j,SicsCountryReference.class,false);
                        this.countries.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("countryGroups"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.countryGroups==null)
                        {
                            this.countryGroups = new ArrayList< SicsAreaGroupCountryReference>();
                        }
                        java.lang.Object j =obj;
                        SicsAreaGroupCountryReference j1= (SicsAreaGroupCountryReference)__envelope.get(j,SicsAreaGroupCountryReference.class,false);
                        this.countryGroups.add(j1);
                   
        
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
        if(propertyIndex>=0 && propertyIndex < 0+this.countries.size())
        {
            return this.countries.get(propertyIndex-(0));
        }
        if(propertyIndex>=0+this.countries.size() && propertyIndex < 0+this.countries.size()+this.countryGroups.size())
        {
            return this.countryGroups.get(propertyIndex-(0+this.countries.size()));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 0+countries.size()+countryGroups.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex>=0 && propertyIndex < 0+this.countries.size())
        {
            info.type = SicsCountryReference.class;
            info.name = "countries";
            info.namespace= "";
        }
        if(propertyIndex>=0+this.countries.size() && propertyIndex < 0+this.countries.size()+this.countryGroups.size())
        {
            info.type = SicsAreaGroupCountryReference.class;
            info.name = "countryGroups";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

