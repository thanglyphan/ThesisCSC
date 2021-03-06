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
import java.math.BigDecimal;

public class PolicyAccountingDetail extends AbstractPolicyAccountingDetail implements KvmSerializable,java.io.Serializable
{

    
    public SicsScopeOfCoverReference policySection;
    
    public java.util.Date effectivePeriodFromDate;
    
    public SicsAccountingEntryCodeReference deduction1EntryCode;
    
    public BigDecimal deduction1;
    
    public SicsAccountingEntryCodeReference deduction2EntryCode;
    
    public BigDecimal deduction2;
    
    public SicsAccountingEntryCodeReference deduction3EntryCode;
    
    public BigDecimal deduction3;
    
    public SicsAccountingEntryCodeReference deduction4EntryCode;
    
    public BigDecimal deduction4;
    
    public SicsAccountingEntryCodeReference deduction5EntryCode;
    
    public BigDecimal deduction5;
    
    public SicsAccountingEntryCodeReference premium1EntryCode;
    
    public BigDecimal premium1;
    
    public SicsAccountingEntryCodeReference premium2EntryCode;
    
    public BigDecimal premium2;
    
    public SicsAccountingEntryCodeReference premium3EntryCode;
    
    public BigDecimal premium3;
    
    public SicsAccountingEntryCodeReference premium4EntryCode;
    
    public BigDecimal premium4;
    
    public SicsAccountingEntryCodeReference premium5EntryCode;
    
    public BigDecimal premium5;
    
    public SicsAccountingEntryCodeReference tax1EntryCode;
    
    public BigDecimal tax1;
    
    public SicsAccountingEntryCodeReference tax2EntryCode;
    
    public BigDecimal tax2;
    
    public SicsAccountingEntryCodeReference tax3EntryCode;
    
    public BigDecimal tax3;

    public PolicyAccountingDetail ()
    {
    }

    public PolicyAccountingDetail (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("policySection"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.policySection = (SicsScopeOfCoverReference)__envelope.get(j,SicsScopeOfCoverReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("effectivePeriodFromDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.effectivePeriodFromDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.effectivePeriodFromDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deduction1EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deduction1EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("deduction1"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deduction1 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.deduction1 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deduction2EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deduction2EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("deduction2"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deduction2 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.deduction2 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deduction3EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deduction3EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("deduction3"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deduction3 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.deduction3 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deduction4EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deduction4EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("deduction4"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deduction4 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.deduction4 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deduction5EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.deduction5EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("deduction5"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deduction5 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.deduction5 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premium1EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premium1EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("premium1"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premium1 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premium1 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premium2EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premium2EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("premium2"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premium2 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premium2 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premium3EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premium3EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("premium3"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premium3 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premium3 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premium4EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premium4EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("premium4"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premium4 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premium4 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("premium5EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.premium5EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("premium5"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.premium5 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.premium5 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("tax1EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.tax1EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("tax1"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.tax1 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.tax1 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("tax2EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.tax2EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("tax2"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.tax2 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.tax2 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("tax3EntryCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.tax3EntryCode = (SicsAccountingEntryCodeReference)__envelope.get(j,SicsAccountingEntryCodeReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("tax3"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.tax3 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.tax3 = (BigDecimal)obj;
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
            return policySection;
        }
        if(propertyIndex==count+1)
        {
            return this.effectivePeriodFromDate!=null?Helper.getDateFormat().format(this.effectivePeriodFromDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.deduction1EntryCode!=null?this.deduction1EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.deduction1!=null?this.deduction1.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.deduction2EntryCode!=null?this.deduction2EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.deduction2!=null?this.deduction2.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.deduction3EntryCode!=null?this.deduction3EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.deduction3!=null?this.deduction3.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.deduction4EntryCode!=null?this.deduction4EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.deduction4!=null?this.deduction4.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.deduction5EntryCode!=null?this.deduction5EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.deduction5!=null?this.deduction5.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.premium1EntryCode!=null?this.premium1EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.premium1!=null?this.premium1.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.premium2EntryCode!=null?this.premium2EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.premium2!=null?this.premium2.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.premium3EntryCode!=null?this.premium3EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.premium3!=null?this.premium3.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.premium4EntryCode!=null?this.premium4EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.premium4!=null?this.premium4.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.premium5EntryCode!=null?this.premium5EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.premium5!=null?this.premium5.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+22)
        {
            return this.tax1EntryCode!=null?this.tax1EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+23)
        {
            return this.tax1!=null?this.tax1.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+24)
        {
            return this.tax2EntryCode!=null?this.tax2EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+25)
        {
            return this.tax2!=null?this.tax2.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+26)
        {
            return this.tax3EntryCode!=null?this.tax3EntryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+27)
        {
            return this.tax3!=null?this.tax3.toString():SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+28;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsScopeOfCoverReference.class;
            info.name = "policySection";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "effectivePeriodFromDate";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "deduction1EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "deduction1";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "deduction2EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "deduction2";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "deduction3EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "deduction3";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "deduction4EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "deduction4";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "deduction5EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "deduction5";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "premium1EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premium1";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "premium2EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premium2";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "premium3EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premium3";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "premium4EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premium4";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "premium5EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "premium5";
            info.namespace= "";
        }
        if(propertyIndex==count+22)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "tax1EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+23)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "tax1";
            info.namespace= "";
        }
        if(propertyIndex==count+24)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "tax2EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+25)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "tax2";
            info.namespace= "";
        }
        if(propertyIndex==count+26)
        {
            info.type = SicsAccountingEntryCodeReference.class;
            info.name = "tax3EntryCode";
            info.namespace= "";
        }
        if(propertyIndex==count+27)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "tax3";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

