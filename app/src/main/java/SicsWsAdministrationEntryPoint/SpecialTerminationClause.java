package SicsWsAdministrationEntryPoint;

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

public class SpecialTerminationClause extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* SubclassNumber: 1196
	*                      Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Reason for Clause
	*                      Reason for Clause
	*/
    public SicsReferenceDataReference reasonForClause;
    
	/**
	* SubclassNumber: 1190
	*                      GUI: At Inception Exempt Wording
	*                      At Inception Exempt Wording
	*/
    public SicsReferenceDataReference atInceptExemptWording;
    
	/**
	* Disabled if atInceptionExcemptWording is 'None' mandatory otherwise.
	*                      Free text, max 35 characters.
	*                      GUI: At Inception Details
	*                      At Inception Details
	*/
    public String atInceptionDetails;
    
	/**
	* Minimum 0, Maximum: 999
	*                      GUI: Cedent Exercise Notice of Termination Within Days
	*                      Cedent Exercise Notice of Termination Within Days
	*/
    public Integer noticeOfTermWithInDays;
    
	/**
	* Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Special Termination Cancellation Basis - No Return of Unearned Premium
	*                      Special Termination Cancellation Basis - No Return of Unearned Premium
	*/
    public Boolean isRunOff;
    
	/**
	* Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Special Termination Cancellation Basis - Return of Unearned Premium
	*                      Special Termination Cancellation Basis - Return of Unearned Premium
	*/
    public Boolean isCutOff;
    
	/**
	* SubclassNumber: 1197
	*                      Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Retroactive Cancellation/Reimbursement of Earned Premium
	*                      Retroactive Cancellation/Reimbursement of Earned Premium
	*/
    public SicsReferenceDataReference retroCancellation;
    
	/**
	* Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Reinsurer to Assume Other Reinsurers Share
	*                      Reinsurer to Assume Other Reinsurers Share
	*/
    public Boolean otherReinsurersShare;
    
	/**
	* SubclassNumber: 1192
	*                      Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Commutation
	*                      Commutation
	*/
    public SicsReferenceDataReference commutation;
    
	/**
	* SubclassNumber: 1194
	*                      Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Post Collateral
	*                      Post Collateral
	*/
    public SicsReferenceDataReference postCollateral;
    
	/**
	* Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Return of Reserves and/or IBNR
	*                      Return of Reserves and/or IBNR
	*/
    public Boolean returnOfReserves;
    
	/**
	* Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Return of Unearned Premium
	*                      Return of Unearned Premium
	*/
    public Boolean returnOfUnearnedPermium;
    
	/**
	* Value 0-999
	*                      GUI: Reinsurer Consequences - Payment Within Days
	*                      Reinsurer Consequences - Payment Within Days
	*/
    public Integer paymentWithInDays;
    
	/**
	* Free text - max 35 characters.
	*                      GUI: Authorization Reference
	*                      Authorization Reference
	*/
    public String authRef;
    
	/**
	* GUI: Tab with name 'Notes'
	*                      Tab with name 'Notes'
	*/
    public String specialTerminationClauseNotes;
    
	/**
	* Min-max percentage: 0-999
	*                      GUI: Policy Holders Surplus
	*                      Policy Holders Surplus
	*/
    public Integer policyHoldersSurplus;
    
	/**
	* Min-max percentage: 0-999
	*                      GUI: RBC Ratio
	*                      RBC Ratio
	*/
    public Integer rbcRatio;
    
	/**
	* SubclassNumber: 1195
	*                      Only available if RBC Ratio is present - if so it's mandatory.
	*                      GUI: RBC Ratio Type
	*                      RBC Ratio Type
	*/
    public SicsReferenceDataReference rbcRatioType;
    
	/**
	* SubclassNumber: 1198
	*                      Only visible if set up in system parameters
	*                      GUI: Solvency Model
	*                      Solvency Model
	*/
    public SicsReferenceDataReference solvencyModel;
    
	/**
	* Min - max percentage: 0-999
	*                      GUI: SST Ratio
	*                      SST Ratio
	*/
    public Integer solvencyPerct;
    
	/**
	* Values 1-4.
	*                      Mandatory if atInceptExemptWording is 'None'.
	*                      GUI: Number of Trigger Types Required
	*                      Number of Trigger Types Required
	*/
    public Integer numberOfTriggerTypeReq;
    
	/**
	* Note on update: Use this element to add new otherTriggers.
	*                      If you need to modify or delete the list you should use the
	*                      otherTriggerListUpdate element instead.
	*                      GUI: Other Triggers
	*                      Other Triggers
	*/
    public STCOtherTriggerList otherTriggerList;
    
	/**
	* Mandatory if other trigger list contains 'Other'.
	*                      GUI: Other Triggers Comments
	*                      Other Triggers Comments
	*/
    public String otherTriggerComments;
    
	/**
	* SubclassNumber: 1191
	*                      GUI: Number of Breaches Required
	*                      Number of Breaches Required
	*/
    public SicsReferenceDataReference noOfBreachesReq;
    
	/**
	* Note on update: Use this element to add new terminatingAgencyRatings.
	*                      If you need to modify or delete the list you should use the
	*                      terminatingAgencyRatingListUpdate element instead.
	*                      GUI: Rating Systems
	*                      Rating Systems
	*/
    public STCTerminatingAgencyRatingList terminatingAgencyRatingList;

    public SpecialTerminationClause ()
    {
    }

    public SpecialTerminationClause (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("reasonForClause"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.reasonForClause = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("atInceptExemptWording"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.atInceptExemptWording = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("atInceptionDetails"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.atInceptionDetails = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.atInceptionDetails = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("noticeOfTermWithInDays"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.noticeOfTermWithInDays = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.noticeOfTermWithInDays = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isRunOff"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isRunOff = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isRunOff = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isCutOff"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isCutOff = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isCutOff = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("retroCancellation"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.retroCancellation = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("otherReinsurersShare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.otherReinsurersShare = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.otherReinsurersShare = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("commutation"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.commutation = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("postCollateral"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.postCollateral = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("returnOfReserves"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.returnOfReserves = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.returnOfReserves = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("returnOfUnearnedPermium"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.returnOfUnearnedPermium = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.returnOfUnearnedPermium = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("paymentWithInDays"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.paymentWithInDays = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.paymentWithInDays = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("authRef"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.authRef = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.authRef = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("specialTerminationClauseNotes"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.specialTerminationClauseNotes = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.specialTerminationClauseNotes = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("policyHoldersSurplus"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.policyHoldersSurplus = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.policyHoldersSurplus = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("rbcRatio"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.rbcRatio = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.rbcRatio = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("rbcRatioType"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.rbcRatioType = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("solvencyModel"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.solvencyModel = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("solvencyPerct"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.solvencyPerct = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.solvencyPerct = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("numberOfTriggerTypeReq"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.numberOfTriggerTypeReq = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.numberOfTriggerTypeReq = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("otherTriggerList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.otherTriggerList = new STCOtherTriggerList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("otherTriggerComments"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.otherTriggerComments = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.otherTriggerComments = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("noOfBreachesReq"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.noOfBreachesReq = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("terminatingAgencyRatingList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.terminatingAgencyRatingList = new STCTerminatingAgencyRatingList(j,__envelope);
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
            return this.reasonForClause!=null?this.reasonForClause:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.atInceptExemptWording!=null?this.atInceptExemptWording:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.atInceptionDetails!=null?this.atInceptionDetails:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.noticeOfTermWithInDays!=null?this.noticeOfTermWithInDays:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.isRunOff!=null?this.isRunOff:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.isCutOff!=null?this.isCutOff:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.retroCancellation!=null?this.retroCancellation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.otherReinsurersShare!=null?this.otherReinsurersShare:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.commutation!=null?this.commutation:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.postCollateral!=null?this.postCollateral:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.returnOfReserves!=null?this.returnOfReserves:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.returnOfUnearnedPermium!=null?this.returnOfUnearnedPermium:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.paymentWithInDays!=null?this.paymentWithInDays:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.authRef!=null?this.authRef:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.specialTerminationClauseNotes!=null?this.specialTerminationClauseNotes:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.policyHoldersSurplus!=null?this.policyHoldersSurplus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.rbcRatio!=null?this.rbcRatio:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.rbcRatioType!=null?this.rbcRatioType:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+18)
        {
            return this.solvencyModel!=null?this.solvencyModel:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+19)
        {
            return this.solvencyPerct!=null?this.solvencyPerct:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+20)
        {
            return this.numberOfTriggerTypeReq!=null?this.numberOfTriggerTypeReq:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+21)
        {
            return this.otherTriggerList!=null?this.otherTriggerList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+22)
        {
            return this.otherTriggerComments!=null?this.otherTriggerComments:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+23)
        {
            return this.noOfBreachesReq!=null?this.noOfBreachesReq:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+24)
        {
            return this.terminatingAgencyRatingList!=null?this.terminatingAgencyRatingList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+25;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "reasonForClause";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "atInceptExemptWording";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "atInceptionDetails";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "noticeOfTermWithInDays";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isRunOff";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isCutOff";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "retroCancellation";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "otherReinsurersShare";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "commutation";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "postCollateral";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "returnOfReserves";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "returnOfUnearnedPermium";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "paymentWithInDays";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "authRef";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "specialTerminationClauseNotes";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "policyHoldersSurplus";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "rbcRatio";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "rbcRatioType";
            info.namespace= "";
        }
        if(propertyIndex==count+18)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "solvencyModel";
            info.namespace= "";
        }
        if(propertyIndex==count+19)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "solvencyPerct";
            info.namespace= "";
        }
        if(propertyIndex==count+20)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "numberOfTriggerTypeReq";
            info.namespace= "";
        }
        if(propertyIndex==count+21)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "otherTriggerList";
            info.namespace= "";
        }
        if(propertyIndex==count+22)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "otherTriggerComments";
            info.namespace= "";
        }
        if(propertyIndex==count+23)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "noOfBreachesReq";
            info.namespace= "";
        }
        if(propertyIndex==count+24)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "terminatingAgencyRatingList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

