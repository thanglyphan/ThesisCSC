package SicsWsPcAccountingEntryPoint;

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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class BusinessIPRConditionEarningMethod extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public Integer bookingYearFrom=0;
    
	/**
	* SubclassNumber: 10.
	*                       Booking Period From
	*/
    public SicsReferenceDataReference bookingPeriodFrom;
    
    public Integer bookingYearTo=0;
    
	/**
	* SubclassNumber: 10.
	*                       Booking Period To
	*/
    public SicsReferenceDataReference bookingPeriodTo;
    
	/**
	* SubclassNumber: 3, 19 or 49.
	*                       Classification
	*/
    public ArrayList< SicsReferenceDataReference> refDataItem =new ArrayList<SicsReferenceDataReference >();
    
	/**
	* SubclassNumber: 1203. Mandatory when unearnedPremiumReserveCalculationOption is LP
	*                       Earning Period Type
	*/
    public SicsReferenceDataReference earningPeriodType;
    
	/**
	* SubclassNumber: 69. Mandatory when unearnedPremiumReserveCalculationOption is LP and Earning Period Type is 'Fixed' or 'Insured Period'
	*                       Earning Period Basis
	*/
    public SicsReferenceDataReference earningPeriodBasis;
    
    public ArrayList< BusinessIPRConditionEarningMethodSplit> split =new ArrayList<BusinessIPRConditionEarningMethodSplit >();

    public BusinessIPRConditionEarningMethod ()
    {
    }

    public BusinessIPRConditionEarningMethod (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("bookingYearFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bookingYearFrom = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.bookingYearFrom = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bookingPeriodFrom"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingPeriodFrom = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bookingYearTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bookingYearTo = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.bookingYearTo = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bookingPeriodTo"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingPeriodTo = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("refDataItem"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.refDataItem==null)
                        {
                            this.refDataItem = new ArrayList< SicsReferenceDataReference>();
                        }
                        java.lang.Object j =obj;
                        SicsReferenceDataReference j1= (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                        this.refDataItem.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("earningPeriodType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.earningPeriodType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("earningPeriodBasis"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.earningPeriodBasis = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("split"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.split==null)
                        {
                            this.split = new ArrayList< BusinessIPRConditionEarningMethodSplit>();
                        }
                        java.lang.Object j =obj;
                        BusinessIPRConditionEarningMethodSplit j1= (BusinessIPRConditionEarningMethodSplit)__envelope.get(j,BusinessIPRConditionEarningMethodSplit.class,false);
                        this.split.add(j1);
                   
        
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
            return bookingYearFrom;
        }
        if(propertyIndex==count+1)
        {
            return bookingPeriodFrom;
        }
        if(propertyIndex==count+2)
        {
            return bookingYearTo;
        }
        if(propertyIndex==count+3)
        {
            return bookingPeriodTo;
        }
        if(propertyIndex>=count+4 && propertyIndex < count+4+this.refDataItem.size())
        {
            return this.refDataItem.get(propertyIndex-(count+4));
        }
        if(propertyIndex==count+4+this.refDataItem.size())
        {
            return this.earningPeriodType!=null?this.earningPeriodType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5+this.refDataItem.size())
        {
            return this.earningPeriodBasis!=null?this.earningPeriodBasis:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+6+this.refDataItem.size() && propertyIndex < count+6+this.refDataItem.size()+this.split.size())
        {
            return this.split.get(propertyIndex-(count+6+this.refDataItem.size()));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6+refDataItem.size()+split.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "bookingYearFrom";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "bookingPeriodFrom";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "bookingYearTo";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "bookingPeriodTo";
            info.namespace= "";
        }
        if(propertyIndex>=count+4 && propertyIndex < count+4+this.refDataItem.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "refDataItem";
            info.namespace= "";
        }
        if(propertyIndex==count+4+this.refDataItem.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "earningPeriodType";
            info.namespace= "";
        }
        if(propertyIndex==count+5+this.refDataItem.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "earningPeriodBasis";
            info.namespace= "";
        }
        if(propertyIndex>=count+6+this.refDataItem.size() && propertyIndex < count+6+this.refDataItem.size()+this.split.size())
        {
            info.type = BusinessIPRConditionEarningMethodSplit.class;
            info.name = "split";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

