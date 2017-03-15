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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class ResponsibleUserRoleListUpdate extends ListUpdate implements KvmSerializable,java.io.Serializable
{

    
    public ArrayList< ResponsibleUserRoleUpdateElement> responsibleUserRoleUpdate =new ArrayList<ResponsibleUserRoleUpdateElement >();

    public ResponsibleUserRoleListUpdate ()
    {
    }

    public ResponsibleUserRoleListUpdate (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("responsibleUserRoleUpdate"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.responsibleUserRoleUpdate==null)
                        {
                            this.responsibleUserRoleUpdate = new ArrayList< ResponsibleUserRoleUpdateElement>();
                        }
                        java.lang.Object j =obj;
                        ResponsibleUserRoleUpdateElement j1= (ResponsibleUserRoleUpdateElement)__envelope.get(j,ResponsibleUserRoleUpdateElement.class,false);
                        this.responsibleUserRoleUpdate.add(j1);
                   
        
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
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.responsibleUserRoleUpdate.size())
        {
            return this.responsibleUserRoleUpdate.get(propertyIndex-(count+0));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+0+responsibleUserRoleUpdate.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex>=count+0 && propertyIndex < count+0+this.responsibleUserRoleUpdate.size())
        {
            info.type = ResponsibleUserRoleUpdateElement.class;
            info.name = "responsibleUserRoleUpdate";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

