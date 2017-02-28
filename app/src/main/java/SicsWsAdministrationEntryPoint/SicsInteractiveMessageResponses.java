package SicsWsAdministrationEntryPoint;

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

/**
* Define generic input data that can be provided on each call to SICS/Server
*/
public class SicsInteractiveMessageResponses extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Identifiers of messages that should be answered with Yes.
	*/
    public ArrayList< String> answerYes =new ArrayList<String >();
    
	/**
	* Identifiers of messages that should be answered with No.
	*/
    public ArrayList< String> answerNo =new ArrayList<String >();

    public SicsInteractiveMessageResponses ()
    {
    }

    public SicsInteractiveMessageResponses (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("answerYes"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.answerYes==null)
                        {
                            this.answerYes = new ArrayList< String>();
                        }
                        java.lang.Object j =obj;
                        String j1= j.toString();
                        this.answerYes.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("answerNo"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.answerNo==null)
                        {
                            this.answerNo = new ArrayList< String>();
                        }
                        java.lang.Object j =obj;
                        String j1= j.toString();
                        this.answerNo.add(j1);
                   
        
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
        if(propertyIndex>=0 && propertyIndex < 0+this.answerYes.size())
        {
            return this.answerYes.get(propertyIndex-(0));
        }
        if(propertyIndex>=0+this.answerYes.size() && propertyIndex < 0+this.answerYes.size()+this.answerNo.size())
        {
            return this.answerNo.get(propertyIndex-(0+this.answerYes.size()));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 0+answerYes.size()+answerNo.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex>=0 && propertyIndex < 0+this.answerYes.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "answerYes";
            info.namespace= "";
        }
        if(propertyIndex>=0+this.answerYes.size() && propertyIndex < 0+this.answerYes.size()+this.answerNo.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "answerNo";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

