package com.ecommarce.cyberx.app.ecommarce.fragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.ecommarce.cyberx.app.ecommarce.R;
import com.ecommarce.cyberx.app.ecommarce.activity.ArtistDetailsActivity;

import org.w3c.dom.Text;

public class ArtistFragment extends Fragment {
    TextView clickName;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.colorPrimary));
            View decore = getActivity().getWindow().getDecorView();
//            decore.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            decore.setSystemUiVisibility(0);
        }

        View view =  inflater.inflate(R.layout.fragment_artist, container, false);
        clickName = view.findViewById(R.id.clickName);
        clickName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("sajal","button clicked");
                Intent intent = new Intent(getActivity(),ArtistDetailsActivity.class);
                startActivity(intent);
            }
        });
        return  view;


    }

}