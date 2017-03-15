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

public class EdiInformation extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public BigDecimal bureauSignedLine;
    
    public BigDecimal bureauSlipOrder1;
    
    public BigDecimal bureauSlipOrder2;
    
    public Boolean hasNonStandardSlipOrder;
    
    public Boolean isEdiUpdateAllowed;
    
    public String uniqueMarketReference;
    
	/**
	* SubclassNumber: 1053. SicsRefEdiVnabOption
	*/
    public SicsReferenceDataReference vnabOption;
    
	/**
	* SubclassNumber: 1102. SicsRefEdiAccountingClassificationProcessingOption
	*/
    public SicsReferenceDataReference accClassificOption;

    public EdiInformation ()
    {
    }

    public EdiInformation (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("bureauSignedLine"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bureauSignedLine = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.bureauSignedLine = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bureauSlipOrder1"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bureauSlipOrder1 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.bureauSlipOrder1 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("bureauSlipOrder2"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.bureauSlipOrder2 = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.bureauSlipOrder2 = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("hasNonStandardSlipOrder"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.hasNonStandardSlipOrder = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.hasNonStandardSlipOrder = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isEdiUpdateAllowed"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isEdiUpdateAllowed = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isEdiUpdateAllowed = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("uniqueMarketReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.uniqueMarketReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.uniqueMarketReference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("vnabOption"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.vnabOption = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("accClassificOption"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accClassificOption = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
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
            return this.bureauSignedLine!=null?this.bureauSignedLine.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.bureauSlipOrder1!=null?this.bureauSlipOrder1.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.bureauSlipOrder2!=null?this.bureauSlipOrder2.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.hasNonStandardSlipOrder!=null?this.hasNonStandardSlipOrder:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.isEdiUpdateAllowed!=null?this.isEdiUpdateAllowed:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.uniqueMarketReference!=null?this.uniqueMarketReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return vnabOption;
        }
        if(propertyIndex==count+7)
        {
            return accClassificOption;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "bureauSignedLine";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "bureauSlipOrder1";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "bureauSlipOrder2";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "hasNonStandardSlipOrder";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isEdiUpdateAllowed";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "uniqueMarketReference";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "vnabOption";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accClassificOption";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

