package SicsWsDomainSearchEntryPoint;

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

public class ModelSectionClassificationList extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Set this element to true if you want to replace the current set of 
	*               classifications with the new list. Defaults to false if not present.
	*/
    public Boolean replaceAll;
    
	/**
	* GUI: Type and one of the Selected values
	*               Type and one of the Selected values
	*/
    public ArrayList< SicsReferenceDataReference> classification =new ArrayList<SicsReferenceDataReference >();

    public ModelSectionClassificationList ()
    {
    }

    public ModelSectionClassificationList (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("replaceAll"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.replaceAll = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.replaceAll = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("classification"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.classification==null)
                        {
                            this.classification = new ArrayList< SicsReferenceDataReference>();
                        }
                        java.lang.Object j =obj;
                        SicsReferenceDataReference j1= (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                        this.classification.add(j1);
                   
        
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
            return this.replaceAll!=null?this.replaceAll:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.classification.size())
        {
            return this.classification.get(propertyIndex-(1));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+classification.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "replaceAll";
            info.namespace= "";
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.classification.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "classification";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

