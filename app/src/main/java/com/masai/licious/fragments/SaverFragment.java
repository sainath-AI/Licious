package com.masai.licious.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.masai.licious.R;


public class SaverFragment extends Fragment {

    public SaverFragment(){

    }
    public  static  SaverFragment newInstance(){
        SaverFragment saverFragment=new SaverFragment();
        return saverFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saver, container, false);
    }
}