package com.ecommarce.cyberx.app.ecommarce.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.ecommarce.cyberx.app.ecommarce.fragments.ArtWorkFragment;
import com.ecommarce.cyberx.app.ecommarce.fragments.ArtistAttendExhibitionFragment;
import com.ecommarce.cyberx.app.ecommarce.fragments.ArtistFragment;
import com.ecommarce.cyberx.app.ecommarce.fragments.HomeFragment;

public class artistTabAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;
    public  artistTabAdapter(Context context,FragmentManager fm, int totalTabs){
        super(fm);
        myContext= context;
        this.totalTabs = totalTabs;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                ArtWorkFragment artWorkFragment = new ArtWorkFragment();
                return  artWorkFragment;
              case 1:
                ArtistAttendExhibitionFragment artistAttendExhibitionFragment = new ArtistAttendExhibitionFragment();
                return  artistAttendExhibitionFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
