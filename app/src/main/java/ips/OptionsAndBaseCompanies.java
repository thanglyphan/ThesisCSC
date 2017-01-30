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

public class OptionsAndBaseCompanies extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 582. SicsRefClaimQueryType
	*/
    public SicsReferenceDataReference selectedQueryOption;
    
	/**
	* All , APH Only , Non APH.
	*/
    public Enums.SortOption sortOption;
    
	/**
	* Base Companies.
	*/
    public BaseCompanyList_1 selectedBaseCompanies;

    public OptionsAndBaseCompanies ()
    {
    }

    public OptionsAndBaseCompanies (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("selectedQueryOption"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.selectedQueryOption = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("sortOption"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sortOption = Enums.SortOption.fromString(j.toString());
                            }
                        }
                        else if (obj instanceof Enums.SortOption){
                            this.sortOption = (Enums.SortOption)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("selectedBaseCompanies"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.selectedBaseCompanies = new BaseCompanyList_1(j,__envelope);
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
            return this.selectedQueryOption!=null?this.selectedQueryOption:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.sortOption!=null?this.sortOption.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.selectedBaseCompanies!=null?this.selectedBaseCompanies:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "selectedQueryOption";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sortOption";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "selectedBaseCompanies";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

