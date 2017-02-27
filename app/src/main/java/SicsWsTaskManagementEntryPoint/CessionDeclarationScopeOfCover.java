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

public class CessionDeclarationScopeOfCover extends AbstractCessionDeclarationScopeOfCover implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SicsRefInsurableObjectClassification reference data subclass 535
	*/
    public SicsReferenceDataReference goodsClassification;
    
	/**
	* SicsRefSubTypeOfGoods1 reference data subclass 544
	*/
    public SicsReferenceDataReference subTypeOfGoods1;
    
	/**
	* SicsRefSubTypeOfGoods2 reference data subclass 545
	*/
    public SicsReferenceDataReference subTypeOfGoods2;
    
	/**
	* SicsRefSubTypeOfGoods3 reference data subclass 546
	*/
    public SicsReferenceDataReference subTypeOfGoods3;
    
	/**
	* SicsRefTypeOfGoods reference data subclass 543
	*/
    public SicsReferenceDataReference typeOfGoods;
    
    public String externalIdentifier;

    public CessionDeclarationScopeOfCover ()
    {
    }

    public CessionDeclarationScopeOfCover (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("goodsClassification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.goodsClassification = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("subTypeOfGoods1"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.subTypeOfGoods1 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("subTypeOfGoods2"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.subTypeOfGoods2 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("subTypeOfGoods3"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.subTypeOfGoods3 = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("typeOfGoods"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfGoods = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("externalIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.externalIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.externalIdentifier = (String)obj;
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
            return this.goodsClassification!=null?this.goodsClassification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.subTypeOfGoods1!=null?this.subTypeOfGoods1:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.subTypeOfGoods2!=null?this.subTypeOfGoods2:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.subTypeOfGoods3!=null?this.subTypeOfGoods3:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.typeOfGoods!=null?this.typeOfGoods:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.externalIdentifier!=null?this.externalIdentifier:SoapPrimitive.NullSkip;
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
            info.type = SicsReferenceDataReference.class;
            info.name = "goodsClassification";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "subTypeOfGoods1";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "subTypeOfGoods2";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "subTypeOfGoods3";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfGoods";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "externalIdentifier";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

