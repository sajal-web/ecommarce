package com.ecommarce.cyberx.app.ecommarce.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
ProgressBar pgLoading;
String name,email,password,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerBinding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(registerBinding.getRoot());



       registerBinding.regSubmit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
//               tvError.setVisibility(View.GONE);
               pgLoading.setVisibility(View.VISIBLE);
               name = registerBinding.regName.getText().toString();
               email = registerBinding.regEmail.getText().toString();
               password = registerBinding.regPassword.getText().toString();
               mobile = registerBinding.regNumber.getText().toString();
               RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
               String url ="http://192.168.43.135/ecommarceapp/signup.php";

               StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                       new Response.Listener<String>() {
                           @Override
                           public void onResponse(String response) {

                                if (response.equals("success")){
                                    pgLoading.setVisibility(View.GONE);
                                    Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                                    startActivity(intent);
                                    finish();
                                }else {
                                registerBinding.tvError.setText(response);
                                registerBinding.tvError.setVisibility(View.VISIBLE);
                                }
                           }
                       }, new Response.ErrorListener() {
                   @Override
                   public void onErrorResponse(VolleyError error) {
                    pgLoading.setVisibility(View.GONE);
                   }
               }){
                   protected Map<String, String> getParams(){
                       Map<String, String> paramV = new HashMap<>();
                       paramV.put("name", name);
                        paramV.put("email", email);
                        paramV.put("password", password);
                        paramV.put("mobile",mobile);
                       return paramV;
                   }
               };
               queue.add(stringRequest);
           }
       });
    }
}