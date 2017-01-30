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

/**
* Contains all the fields for reinstatement condition container.
*/
public class ReinstatementConditionContainer extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* true: currencyOfLoss. false: currencyOfPremium.
	*/
    public Boolean isCurrencyOfLoss;
    
	/**
	* SubclassNumber: 00160. SicsRefReinstatementCalculation
	*                             Calculation Rule
	*/
    public SicsReferenceDataReference reinstatementCalculation;
    
	/**
	* SicsRefReinstatementType
	*/
    public SicsReferenceDataReference reinstatementType;
    
	/**
	* SicsRefExchangeRateOption
	*/
    public SicsReferenceDataReference exchangeRateOption;
    
	/**
	* Relevant if exchangeRateOption is DATE.
	*/
    public java.util.Date fixedExchangeRateDate;
    
	/**
	* Relevant if exchangeRateOption is RATE.
	*/
    public ArrayList< ReinstatementFixedExchangeRate> fixedExchangeRate =new ArrayList<ReinstatementFixedExchangeRate >();
    
    public ArrayList< ReinstatementCondition> reinstatement =new ArrayList<ReinstatementCondition >();
    
    public ArrayList< UpdateReinstatementType> updateReinstatement =new ArrayList<UpdateReinstatementType >();
    
    public ArrayList< DeleteReinstatementType> deleteReinstatement =new ArrayList<DeleteReinstatementType >();
    
    public ArrayList< CreateReinstatement> createReinstatement =new ArrayList<CreateReinstatement >();
    
	/**
	* note tab for reinstatement condition from Sics/nt GUI.
	*/
    public String note;

    public ReinstatementConditionContainer ()
    {
    }

    public ReinstatementConditionContainer (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("isCurrencyOfLoss"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isCurrencyOfLoss = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isCurrencyOfLoss = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reinstatementCalculation"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reinstatementCalculation = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reinstatementType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reinstatementType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("exchangeRateOption"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.exchangeRateOption = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("fixedExchangeRateDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fixedExchangeRateDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.fixedExchangeRateDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("fixedExchangeRate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.fixedExchangeRate==null)
                        {
                            this.fixedExchangeRate = new ArrayList< ReinstatementFixedExchangeRate>();
                        }
                        java.lang.Object j =obj;
                        ReinstatementFixedExchangeRate j1= (ReinstatementFixedExchangeRate)__envelope.get(j,ReinstatementFixedExchangeRate.class,false);
                        this.fixedExchangeRate.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("reinstatement"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.reinstatement==null)
                        {
                            this.reinstatement = new ArrayList< ReinstatementCondition>();
                        }
                        java.lang.Object j =obj;
                        ReinstatementCondition j1= (ReinstatementCondition)__envelope.get(j,ReinstatementCondition.class,false);
                        this.reinstatement.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("updateReinstatement"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.updateReinstatement==null)
                        {
                            this.updateReinstatement = new ArrayList< UpdateReinstatementType>();
                        }
                        java.lang.Object j =obj;
                        UpdateReinstatementType j1= (UpdateReinstatementType)__envelope.get(j,UpdateReinstatementType.class,false);
                        this.updateReinstatement.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("deleteReinstatement"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.deleteReinstatement==null)
                        {
                            this.deleteReinstatement = new ArrayList< DeleteReinstatementType>();
                        }
                        java.lang.Object j =obj;
                        DeleteReinstatementType j1= (DeleteReinstatementType)__envelope.get(j,DeleteReinstatementType.class,false);
                        this.deleteReinstatement.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("createReinstatement"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.createReinstatement==null)
                        {
                            this.createReinstatement = new ArrayList< CreateReinstatement>();
                        }
                        java.lang.Object j =obj;
                        CreateReinstatement j1= (CreateReinstatement)__envelope.get(j,CreateReinstatement.class,false);
                        this.createReinstatement.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("note"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.note = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.note = (String)obj;
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
            return this.isCurrencyOfLoss!=null?this.isCurrencyOfLoss:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.reinstatementCalculation!=null?this.reinstatementCalculation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.reinstatementType!=null?this.reinstatementType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.exchangeRateOption!=null?this.exchangeRateOption:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.fixedExchangeRateDate!=null?Helper.getDateFormat().format(this.fixedExchangeRateDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+5 && propertyIndex < count+5+this.fixedExchangeRate.size())
        {
            return this.fixedExchangeRate.get(propertyIndex-(count+5));
        }
        if(propertyIndex>=count+5+this.fixedExchangeRate.size() && propertyIndex < count+5+this.fixedExchangeRate.size()+this.reinstatement.size())
        {
            return this.reinstatement.get(propertyIndex-(count+5+this.fixedExchangeRate.size()));
        }
        if(propertyIndex>=count+5+this.fixedExchangeRate.size()+this.reinstatement.size() && propertyIndex < count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size())
        {
            return this.updateReinstatement.get(propertyIndex-(count+5+this.fixedExchangeRate.size()+this.reinstatement.size()));
        }
        if(propertyIndex>=count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size() && propertyIndex < count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()+this.deleteReinstatement.size())
        {
            return this.deleteReinstatement.get(propertyIndex-(count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()));
        }
        if(propertyIndex>=count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()+this.deleteReinstatement.size() && propertyIndex < count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()+this.deleteReinstatement.size()+this.createReinstatement.size())
        {
            return this.createReinstatement.get(propertyIndex-(count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()+this.deleteReinstatement.size()));
        }
        if(propertyIndex==count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()+this.deleteReinstatement.size()+this.createReinstatement.size())
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6+fixedExchangeRate.size()+reinstatement.size()+updateReinstatement.size()+deleteReinstatement.size()+createReinstatement.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isCurrencyOfLoss";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "reinstatementCalculation";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "reinstatementType";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "exchangeRateOption";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fixedExchangeRateDate";
            info.namespace= "";
        }
        if(propertyIndex>=count+5 && propertyIndex < count+5+this.fixedExchangeRate.size())
        {
            info.type = ReinstatementFixedExchangeRate.class;
            info.name = "fixedExchangeRate";
            info.namespace= "";
        }
        if(propertyIndex>=count+5+this.fixedExchangeRate.size() && propertyIndex < count+5+this.fixedExchangeRate.size()+this.reinstatement.size())
        {
            info.type = ReinstatementCondition.class;
            info.name = "reinstatement";
            info.namespace= "";
        }
        if(propertyIndex>=count+5+this.fixedExchangeRate.size()+this.reinstatement.size() && propertyIndex < count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size())
        {
            info.type = UpdateReinstatementType.class;
            info.name = "updateReinstatement";
            info.namespace= "";
        }
        if(propertyIndex>=count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size() && propertyIndex < count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()+this.deleteReinstatement.size())
        {
            info.type = DeleteReinstatementType.class;
            info.name = "deleteReinstatement";
            info.namespace= "";
        }
        if(propertyIndex>=count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()+this.deleteReinstatement.size() && propertyIndex < count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()+this.deleteReinstatement.size()+this.createReinstatement.size())
        {
            info.type = CreateReinstatement.class;
            info.name = "createReinstatement";
            info.namespace= "";
        }
        if(propertyIndex==count+5+this.fixedExchangeRate.size()+this.reinstatement.size()+this.updateReinstatement.size()+this.deleteReinstatement.size()+this.createReinstatement.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

