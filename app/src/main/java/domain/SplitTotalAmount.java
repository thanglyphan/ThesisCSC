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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;
import java.math.BigDecimal;

public class SplitTotalAmount extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* The percent of all the items must add up to exactly 100%
	*                XXXXXX
	*/
    public ArrayList< SplitTotalAmountItem> splitTotalAmountItem =new ArrayList<SplitTotalAmountItem >();
    
	/**
	* XXXXXX
	*                Total Amount
	*/
    public BigDecimal totalAmount;

    public SplitTotalAmount ()
    {
    }

    public SplitTotalAmount (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("splitTotalAmountItem"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.splitTotalAmountItem==null)
                        {
                            this.splitTotalAmountItem = new ArrayList< SplitTotalAmountItem>();
                        }
                        java.lang.Object j =obj;
                        SplitTotalAmountItem j1= (SplitTotalAmountItem)__envelope.get(j,SplitTotalAmountItem.class,false);
                        this.splitTotalAmountItem.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("totalAmount"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.totalAmount = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.totalAmount = (BigDecimal)obj;
                        }
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
        if(propertyIndex>=0 && propertyIndex < 0+this.splitTotalAmountItem.size())
        {
            return this.splitTotalAmountItem.get(propertyIndex-(0));
        }
        if(propertyIndex==0+this.splitTotalAmountItem.size())
        {
            return this.totalAmount!=null?this.totalAmount.toString():SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+splitTotalAmountItem.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex>=0 && propertyIndex < 0+this.splitTotalAmountItem.size())
        {
            info.type = SplitTotalAmountItem.class;
            info.name = "splitTotalAmountItem";
            info.namespace= "";
        }
        if(propertyIndex==0+this.splitTotalAmountItem.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "totalAmount";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
