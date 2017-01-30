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

public class ClauseConditionUpdate extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public GeneralClauseList generalClauseList;
    
    public ExclusionClauseList exclusionClauseList;
    
    public AttachmentClauseList attachmentClauseList;
    
	/**
	* Special tab
	*/
    public String specialGeneralClause;
    
	/**
	* Special tab
	*/
    public String specialExclusionClause;
    
	/**
	* Special tab
	*/
    public String specialAttachmentClause;
    
    public SicsWsTimeDurationReference paymentWarranty;
    
    public SicsWsTimeDurationReference paymentWarrantyOutward;
    
    public Boolean isBusinessActivitiesSelected;
    
    public Boolean isClaimActivitiesSelected;
    
    public Boolean isAccountingActivitiesSelected;
    
    public Boolean deleteGeneralClauses;
    
    public Boolean deleteExclusionClauses;
    
    public Boolean deleteAttachmentClauses;

    public ClauseConditionUpdate ()
    {
    }

    public ClauseConditionUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("generalClauseList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.generalClauseList = (GeneralClauseList)__envelope.get(j,GeneralClauseList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("exclusionClauseList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.exclusionClauseList = (ExclusionClauseList)__envelope.get(j,ExclusionClauseList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("attachmentClauseList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.attachmentClauseList = (AttachmentClauseList)__envelope.get(j,AttachmentClauseList.class,false);
                    }
                    continue;
                }
                if (info.name.equals("specialGeneralClause"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.specialGeneralClause = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.specialGeneralClause = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("specialExclusionClause"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.specialExclusionClause = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.specialExclusionClause = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("specialAttachmentClause"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.specialAttachmentClause = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.specialAttachmentClause = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("paymentWarranty"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paymentWarranty = (SicsWsTimeDurationReference)__envelope.get(j,SicsWsTimeDurationReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("paymentWarrantyOutward"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.paymentWarrantyOutward = (SicsWsTimeDurationReference)__envelope.get(j,SicsWsTimeDurationReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("isBusinessActivitiesSelected"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isBusinessActivitiesSelected = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isBusinessActivitiesSelected = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isClaimActivitiesSelected"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isClaimActivitiesSelected = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isClaimActivitiesSelected = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isAccountingActivitiesSelected"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isAccountingActivitiesSelected = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isAccountingActivitiesSelected = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deleteGeneralClauses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deleteGeneralClauses = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.deleteGeneralClauses = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deleteExclusionClauses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deleteExclusionClauses = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.deleteExclusionClauses = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("deleteAttachmentClauses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.deleteAttachmentClauses = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.deleteAttachmentClauses = (Boolean)obj;
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
            return this.generalClauseList!=null?this.generalClauseList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.exclusionClauseList!=null?this.exclusionClauseList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.attachmentClauseList!=null?this.attachmentClauseList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.specialGeneralClause!=null?this.specialGeneralClause:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.specialExclusionClause!=null?this.specialExclusionClause:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.specialAttachmentClause!=null?this.specialAttachmentClause:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.paymentWarranty!=null?this.paymentWarranty:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.paymentWarrantyOutward!=null?this.paymentWarrantyOutward:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.isBusinessActivitiesSelected!=null?this.isBusinessActivitiesSelected:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.isClaimActivitiesSelected!=null?this.isClaimActivitiesSelected:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.isAccountingActivitiesSelected!=null?this.isAccountingActivitiesSelected:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.deleteGeneralClauses!=null?this.deleteGeneralClauses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.deleteExclusionClauses!=null?this.deleteExclusionClauses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.deleteAttachmentClauses!=null?this.deleteAttachmentClauses:SoapPrimitive.NullSkip;
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
            info.type = GeneralClauseList.class;
            info.name = "generalClauseList";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = ExclusionClauseList.class;
            info.name = "exclusionClauseList";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = AttachmentClauseList.class;
            info.name = "attachmentClauseList";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "specialGeneralClause";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "specialExclusionClause";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "specialAttachmentClause";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = SicsWsTimeDurationReference.class;
            info.name = "paymentWarranty";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = SicsWsTimeDurationReference.class;
            info.name = "paymentWarrantyOutward";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isBusinessActivitiesSelected";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isClaimActivitiesSelected";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isAccountingActivitiesSelected";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "deleteGeneralClauses";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "deleteExclusionClauses";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "deleteAttachmentClauses";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

