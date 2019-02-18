package com.example.bottomnav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                Favourite favourite=new Favourite();
                return favourite;
            case 1:
               music music= new music();
               return music;
            case 2:
                Schedules schedules=new Schedules();
                return schedules;
        }
        return null;
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
