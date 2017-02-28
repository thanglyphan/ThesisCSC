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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class IndexClauseConditionContainer extends DomainObject implements KvmSerializable,java.io.Serializable
{

    
    public String note;
    
	/**
	* Obsolete.
	*/
    public ArrayList< IndexClause> indexClause =new ArrayList<IndexClause >();
    
	/**
	* Obsolete.
	*/
    public ArrayList< IndexClause> updateIndexClause =new ArrayList<IndexClause >();
    
	/**
	* Obsolete.
	*/
    public ArrayList< DeleteIndexClause> deleteIndexClause =new ArrayList<DeleteIndexClause >();
    
	/**
	* Obsolete.
	*/
    public ArrayList< IndexClause> createIndexClause =new ArrayList<IndexClause >();
    
    public IndexClauseList indexClauseList;

    public IndexClauseConditionContainer ()
    {
    }

    public IndexClauseConditionContainer (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("indexClause"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.indexClause==null)
                        {
                            this.indexClause = new ArrayList< IndexClause>();
                        }
                        java.lang.Object j =obj;
                        IndexClause j1= (IndexClause)__envelope.get(j,IndexClause.class,false);
                        this.indexClause.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("updateIndexClause"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.updateIndexClause==null)
                        {
                            this.updateIndexClause = new ArrayList< IndexClause>();
                        }
                        java.lang.Object j =obj;
                        IndexClause j1= (IndexClause)__envelope.get(j,IndexClause.class,false);
                        this.updateIndexClause.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("deleteIndexClause"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.deleteIndexClause==null)
                        {
                            this.deleteIndexClause = new ArrayList< DeleteIndexClause>();
                        }
                        java.lang.Object j =obj;
                        DeleteIndexClause j1= (DeleteIndexClause)__envelope.get(j,DeleteIndexClause.class,false);
                        this.deleteIndexClause.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("createIndexClause"))
                {
                    if(obj!=null)
                    {
        
                    
                        if(this.createIndexClause==null)
                        {
                            this.createIndexClause = new ArrayList< IndexClause>();
                        }
                        java.lang.Object j =obj;
                        IndexClause j1= (IndexClause)__envelope.get(j,IndexClause.class,false);
                        this.createIndexClause.add(j1);
                   
        
                    }
                    continue;
                }
                if (info.name.equals("indexClauseList"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.indexClauseList = (IndexClauseList)__envelope.get(j,IndexClauseList.class,false);
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
            return this.note!=null?this.note:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.indexClause.size())
        {
            return this.indexClause.get(propertyIndex-(count+1));
        }
        if(propertyIndex>=count+1+this.indexClause.size() && propertyIndex < count+1+this.indexClause.size()+this.updateIndexClause.size())
        {
            return this.updateIndexClause.get(propertyIndex-(count+1+this.indexClause.size()));
        }
        if(propertyIndex>=count+1+this.indexClause.size()+this.updateIndexClause.size() && propertyIndex < count+1+this.indexClause.size()+this.updateIndexClause.size()+this.deleteIndexClause.size())
        {
            return this.deleteIndexClause.get(propertyIndex-(count+1+this.indexClause.size()+this.updateIndexClause.size()));
        }
        if(propertyIndex>=count+1+this.indexClause.size()+this.updateIndexClause.size()+this.deleteIndexClause.size() && propertyIndex < count+1+this.indexClause.size()+this.updateIndexClause.size()+this.deleteIndexClause.size()+this.createIndexClause.size())
        {
            return this.createIndexClause.get(propertyIndex-(count+1+this.indexClause.size()+this.updateIndexClause.size()+this.deleteIndexClause.size()));
        }
        if(propertyIndex==count+1+this.indexClause.size()+this.updateIndexClause.size()+this.deleteIndexClause.size()+this.createIndexClause.size())
        {
            return this.indexClauseList!=null?this.indexClauseList:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2+indexClause.size()+updateIndexClause.size()+deleteIndexClause.size()+createIndexClause.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "note";
            info.namespace= "";
        }
        if(propertyIndex>=count+1 && propertyIndex < count+1+this.indexClause.size())
        {
            info.type = IndexClause.class;
            info.name = "indexClause";
            info.namespace= "";
        }
        if(propertyIndex>=count+1+this.indexClause.size() && propertyIndex < count+1+this.indexClause.size()+this.updateIndexClause.size())
        {
            info.type = IndexClause.class;
            info.name = "updateIndexClause";
            info.namespace= "";
        }
        if(propertyIndex>=count+1+this.indexClause.size()+this.updateIndexClause.size() && propertyIndex < count+1+this.indexClause.size()+this.updateIndexClause.size()+this.deleteIndexClause.size())
        {
            info.type = DeleteIndexClause.class;
            info.name = "deleteIndexClause";
            info.namespace= "";
        }
        if(propertyIndex>=count+1+this.indexClause.size()+this.updateIndexClause.size()+this.deleteIndexClause.size() && propertyIndex < count+1+this.indexClause.size()+this.updateIndexClause.size()+this.deleteIndexClause.size()+this.createIndexClause.size())
        {
            info.type = IndexClause.class;
            info.name = "createIndexClause";
            info.namespace= "";
        }
        if(propertyIndex==count+1+this.indexClause.size()+this.updateIndexClause.size()+this.deleteIndexClause.size()+this.createIndexClause.size())
        {
            info.type = IndexClauseList.class;
            info.name = "indexClauseList";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
