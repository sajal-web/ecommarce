package com.ecommarce.cyberx.app.ecommarce.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ecommarce.cyberx.app.ecommarce.R;
import com.ecommarce.cyberx.app.ecommarce.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
    }
}