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

import com.masai.licious.Adapters.EggsAdapter;
import com.masai.licious.Adapters.ModelClass;
import com.masai.licious.R;

import java.util.ArrayList;

public class EggsFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> modelClasses=new ArrayList<>();

    public EggsFragment(){

    }
    public  static  EggsFragment newInstance(){
        EggsFragment eggsFragment  =new EggsFragment();
        return eggsFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_eggs, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView1);
        buildRecyclerViewData();
        setRecyclerdata();
    }

    private void setRecyclerdata() {
        EggsAdapter eggsAdapter=new EggsAdapter(modelClasses);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(eggsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void buildRecyclerViewData() {
        ModelClass egg_classic6 = new ModelClass(R.drawable.egg_classic6,
                "Classic Eggs - Pack Of 6",
                "Farm fresh, Classic Eggs from Licious are obtained from hormone-free, healthy chickens raised in a natural environment. These eggs are 100% natural and are ideal for regular use like making omlettes or boiled eggs. These white-shelled eggs are a rich source of proteins, omega-3 fatty acids, and vitamins D, A, and B12. Order online from Licious and get fresh Classic Eggs delivered at your doorstep.",
                "Pieces 6",
                "MRP: ₹55", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_classic6);

        ModelClass egg_quail12 = new ModelClass(R.drawable.egg_quail12,
                "Quail Eggs - Pack Of 12",
                "A delicacy in some parts of the world, Quail eggs are small in size and have shells with brown speckles and spots. They are fresh, a good source of protein and most commonly used in Japanese cuisine, to make Tamago for Sushi. These eggs have been sourced from healthy, farm-raised Quail. Available as a pack of 12.",
                "Pieces 12",
                "MRP: ₹89", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_quail12);

        ModelClass egg_cage6 = new ModelClass(R.drawable.egg_cage6,
                "Cage Free Eggs - Pack Of 6",
                "These Cage-free Eggs are laid by healthy hens, that are not raised in battery cages. A good source of vitamin D, unsaturated fatty acids and minerals, these eggs are high in nutrition and are perfect for breakfast meals and other egg-based preparations. Available as a pack of 6.",
                "Pieces 6",
                "MRP: ₹139", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_cage6);

        ModelClass egg_classic30 = new ModelClass(R.drawable.egg_classic30,
                "Classic Eggs - Pack Of 30",
                "Obtained from humanely raised and healthy chickens, Classic Eggs from Licious are 100% natural. Eggs are high in proteins, omega-3 fatty acids, and vitamins. This pack of 30 eggs is ideal for families as well as for individuals focussing on a protein-heavy diet. These white-shelled eggs are farm fresh and perfect for omlettes or other fried forms or to be boiled.  Buy a pack of 30 Classic Eggs online and get them delivered straight to your doorstep.",
                "Pieces 30",
                "MRP: ₹255", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_classic30);

        ModelClass egg_brown6 = new ModelClass(R.drawable.egg_brown6,
                "Brown Eggs - Pack Of 6",
                "Farm fresh, Brown Eggs from Licious are 100% authentic as they are obtained from healthy chickens raised in a natural environment. They have a thick, bright yellow-orange yolk with a strong flavour. Brown eggs are also rich in proteins, vitamins A and D, calcium, and iron. These organic eggs are a healthy choice as they are obtained from chickens free from any artificial hormones. Often preferred for their health benefits, brown eggs are also a perfect choice for regular use in omlettes or as boiled eggs. So, order Brown Eggs online from Licious to get a fresh pack delivered at your doorstep.",
                "Pieces 6",
                "MRP: ₹79", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_brown6);

        ModelClass egg_kadaknath6 = new ModelClass(R.drawable.egg_kadaknath6,
                "Kadaknath Eggs - Pack Of 6",
                "These eggs come from the rare breed of Kadaknath chickens, known for their nutritious black meat. Kadaknath Eggs contain high levels of protein, more calcium & 1.5 times more iron than classic eggs. 100% free-range & hormone free, Kadaknath Eggs can be a strong addition to the diet and improve immunity, providing numerous medicinal benefits.",
                "Pieces 6",
                "MRP: ₹263", "Range of delicacies",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_kadaknath6);

        ModelClass egg_classic12 = new ModelClass(R.drawable.egg_classic12,
                "Classic Eggs - Pack Of 12",
                "These Classic Eggs are fresh, crack-free and laid by healthy chickens. A good source of vitamins and minerals, these eggs are nutritious and perfect for curries, salads or other egg preparations. Available as a pack of 12.",
                "Pieces 12",
                "MRP: ₹95", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_classic12);

        ModelClass egg_brown12 = new ModelClass(R.drawable.egg_brown12,
                "Brown Eggs - Pack Of 12",
                "Farm fresh, Brown Eggs from Licious are 100% authentic as they are obtained from healthy chickens raised in a natural environment. They have a thick, bright yellow-orange yolk with a strong flavour. Brown eggs are also rich in proteins, vitamins A and D, calcium, and iron. These organic eggs are a healthy choice as they are obtained from chickens free from any artificial hormones. Often preferred for their health benefits, brown eggs are also a perfect choice for regular use in omlettes or as boiled eggs. So, order Brown Eggs online from Licious to get a fresh pack delivered at your doorstep.",
                "Pieces 12",
                "MRP: ₹149", "Licious Fresh, Delicious Fresh",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_brown12);

        ModelClass egg_country6 = new ModelClass(R.drawable.egg_country6,
                "Country Eggs - Pack Of 6",
                "Obtained from healthy country chickens raised in a natural environment, Country Eggs from Licious are 100% fresh and free range. The eggshell of a Country Egg is its defining feature, as the shell colour could range between off-white and light brown. In terms of nutrition, country eggs are considered to be healthier than other eggs as they come from country chickens that are not injected with artificial hormones. These eggs are rich in protein and vitamins and have a mild taste. These eggs are ideal for curries or boiled-egg recipes. You can now buy authentic Country Eggs online from Licious with just a few clicks.",
                "Pieces 6",
                "MRP: ₹75", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_country6);

        ModelClass egg_valuepack = new ModelClass(R.drawable.egg_valuepack,
                "Classic Eggs Pack of 12 + Classic Eggs Pack of 12",
                "Start your day with Classic Eggs - pack of 12, laid naturally and not cultured, perfect for curries, salads or other egg preparations. They are cleaned and safely packed to prevent breakage and have no anitibiotic residue. Buy Classic Eggs - Pack Of 12 only on Licious.",
                "Pieces 12",
                "MRP: ₹206", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(egg_valuepack);
    }
}