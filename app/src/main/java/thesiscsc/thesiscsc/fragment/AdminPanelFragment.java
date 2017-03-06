package thesiscsc.thesiscsc.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
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

import java.util.concurrent.TimeUnit;

import SicsWsAdministrationEntryPoint.ServerInformation;
import SicsWsAdministrationEntryPoint.SicsWsAdministrationEntryPointBinding;
import thesiscsc.thesiscsc.R;

/**
 * Created by thang on 16.01.2017.
 */
public class AdminPanelFragment extends Fragment {
    private ListView lv;
    private TextView text;
    private NavigationView navigationView;
    CardView isAvailableView, aboutView, fullRefreshView, shutdownView;
SharedPreferences prefs;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_admin_panel, container, false);
        //lv = (ListView)view.findViewById(R.id.lv_channel);
        navigationView = (NavigationView) getActivity().findViewById(R.id.nav_view);
        text = (TextView) view.findViewById(R.id.textView2);
        isAvailableView = (CardView) view.findViewById(R.id.viewIsAvailable);
        aboutView = (CardView) view.findViewById(R.id.viewAbout);
        fullRefreshView = (CardView) view.findViewById(R.id.viewRefresh);
        shutdownView = (CardView) view.findViewById(R.id.viewShutdown);
        setUpOnClickListeners();
        prefs = getActivity().getSharedPreferences("credentials", Context.MODE_PRIVATE);

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
        isAvailableView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("IPADMIN", prefs.getString("ip",""));
                CallIsAvailableService cia = new CallIsAvailableService();
                try {
                    String reply = cia.execute().get(5000, TimeUnit.MILLISECONDS);
                    Toast.makeText(getActivity(), reply, Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Log.d("ÆØÅ",Log.getStackTraceString(e));
                    Toast.makeText(getActivity(), "Server is not available", Toast.LENGTH_LONG).show();
                }
            }
        });

        aboutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallAboutService cas = new CallAboutService();
                try {
                    String reply = cas.execute().get(5000, TimeUnit.MILLISECONDS);
                    Toast.makeText(getActivity(), reply, Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getActivity(), "Server is not available", Toast.LENGTH_LONG).show();
                }
            }
        });

        fullRefreshView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallFullRefreshService cfrs = new CallFullRefreshService();
                try {
                    String reply = cfrs.execute().get(5000, TimeUnit.MILLISECONDS);
                    Toast.makeText(getActivity(), reply, Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getActivity(), "Server is not available", Toast.LENGTH_LONG).show();
                }

            }
        });

        shutdownView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallShutdownService css = new CallShutdownService();
                try {
                    String reply = css.execute().get(5000, TimeUnit.MILLISECONDS);
                    Toast.makeText(getActivity(), reply, Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getActivity(), "Server is not available", Toast.LENGTH_LONG).show();
                }
            }
        });

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
            Log.d("IPADMIN", prefs.getString("ip",""));
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