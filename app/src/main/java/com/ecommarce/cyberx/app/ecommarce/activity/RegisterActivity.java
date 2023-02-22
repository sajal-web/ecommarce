package com.ecommarce.cyberx.app.ecommarce.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ecommarce.cyberx.app.ecommarce.R;
import com.ecommarce.cyberx.app.ecommarce.databinding.ActivityRegisterBinding;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding registerBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerBinding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(registerBinding.getRoot());

    }
}