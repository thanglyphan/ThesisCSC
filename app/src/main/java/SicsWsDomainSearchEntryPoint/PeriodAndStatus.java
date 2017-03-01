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
import java.math.BigInteger;

public class PeriodAndStatus extends AttributeContainer implements KvmSerializable,java.io.Serializable
{

    
    public BigInteger underwritingYearFrom;
    
    public BigInteger underwritingYearTo;
    
    public java.util.Date insuredPeriodFrom;
    
    public java.util.Date insuredPeriodTo;
    
    public java.util.Date insuredPeriodIncludes;
    
    public Boolean onlyLatestInsuredPeriod;
    
    public Boolean includeDefiniteStatuses;
    
    public Boolean includePendingStatuses;
    
    public Boolean includeInformationalStatuses;
    
    public Boolean includeDeclinedStatuses;
    
    public Boolean includeInactiveStatuses;
    
    public LifeCycleStatusesList lifeCycleStatuses;
    
    public SelectedLifeCycleSubStatusList selectedLifeCycleSubStatus;
    
    public CancellationStatusesList cancellationStatuses;
    
    public Boolean lifeCyclePhaseIsCurrent;
    
    public String commutationReference;

    public PeriodAndStatus ()
    {
    }

    public PeriodAndStatus (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("underwritingYearFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.underwritingYearFrom = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.underwritingYearFrom = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("underwritingYearTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.underwritingYearTo = new BigInteger(j.toString());
                            }
                        }
                        else if (obj instanceof BigInteger){
                            this.underwritingYearTo = (BigInteger)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriodFrom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredPeriodFrom = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.insuredPeriodFrom = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriodTo"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredPeriodTo = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.insuredPeriodTo = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("insuredPeriodIncludes"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.insuredPeriodIncludes = Helper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.insuredPeriodIncludes = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("onlyLatestInsuredPeriod"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.onlyLatestInsuredPeriod = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.onlyLatestInsuredPeriod = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("includeDefiniteStatuses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.includeDefiniteStatuses = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.includeDefiniteStatuses = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("includePendingStatuses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.includePendingStatuses = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.includePendingStatuses = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("includeInformationalStatuses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.includeInformationalStatuses = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.includeInformationalStatuses = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("includeDeclinedStatuses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.includeDeclinedStatuses = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.includeDeclinedStatuses = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("includeInactiveStatuses"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.includeInactiveStatuses = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.includeInactiveStatuses = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("lifeCycleStatuses"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.lifeCycleStatuses = new LifeCycleStatusesList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("selectedLifeCycleSubStatus"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.selectedLifeCycleSubStatus = new SelectedLifeCycleSubStatusList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("cancellationStatuses"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.cancellationStatuses = new CancellationStatusesList(j,__envelope);
                    }
                    continue;
                }
                if (info.name.equals("lifeCyclePhaseIsCurrent"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.lifeCyclePhaseIsCurrent = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.lifeCyclePhaseIsCurrent = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("commutationReference"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.commutationReference = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.commutationReference = (String)obj;
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
            return this.underwritingYearFrom!=null?this.underwritingYearFrom.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.underwritingYearTo!=null?this.underwritingYearTo.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.insuredPeriodFrom!=null?Helper.getDateFormat().format(this.insuredPeriodFrom):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.insuredPeriodTo!=null?Helper.getDateFormat().format(this.insuredPeriodTo):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.insuredPeriodIncludes!=null?Helper.getDateFormat().format(this.insuredPeriodIncludes):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.onlyLatestInsuredPeriod!=null?this.onlyLatestInsuredPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.includeDefiniteStatuses!=null?this.includeDefiniteStatuses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.includePendingStatuses!=null?this.includePendingStatuses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.includeInformationalStatuses!=null?this.includeInformationalStatuses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.includeDeclinedStatuses!=null?this.includeDeclinedStatuses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.includeInactiveStatuses!=null?this.includeInactiveStatuses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.lifeCycleStatuses!=null?this.lifeCycleStatuses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.selectedLifeCycleSubStatus!=null?this.selectedLifeCycleSubStatus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.cancellationStatuses!=null?this.cancellationStatuses:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==14)
        {
            return this.lifeCyclePhaseIsCurrent!=null?this.lifeCyclePhaseIsCurrent:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==15)
        {
            return this.commutationReference!=null?this.commutationReference:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 16;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "underwritingYearFrom";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "underwritingYearTo";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredPeriodFrom";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredPeriodTo";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "insuredPeriodIncludes";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "onlyLatestInsuredPeriod";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "includeDefiniteStatuses";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "includePendingStatuses";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "includeInformationalStatuses";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "includeDeclinedStatuses";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "includeInactiveStatuses";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "lifeCycleStatuses";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "selectedLifeCycleSubStatus";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "cancellationStatuses";
            info.namespace= "";
        }
        if(propertyIndex==14)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "lifeCyclePhaseIsCurrent";
            info.namespace= "";
        }
        if(propertyIndex==15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "commutationReference";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
