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

public class ClaimToInsuredClaimantRelationListUpdate extends ListUpdate implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< ClaimToInsuredClaimantRelationUpdateElement> insuredClaimantUpdate =new ArrayList<ClaimToInsuredClaimantRelationUpdateElement >();

    public ClaimToInsuredClaimantRelationListUpdate ()
    {
    }

    public ClaimToInsuredClaimantRelationListUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("insuredClaimantUpdate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.insuredClaimantUpdate==null)
                        {
                            this.insuredClaimantUpdate = new ArrayList< ClaimToInsuredClaimantRelationUpdateElement>();
                        }
                        java.lang.Object j =obj;
                        ClaimToInsuredClaimantRelationUpdateElement j1= (ClaimToInsuredClaimantRelationUpdateElement)__envelope.get(j,ClaimToInsuredClaimantRelationUpdateElement.class,false);
                        this.insuredClaimantUpdate.add(j1);
                   
        
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.insuredClaimantUpdate.size())
        {
            return this.insuredClaimantUpdate.get(propertyIndex-(count+0));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+0+insuredClaimantUpdate.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.insuredClaimantUpdate.size())
        {
            info.type = ClaimToInsuredClaimantRelationUpdateElement.class;
            info.name = "insuredClaimantUpdate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

