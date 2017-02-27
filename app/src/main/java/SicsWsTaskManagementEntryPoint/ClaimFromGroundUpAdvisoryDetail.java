package SicsWsTaskManagementEntryPoint;

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
import java.math.BigDecimal;

public class ClaimFromGroundUpAdvisoryDetail extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public BigDecimal incurred;
    
    public BigDecimal totalPaidLossAndAnnuity;
    
    public BigDecimal totalReservesLossAndAnnuity;
    
    public SicsCurrencyReference currency;
    
    public BigDecimal paid;
    
    public BigDecimal paidExpenses;
    
    public BigDecimal paidInterests;
    
    public BigDecimal reserves;
    
    public BigDecimal reserveExpenses;
    
    public BigDecimal reserveInterests;
    
    public BigDecimal paidAnnuity;
    
    public BigDecimal reservesAnnuity;
    
    public BigDecimal additionalLossReserve;
    
    public BigDecimal additionalLossReserveAdjustedExpense;

    public ClaimFromGroundUpAdvisoryDetail ()
    {
    }

    public ClaimFromGroundUpAdvisoryDetail (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("incurred"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.incurred = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.incurred = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("totalPaidLossAndAnnuity"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.totalPaidLossAndAnnuity = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.totalPaidLossAndAnnuity = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("totalReservesLossAndAnnuity"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.totalReservesLossAndAnnuity = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.totalReservesLossAndAnnuity = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("currency"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.currency = (SicsCurrencyReference)__envelope.get(j,SicsCurrencyReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paid"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.paid = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.paid = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("paidExpenses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.paidExpenses = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.paidExpenses = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("paidInterests"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.paidInterests = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.paidInterests = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reserves"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reserves = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.reserves = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reserveExpenses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reserveExpenses = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.reserveExpenses = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reserveInterests"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reserveInterests = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.reserveInterests = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("paidAnnuity"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.paidAnnuity = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.paidAnnuity = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reservesAnnuity"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reservesAnnuity = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.reservesAnnuity = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("additionalLossReserve"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.additionalLossReserve = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.additionalLossReserve = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("additionalLossReserveAdjustedExpense"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.additionalLossReserveAdjustedExpense = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.additionalLossReserveAdjustedExpense = (BigDecimal)obj;
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
        if(propertyIndex==0)
        {
            return this.incurred!=null?this.incurred.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.totalPaidLossAndAnnuity!=null?this.totalPaidLossAndAnnuity.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.totalReservesLossAndAnnuity!=null?this.totalReservesLossAndAnnuity.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.currency!=null?this.currency:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.paid!=null?this.paid.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.paidExpenses!=null?this.paidExpenses.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.paidInterests!=null?this.paidInterests.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.reserves!=null?this.reserves.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.reserveExpenses!=null?this.reserveExpenses.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.reserveInterests!=null?this.reserveInterests.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.paidAnnuity!=null?this.paidAnnuity.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.reservesAnnuity!=null?this.reservesAnnuity.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.additionalLossReserve!=null?this.additionalLossReserve.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.additionalLossReserveAdjustedExpense!=null?this.additionalLossReserveAdjustedExpense.toString():SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 14;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "incurred";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "totalPaidLossAndAnnuity";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "totalReservesLossAndAnnuity";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsCurrencyReference.class;
            info.name = "currency";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paid";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paidExpenses";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paidInterests";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reserves";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reserveExpenses";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reserveInterests";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "paidAnnuity";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reservesAnnuity";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "additionalLossReserve";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "additionalLossReserveAdjustedExpense";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

