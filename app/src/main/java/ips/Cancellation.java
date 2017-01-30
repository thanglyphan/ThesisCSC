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

public class Cancellation extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date cancellationDate;
    
	/**
	* SubclassNumber: 74. SicsRefCancellationReason
	*/
    public SicsReferenceDataReference cancellationReason;
    
	/**
	* SubclassNumber: 94. SicsRefCancellationStatus
	*/
    public SicsReferenceDataReference cancellationStatus;
    
    public java.util.Date closedDate;
    
	/**
	* SubclassNumber: 93. SicsRefCancellationConditions
	*/
    public ArrayList< SicsReferenceDataReference> conditionsAgreed =new ArrayList<SicsReferenceDataReference >();
    
	/**
	* SubclassNumber: 93. SicsRefCancellationConditions
	*/
    public ArrayList< SicsReferenceDataReference> conditionsNotAgreed =new ArrayList<SicsReferenceDataReference >();
    
	/**
	* This element is used only for retrieval
	*/
    public BusinessPartnerRelationshipReference businessPartnerRelationship;

    public Cancellation ()
    {
    }

    public Cancellation (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("cancellationDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.cancellationDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.cancellationDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("cancellationReason"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.cancellationReason = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("cancellationStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.cancellationStatus = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("closedDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.closedDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.closedDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("conditionsAgreed"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.conditionsAgreed==null)
                        {
                            this.conditionsAgreed = new ArrayList< SicsReferenceDataReference>();
                        }
                        java.lang.Object j =obj;
                        SicsReferenceDataReference j1= (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                        this.conditionsAgreed.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("conditionsNotAgreed"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.conditionsNotAgreed==null)
                        {
                            this.conditionsNotAgreed = new ArrayList< SicsReferenceDataReference>();
                        }
                        java.lang.Object j =obj;
                        SicsReferenceDataReference j1= (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                        this.conditionsNotAgreed.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerRelationship"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartnerRelationship = (BusinessPartnerRelationshipReference)__envelope.get(j,BusinessPartnerRelationshipReference.class,false);
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
            return this.cancellationDate!=null?Helper.getDateFormat().format(this.cancellationDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.cancellationReason!=null?this.cancellationReason:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.cancellationStatus!=null?this.cancellationStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.closedDate!=null?Helper.getDateFormat().format(this.closedDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+4 && propertyIndex < count+4+this.conditionsAgreed.size())
        {
            return this.conditionsAgreed.get(propertyIndex-(count+4));
        }
        if(propertyIndex>=count+4+this.conditionsAgreed.size() && propertyIndex < count+4+this.conditionsAgreed.size()+this.conditionsNotAgreed.size())
        {
            return this.conditionsNotAgreed.get(propertyIndex-(count+4+this.conditionsAgreed.size()));
        }
        if(propertyIndex==count+4+this.conditionsAgreed.size()+this.conditionsNotAgreed.size())
        {
            return this.businessPartnerRelationship!=null?this.businessPartnerRelationship:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+5+conditionsAgreed.size()+conditionsNotAgreed.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cancellationDate";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "cancellationReason";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "cancellationStatus";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "closedDate";
            info.namespace= "";
        }
        if(propertyIndex>=count+4 && propertyIndex < count+4+this.conditionsAgreed.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "conditionsAgreed";
            info.namespace= "";
        }
        if(propertyIndex>=count+4+this.conditionsAgreed.size() && propertyIndex < count+4+this.conditionsAgreed.size()+this.conditionsNotAgreed.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "conditionsNotAgreed";
            info.namespace= "";
        }
        if(propertyIndex==count+4+this.conditionsAgreed.size()+this.conditionsNotAgreed.size())
        {
            info.type = BusinessPartnerRelationshipReference.class;
            info.name = "businessPartnerRelationship";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

