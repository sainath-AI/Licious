package com.masai.licious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Category extends AppCompatActivity {

    private final ArrayList<CategoryModel> categoryModelList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_layout);
        initViews();
        buildCategoryList();
        setCategoryView();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
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
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(categoryAdapter);
    }
}