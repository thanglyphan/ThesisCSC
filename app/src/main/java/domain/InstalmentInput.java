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

public class InstalmentInput extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
	/**
	* XXXXXX
	*                (Deposit)
	*/
    public Deposit deposit;
    
	/**
	* "Split Deposits"
	*                Split Total Amount
	*/
    public SplitTotalAmount splitTotalAmount;
    
	/**
	* V3.1: Instalment Condition tab under Instalments tab
	*                   Instalment Condition
	*/
    public InstalmentSpecification instalmentCondition;
    
	/**
	* V3.0: NB! Element should only be used for backward compatibility.
	*                   v3.0: Proportional Split Instalments
	*/
    public ArrayList< InstalmentConditionDetail> proportionalSplitInstalmentSpecification =new ArrayList<InstalmentConditionDetail >();
    
	/**
	* Works as the menu choice Proportional Split Instalment, ie will only ask for instalment condition input if instalment condition does not exists.
	*                Proportional Split Instalments menu choice
	*/
    public Boolean proportionalSplitInstalment;
    
	/**
	* Additional\Return Premium Instalment From Amendmend menu choice
	*/
    public InstalmentSpecification additionalReturnPremium;
    
	/**
	* Used by the "update" Condition Web Service: set to "true" if all instalments should be removed.
	*                Remove All
	*/
    public Boolean removeAllInstalments;
    
	/**
	* Used to specify instalments which are to be added or removed on an individual basis
	*/
    public ArrayList< Instalment> instalment =new ArrayList<Instalment >();

    public InstalmentInput ()
    {
    }

    public InstalmentInput (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("deposit"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deposit = (Deposit)__envelope.get(j,Deposit.class,false);
                    }
                    continue;
                }
                if (info.name.equals("splitTotalAmount"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.splitTotalAmount = (SplitTotalAmount)__envelope.get(j,SplitTotalAmount.class,false);
                    }
                    continue;
                }
                if (info.name.equals("instalmentCondition"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.instalmentCondition = (InstalmentSpecification)__envelope.get(j,InstalmentSpecification.class,false);
                    }
                    continue;
                }
                if (info.name.equals("proportionalSplitInstalmentSpecification"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.proportionalSplitInstalmentSpecification==null)
                        {
                            this.proportionalSplitInstalmentSpecification = new ArrayList< InstalmentConditionDetail>();
                        }
                        java.lang.Object j =obj;
                        InstalmentConditionDetail j1= (InstalmentConditionDetail)__envelope.get(j,InstalmentConditionDetail.class,false);
                        this.proportionalSplitInstalmentSpecification.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("proportionalSplitInstalment"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.proportionalSplitInstalment = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.proportionalSplitInstalment = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("additionalReturnPremium"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.additionalReturnPremium = (InstalmentSpecification)__envelope.get(j,InstalmentSpecification.class,false);
                    }
                    continue;
                }
                if (info.name.equals("removeAllInstalments"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.removeAllInstalments = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.removeAllInstalments = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("instalment"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.instalment==null)
                        {
                            this.instalment = new ArrayList< Instalment>();
                        }
                        java.lang.Object j =obj;
                        Instalment j1= (Instalment)__envelope.get(j,Instalment.class,false);
                        this.instalment.add(j1);
                   
        
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
            return this.deposit!=null?this.deposit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.splitTotalAmount!=null?this.splitTotalAmount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.instalmentCondition!=null?this.instalmentCondition:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=3 && propertyIndex < 3+this.proportionalSplitInstalmentSpecification.size())
        {
            return this.proportionalSplitInstalmentSpecification.get(propertyIndex-(3));
        }
        if(propertyIndex==3+this.proportionalSplitInstalmentSpecification.size())
        {
            return this.proportionalSplitInstalment!=null?this.proportionalSplitInstalment:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4+this.proportionalSplitInstalmentSpecification.size())
        {
            return this.additionalReturnPremium!=null?this.additionalReturnPremium:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5+this.proportionalSplitInstalmentSpecification.size())
        {
            return this.removeAllInstalments!=null?this.removeAllInstalments:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=6+this.proportionalSplitInstalmentSpecification.size() && propertyIndex < 6+this.proportionalSplitInstalmentSpecification.size()+this.instalment.size())
        {
            return this.instalment.get(propertyIndex-(6+this.proportionalSplitInstalmentSpecification.size()));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 6+proportionalSplitInstalmentSpecification.size()+instalment.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = Deposit.class;
            info.name = "deposit";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = SplitTotalAmount.class;
            info.name = "splitTotalAmount";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = InstalmentSpecification.class;
            info.name = "instalmentCondition";
            info.namespace= "";
        }
        if(propertyIndex>=3 && propertyIndex < 3+this.proportionalSplitInstalmentSpecification.size())
        {
            info.type = InstalmentConditionDetail.class;
            info.name = "proportionalSplitInstalmentSpecification";
            info.namespace= "";
        }
        if(propertyIndex==3+this.proportionalSplitInstalmentSpecification.size())
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "proportionalSplitInstalment";
            info.namespace= "";
        }
        if(propertyIndex==4+this.proportionalSplitInstalmentSpecification.size())
        {
            info.type = InstalmentSpecification.class;
            info.name = "additionalReturnPremium";
            info.namespace= "";
        }
        if(propertyIndex==5+this.proportionalSplitInstalmentSpecification.size())
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "removeAllInstalments";
            info.namespace= "";
        }
        if(propertyIndex>=6+this.proportionalSplitInstalmentSpecification.size() && propertyIndex < 6+this.proportionalSplitInstalmentSpecification.size()+this.instalment.size())
        {
            info.type = Instalment.class;
            info.name = "instalment";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

