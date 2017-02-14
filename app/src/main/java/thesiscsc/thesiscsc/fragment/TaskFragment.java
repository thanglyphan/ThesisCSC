package thesiscsc.thesiscsc.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import java.util.Date;

import thesiscsc.thesiscsc.R;

import static android.view.View.GONE;

/**
 * Created by thang on 16.01.2017.
 */
public class TaskFragment extends Fragment {
    public SharedPreferences prefs;
    private ListView lv;
    private MaterialViewPager mViewPager;
    private Toolbar toolbar;
    private String username;
    private String token;
    private Date token_exp;


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        //View view = inflater.inflate(R.layout.testtwo_view, container, false);
        //lv = (ListView)view.findViewById(R.id.lv_channel);
        View view = inflater.inflate(R.layout.two_fragment_view, container, false);

        mViewPager = (MaterialViewPager) view.findViewById(R.id.materialViewPager);
        prefs = this.getActivity().getSharedPreferences("credentials", Context.MODE_PRIVATE);
        mViewPager.getToolbar().setVisibility(GONE);
        toolbar = mViewPager.getToolbar();

        if (toolbar != null) {
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        }

        mViewPager.getViewPager().setAdapter(new FragmentStatePagerAdapter(getActivity().getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        RecyclerViewFragment during = new RecyclerViewFragment();
                        during.addPosition(position);
                        during.addUsername(username, token, token_exp);
                        return during;
                    case 1:
                        RecyclerViewFragment intask = new RecyclerViewFragment();
                        intask.addPosition(position);
                        intask.addUsername(username, token, token_exp);
                        return intask;
                    case 2:
                        RecyclerViewFragment ended = new RecyclerViewFragment();
                        ended.addPosition(position);
                        ended.addUsername(username, token, token_exp);
                        return ended;
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position % 3) {
                    case 0:
                        return "Pågår";
                    case 1:
                        return "Kommende";
                    case 2:
                        return "Avsluttet";
                }
                return "";
            }
        });

        //Fjerne denne hvis vi ikke skal bruke bilder.
        /*mViewPager.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                switch (page) {
                    case 0:
                        //return HeaderDesign.fromColorResAndUrl(
                                //R.color.red,
                                //"https://www.bodybuilding.com/images/2016/july/train-like-dwayne-the-rock-johnson-bigshot-v2-830x467.jpg");
                    case 1:
                        //return HeaderDesign.fromColorResAndUrl(
                               // R.color.red,
                                //"http://www.sanandreshoy.com/media/social/famosos/Hayden%20Panettiere/6.jpg");
                    case 2:
                       // return HeaderDesign.fromColorResAndUrl(
                            //    R.color.red,
                             //   "http://heightline.com/wp-content/uploads/Tom-Cruise-smile.jpg");
                }

                return null;
            }

        });*/

        mViewPager.getViewPager().setOffscreenPageLimit(mViewPager.getViewPager().getAdapter().getCount());
        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());

        View logo = getActivity().findViewById(R.id.logo_white);
        if (logo != null) {
            logo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mViewPager.notifyHeaderChanged();
                    Toast.makeText(getContext().getApplicationContext(), "Yes, the title is clickable", Toast.LENGTH_SHORT).show();
                }
            });
        }


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

    public void loadInfo(String gUsername, String gToken, Long gDate) {
        this.username = gUsername; //prefs.getString("username", "");
        this.token = gToken; //prefs.getString("token", "");
        this.token_exp = new Date(gDate); //new Date(prefs.getLong("exp", 0));
    }
}