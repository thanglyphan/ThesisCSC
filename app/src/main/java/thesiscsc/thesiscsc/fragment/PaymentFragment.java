package thesiscsc.thesiscsc.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ksoap2.serialization.SoapObject;

import thesiscsc.thesiscsc.R;
import thesiscsc.thesiscsc.asyncMethods.ExcecuteRetrieveObjectService;

/**
 * Created by Adam on 06.03.2017.
 */

public class PaymentFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_payment, container, false);

        /*ExcecuteRetrieveObjectService excecuteRetrieveObjectService = new ExcecuteRetrieveObjectService(this.getContext());
        try {
            String hei = excecuteRetrieveObjectService.execute().get();
        } catch (Exception e){
            Log.d("exception", e.toString());
        }
        */

        return view;
    }
}
