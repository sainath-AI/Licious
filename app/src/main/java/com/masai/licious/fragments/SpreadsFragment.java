package com.masai.licious.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.masai.licious.Adapters.ModelClass;
import com.masai.licious.Adapters.SpreadsAdapter;
import com.masai.licious.Cart.BuyItemClickListner;
import com.masai.licious.Cart.CheckOutActivity;
import com.masai.licious.R;

import java.util.ArrayList;


public class SpreadsFragment extends Fragment implements BuyItemClickListner {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> modelClasses=new ArrayList<>();
    private ModelClass model;


    public SpreadsFragment(){

    }
    public  static  SpreadsFragment newInstance(){
        SpreadsFragment spreadsFragment=new SpreadsFragment();
        return spreadsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_spreads, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView1);
        buildRecyclerViewData();
        setRecyclerdata();
    }

    private void setRecyclerdata() {
        SpreadsAdapter spreadsAdapter=new SpreadsAdapter(modelClasses,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(spreadsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void buildRecyclerViewData() {
        ModelClass chickentomato = new ModelClass(R.drawable.spread_chickentomato,
                "Chunky Herby Tomato Chicken Spread",
                "The Herby Tomato Chicken Spread from Licious is a burst of sweet and tart flavours. Freshly roasted chicken chunks are mixed with a creamy base of garlic, chilli and tomato. Our ready-to-eat chunky meat spreads have zero trans-fat and are preservative free. Order the Chunky Herby Tomato Chicken Spread and give a twist to your usual sandwiches, burgers and wraps.\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹199", "How to Use Chunky Chicken Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(chickentomato);

        ModelClass eggtomato = new ModelClass(R.drawable.spread_eggtomato,
                "Chunky Creamy Tomato Egg Spread",
                "A creamy base of mayonnaise, ketchup, chilli sauce, diced onions and real chunks of perfectly cooked eggs, this spread is a must-have at your breakfast table!\n" +
                        "Ready-to-eat, the Chunky Creamy Tomato Egg Spread is best-used to make delicious sandwiches, wraps, tortillas and more. Our chunky egg spreads have zero trans-fat & and free of artificial preservatives - perfect to make worry-free, easy & quick snacks for your kids! Order Chunky Creamy Tomato Egg Spread online on Licious and have it delivered to your doorstep!\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.\n" +
                        "Allergen information: Contains Eggs",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹149", "How to Use Chunky Egg Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(eggtomato);

        ModelClass prawnsriracha = new ModelClass(R.drawable.spread_prawnsriracha,
                "Chunky Sriracha Prawn Spread",
                "A spicy sriracha base with freshly cooked juicy prawns makes this a perfect spread for canapé platters, salads or pita bread. Whether a quick snack for yourself or an appetizer platter for a gathering, this versatile, ready-to-eat spread is hearty and flavourful without any efforts. Our chunky meat spreads have zero trans-fat and are preservative free. Order authentic Chunky Sriracha Prawn Spread online from Licious.\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹249", "How to Use Chunky Prawn Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawnsriracha);

        ModelClass eggmustard = new ModelClass(R.drawable.spread_eggmustard,
                "Chunky Garlic Mustard Egg Spread (Single Serve)",
                "Mustard, mayonnaise and freshly cooked chunks of egg come together to create a delicious spread, perfect to be had in a snack at any time of the day! This ready-to-eat Chunky Garlic Mustard Egg Spread also contains garlic, honey, black pepper & jalapenos, offering a multitude of flavours in every bite.\n" +
                        "High in protein, this spread has zero trans-fat & are free of artificial preservatives, making it safe for both and your children to enjoy! Order Chunky Garlic Mustard Egg Spread online on Licious and use it to make delicious salads, rolls, pita sandwiches & more!\n" +
                        "\n" +
                        "Disclaimer: Best Before 25 Days from the date of manufacture.\n" +
                        "Allergen information: Contains Eggs, Mustard",
                "Gross Wt. 100gms| Net wt. 100gms",
                "MRP: ₹129", "How to Use Chunky Egg Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(eggmustard);

        ModelClass chickenbutter = new ModelClass(R.drawable.spread_chickenbutter,
                "Chunky Butter Chicken Spread",
                "Our Chunky Butter Chicken Spread offers freshly roasted chicken chunks in a creamy Butter Chicken base. This ready-to-eat spread is prepared using gourmet ingredients with an authentic Indian twist, giving it the mildly spicy, Makhni taste. Ideal to pair with roti, naan or bread, this spread is perfect for a wholesome meal or party platter. Our chunky meat spreads have zero trans-fat and are preservative free. Order Chunky Butter Chicken Spread online from Licious and satiate your butter chicken cravings right at your home.\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹199", "How to Use Chunky Chicken Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(chickenbutter);

        ModelClass eggcontinental = new ModelClass(R.drawable.spread_eggcontinental,
                "Chunky Continental Egg Spread",
                "Savour the combination of creamy mayonnaise & chunky, freshly cooked eggs in this delightful spread! This ready-to-eat Chunky Continental Egg Spread is flavoured with garlic and pepper, making for a simple yet delicious egg spread.\n" +
                        "High in protein, this spread has no trans-fat & is free of artificial preservatives, perfect for safe & healthy snacks and meals! Chunky Continental Egg Spread online on Licious and use it to make delicious sandwiches, taco toppings, kaati rolls & more!\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.\n" +
                        "Allergen information: Contains Eggs",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹149", "How to Use Chunky Egg Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(eggcontinental);

        ModelClass chickenshawarma = new ModelClass(R.drawable.spread_chickenshawarma,
                "Chunky Shawarma Chicken Spread",
                "Get the authentic smoky taste of Shawarma meat roasted on a rotisserie in our Chunky Shawarma Chicken Spread. This ready-to-eat spread is made of a flavourful, creamy base that includes crushed black peppers, garlic, freshly roasted chicken chunks and a subtle hint of chilli. High in protein, this Shawarma Spread is a delight for your Greek salad or mini pitas. Our chunky meat spreads have zero trans-fat and are preservative free. Order Chunky Shawarma Chicken Spread online from Licious and get home delivery.\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹199", "How to Use Chunky Chicken Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(chickenshawarma);

        ModelClass prawngarlic = new ModelClass(R.drawable.spread_prawngralic,
                "Chunky Butter Garlic Prawn Spread",
                "At Licious, the ready-to-eat Chunky Butter Garlic Prawn Spread is a creamy base of butter and garlic with freshly cooked juicy, chunks of real prawn. Ready-to-eat, this spread is perfect for sandwiches, salads or canapé platters. The classic combo of butter and garlic with other spices and condiments gives this spread an authentic and mildly spicy taste. Our chunky meat spreads have zero trans-fat and are preservative free. Order online and get fresh Chunky Butter Garlic Prawns Spread home delivered.\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹249", "How to Use Chunky Prawn Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawngarlic);

        ModelClass egggarlic = new ModelClass(R.drawable.spread_egggarlic,
                "Chunky Garlic Mustard Egg Spread",
                "Mustard, mayonnaise and freshly cooked chunks of egg come together to create a delicious spread, perfect to be had in a snack at any time of the day! This ready-to-eat Chunky Garlic Mustard Egg Spread also contains garlic, honey, black pepper & jalapenos, offering a multitude of flavours in every bite.\n" +
                        "High in protein, this spread has zero trans-fat & are free of artificial preservatives, making it safe for both and your children to enjoy! Order Chunky Garlic Mustard Egg Spread online on Licious and use it to make delicious salads, rolls, pita sandwiches & more!\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.\n" +
                        "Allergen information: Contains Eggs, Mustard",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹149", "How to Use Chunky Egg Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(egggarlic);

        ModelClass chickencontinental = new ModelClass(R.drawable.spread_chickencontinental,
                "Chunky Continental Chicken Spread",
                "The Chunky Continental Chicken Spread from Licious is a flavourful rich base packed with crushed jalapenos, cracked pepper and garlic mixed with freshly roasted chicken chunks. The ready-to-eat spread is a rich source of protein and does not have any added preservatives. It is ideal for sandwiches, wraps or a canapé platter. Our chunky meat spreads have zero trans-fat and are preservative free. Order Chunky Continental Chicken Spread online from Licious and get doorstep delivery.\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹199", "How to Use Chunky Chicken Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(chickencontinental);

    }
    @Override
    public void onItemClick(ModelClass model, int pos) {
        Intent intent=new Intent(getActivity(), CheckOutActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("Title",model.getTitle());
        bundle.putInt("image",model.getImage());
        bundle.putString("price",model.getPrice());
        bundle.putString("weight",model.getWeight());
        intent.putExtra("data",bundle);
        startActivity(intent);

    }
}