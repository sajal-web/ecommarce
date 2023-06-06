package com.ecommarce.cyberx.app.ecommarce.fragments.artistDetails;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecommarce.cyberx.app.ecommarce.R;
public class artWorkFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_art_work, container, false);
        return  view;
    }
}