package thesiscsc.thesiscsc.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import thesiscsc.thesiscsc.PaymentActivity;
import thesiscsc.thesiscsc.R;
import thesiscsc.thesiscsc.other.CallIsAvailable;

/**
 * Created by thang on 16.01.2017.
 */
public class TestOneFragment extends Fragment {
    private ListView lv;
    private TextView text;
    private NavigationView navigationView;
    CardView taskView, paymentView, adminView, settingView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {
            String reply = new CallIsAvailable().CallIsAvailable(getContext());
        } catch (Exception e) {
            Log.d("ÆØÅ",Log.getStackTraceString(e));
        }
        View view = inflater.inflate(R.layout.testone_view, container, false);
        //lv = (ListView)view.findViewById(R.id.lv_channel);
        navigationView = (NavigationView) getActivity().findViewById(R.id.nav_view);
        text = (TextView) view.findViewById(R.id.textView2);
        taskView = (CardView) view.findViewById(R.id.viewIsAvailable);
        paymentView = (CardView) view.findViewById(R.id.viewAbout);
        adminView = (CardView) view.findViewById(R.id.viewRefresh);
        settingView = (CardView) view.findViewById(R.id.viewShutdown);
        setUpOnClickListeners();


        return view;

    }

    @Override
    public void onResume() {

        super.onResume();

        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK){
                    getActivity().finish();
                    return true;

                }

                return false;
            }
        });
    }

    private void setUpOnClickListeners(){
        taskView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextFragment(new TaskFragment(), "task", 1);
            }
        });

        paymentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(TestOneFragment.this.getActivity(), PaymentActivity.class);
                startActivity(paymentIntent);

                /*
                FragmentManager manager = getFragmentManager ();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.frame, new TestThreeFragment(), "payment").commit();
                //nextFragment(new AdminPanelFragment(), "adminPanel", 3);
                System.out.print("LOL");
                //nextFragment(new TestThreeFragment(), "home3", 2);
                */
            }
        });
        //TODO: FIX THIS
        adminView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextFragment(new AdminPanelFragment(), "adminPanel", 3);
            }
        });

        settingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextFragment(new SettingsFragment(), "Settings", 3);
            }
        });

    }

    private void nextFragment(Fragment a, String tag, int index){
        final FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frame, a, tag).commit();
        navigationView.getMenu().getItem(index).setChecked(true);
    }

}