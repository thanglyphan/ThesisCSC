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

public class Input extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* The service only accept SQL SELECT statements. 
	*             Use this element if you want to specify the search as an SQL SELECT statement.  
	*               If this element is used the inputCriteria element and outputCriteria element should not be included in the message.
	*/
    public SQLSpecification inputSQLSpecification;
    
	/**
	* Use this element if you want to specify the search as an alternative to an explicit SQL statement.                             
	*            This element should not be used if you use the inputSQLSpecification. If this element is used you also need to specify the outputCriteria element.
	*/
    public Criteria inputCriteria;
    
	/**
	* Use this element in conjuction with the inputCriteria element and is used to specify the data to return to the client.                            
	*            This element should not be used if you use the inputSQLSpecification. If this elemnt is used you must specify the inputCriteria element.
	*/
    public DbResultDescription outputCriteria;

    public Input ()
    {
    }

    public Input (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("inputSQLSpecification"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.inputSQLSpecification = (SQLSpecification)__envelope.get(j,SQLSpecification.class,false);
                    }
                    continue;
                }
                if (info.name.equals("inputCriteria"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.inputCriteria = (Criteria)__envelope.get(j,Criteria.class,false);
                    }
                    continue;
                }
                if (info.name.equals("outputCriteria"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.outputCriteria = new DbResultDescription(j,__envelope);
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
            return this.inputSQLSpecification!=null?this.inputSQLSpecification:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.inputCriteria!=null?this.inputCriteria:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.outputCriteria!=null?this.outputCriteria:SoapPrimitive.NullSkip;
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
            info.type = SQLSpecification.class;
            info.name = "inputSQLSpecification";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = Criteria.class;
            info.name = "inputCriteria";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "outputCriteria";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

