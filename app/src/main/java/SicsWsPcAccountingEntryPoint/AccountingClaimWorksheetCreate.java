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

public class AccountingClaimWorksheetCreate extends AccountingWorksheetCreate implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Letter Of Credit
	*                          SubclassNumber: 246. SicsRefEdiPaymentType.
	*                          This element is used for claim worksheet only. NOT SUPPORTED BY FGU CLAIM WORKSHEET
	*/
    public SicsReferenceDataReference letterOfCredit;
    
	/**
	* Claim Adjustments Affect FGU Distribution
	*/
    public Boolean isReflectedInFGUDistribution;
    
	/**
	* Automatic Reinstatement Calculation Menu option
	*/
    public Boolean performReinstatementCalculation;
    
	/**
	* Allocate Occurrence Year
	*/
    public Boolean allocateOccYear;

    public AccountingClaimWorksheetCreate ()
    {
    }

    public AccountingClaimWorksheetCreate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("letterOfCredit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.letterOfCredit = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("isReflectedInFGUDistribution"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isReflectedInFGUDistribution = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isReflectedInFGUDistribution = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("performReinstatementCalculation"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.performReinstatementCalculation = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.performReinstatementCalculation = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("allocateOccYear"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.allocateOccYear = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.allocateOccYear = (Boolean)obj;
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
            return this.letterOfCredit!=null?this.letterOfCredit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.isReflectedInFGUDistribution!=null?this.isReflectedInFGUDistribution:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.performReinstatementCalculation!=null?this.performReinstatementCalculation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.allocateOccYear!=null?this.allocateOccYear:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "letterOfCredit";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isReflectedInFGUDistribution";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "performReinstatementCalculation";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "allocateOccYear";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

