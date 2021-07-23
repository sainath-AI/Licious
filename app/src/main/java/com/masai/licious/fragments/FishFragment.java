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

import com.masai.licious.Adapters.FishAdapter;
import com.masai.licious.Adapters.ModelClass;
import com.masai.licious.R;

import java.util.ArrayList;


public class FishFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> modelClasses=new ArrayList<>();

    public  static  FishFragment newInstance(){
        FishFragment fishFragment=new FishFragment();
        return fishFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fish, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView);
        buildRecyclerViewData();
        setRecyclerdata();
    }

    private void setRecyclerdata() {
        FishAdapter fishAdapter=new FishAdapter(modelClasses);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(fishAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void buildRecyclerViewData() {

        ModelClass bombil = new ModelClass(R.drawable.fish_bombil,
                "Bombay Duck (Bombil) - Whole, Cleaned",
                "Perfect for frying, this soft fleshy fish is loved by all. Thoroughly cleaned and gutted so you can enjoy it every step of the way from cooking to devouring it up!",
                "Gross Wt. 415gms | Net wt. 250gms",
                "MRP: ₹139", "Coast to kitchen in 24 hrs",
                "Today 7 AM - 10 AM");
        modelClasses.add(bombil);

        ModelClass vanjaram = new ModelClass(R.drawable.fish_vanjaram,
                "Seer (Vanjaram/Surmai) Small - Steaks",
                "The reigning universal favourite! Cut into firm, delectable steaks, the unmistakable sharp flavour is bound to gratify and satisfy a great deal. Beautifully carved and handled carefully, bite into the welcoming taste of pure and rich, just off the water seer. It isn't considered one of the popular fishes for nothing.",
                "Gross Wt. 704gms | Net wt. 500gms",
                "MRP: ₹899", "See why your meat is safe",
                "Today 7 AM - 10 AM");
        modelClasses.add(vanjaram);

        ModelClass kendai = new ModelClass(R.drawable.fish_kendai,
                "Pink Perch (Kendai/Madumagala) Medium - Whole, Cleaned",
                "Offered whole, our Seawater Pink Perch is cleaned and gutted neatly. Also known as Rani Masa or Kendai, Pink Perch gets its name due to the pink hue and yellow strips with scales on its skin. It has a mild flavour with a delicate, soft texture that makes it ideal for curries, fried or grilled preparations. High in proteins and vitamins, this fatty fish with minimum bones is also ideal if you are new to seafood. Buy Pink Perch online from Licious and get a doorstep delivery.",
                "Gross Wt. 694gm | Net wt. 500gm",
                "MRP: ₹359", "Coast to kitchen in 24 hrs",
                "Today 7 AM - 10 AM");
        modelClasses.add(kendai);

        ModelClass theppu = new ModelClass(R.drawable.fish_theppu,
                "Catla (Theppu) Medium - Bengali Cut, No Head",
                "A delight for Bengali cuisine aficionados, this lean, bony fish, cut Bengali style is bound to elevate your fish curries with its soft and delicate flavoured meat. Includes part of the tail for added flavour as the juices infuse into your curries to give it a rich body and sharp flavour.",
                "Gross Wt. 961gms | Net wt. 500gms",
                "MRP: ₹315", "See why your meat is safe",
                "Today 7 AM - 10 AM");
        modelClasses.add(theppu);

        ModelClass kajoli = new ModelClass(R.drawable.fish_kajoli,
                "Kajoli - Whole & Cleaned, No Tail",
                "At Licious, the freshwater fish Kajoli is thoroughly cleaned, gutted and offered whole without the tail. Also known as Kajuli, Kajli or Baspata, this lean fish is a rich source of proteins and minerals like magnesium and calcium. Kajoli has a sweet taste as compared to other fishes and has a delicate texture that is ideal for dry preparations like grilled fish. Buy Kajoli online and get your order delivered to your doorstep.",
                "Gross Wt. 280gms | Net wt. 250gms",
                "MRP: ₹338", "Coast to kitchen in 24 hrs",
                "Today 7 AM - 10 AM");
        modelClasses.add(kajoli);

        ModelClass rui = new ModelClass(R.drawable.fish_rui,
                "Rohu (Rui) - Head",
                "One medium rohu fish-head cleaned, cleaved in two and prepped for your next culinary adventure. Meaty with the palpable bony, freshwater sweetness, this one’s strictly crafted for those with a hyper-active freshwater-fish love. So, if you are looking for the perfect Bengali Moori Ghonto or the Anglo-Indian fish-head curry, we have got just the thing for you.",
                "Gross Wt. 1 | Net wt. 1",
                "MRP: ₹49", "See why your meat is safe",
                "Today 7 AM - 10 AM");
        modelClasses.add(rui);

        ModelClass erimeenu = new ModelClass(R.drawable.fish_erimeenu,
                "Emperor (Erimeenu) Small - Curry Cut, No Head",
                "Emperor is found in the deep lagoons and coral reefs. A healthy choice for many, as it is low in calories and fat. Once cooked, this white fish gets firm, almost chewy and doesn't flake. It has a mild but very distinctive flavour. This fish is great for baking, steaming, deep frying, grilling & barbecuing.",
                "Gross Wt. 980gms | Net wt. 500gms",
                "MRP: ₹565", "Coast to kitchen in 24 hrs",
                "Today 7 AM - 10 AM");
        modelClasses.add(erimeenu);

        ModelClass kane = new ModelClass(R.drawable.fish_kane,
                "Lady Fish (Kane/Poovan) Medium - Curry Cut",
                "This seawater fish is sure to appeal to your palate with its delicate taste. While the Lady Fish is known to be bonier that most, this is easily remedied by pressure cooking the fish enough. Offered to you in a curry cut without head, get the most out of this subtle-flavoured fish, best had fried or steamed.",
                "Gross Wt. 394gms | Net wt. 250gms",
                "MRP: ₹259", "Coast to kitchen in 24 hrs",
                "Today 7 AM - 10 AM");
        modelClasses.add(kane);

        ModelClass pulasa = new ModelClass(R.drawable.fish_pulasa,
                "Hilsa(Pulasa/Palva/Palla) Medium - Curry Cut With Head",
                "Found in the fresh waters of eastern India, the Hilsa has a full-bodied flavour and a tender, oily texture. Also known as Ilish, Pulasa, Palva, or Palla, Hilsa is rich in omega-3 fatty acids, proteins, and calcium. This Hilsa is cut perfectly into medium-sized pieces for easy, curry preparations.",
                "Gross Wt. 704gms | Net wt. 500gms",
                "MRP: ₹1799", "Coast to kitchen in 24 hrs",
                "Today 7 AM - 10 AM");
        modelClasses.add(pulasa);

        ModelClass murrel = new ModelClass(R.drawable.fish_murrel,
                "River Sol (Murrel/Nangu) - Fillet",
                "Mild tasting boneless fillets of freshwater Sol, cut precisely for the perfect grill or pan-fry. Rich in Omega-3 fatty acids, essential minerals like potassium and phosphorus, and vitamins like Niacin, this is the perfect pick for the health-conscious gourmand.",
                "Gross Wt. 568gms | Net wt. 250gms",
                "MRP: ₹519", "See why your meat is safe",
                "Today 7 AM - 10 AM");
        modelClasses.add(murrel);

    }

}