package thesiscsc.thesiscsc.fragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import thesiscsc.thesiscsc.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Adam on 05.03.2017.
 */

public class SettingsFragment extends Fragment {
    private ListView lv;
    private TextView title,serverIP;
    View colorView;
    private Switch colorSwitch;
    private EditText ip;
    private Button btnSetIP, btnSetIPHome, btnSetIPHotspot, btnSetGlobalIP;
    private NavigationView navigationView;
    private SharedPreferences prefs;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        View view2 = inflater.inflate(R.layout.list_item_card_small, container, false);
        colorView = view2.findViewById(R.id.taskStatusColor);
        navigationView = (NavigationView) getActivity().findViewById(R.id.nav_view);
        title = (TextView) view.findViewById(R.id.settingsTitleTextView);
        serverIP = (TextView) view.findViewById(R.id.setServerIPTextView);
        ip = (EditText) view.findViewById(R.id.IPEditText);
        btnSetIP = (Button) view.findViewById(R.id.SetIPButton);
        btnSetIPHome = (Button) view.findViewById(R.id.SetIPHomeButton);
        btnSetIPHotspot = (Button) view.findViewById(R.id.SetIPHotspotButton);
        btnSetGlobalIP = (Button) view.findViewById(R.id.btnHomeGlobalIp);
        prefs = getActivity().getSharedPreferences("credentials", MODE_PRIVATE);
        ip.setText(prefs.getString("ip",""));

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Settings");

        btnSetIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putString("ip", ip.getText().toString()).apply();
                Toast.makeText(getActivity(), "'" + ip.getText().toString() + "' set as new server IP.", Toast.LENGTH_LONG).show();
                ip.setText(prefs.getString("ip",""));
            }
        });

        btnSetIPHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putString("ip", "10.0.0.60:8080").apply();
                Toast.makeText(getActivity(), "'" + "10.0.0.60:8080" + "' set as new server IP.", Toast.LENGTH_LONG).show();
                ip.setText(prefs.getString("ip",""));
            }
        });

        btnSetIPHotspot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putString("ip", "192.168.43.197:8080").apply();
                Toast.makeText(getActivity(), "'" + "192.168.43.197:8080" + "' set as new server IP.", Toast.LENGTH_LONG).show();
                ip.setText(prefs.getString("ip",""));
            }
        });

        btnSetGlobalIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putString("ip", "88.89.219.196:8080").apply();
                Toast.makeText(getActivity(), "'" + "88.89.219.196:8080" + "' set as new server IP.", Toast.LENGTH_LONG).show();
                ip.setText(prefs.getString("ip",""));
            }
        });
        colorSwitch = (Switch) view.findViewById(R.id.switchColor);

        //set the switch to Off
        SharedPreferences prefs = getContext().getSharedPreferences("colorBlindMode", MODE_PRIVATE);
        colorSwitch.setChecked(prefs.getBoolean("isColorBlind", true));
        //attach a listener to check for changes in state
        colorSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    System.out.println("Color Switch On");
                    SharedPreferences.Editor editor = getContext().getSharedPreferences("colorBlindMode", MODE_PRIVATE).edit();
                    editor.putBoolean("isColorBlind", true);
                    editor.apply();

                }else{
                    System.out.println("Color Switch Off");
                    SharedPreferences.Editor editor = getContext().getSharedPreferences("colorBlindMode", MODE_PRIVATE).edit();
                    editor.putBoolean("isColorBlind", false);
                    editor.apply();
                }
            }
        });

        return view;
    }
}