package thesiscsc.thesiscsc.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
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
public class TestOneFragment extends Fragment {
    public SharedPreferences prefs;
    private ListView lv;
    private TextView text;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.testone_view, container, false);
        //lv = (ListView)view.findViewById(R.id.lv_channel);
        text = (TextView) view.findViewById(R.id.textView2);
        CardView cardViewTask = (CardView) view.findViewById(R.id.viewTask);

        cardViewTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Moving to Task Management");
            }
        });

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

    private void nextFragment(Fragment a){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.channel_frame, a);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
    }

}