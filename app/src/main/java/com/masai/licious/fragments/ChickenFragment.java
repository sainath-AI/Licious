package com.masai.licious.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.masai.licious.R;
import com.masai.licious.categories.CategoryAdapter;
import com.masai.licious.categories.CategoryModel;
import com.masai.licious.categories.Chicken;

import java.util.ArrayList;

public class ChickenFragment extends Fragment {

    public static ChickenFragment newInstance() {
        ChickenFragment chickenFragment = new ChickenFragment();
        return chickenFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chicken, container, false);
    }

}