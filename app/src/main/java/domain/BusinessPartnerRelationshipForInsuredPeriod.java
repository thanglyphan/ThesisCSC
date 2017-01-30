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
import java.math.BigDecimal;

public class BusinessPartnerRelationshipForInsuredPeriod extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Optional for relationship type Insured, Agent and Broker on type of business Policy Ceded. Mandatory for all other Business Partner Relationships.
	*/
    public SicsBusinessPartnerReference businessPartner;
    
	/**
	* SubclassNumber: 55. SicsRefBusinessPartnerRelationshipType
	*/
    public SicsReferenceDataReference relationshipType;
    
	/**
	* SubclassNumber: 73. SicsRefBusinessAdministratorTask
	*/
    public ArrayList< SicsReferenceDataReference> businessAdministratorTask =new ArrayList<SicsReferenceDataReference >();
    
    public java.util.Date fromDate;
    
    public java.util.Date toDate;
    
    public String reference;
    
    public String mortgageePriority;
    
	/**
	* SubclassNumber: 76. SicsRefCedentRole
	*/
    public SicsReferenceDataReference roleForCedent;
    
	/**
	* SubclassNumber: 72. SicsRefReinsurerTask
	*/
    public SicsReferenceDataReference reinsurerTask;
    
    public BigDecimal percentageOf100Pct;
    
    public BigDecimal percentageOfShare;
    
	/**
	* SubclassNumber: 75. SicsRefBrokerTask
	*/
    public SicsReferenceDataReference brokerTask;
    
	/**
	* SubclassNumber: 76. SicsRefCedentRole
	*/
    public SicsReferenceDataReference cedentRole;
    
    public SicsWsTimeDurationReference creditTermDuration;
    
	/**
	* Available only for relationship type Insured, Agent and Broker on type of business Policy Ceded.
	*/
    public String businessPartnerIdentifier;
    
	/**
	* Available only for relationship type Insured, Agent and Broker on type of business Policy Ceded.
	*/
    public String businessPartnerName;
    
	/**
	* Available only for relationship type Cedent on level of business OPP/OCC/ORP/OIP.
	*/
    public Boolean isMasterBaseCompany;
    
	/**
	* For Domain Retrieval Only
	*/
    public String location;

    public BusinessPartnerRelationshipForInsuredPeriod ()
    {
    }

    public BusinessPartnerRelationshipForInsuredPeriod (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("businessPartner"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartner = (SicsBusinessPartnerReference)__envelope.get(j,SicsBusinessPartnerReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("relationshipType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.relationshipType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessAdministratorTask"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.businessAdministratorTask==null)
                        {
                            this.businessAdministratorTask = new ArrayList< SicsReferenceDataReference>();
                        }
                        java.lang.Object j =obj;
                        SicsReferenceDataReference j1= (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                        this.businessAdministratorTask.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("fromDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.fromDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.fromDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("toDate"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.toDate = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.toDate = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("reference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.reference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.reference = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("mortgageePriority"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.mortgageePriority = j.toString();
                            }
                        }
                        else{
                            this.mortgageePriority = obj.toString();
                        }
                    }
                    continue;
                }
                if (info.name.equals("roleForCedent"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.roleForCedent = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("reinsurerTask"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reinsurerTask = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("percentageOf100Pct"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.percentageOf100Pct = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.percentageOf100Pct = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("percentageOfShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.percentageOfShare = new BigDecimal(j.toString());
                            }
                        }
                        else if (obj instanceof BigDecimal){
                            this.percentageOfShare = (BigDecimal)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("brokerTask"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.brokerTask = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("cedentRole"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.cedentRole = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("creditTermDuration"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.creditTermDuration = (SicsWsTimeDurationReference)__envelope.get(j,SicsWsTimeDurationReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerIdentifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessPartnerIdentifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessPartnerIdentifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.businessPartnerName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.businessPartnerName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isMasterBaseCompany"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isMasterBaseCompany = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isMasterBaseCompany = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("location"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.location = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.location = (String)obj;
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
            return this.businessPartner!=null?this.businessPartner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return relationshipType;
        }
        if(propertyIndex>=count+2 && propertyIndex < count+2+this.businessAdministratorTask.size())
        {
            return this.businessAdministratorTask.get(propertyIndex-(count+2));
        }
        if(propertyIndex==count+2+this.businessAdministratorTask.size())
        {
            return this.fromDate!=null?Helper.getDateFormat().format(this.fromDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3+this.businessAdministratorTask.size())
        {
            return this.toDate!=null?Helper.getDateFormat().format(this.toDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4+this.businessAdministratorTask.size())
        {
            return this.reference!=null?this.reference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5+this.businessAdministratorTask.size())
        {
            return this.mortgageePriority!=null?this.mortgageePriority:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6+this.businessAdministratorTask.size())
        {
            return this.roleForCedent!=null?this.roleForCedent:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7+this.businessAdministratorTask.size())
        {
            return this.reinsurerTask!=null?this.reinsurerTask:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8+this.businessAdministratorTask.size())
        {
            return this.percentageOf100Pct!=null?this.percentageOf100Pct.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9+this.businessAdministratorTask.size())
        {
            return this.percentageOfShare!=null?this.percentageOfShare.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10+this.businessAdministratorTask.size())
        {
            return this.brokerTask!=null?this.brokerTask:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11+this.businessAdministratorTask.size())
        {
            return this.cedentRole!=null?this.cedentRole:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12+this.businessAdministratorTask.size())
        {
            return this.creditTermDuration!=null?this.creditTermDuration:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13+this.businessAdministratorTask.size())
        {
            return this.businessPartnerIdentifier!=null?this.businessPartnerIdentifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14+this.businessAdministratorTask.size())
        {
            return this.businessPartnerName!=null?this.businessPartnerName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15+this.businessAdministratorTask.size())
        {
            return this.isMasterBaseCompany!=null?this.isMasterBaseCompany:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16+this.businessAdministratorTask.size())
        {
            return this.location!=null?this.location:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+17+businessAdministratorTask.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsBusinessPartnerReference.class;
            info.name = "businessPartner";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "relationshipType";
            info.namespace= "";
        }
        if(propertyIndex>=count+2 && propertyIndex < count+2+this.businessAdministratorTask.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "businessAdministratorTask";
            info.namespace= "";
        }
        if(propertyIndex==count+2+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fromDate";
            info.namespace= "";
        }
        if(propertyIndex==count+3+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "toDate";
            info.namespace= "";
        }
        if(propertyIndex==count+4+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reference";
            info.namespace= "";
        }
        if(propertyIndex==count+5+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "mortgageePriority";
            info.namespace= "";
        }
        if(propertyIndex==count+6+this.businessAdministratorTask.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "roleForCedent";
            info.namespace= "";
        }
        if(propertyIndex==count+7+this.businessAdministratorTask.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "reinsurerTask";
            info.namespace= "";
        }
        if(propertyIndex==count+8+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "percentageOf100Pct";
            info.namespace= "";
        }
        if(propertyIndex==count+9+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "percentageOfShare";
            info.namespace= "";
        }
        if(propertyIndex==count+10+this.businessAdministratorTask.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "brokerTask";
            info.namespace= "";
        }
        if(propertyIndex==count+11+this.businessAdministratorTask.size())
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "cedentRole";
            info.namespace= "";
        }
        if(propertyIndex==count+12+this.businessAdministratorTask.size())
        {
            info.type = SicsWsTimeDurationReference.class;
            info.name = "creditTermDuration";
            info.namespace= "";
        }
        if(propertyIndex==count+13+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessPartnerIdentifier";
            info.namespace= "";
        }
        if(propertyIndex==count+14+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "businessPartnerName";
            info.namespace= "";
        }
        if(propertyIndex==count+15+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isMasterBaseCompany";
            info.namespace= "";
        }
        if(propertyIndex==count+16+this.businessAdministratorTask.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "location";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

