package com.masai.licious.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.masai.licious.R;


public class AlertFragment extends Fragment {

    public  static  AlertFragment newInstance(){
        AlertFragment alertFragment  =new AlertFragment();
        return alertFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alert, container, false);
    }
}