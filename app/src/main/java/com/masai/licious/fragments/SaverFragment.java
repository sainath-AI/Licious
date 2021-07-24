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

import com.masai.licious.Adapters.ModelClass;
import com.masai.licious.Adapters.SaverAdapter;
import com.masai.licious.R;

import java.util.ArrayList;


public class SaverFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> modelClasses=new ArrayList<>();

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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView1);
        buildRecyclerViewData();
        setRecyclerdata();
    }

    private void setRecyclerdata() {
        SaverAdapter saverAdapter=new SaverAdapter(modelClasses);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(saverAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void buildRecyclerViewData() {

        ModelClass large = new ModelClass(R.drawable.chicken_large,
                "Chicken Curry Cut Large - Large Pack",
                "A mix of dark and white meat, our large Chicken Curry Cut pieces include Two leg, Two wing without tip, and Two breast quarter with backbone. Obtained from pasture-raised healthy chickens, the meat has a rich, juicy flavour with a tender, smooth and moderate-firm texture. Best suited for curries, the package includes both boneless and bone-in curry cut pieces. Order hormone-free Chicken Curry Cut pieces online and get them delivered fresh at your doorstep.",
                "Gross Wt. 1026gms | Net wt. 1000gms",
                "MRP: ₹285", "Get value for money!",
                "Today 7 AM - 10 AM");
        modelClasses.add(large);

        ModelClass egg_classic30 = new ModelClass(R.drawable.egg_classic30,
                "Classic Eggs - Pack Of 30",
                "Obtained from humanely raised and healthy chickens, Classic Eggs from Licious are 100% natural. Eggs are high in proteins, omega-3 fatty acids, and vitamins. This pack of 30 eggs is ideal for families as well as for individuals focussing on a protein-heavy diet. These white-shelled eggs are farm fresh and perfect for omlettes or other fried forms or to be boiled.  Buy a pack of 30 Classic Eggs online and get them delivered straight to your doorstep.",
                "Pieces 30",
                "MRP: ₹255", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_classic30);

        ModelClass prawngarlic = new ModelClass(R.drawable.spread_prawngralic,
                "Chunky Butter Garlic Prawn Spread",
                "At Licious, the ready-to-eat Chunky Butter Garlic Prawn Spread is a creamy base of butter and garlic with freshly cooked juicy, chunks of real prawn. Ready-to-eat, this spread is perfect for sandwiches, salads or canapé platters. The classic combo of butter and garlic with other spices and condiments gives this spread an authentic and mildly spicy taste. Our chunky meat spreads have zero trans-fat and are preservative free. Order online and get fresh Chunky Butter Garlic Prawns Spread home delivered.\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹249", "How to Use Chunky Prawn Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawngarlic);

        ModelClass egg_classic12 = new ModelClass(R.drawable.egg_classic12,
                "Classic Eggs - Pack Of 12",
                "These Classic Eggs are fresh, crack-free and laid by healthy chickens. A good source of vitamins and minerals, these eggs are nutritious and perfect for curries, salads or other egg preparations. Available as a pack of 12.",
                "Pieces 12",
                "MRP: ₹95", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_classic12);

        ModelClass rtcKebabPlatter = new ModelClass(R.drawable.rtc_kebabplatter,
                "Assorted Kebab Platter | Ready to Cook",
                "Indulge in our Nawabi-style kebabs as you watch the gentleman’s game! The platter consists of Afghani Murgh Seekh Kebab, Purani Dilli Mutton Seekh Kebab & Lucknowi Galouti Kebab - each ready within 8 minutes!\n" +
                        "\n" +
                        "Note: Use within 15 days from the date of manufacture. FSSAI Category 8.3.2: Heat-treated processed comminuted meat and poultry products.",
                "Pieces 14 | Net wt. 14",
                "MRP: ₹798", "How To Cook",
                "Today 7 AM - 10 AM");
        modelClasses.add(rtcKebabPlatter);

        ModelClass chickenshawarma = new ModelClass(R.drawable.spread_chickenshawarma,
                "Chunky Shawarma Chicken Spread",
                "Get the authentic smoky taste of Shawarma meat roasted on a rotisserie in our Chunky Shawarma Chicken Spread. This ready-to-eat spread is made of a flavourful, creamy base that includes crushed black peppers, garlic, freshly roasted chicken chunks and a subtle hint of chilli. High in protein, this Shawarma Spread is a delight for your Greek salad or mini pitas. Our chunky meat spreads have zero trans-fat and are preservative free. Order Chunky Shawarma Chicken Spread online from Licious and get home delivery.\n" +
                        "\n" +
                        "Disclaimer: Best Before 30 Days from the date of manufacture.",
                "Gross Wt. 200gms | Net wt. 200gms",
                "MRP: ₹199", "How to Use Chunky Chicken Spreads",
                "Today 7 AM - 10 AM");
        modelClasses.add(chickenshawarma);

        ModelClass vanjaram = new ModelClass(R.drawable.fish_vanjaram,
                "Seer (Vanjaram/Surmai) Small - Steaks",
                "The reigning universal favourite! Cut into firm, delectable steaks, the unmistakable sharp flavour is bound to gratify and satisfy a great deal. Beautifully carved and handled carefully, bite into the welcoming taste of pure and rich, just off the water seer. It isn't considered one of the popular fishes for nothing.",
                "Gross Wt. 704gms | Net wt. 500gms",
                "MRP: ₹899", "See why your meat is safe",
                "Today 7 AM - 10 AM");
        modelClasses.add(vanjaram);

        ModelClass egg_valuepack = new ModelClass(R.drawable.egg_valuepack,
                "Classic Eggs Pack of 12 + Classic Eggs Pack of 12",
                "Start your day with Classic Eggs - pack of 12, laid naturally and not cultured, perfect for curries, salads or other egg preparations. They are cleaned and safely packed to prevent breakage and have no anitibiotic residue. Buy Classic Eggs - Pack Of 12 only on Licious.",
                "Pieces 12",
                "MRP: ₹206", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_valuepack);

    }
}