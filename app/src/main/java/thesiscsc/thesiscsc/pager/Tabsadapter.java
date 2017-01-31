package thesiscsc.thesiscsc.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import thesiscsc.thesiscsc.fragment.TestOneFragment;
import thesiscsc.thesiscsc.fragment.TestThreeFragment;
import thesiscsc.thesiscsc.fragment.TaskFragment;

/**
 * Created by thang on 16.01.2017.
 */
public class Tabsadapter  extends FragmentStatePagerAdapter {

    private int TOTAL_TABS = 3;

    public Tabsadapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int index) {
        // TODO Auto-generated method stub
        switch (index) {
            case 0:
                return new TestOneFragment();

            case 1:
                return new TaskFragment();

            case 2:
                return new TestThreeFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return TOTAL_TABS;
    }

}