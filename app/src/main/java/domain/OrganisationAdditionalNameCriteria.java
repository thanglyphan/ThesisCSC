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

public class OrganisationAdditionalNameCriteria extends AbstractCriteria implements KvmSerializable,java.io.Serializable
{

    
    public String fullName;
    
    public Boolean isFormerName;
    
    public String name;
    
    public Boolean isAlternateName;
    
    public String shortName;
    
    public Boolean isCurrentName;
    
    public Enums.BusinessStatuses selectedStatus;
    
    public Boolean isBaseCompany;
    
    public Boolean isLegalEntityCompany;
    
	/**
	* SubclassNumber: 23. SicsRefBusinessPartnerCategory
	*/
    public SicsReferenceDataReference typeOfPartner;

    public OrganisationAdditionalNameCriteria ()
    {
    }

    public OrganisationAdditionalNameCriteria (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("fullName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fullName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.fullName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isFormerName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isFormerName = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isFormerName = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("name"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.name = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.name = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isAlternateName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAlternateName = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAlternateName = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("shortName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.shortName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.shortName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isCurrentName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isCurrentName = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isCurrentName = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("selectedStatus"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.selectedStatus = Enums.BusinessStatuses.fromString(j.toString());
                            }
                        }
                        else if (obj instanceof Enums.BusinessStatuses){
                            this.selectedStatus = (Enums.BusinessStatuses)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isBaseCompany"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isBaseCompany = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isBaseCompany = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isLegalEntityCompany"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isLegalEntityCompany = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isLegalEntityCompany = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("typeOfPartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.typeOfPartner = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
            return this.fullName!=null?this.fullName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.isFormerName!=null?this.isFormerName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.name!=null?this.name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.isAlternateName!=null?this.isAlternateName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.shortName!=null?this.shortName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.isCurrentName!=null?this.isCurrentName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.selectedStatus!=null?this.selectedStatus.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.isBaseCompany!=null?this.isBaseCompany:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.isLegalEntityCompany!=null?this.isLegalEntityCompany:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.typeOfPartner!=null?this.typeOfPartner:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+10;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fullName";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isFormerName";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "name";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAlternateName";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "shortName";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isCurrentName";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "selectedStatus";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isBaseCompany";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isLegalEntityCompany";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "typeOfPartner";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

