package thesiscsc.thesiscsc;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import thesiscsc.thesiscsc.pager.Tabsadapter;

/**
 * Created by thang on 12.01.2017.
 */

public class MenuActivity extends AppCompatActivity implements ActionBar.TabListener{

    private ViewPager tabsviewPager;
    private Tabsadapter mTabsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.inject(this);

        initializeTabs();

    }


    public void initializeTabs(){
        tabsviewPager = (ViewPager) findViewById(R.id.tabspager);
        tabsviewPager.setOffscreenPageLimit(2);

        mTabsAdapter = new Tabsadapter(getSupportFragmentManager());

        tabsviewPager.setAdapter(mTabsAdapter);
        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab channeltab = getSupportActionBar().newTab().setTabListener(this);
        ActionBar.Tab settingstab = getSupportActionBar().newTab().setTabListener(this);
        ActionBar.Tab accounttab = getSupportActionBar().newTab().setTabListener(this);
        channeltab.setIcon(R.drawable.test);
        settingstab.setIcon(R.drawable.test);
        accounttab.setIcon(R.drawable.test);

        getSupportActionBar().addTab(channeltab);
        getSupportActionBar().addTab(accounttab);
        getSupportActionBar().addTab(settingstab);

        //This helps in providing swiping effect for v7 compat library
        tabsviewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                // TODO Auto-generated method stub
                getSupportActionBar().setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });
    }
    @Override
    public void onBackPressed() {

        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
        } else {
            getFragmentManager().popBackStack();
        }

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        tabsviewPager.setCurrentItem(tab.getPosition());
        int tabIconColor = ContextCompat.getColor(getApplicationContext(), R.color.RosyBrown);
        tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        int tabIconColor = ContextCompat.getColor(getApplicationContext(), R.color.Black);
        tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
