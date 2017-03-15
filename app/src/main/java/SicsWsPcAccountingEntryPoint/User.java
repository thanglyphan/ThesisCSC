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

public class User extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
	/**
	* Optional in Update, mandatory in Create
	*/
    public String firstName;
    
	/**
	* Optional in Update, mandatory in Create
	*/
    public String lastName;
    
	/**
	* Optional in Update, mandatory in Create
	*/
    public String userId;
    
    public String dbUserId;
    
    public String dbPassword;
    
    public String shortName;
    
    public Boolean isActive;
    
    public Boolean isPcUser;
    
    public Boolean isLfUser;
    
    public Boolean allowGlobalViewOfData;
    
    public Boolean allowUserToSwitchToAnyAccessCode;
    
	/**
	* SubclassNumber: 260. SicsRefAccessCode
	*/
    public SicsReferenceDataReference accessCode;
    
	/**
	* This is used only for Domain retreival.
	*/
    public String lastLoggedInTimeStamp;
    
    public ResponsibleUserRoleList responsibleUserRoleList;
    
    public Boolean allowClaimAndTechnicalBookingIgnoringSpecificClosureTerms;
    
    public String note;
    
    public SecurityUserCategoryList securityUserCategoryList;
    
    public ElectronicAddressList_1 electronicAddressList;

    public User ()
    {
    }

    public User (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("firstName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.firstName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.firstName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lastName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lastName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.lastName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("userId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.userId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.userId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dbUserId"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dbUserId = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dbUserId = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dbPassword"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dbPassword = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dbPassword = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("shortName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.shortName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.shortName = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isActive"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isActive = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isActive = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isPcUser"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isPcUser = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isPcUser = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("isLfUser"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.isLfUser = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.isLfUser = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("allowGlobalViewOfData"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.allowGlobalViewOfData = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.allowGlobalViewOfData = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("allowUserToSwitchToAnyAccessCode"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.allowUserToSwitchToAnyAccessCode = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.allowUserToSwitchToAnyAccessCode = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("accessCode"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.accessCode = (SicsReferenceDataReference)__envelope.get(j,SicsReferenceDataReference.class,false);
                    }
                    continue;
                }
                if (info.name.equals("lastLoggedInTimeStamp"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lastLoggedInTimeStamp = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.lastLoggedInTimeStamp = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("responsibleUserRoleList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.responsibleUserRoleList = new ResponsibleUserRoleList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("allowClaimAndTechnicalBookingIgnoringSpecificClosureTerms"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.allowClaimAndTechnicalBookingIgnoringSpecificClosureTerms = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.allowClaimAndTechnicalBookingIgnoringSpecificClosureTerms = (Boolean)obj;
                        }
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
                if (info.name.equals("securityUserCategoryList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.securityUserCategoryList = new SecurityUserCategoryList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("electronicAddressList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.electronicAddressList = new ElectronicAddressList_1(j,__envelope);
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
            return this.firstName!=null?this.firstName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.lastName!=null?this.lastName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.userId!=null?this.userId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.dbUserId!=null?this.dbUserId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.dbPassword!=null?this.dbPassword:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.shortName!=null?this.shortName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.isActive!=null?this.isActive:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.isPcUser!=null?this.isPcUser:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.isLfUser!=null?this.isLfUser:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.allowGlobalViewOfData!=null?this.allowGlobalViewOfData:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.allowUserToSwitchToAnyAccessCode!=null?this.allowUserToSwitchToAnyAccessCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.accessCode!=null?this.accessCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.lastLoggedInTimeStamp!=null?this.lastLoggedInTimeStamp:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.responsibleUserRoleList!=null?this.responsibleUserRoleList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+14)
        {
            return this.allowClaimAndTechnicalBookingIgnoringSpecificClosureTerms!=null?this.allowClaimAndTechnicalBookingIgnoringSpecificClosureTerms:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+15)
        {
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+16)
        {
            return this.securityUserCategoryList!=null?this.securityUserCategoryList:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+17)
        {
            return this.electronicAddressList!=null?this.electronicAddressList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+18;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "firstName";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lastName";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "userId";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dbUserId";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dbPassword";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "shortName";
            info.namespace= "";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isActive";
            info.namespace= "";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isPcUser";
            info.namespace= "";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "isLfUser";
            info.namespace= "";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "allowGlobalViewOfData";
            info.namespace= "";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "allowUserToSwitchToAnyAccessCode";
            info.namespace= "";
        }
        if(propertyIndex==count+11)
        {
            info.type = SicsReferenceDataReference.class;
            info.name = "accessCode";
            info.namespace= "";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lastLoggedInTimeStamp";
            info.namespace= "";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "responsibleUserRoleList";
            info.namespace= "";
        }
        if(propertyIndex==count+14)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "allowClaimAndTechnicalBookingIgnoringSpecificClosureTerms";
            info.namespace= "";
        }
        if(propertyIndex==count+15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        if(propertyIndex==count+16)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "securityUserCategoryList";
            info.namespace= "";
        }
        if(propertyIndex==count+17)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "electronicAddressList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

