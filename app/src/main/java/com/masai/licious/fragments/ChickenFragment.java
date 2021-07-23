package com.masai.licious.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.masai.licious.Adapters.ChickenAdapter;
import com.masai.licious.Adapters.ModelClass;
import com.masai.licious.R;

import java.util.ArrayList;

public class ChickenFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> modelClasses=new ArrayList<>();

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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView);
        buildRecyclerViewData();
        setRecyclerdata();
    }

    private void setRecyclerdata() {
        ChickenAdapter chickenAdapter=new ChickenAdapter(modelClasses);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(chickenAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void buildRecyclerViewData() {
        ModelClass tangdi = new ModelClass(R.drawable.chicken_tangdi,
                "Chicken Tangdi - Biryani Cut",
                "Succulent and tender pieces of chicken that have been taken from the leg of the chicken, cut into drumsticks and whole thigh pieces. A mixture of white and dark meat these pieces of chicken are loaded with flavour and deliver mouth-watering goodness with every bite. Juicy and tender they are perfect for every kind of biryani, from Hyderabadi to Calicut biryani.\n" +
                        "Order Chicken Tangdi - Biryani Cut online on Licious and get it delivered to your home.",
                "Gross Wt. 600gms | Net wt. 550gms",
                "MRP: ₹229", "Get value for money!",
                "Today 7 AM - 10 AM");
        modelClasses.add(tangdi);

        ModelClass country = new ModelClass(R.drawable.chicken_country,
                "Smoky Turmeric Country Chicken - Curry Cut With Skin",
                "Smoky Turmeric Country Chicken is a traditional preparation of country chicken (Nati Koli) smoked & marinated in turmeric. This cut of chicken comes from the Aseel Cross Breed birds & offers a slightly tougher texture which is characteristic of authentic country chicken birds.\n" +
                        "Known for its anti-bacterial & anti-inflammatory properties, turmeric is often used in a variety of marinades. Licious Smoky Turmeric Country Chicken allows for easy preparation of delicious curries and fries, with its perfectly cut pieces ideal for quick & easy cooking!",
                "Gross Wt. 510gms | Net wt. 500gms",
                "MRP: ₹349", "Only the Safest Chicken!",
                "Today 7 AM - 10 AM");
        modelClasses.add(country);

        ModelClass large = new ModelClass(R.drawable.chicken_large,
                "Chicken Curry Cut Large - Large Pack",
                "A mix of dark and white meat, our large Chicken Curry Cut pieces include Two leg, Two wing without tip, and Two breast quarter with backbone. Obtained from pasture-raised healthy chickens, the meat has a rich, juicy flavour with a tender, smooth and moderate-firm texture. Best suited for curries, the package includes both boneless and bone-in curry cut pieces. Order hormone-free Chicken Curry Cut pieces online and get them delivered fresh at your doorstep.",
                "Gross Wt. 1026gms | Net wt. 1000gms",
                "MRP: ₹285", "Get value for money!",
                "Today 7 AM - 10 AM");
        modelClasses.add(large);

        ModelClass mince = new ModelClass(R.drawable.chicken_mince,
                "Chicken Mince - Large Pack",
                "Chicken Mince consists of Chicken Breast Fillets ground to perfection! Packed with proteins and minerals, Chicken Mince is a versatile meat that can be ideal for making patties, kebabs, keema, or meatballs. Order tender, fine-grained Chicken Mince online from Licious and get it delivered to your door.\n" +
                        "\n" +
                        "Note: Licious Chicken is thoroughly cleaned before it is minced. You can cook it straight from the pack. To retain the taste, texture and flavour of the mince, please do not wash it.",
                "Gross Wt. 1130gms | Net wt. 900gms",
                "MRP: ₹479", "Only the Safest Chicken!",
                "Today 7 AM - 10 AM");
        modelClasses.add(mince);

        ModelClass breast = new ModelClass(R.drawable.chicken_breast,
                "Chicken Breast Fillet - Thinly Sliced",
                "Chicken Breast is one of the meatier cuts of a chicken, which comes from the breast-bone of the bird. This fillet cut is skinless and thinly sliced for more even cooking. A good source of vitamins and minerals, Chicken Breast, is also a great choice for a lean protein diet. Apply a flavourful spice-rub and pan-fry, bake or the Chicken Breast Fillet to relish this versatile cut.",
                "Gross Wt. 1303gms | Net wt. 450gms",
                "MRP: ₹259", "Find cuts for every recipe",
                "Today 7 AM - 10 AM");
        modelClasses.add(breast);

        ModelClass lollipop = new ModelClass(R.drawable.chicken_lollipop,
                "Chicken Lollipop",
                "Chicken Lollipops at Licious are expertly cleaned, cut and trimmed. The meat is cut loose from the wing bone and pushed down towards the end of the drumstick. Chicken Lollipops are rich in flavour and tender in texture. They are ideal for a protein-rich meal. Chicken Lollipops can be pan-fried or deep-fried to make perfect starters. The meat turns juicy and succulent after cooking. Order Chicken Lollipops from Licious and prepare crispy fried lollipops at home.",
                "Gross Wt. 10 | Net wt. 10",
                "MRP: ₹129", "Get value for money!",
                "Today 7 AM - 10 AM");
        modelClasses.add(lollipop);

        ModelClass gizzard = new ModelClass(R.drawable.chicken_gizzard,
                "Chicken Gizzard",
                "Chicken Gizzards from Licious are freshly cut and thoroughly cleaned. Obtained from the muscular areas around the digestive tract of the bird, the Gizzards have a unique and strong flavour and are firm in texture. They are also a rich source of proteins and vitamins. Chicken Gizzards have a low fat content and can be braised or used in starters when fried. Order Chicken Gizzards online from Licious to enjoy home-made fried gizzards or chicken gizzard masala.",
                "Gross Wt. 303gms | Net wt. 300gms",
                "MRP: ₹55", "Find cuts for every recipe",
                "Today 7 AM - 10 AM");
        modelClasses.add(gizzard);

        ModelClass drumstick = new ModelClass(R.drawable.chicken_drumstick,
                "Chicken Drumstick",
                "Our skinless and bone-in Chicken Drumsticks are cut from the lower leg portions. These juicy portions are flavourful and tender while being one of the fleshiest cuts of the bird. They contain a little more fat as compared to chicken wings. In terms of nutrients, these succulent portions are high in proteins and vitamins. Thoroughly cleaned and cut, these drumsticks are ideal for grilled or fried dishes. Order online from Licious and get fresh Chicken Drumsticks home delivered.",
                "Gross Wt. 666gms | Net wt. 500gms",
                "MRP: ₹235", "Only the Safest Chicken!",
                "Today 7 AM - 10 AM");
        modelClasses.add(drumstick);

        ModelClass liver = new ModelClass(R.drawable.chicken_liver,
                "Chicken Liver",
                "At Licious, the Chicken Liver is fresh and thoroughly cleaned and cut into pieces. The chicken liver has a strong flavour and a smooth texture when raw which turns to being dense when cooked. Obtained from farm-raised, healthy chickens, the chicken liver is a rich source of vitamins, protein, and iron. Ideal for pan-fried or stir-fried dishes, you can prepare delicious Chicken Liver Masala with a blend of spices and herbs. Buy Chicken Liver online and get it delivered to your doorstep.",
                "Gross Wt. 354gms | Net wt. 350gms",
                "MRP: ₹65", "Find cuts for every recipe",
                "Today 7 AM - 10 AM");
        modelClasses.add(liver);

        ModelClass thigh = new ModelClass(R.drawable.chicken_thigh,
                "Chunkier Chicken Thigh with Bone",
                "Bone-in pieces of chicken thigh which have a moderate firm texture that turn juicy when cooked. Rich in proteins and minerals, this extra-meaty cut is ideal for slow-cooked preparations.",
                "Gross Wt. 667gms | Net wt. 500gms",
                "MRP: ₹239", "Only the Safest Chicken!",
                "Today 7 AM - 10 AM");
        modelClasses.add(thigh);

    }

}