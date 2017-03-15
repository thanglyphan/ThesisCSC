package SicsWsDomainSearchEntryPoint;

import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

import SicsWsDomainRetrievalEntryPoint.*;
import SicsWsDomainRetrievalEntryPoint.DomainObjectReference;

/**
 * Created by Adam on 12.03.2017.
 */

public class AltInput extends AttributeContainer implements KvmSerializable,java.io.Serializable {
    public AltInput ()
    {
    }

    public AltInput (Object paramObj, SicsWsDomainRetrievalEntryPoint.ExtendedSoapSerializationEnvelope __envelope)
    {
    }

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
       /* if(propertyIndex==0)
        {
            return referenceObject;
        }
        if(propertyIndex==1)
        {
            return this.amendmentNumber!=null?this.amendmentNumber: SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return specification;
        }*/
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 3;
    }


    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = DomainObjectReference.class;
            info.name = "referenceObject";
            info.namespace= "ns4:SicsLedgerRemittanceBalanceReference";

        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "amendmentNumber";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = Specification.class;
            info.name = "specification";
            info.namespace= "";
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }
}
