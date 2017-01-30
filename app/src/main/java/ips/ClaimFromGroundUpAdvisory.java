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

public class ClaimFromGroundUpAdvisory extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public java.util.Date asOfDate;
    
    public ClaimFromGroundUpAdvisoryDetailReadList fguAdvisoryDetailList;
    
    public java.util.Date settlementDate;
    
    public SicsAccountingEntryCodeReference paidEntryCode;
    
    public SicsAccountingEntryCodeReference paidExpensesEntryCode;
    
    public SicsAccountingEntryCodeReference paidInterests;
    
    public SicsAccountingEntryCodeReference reservesEntryCode;
    
    public SicsAccountingEntryCodeReference reserveExpensesEntryCode;
    
    public SicsAccountingEntryCodeReference reserveInterests;
    
    public SicsAccountingEntryCodeReference paidAnnuityEntryCode;
    
    public SicsAccountingEntryCodeReference reservesAnnuityEntryCode;
    
    public SicsAccountingEntryCodeReference additionalLossReserveEntryCode;
    
    public SicsAccountingEntryCodeReference additionalLossReserveAdjustedExpenseEntryCode;

    public ClaimFromGroundUpAdvisory ()
    {
    }

    public ClaimFromGroundUpAdvisory (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("asOfDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.asOfDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.asOfDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("fguAdvisoryDetailList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.fguAdvisoryDetailList = new ClaimFromGroundUpAdvisoryDetailReadList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("settlementDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.settlementDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.settlementDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("paidEntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paidEntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paidExpensesEntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paidExpensesEntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paidInterests"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paidInterests = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reservesEntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reservesEntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reserveExpensesEntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reserveExpensesEntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reserveInterests"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reserveInterests = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paidAnnuityEntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paidAnnuityEntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reservesAnnuityEntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reservesAnnuityEntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("additionalLossReserveEntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.additionalLossReserveEntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("additionalLossReserveAdjustedExpenseEntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.additionalLossReserveAdjustedExpenseEntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
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
            return this.asOfDate!=null?Helper.getDateFormat().format(this.asOfDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.fguAdvisoryDetailList!=null?this.fguAdvisoryDetailList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.settlementDate!=null?Helper.getDateFormat().format(this.settlementDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.paidEntryCode!=null?this.paidEntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.paidExpensesEntryCode!=null?this.paidExpensesEntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.paidInterests!=null?this.paidInterests:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.reservesEntryCode!=null?this.reservesEntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.reserveExpensesEntryCode!=null?this.reserveExpensesEntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.reserveInterests!=null?this.reserveInterests:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.paidAnnuityEntryCode!=null?this.paidAnnuityEntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.reservesAnnuityEntryCode!=null?this.reservesAnnuityEntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.additionalLossReserveEntryCode!=null?this.additionalLossReserveEntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.additionalLossReserveAdjustedExpenseEntryCode!=null?this.additionalLossReserveAdjustedExpenseEntryCode:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 13;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "asOfDate";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "fguAdvisoryDetailList";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "settlementDate";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "paidEntryCode";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "paidExpensesEntryCode";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "paidInterests";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "reservesEntryCode";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "reserveExpensesEntryCode";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "reserveInterests";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "paidAnnuityEntryCode";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "reservesAnnuityEntryCode";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "additionalLossReserveEntryCode";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "additionalLossReserveAdjustedExpenseEntryCode";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

