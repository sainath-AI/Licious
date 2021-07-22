package com.masai.licious.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.masai.licious.CategoryAdapter;
import com.masai.licious.CategoryModel;
import com.masai.licious.R;

import java.util.ArrayList;


public class ChickenFragment extends Fragment {

    private final ArrayList<CategoryModel> categoryModelList = new ArrayList<>();
    private RecyclerView recyclerView;


    public ChickenFragment(){

    }
    public  static  ChickenFragment newInstance(){
        ChickenFragment chickenFragment=new ChickenFragment();
        return chickenFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chicken, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildCategoryList();
        setCategoryView();
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView11);
    }

    private void buildCategoryList() {
        CategoryModel fish01 = new CategoryModel(R.drawable.image,
                "Bombay Duck (Bombil) - Whole, Cleaned",
                "Perfect for frying, this soft fleshy fish is loved by all. " +
                        "Thoroughly cleaned and gutted so you can enjoy it every step of the " +
                        "way from cooking to devouring it up!", "Gross Wt. 415gms | Net wt. 250gms",
                "MRP: ₹139", "Coast to kitchen in 24 hrs", "Tomorrow 9 AM - 12 PM");
        categoryModelList.add(fish01);
        CategoryModel fish02 = new CategoryModel(R.drawable.image, "fish", "fish", "fish", "100", "play", "today");
        categoryModelList.add(fish02);
        CategoryModel fish03 = new CategoryModel(R.drawable.image, "fish", "fish", "fish", "100", "play", "today");
        categoryModelList.add(fish03);
    }

    private void setCategoryView() {
        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(categoryAdapter);
    }
}