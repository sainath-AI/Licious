package com.masai.licious.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.masai.licious.R;


public class MuttonFragment extends Fragment {

    public MuttonFragment(){

    }
    public  static  MuttonFragment newInstance(){
        MuttonFragment muttonFragment=new MuttonFragment();
        return muttonFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mutton, container, false);
    }
}