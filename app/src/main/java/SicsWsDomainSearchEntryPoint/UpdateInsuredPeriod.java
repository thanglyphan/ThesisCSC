package SicsWsDomainSearchEntryPoint;

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

public class UpdateInsuredPeriod extends InsuredPeriodCommonUpdateAndCreate implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 90. SicsRefAgreementLifeCycleStatus
	*/
    public SicsReferenceDataReference renewedLifeCyclePhase;
    
    public ArrayList< SicsGroupReference> linkToBusinessGroup =new ArrayList<SicsGroupReference >();
    
    public ArrayList< SicsGroupReference> removeLinkToBusinessGroup =new ArrayList<SicsGroupReference >();
    
	/**
	* This element should be used to update the properties of the relationship, but not change the partner. 
	*                      If you want to change the business partner you should use the replaceBusinessPartnerRelationship element. 
	*                      OBSOLETE.
	*/
    public ArrayList< BusinessPartnerRelationshipForInsuredPeriod> updateBusinessPartnerRelationship =new ArrayList<BusinessPartnerRelationshipForInsuredPeriod >();
    
	/**
	* OBSOLETE.
	*/
    public ArrayList< BusinessPartnerRelationshipReference> deleteBusinessPartnerRelationship =new ArrayList<BusinessPartnerRelationshipReference >();
    
	/**
	* OBSOLETE.
	*/
    public ArrayList< BusinessPartnerRelationshipForInsuredPeriod> createBusinessPartnerRelationship =new ArrayList<BusinessPartnerRelationshipForInsuredPeriod >();
    
	/**
	* Use this element if you want to change the business partner. 
	*                      If you want to update the properties of the relationship, but not change the partner,
	*                       you should use the updateBusinessPartnerRelationship element instead.
	*                      OBSOLETE.
	*/
    public ArrayList< ReplaceBusinessPartnerRelationship> replaceBusinessPartnerRelationship =new ArrayList<ReplaceBusinessPartnerRelationship >();
    
	/**
	* OBSOLETE.
	*/
    public TransferPaymentTask transferPaymentTask;
    
	/**
	* This element should be used to represent all the current valid business partner relationships.
	*                      If this element is present then  updateBusinessPartnerRelationship ,replaceBusinessPartnerRelationship ,createBusinessPartnerRelationship 
	*                      ,deleteBusinessPartnerRelationship and transferPaymentTask will be ignored.
	*/
    public BusinessPartnerRelationshipList businessPartnerRelationshipList;
    
	/**
	* This element represent the "Edit Business Partner Task/Reference..." menu choice on the "Partners" tab in the business window. 
	*                      It is intended to be used by users who are not allowed (because of SICS Security) to change business partners and therefore cannot 
	*                      use the elements "businessPartnerRelationshipList" or "updateBusinessPartnerRelationship".
	*/
    public ArrayList< BusinessPartnerRelationshipTasksAndReference> updateBusinessPartnerRelationshipTasksAndReference =new ArrayList<BusinessPartnerRelationshipTasksAndReference >();

    public UpdateInsuredPeriod ()
    {
    }

    public UpdateInsuredPeriod (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("renewedLifeCyclePhase"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.renewedLifeCyclePhase = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("linkToBusinessGroup"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.linkToBusinessGroup==null)
                        {
                            this.linkToBusinessGroup = new ArrayList< SicsGroupReference>();
                        }
                        java.lang.Object j =obj;
                        SicsGroupReference j1= (SicsGroupReference)__envelope.get(j,SicsGroupReference.class,false);
                        this.linkToBusinessGroup.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("removeLinkToBusinessGroup"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.removeLinkToBusinessGroup==null)
                        {
                            this.removeLinkToBusinessGroup = new ArrayList< SicsGroupReference>();
                        }
                        java.lang.Object j =obj;
                        SicsGroupReference j1= (SicsGroupReference)__envelope.get(j,SicsGroupReference.class,false);
                        this.removeLinkToBusinessGroup.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("updateBusinessPartnerRelationship"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.updateBusinessPartnerRelationship==null)
                        {
                            this.updateBusinessPartnerRelationship = new ArrayList< BusinessPartnerRelationshipForInsuredPeriod>();
                        }
                        java.lang.Object j =obj;
                        BusinessPartnerRelationshipForInsuredPeriod j1= (BusinessPartnerRelationshipForInsuredPeriod)__envelope.get(j,BusinessPartnerRelationshipForInsuredPeriod.class,false);
                        this.updateBusinessPartnerRelationship.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("deleteBusinessPartnerRelationship"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.deleteBusinessPartnerRelationship==null)
                        {
                            this.deleteBusinessPartnerRelationship = new ArrayList< BusinessPartnerRelationshipReference>();
                        }
                        java.lang.Object j =obj;
                        BusinessPartnerRelationshipReference j1= (BusinessPartnerRelationshipReference)__envelope.get(j,BusinessPartnerRelationshipReference.class,false);
                        this.deleteBusinessPartnerRelationship.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("createBusinessPartnerRelationship"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.createBusinessPartnerRelationship==null)
                        {
                            this.createBusinessPartnerRelationship = new ArrayList< BusinessPartnerRelationshipForInsuredPeriod>();
                        }
                        java.lang.Object j =obj;
                        BusinessPartnerRelationshipForInsuredPeriod j1= (BusinessPartnerRelationshipForInsuredPeriod)__envelope.get(j,BusinessPartnerRelationshipForInsuredPeriod.class,false);
                        this.createBusinessPartnerRelationship.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("replaceBusinessPartnerRelationship"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.replaceBusinessPartnerRelationship==null)
                        {
                            this.replaceBusinessPartnerRelationship = new ArrayList< ReplaceBusinessPartnerRelationship>();
                        }
                        java.lang.Object j =obj;
                        ReplaceBusinessPartnerRelationship j1= (ReplaceBusinessPartnerRelationship)__envelope.get(j,ReplaceBusinessPartnerRelationship.class,false);
                        this.replaceBusinessPartnerRelationship.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("transferPaymentTask"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.transferPaymentTask = (TransferPaymentTask)__envelope.get(j,TransferPaymentTask.class,false);
                    }
                    continue;
                }
                if (info.name.equals("businessPartnerRelationshipList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.businessPartnerRelationshipList = (BusinessPartnerRelationshipList)__envelope.get(j,BusinessPartnerRelationshipList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("updateBusinessPartnerRelationshipTasksAndReference"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.updateBusinessPartnerRelationshipTasksAndReference==null)
                        {
                            this.updateBusinessPartnerRelationshipTasksAndReference = new ArrayList< BusinessPartnerRelationshipTasksAndReference>();
                        }
                        java.lang.Object j =obj;
                        BusinessPartnerRelationshipTasksAndReference j1= (BusinessPartnerRelationshipTasksAndReference)__envelope.get(j,BusinessPartnerRelationshipTasksAndReference.class,false);
                        this.updateBusinessPartnerRelationshipTasksAndReference.add(j1);
                   
        
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
            return this.renewedLifeCyclePhase!=null?this.renewedLifeCyclePhase:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.linkToBusinessGroup.size())
        {
            return this.linkToBusinessGroup.get(propertyIndex-(count+1));
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size())
        {
            return this.removeLinkToBusinessGroup.get(propertyIndex-(count+1+this.linkToBusinessGroup.size()));
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size())
        {
            return this.updateBusinessPartnerRelationship.get(propertyIndex-(count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()));
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size())
        {
            return this.deleteBusinessPartnerRelationship.get(propertyIndex-(count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()));
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size())
        {
            return this.createBusinessPartnerRelationship.get(propertyIndex-(count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()));
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size())
        {
            return this.replaceBusinessPartnerRelationship.get(propertyIndex-(count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()));
        }
        if(propertyIndex==count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size())
        {
            return this.transferPaymentTask!=null?this.transferPaymentTask:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size())
        {
            return this.businessPartnerRelationshipList!=null?this.businessPartnerRelationshipList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+3+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size() && propertyIndex < count+3+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size()+this.updateBusinessPartnerRelationshipTasksAndReference.size())
        {
            return this.updateBusinessPartnerRelationshipTasksAndReference.get(propertyIndex-(count+3+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size()));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+3+linkToBusinessGroup.size()+removeLinkToBusinessGroup.size()+updateBusinessPartnerRelationship.size()+deleteBusinessPartnerRelationship.size()+createBusinessPartnerRelationship.size()+replaceBusinessPartnerRelationship.size()+updateBusinessPartnerRelationshipTasksAndReference.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "renewedLifeCyclePhase";
            info.namespace= "";
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.linkToBusinessGroup.size())
        {
            info.type = SicsGroupReference.class;
            info.name = "linkToBusinessGroup";
            info.namespace= "";
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size())
        {
            info.type = SicsGroupReference.class;
            info.name = "removeLinkToBusinessGroup";
            info.namespace= "";
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size())
        {
            info.type = BusinessPartnerRelationshipForInsuredPeriod.class;
            info.name = "updateBusinessPartnerRelationship";
            info.namespace= "";
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size())
        {
            info.type = BusinessPartnerRelationshipReference.class;
            info.name = "deleteBusinessPartnerRelationship";
            info.namespace= "";
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size())
        {
            info.type = BusinessPartnerRelationshipForInsuredPeriod.class;
            info.name = "createBusinessPartnerRelationship";
            info.namespace= "";
        }
        if(propertyIndex>=count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size() && propertyIndex < count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size())
        {
            info.type = ReplaceBusinessPartnerRelationship.class;
            info.name = "replaceBusinessPartnerRelationship";
            info.namespace= "";
        }
        if(propertyIndex==count+1+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size())
        {
            info.type = TransferPaymentTask.class;
            info.name = "transferPaymentTask";
            info.namespace= "";
        }
        if(propertyIndex==count+2+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size())
        {
            info.type = BusinessPartnerRelationshipList.class;
            info.name = "businessPartnerRelationshipList";
            info.namespace= "";
        }
        if(propertyIndex>=count+3+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size() && propertyIndex < count+3+this.linkToBusinessGroup.size()+this.removeLinkToBusinessGroup.size()+this.updateBusinessPartnerRelationship.size()+this.deleteBusinessPartnerRelationship.size()+this.createBusinessPartnerRelationship.size()+this.replaceBusinessPartnerRelationship.size()+this.updateBusinessPartnerRelationshipTasksAndReference.size())
        {
            info.type = BusinessPartnerRelationshipTasksAndReference.class;
            info.name = "updateBusinessPartnerRelationshipTasksAndReference";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

