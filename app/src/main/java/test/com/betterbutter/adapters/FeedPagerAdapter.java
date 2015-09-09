package test.com.betterbutter.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import test.com.betterbutter.fragments.FeedFragment;
import test.com.betterbutter.fragments.InformationFragment;

/**
 *
 * Created by Aditya Narayan on 9/9/2015.
 *
 */

public class FeedPagerAdapter extends FragmentPagerAdapter {

    String[] names = {"Popular Now", "Information"};

    public FeedPagerAdapter(FragmentManager fm, Context applicationContext) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FeedFragment();
            case 1:
                return new InformationFragment();
            default:
                return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }

    @Override
    public int getCount() {
        return names.length;
    }
}
