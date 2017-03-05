package thesiscsc.thesiscsc.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
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

import java.util.ArrayList;
import java.util.List;

import SicsWsAdministrationEntryPoint.ServerInformation;
import SicsWsAdministrationEntryPoint.SicsWsAdministrationEntryPointBinding;
import thesiscsc.thesiscsc.R;
import thesiscsc.thesiscsc.asyncMethods.ExcecuteAboutService;
import thesiscsc.thesiscsc.model.Task;
import thesiscsc.thesiscsc.model.User;

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

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    getActivity().finish();
                    return true;

                }

                return false;
            }
        });
    }

    private void setUpOnClickListeners() {
        taskView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallIsAvailableService cia = new CallIsAvailableService();
                try {
                    Toast.makeText(getActivity(), cia.execute().get(), Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                }            }
        });

        paymentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallAboutService cas = new CallAboutService();
                try {
                    Toast.makeText(getActivity(), cas.execute().get(), Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                }
            }
        });
        //TODO: FIX THIS
        adminView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallFullRefreshService cfrs = new CallFullRefreshService();
                try {
                    Toast.makeText(getActivity(), cfrs.execute().get(), Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                }

            }
        });

        settingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallShutdownService css = new CallShutdownService();
                try {
                    Toast.makeText(getActivity(), css.execute().get(), Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                }
            }
        });

    }

    private void nextFragment(Fragment a, String tag, int index) {
        final FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frame, a, tag).commit();
        navigationView.getMenu().getItem(index).setChecked(true);
    }

    class CallAboutService extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            SharedPreferences prefs = getActivity().getSharedPreferences("credentials", Context.MODE_PRIVATE);
            SicsWsAdministrationEntryPointBinding service = new SicsWsAdministrationEntryPointBinding(null, "http://" + prefs.getString("ip", "") + "/SwanLake/SicsWSServlet");

            try {
                ServerInformation res = service.about();
                return res.signature;

            } catch (Exception e) {
                Log.d("ExcecuteAboutService", e.toString());
                return "Something went wrong";
            }
        }
    }

    class CallShutdownService extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            SharedPreferences prefs = getActivity().getSharedPreferences("credentials", Context.MODE_PRIVATE);
            SicsWsAdministrationEntryPointBinding service = new SicsWsAdministrationEntryPointBinding(null, "http://" + prefs.getString("ip", "") + "/SwanLake/SicsWSServlet");

            try {
                ServerInformation res = service.about();
                return "Sending shutdown command...";

            } catch (Exception e) {
                Log.d("ExcecuteAboutService", e.toString());
                return "Something went wrong";
            }
        }
    }

    class CallFullRefreshService extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            SharedPreferences prefs = getActivity().getSharedPreferences("credentials", Context.MODE_PRIVATE);
            SicsWsAdministrationEntryPointBinding service = new SicsWsAdministrationEntryPointBinding(null, "http://" + prefs.getString("ip", "") + "/SwanLake/SicsWSServlet");

            try {
                return service.fullRefresh();
            } catch (Exception e) {
                Log.d("ExcecuteAboutService", e.toString());
                return "Something went wrong";
            }
        }
    }

    class CallIsAvailableService extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            SharedPreferences prefs = getActivity().getSharedPreferences("credentials", Context.MODE_PRIVATE);
            SicsWsAdministrationEntryPointBinding service = new SicsWsAdministrationEntryPointBinding(null, "http://" + prefs.getString("ip", "") + "/SwanLake/SicsWSServlet");

            try {
                Boolean res = service.isAvailable();
                if (res) {
                    return "Server is available.";
                } else {
                    return "Server is not available";
                }
            } catch (Exception e) {
                Log.d("ExcecuteAboutService", e.toString());
                return "Something went wrong";
            }
        }
    }
}