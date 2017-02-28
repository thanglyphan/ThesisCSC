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

public class ReverseEstimateUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Booking Year/Period column
	*/
    public SicsBookingYearPeriodReference bookingYearPeriod;
    
	/**
	* Legal Booking Year/Period column
	*/
    public SicsBookingYearPeriodReference bookingYearPeriod2;
    
	/**
	* Global Booking Year/Period column
	*/
    public SicsBookingYearPeriodReference bookingYearPeriod3;

    public ReverseEstimateUpdate ()
    {
    }

    public ReverseEstimateUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("bookingYearPeriod"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingYearPeriod = (SicsBookingYearPeriodReference)__envelope.get(j,SicsBookingYearPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bookingYearPeriod2"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingYearPeriod2 = (SicsBookingYearPeriodReference)__envelope.get(j,SicsBookingYearPeriodReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("bookingYearPeriod3"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.bookingYearPeriod3 = (SicsBookingYearPeriodReference)__envelope.get(j,SicsBookingYearPeriodReference.class,false);
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
            return this.bookingYearPeriod!=null?this.bookingYearPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.bookingYearPeriod2!=null?this.bookingYearPeriod2:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.bookingYearPeriod3!=null?this.bookingYearPeriod3:SoapPrimitive.NullSkip;
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
            info.type = SicsBookingYearPeriodReference.class;
            info.name = "bookingYearPeriod";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SicsBookingYearPeriodReference.class;
            info.name = "bookingYearPeriod2";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = SicsBookingYearPeriodReference.class;
            info.name = "bookingYearPeriod3";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

