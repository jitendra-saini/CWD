package com.example.cw;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    int number_of_tabs;
    public PageAdapter(FragmentManager fm,int number_of_tabs) {
        super(fm);
        this.number_of_tabs=number_of_tabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){

            case 0:
                return new Chat();
            case 1:
                return new Status();
            case 2:
                return new Calls();
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return number_of_tabs;
    }
}
