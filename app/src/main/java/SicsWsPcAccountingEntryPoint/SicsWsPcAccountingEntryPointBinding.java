package SicsWsPcAccountingEntryPoint;




//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 30/01/2017
//
//---------------------------------------------------




import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.*;
import org.ksoap2.transport.*;
import org.kxml2.kdom.Element;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SicsWsPcAccountingEntryPointBinding
{
    interface IWcfMethod
    {
        ExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws java.lang.Exception;

        java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object result) throws java.lang.Exception;
    }

    String url="";

    int timeOut=60000;
    public List< HeaderProperty> httpHeaders;
    public boolean enableLogging;

    IServiceEvents callback;
    public SicsWsPcAccountingEntryPointBinding(){}

    public SicsWsPcAccountingEntryPointBinding (IServiceEvents callback)
    {
        this.callback = callback;
    }
    public SicsWsPcAccountingEntryPointBinding(IServiceEvents callback,String url)
    {
        this.callback = callback;
        this.url = url;
    }

    public SicsWsPcAccountingEntryPointBinding(IServiceEvents callback,String url,int timeOut)
    {
        this.callback = callback;
        this.url = url;
        this.timeOut=timeOut;
    }

    protected org.ksoap2.transport.Transport createTransport()
    {
        try
        {
            java.net.URI uri = new java.net.URI(url);
            if(uri.getScheme().equalsIgnoreCase("https"))
            {
                int port=uri.getPort()>0?uri.getPort():443;
                return new com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE(uri.getHost(), port, uri.getPath(), timeOut);
            }
            else
            {
                return new com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE(url,timeOut);
            }

        }
        catch (java.net.URISyntaxException e)
        {
        }
        return null;
    }
    
    protected ExtendedSoapSerializationEnvelope createEnvelope()
    {
        ExtendedSoapSerializationEnvelope envelope= new ExtendedSoapSerializationEnvelope(ExtendedSoapSerializationEnvelope.VER11);
        return envelope;
    }
    
    protected java.util.List sendRequest(String methodName,ExtendedSoapSerializationEnvelope envelope,org.ksoap2.transport.Transport transport ,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile )throws java.lang.Exception
    {
        if(transport instanceof com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE )
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }
        else
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }  
    }

    java.lang.Object getResult(java.lang.Class destObj,java.lang.Object source,String resultName,ExtendedSoapSerializationEnvelope __envelope) throws java.lang.Exception
    {
        if(source==null)
        {
            return null;
        }
        if(source instanceof SoapPrimitive)
        {
            SoapPrimitive soap =(SoapPrimitive)source;
            if(soap.getName().equals(resultName))
            {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
        }
        else
        {
            SoapObject soap = (SoapObject)source;
            if (soap.hasProperty(resultName))
            {
                java.lang.Object j=soap.getProperty(resultName);
                if(j==null)
                {
                    return null;
                }
                java.lang.Object instance=__envelope.get(j,destObj,false);
                return instance;
            }
            else if( soap.getName().equals(resultName)) {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
       }

       return null;
    }

        
    public void changeStatusRemittanceBalance(final SicsGenericInput genericInput,final ChangeStatusRemittanceBalanceInput changeStatusRemittanceBalance ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","changeStatusRemittanceBalance",new ChangeStatusRemittanceBalanceInput().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "changeStatusRemittanceBalance");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="changeStatusRemittanceBalance";
                __info.type=ChangeStatusRemittanceBalanceInput.class;
                __info.setValue(changeStatusRemittanceBalance!=null?changeStatusRemittanceBalance:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return null;
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/changeStatusRemittanceBalance",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< Void>> changeStatusRemittanceBalanceAsync(final SicsGenericInput genericInput,final ChangeStatusRemittanceBalanceInput changeStatusRemittanceBalance)
    {
        return executeAsync(new Functions.IFunc< Void>()
        {
            @Override
            public Void Func() throws java.lang.Exception {
                changeStatusRemittanceBalance( genericInput,changeStatusRemittanceBalance);
                return null;
            }
        }) ;
    }
    
    public void createPolicyAccountingDetail(final SicsGenericInput genericInput,final PolicyAccountingDetail createPolicyAccountingDetailInput ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","createPolicyAccountingDetailInput",new PolicyAccountingDetail().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "createPolicyAccountingDetail");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="createPolicyAccountingDetailInput";
                __info.type=PolicyAccountingDetail.class;
                __info.setValue(createPolicyAccountingDetailInput!=null?createPolicyAccountingDetailInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return null;
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/createPolicyAccountingDetail",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< Void>> createPolicyAccountingDetailAsync(final SicsGenericInput genericInput,final PolicyAccountingDetail createPolicyAccountingDetailInput)
    {
        return executeAsync(new Functions.IFunc< Void>()
        {
            @Override
            public Void Func() throws java.lang.Exception {
                createPolicyAccountingDetail( genericInput,createPolicyAccountingDetailInput);
                return null;
            }
        }) ;
    }
    
    public void closeWorksheet(final SicsGenericInput genericInput,final CloseWorksheetInput closeWorksheet ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","closeWorksheet",new CloseWorksheetInput().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "closeWorksheet");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="closeWorksheet";
                __info.type=CloseWorksheetInput.class;
                __info.setValue(closeWorksheet!=null?closeWorksheet:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return null;
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/closeWorksheet",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< Void>> closeWorksheetAsync(final SicsGenericInput genericInput,final CloseWorksheetInput closeWorksheet)
    {
        return executeAsync(new Functions.IFunc< Void>()
        {
            @Override
            public Void Func() throws java.lang.Exception {
                closeWorksheet( genericInput,closeWorksheet);
                return null;
            }
        }) ;
    }
    
    public SicsAccountingWorksheetReference createWorksheet(final SicsGenericInput genericInput,final CreateBusinessWorksheetInput createWorksheet ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (SicsAccountingWorksheetReference)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","createWorksheet",new CreateBusinessWorksheetInput().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "createWorksheet");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="createWorksheet";
                __info.type=CreateBusinessWorksheetInput.class;
                __info.setValue(createWorksheet!=null?createWorksheet:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (SicsAccountingWorksheetReference)getResult(SicsAccountingWorksheetReference.class,__result,"worksheet",__envelope);
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/createWorksheet",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< SicsAccountingWorksheetReference>> createWorksheetAsync(final SicsGenericInput genericInput,final CreateBusinessWorksheetInput createWorksheet)
    {
        return executeAsync(new Functions.IFunc< SicsAccountingWorksheetReference>() {
            public SicsAccountingWorksheetReference Func() throws java.lang.Exception {
                return createWorksheet( genericInput,createWorksheet);
            }
        });
    }
    
    public SicsLedgerRemittanceBalanceReference createRemittanceBalance(final SicsGenericInput genericInput,final CreateRemittanceBalanceInput createRemittanceBalance ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (SicsLedgerRemittanceBalanceReference)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","createRemittanceBalance",new CreateRemittanceBalanceInput().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "createRemittanceBalance");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="createRemittanceBalance";
                __info.type=CreateRemittanceBalanceInput.class;
                __info.setValue(createRemittanceBalance!=null?createRemittanceBalance:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (SicsLedgerRemittanceBalanceReference)getResult(SicsLedgerRemittanceBalanceReference.class,__result,"remittanceBalance",__envelope);
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/createRemittanceBalance",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< SicsLedgerRemittanceBalanceReference>> createRemittanceBalanceAsync(final SicsGenericInput genericInput,final CreateRemittanceBalanceInput createRemittanceBalance)
    {
        return executeAsync(new Functions.IFunc< SicsLedgerRemittanceBalanceReference>() {
            public SicsLedgerRemittanceBalanceReference Func() throws java.lang.Exception {
                return createRemittanceBalance( genericInput,createRemittanceBalance);
            }
        });
    }
    
    public LedgerBalancePairing createBalancePairing(final SicsGenericInput genericInput,final LedgerBalancePairingInput balancePairingInput ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (LedgerBalancePairing)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","balancePairingInput",new LedgerBalancePairingInput().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "createBalancePairing");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="balancePairingInput";
                __info.type=LedgerBalancePairingInput.class;
                __info.setValue(balancePairingInput!=null?balancePairingInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (LedgerBalancePairing)getResult(LedgerBalancePairing.class,__result,"ledgerBalancePairing",__envelope);
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/createBalancePairing",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< LedgerBalancePairing>> createBalancePairingAsync(final SicsGenericInput genericInput,final LedgerBalancePairingInput balancePairingInput)
    {
        return executeAsync(new Functions.IFunc< LedgerBalancePairing>() {
            public LedgerBalancePairing Func() throws java.lang.Exception {
                return createBalancePairing( genericInput,balancePairingInput);
            }
        });
    }
    
    public ArrayOfSicsAccountingWorksheetReference createFGUClaimWorksheet(final SicsGenericInput genericInput,final CreateFGUClaimWorksheetInput createFGUClaimWorksheet ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (ArrayOfSicsAccountingWorksheetReference)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","createFGUClaimWorksheet",new CreateFGUClaimWorksheetInput().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "createFGUClaimWorksheet");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="createFGUClaimWorksheet";
                __info.type=CreateFGUClaimWorksheetInput.class;
                __info.setValue(createFGUClaimWorksheet!=null?createFGUClaimWorksheet:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (ArrayOfSicsAccountingWorksheetReference)getResult(ArrayOfSicsAccountingWorksheetReference.class,__result,"ArrayOfSicsAccountingWorksheetReference",__envelope);
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/createFGUClaimWorksheet",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< ArrayOfSicsAccountingWorksheetReference>> createFGUClaimWorksheetAsync(final SicsGenericInput genericInput,final CreateFGUClaimWorksheetInput createFGUClaimWorksheet)
    {
        return executeAsync(new Functions.IFunc< ArrayOfSicsAccountingWorksheetReference>() {
            public ArrayOfSicsAccountingWorksheetReference Func() throws java.lang.Exception {
                return createFGUClaimWorksheet( genericInput,createFGUClaimWorksheet);
            }
        });
    }
    
    public SicsAccountingClaimWorksheetReference createClaimWorksheet(final SicsGenericInput genericInput,final CreateClaimWorksheetInput createClaimWorksheet ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (SicsAccountingClaimWorksheetReference)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","createClaimWorksheet",new CreateClaimWorksheetInput().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "createClaimWorksheet");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="createClaimWorksheet";
                __info.type=CreateClaimWorksheetInput.class;
                __info.setValue(createClaimWorksheet!=null?createClaimWorksheet:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (SicsAccountingClaimWorksheetReference)getResult(SicsAccountingClaimWorksheetReference.class,__result,"worksheet",__envelope);
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/createClaimWorksheet",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< SicsAccountingClaimWorksheetReference>> createClaimWorksheetAsync(final SicsGenericInput genericInput,final CreateClaimWorksheetInput createClaimWorksheet)
    {
        return executeAsync(new Functions.IFunc< SicsAccountingClaimWorksheetReference>() {
            public SicsAccountingClaimWorksheetReference Func() throws java.lang.Exception {
                return createClaimWorksheet( genericInput,createClaimWorksheet);
            }
        });
    }
    
    public void createPolicyAccountingClaimDetail(final SicsGenericInput genericInput,final PolicyAccountingClaimDetail createPolicyAccountingClaimDetailInput ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","createPolicyAccountingClaimDetailInput",new PolicyAccountingClaimDetail().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "createPolicyAccountingClaimDetail");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="createPolicyAccountingClaimDetailInput";
                __info.type=PolicyAccountingClaimDetail.class;
                __info.setValue(createPolicyAccountingClaimDetailInput!=null?createPolicyAccountingClaimDetailInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return null;
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/createPolicyAccountingClaimDetail",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< Void>> createPolicyAccountingClaimDetailAsync(final SicsGenericInput genericInput,final PolicyAccountingClaimDetail createPolicyAccountingClaimDetailInput)
    {
        return executeAsync(new Functions.IFunc< Void>()
        {
            @Override
            public Void Func() throws java.lang.Exception {
                createPolicyAccountingClaimDetail( genericInput,createPolicyAccountingClaimDetailInput);
                return null;
            }
        }) ;
    }
    
    public SicsAccountingWorksheetReference reverseTechnicalWorksheet(final SicsGenericInput genericInput,final ReverseTechnicalWorksheetInput reverseTechnicalWorksheet ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (SicsAccountingWorksheetReference)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","reverseTechnicalWorksheet",new ReverseTechnicalWorksheetInput().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "reverseTechnicalWorksheet");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="reverseTechnicalWorksheet";
                __info.type=ReverseTechnicalWorksheetInput.class;
                __info.setValue(reverseTechnicalWorksheet!=null?reverseTechnicalWorksheet:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (SicsAccountingWorksheetReference)getResult(SicsAccountingWorksheetReference.class,__result,"worksheet",__envelope);
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/reverseTechnicalWorksheet",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< SicsAccountingWorksheetReference>> reverseTechnicalWorksheetAsync(final SicsGenericInput genericInput,final ReverseTechnicalWorksheetInput reverseTechnicalWorksheet)
    {
        return executeAsync(new Functions.IFunc< SicsAccountingWorksheetReference>() {
            public SicsAccountingWorksheetReference Func() throws java.lang.Exception {
                return reverseTechnicalWorksheet( genericInput,reverseTechnicalWorksheet);
            }
        });
    }
    
    public String updateWorksheetBalanceInformation(final SicsGenericInput genericInput,final UpdateWorksheetBalanceInformationInput updateWorksheetBalanceInformationInput ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (String)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("","genericInput",new SicsGenericInput().getClass());
                __envelope.addMapping("","updateWorksheetBalanceInformationInput",new UpdateWorksheetBalanceInformationInput().getClass());
                SoapObject __soapReq = new SoapObject("urn:SicsWsPcAccountingEntryPoint", "updateWorksheetBalanceInformation");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="genericInput";
                __info.type=SicsGenericInput.class;
                __info.setValue(genericInput!=null?genericInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="";
                __info.name="updateWorksheetBalanceInformationInput";
                __info.type=UpdateWorksheetBalanceInformationInput.class;
                __info.setValue(updateWorksheetBalanceInformationInput!=null?updateWorksheetBalanceInformationInput:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                SoapObject __soap=(SoapObject)__result;
                java.lang.Object obj = __soap.getProperty("resultString");
                if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    return j.toString();
                }
                else if (obj!= null && obj instanceof String){
                    return (String)obj;
                }
                return null;
            }
        },"http://www.SicsWsPcAccountingEntryPoint.com/SicsWsPcAccountingEntryPoint-interface/updateWorksheetBalanceInformation",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, OperationResult< String>> updateWorksheetBalanceInformationAsync(final SicsGenericInput genericInput,final UpdateWorksheetBalanceInformationInput updateWorksheetBalanceInformationInput)
    {
        return executeAsync(new Functions.IFunc< String>() {
            public String Func() throws java.lang.Exception {
                return updateWorksheetBalanceInformation( genericInput,updateWorksheetBalanceInformationInput);
            }
        });
    }

    
    protected java.lang.Object execute(IWcfMethod wcfMethod,String methodName,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile) throws java.lang.Exception
    {
        org.ksoap2.transport.Transport __httpTransport=createTransport();
        __httpTransport.debug=enableLogging;
        ExtendedSoapSerializationEnvelope __envelope=wcfMethod.CreateSoapEnvelope();
        try
        {
            sendRequest(methodName, __envelope, __httpTransport,profile);
            
        }
        finally {
            if (__httpTransport.debug) {
                if (__httpTransport.requestDump != null) {
                    android.util.Log.i("requestDump",__httpTransport.requestDump);    
                    
                }
                if (__httpTransport.responseDump != null) {
                    android.util.Log.i("responseDump",__httpTransport.responseDump);
                }
            }
        }
        java.lang.Object __retObj = __envelope.bodyIn;
        if (__retObj instanceof org.ksoap2.SoapFault){
            org.ksoap2.SoapFault __fault = (org.ksoap2.SoapFault)__retObj;
            throw convertToException(__fault,__envelope);
        }else{
            return wcfMethod.ProcessResult(__envelope,__retObj);
        }
    }
    
    protected < T> android.os.AsyncTask< Void, Void, OperationResult< T>>  executeAsync(final Functions.IFunc< T> func)
    {
        return new android.os.AsyncTask< Void, Void, OperationResult< T>>()
        {
            @Override
            protected void onPreExecute() {
                callback.Starting();
            };
            @Override
            protected OperationResult< T> doInBackground(Void... params) {
                OperationResult< T> result = new OperationResult< T>();
                try
                {
                    result.Result= func.Func();
                }
                catch(java.lang.Exception ex)
                {
                    ex.printStackTrace();
                    result.Exception=ex;
                }
                return result;
            }
            
            @Override
            protected void onPostExecute(OperationResult< T> result)
            {
                callback.Completed(result);
            }
        }.execute();
    }
        
    java.lang.Exception convertToException(org.ksoap2.SoapFault fault,ExtendedSoapSerializationEnvelope envelope)
    {

        if(fault.detail!=null && fault.detail.getChildCount()>0)
        {
            Element detailsNode=(Element)fault.detail.getChild(0);
            try
            {
                SoapObject exceptionObject = null;
                exceptionObject=envelope.GetExceptionDetail(detailsNode,"http://www.SicsNt.com/SystemTypes","SicsFaultDetails");
                if (exceptionObject != null)
                {
                    return new SicsFaultDetails(exceptionObject,envelope);
                }
            }
            catch (java.lang.Exception e)
            {
                e.printStackTrace();
            }
        }
        return new java.lang.Exception(fault.faultstring);
    }
}


