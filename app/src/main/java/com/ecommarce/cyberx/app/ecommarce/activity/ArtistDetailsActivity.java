package com.ecommarce.cyberx.app.ecommarce.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.ecommarce.cyberx.app.ecommarce.R;
import com.ecommarce.cyberx.app.ecommarce.databinding.ActivityArtistDetailsBinding;

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

    }
}