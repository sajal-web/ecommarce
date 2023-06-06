package com.ecommarce.cyberx.app.ecommarce.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.ecommarce.cyberx.app.ecommarce.R;
import com.ecommarce.cyberx.app.ecommarce.adapter.artistTabAdapter;
import com.ecommarce.cyberx.app.ecommarce.databinding.ActivityArtistDetailsBinding;
import com.google.android.material.tabs.TabLayout;
public class ArtistDetailsActivity extends AppCompatActivity {
        ActivityArtistDetailsBinding activityArtistDetailsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityArtistDetailsBinding = ActivityArtistDetailsBinding.inflate(getLayoutInflater());
        setContentView(activityArtistDetailsBinding.getRoot());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            ArtistDetailsActivity.this.getWindow().setStatusBarColor(ArtistDetailsActivity.this.getColor(R.color.white));
            View decore = ArtistDetailsActivity.this.getWindow().getDecorView();
            decore.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        activityArtistDetailsBinding.tabLayout.addTab(activityArtistDetailsBinding.tabLayout.newTab().setText("Art Works"));
        activityArtistDetailsBinding.tabLayout.addTab(activityArtistDetailsBinding.tabLayout.newTab().setText("Attend Exhibitions"));
        activityArtistDetailsBinding.tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final artistTabAdapter tabAdapter  = new artistTabAdapter(this,getSupportFragmentManager(),activityArtistDetailsBinding.tabLayout.getTabCount());
        activityArtistDetailsBinding.viewPager.setAdapter(tabAdapter);
        activityArtistDetailsBinding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                activityArtistDetailsBinding.viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        activityArtistDetailsBinding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(activityArtistDetailsBinding.tabLayout));
    }
}