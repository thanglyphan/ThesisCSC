package thesiscsc.thesiscsc.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import thesiscsc.thesiscsc.R;

/**
 * Created by thang on 16.01.2017.
 */
public class AdminPanelFragment extends Fragment {
    private ListView lv;
    private TextView text;
    private NavigationView navigationView;
    CardView taskView, paymentView, adminView, settingView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_admin_panel, container, false);
        //lv = (ListView)view.findViewById(R.id.lv_channel);
        navigationView = (NavigationView) getActivity().findViewById(R.id.nav_view);
        text = (TextView) view.findViewById(R.id.textView2);
        taskView = (CardView) view.findViewById(R.id.viewTask);
        paymentView = (CardView) view.findViewById(R.id.viewPay);
        adminView = (CardView) view.findViewById(R.id.viewAdmin);
        settingView = (CardView) view.findViewById(R.id.viewSettings);
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
                nextFragment(new TestThreeFragment(), "home3", 2);
            }
        });
        //TODO: FIX THIS
        adminView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextFragment(new AdminPanelFragment(), "adminPanel", 3);
                System.out.print("LOL");
            }
        });

        settingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("LOL");
            }
        });

    }

    private void nextFragment(Fragment a, String tag, int index){
        final FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frame, a, tag).commit();
        navigationView.getMenu().getItem(index).setChecked(true);
    }

}