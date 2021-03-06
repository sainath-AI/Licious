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
import com.masai.licious.Adapters.PrawnAdapter;
import com.masai.licious.Cart.BuyItemClickListner;
import com.masai.licious.Cart.CheckOutActivity;
import com.masai.licious.R;

import java.util.ArrayList;


public class PrawnFragment extends Fragment  implements BuyItemClickListner {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> modelClasses=new ArrayList<>();
    private ModelClass model;


    public  static  PrawnFragment newInstance(){
        PrawnFragment prawnFragment=new PrawnFragment();
        return prawnFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prawn, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView1);
        buildRecyclerViewData();
        setRecyclerdata();
    }

    private void setRecyclerdata() {
        PrawnAdapter prawnAdapter=new PrawnAdapter(modelClasses,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(prawnAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void buildRecyclerViewData() {
        ModelClass prawn_tiger = new ModelClass(R.drawable.prawn_tiger,
                "Tiger Prawns 16Count - 20Count/Kg (Jhinga/ Seegadi) - Cleaned and Deveined with Tail",
                "Abundantly found in the shallow west coasts of India, the Giant Tiger Prawn is large and flavoursome. It has white flesh, and firm yet tender, moist taste. It is available peeled & deveined. Ideal for making mouthwatering jumbo prawn curry or even fried jumbo prawns.",
                "Gross Wt. 421gms | Net wt. 250gms",
                "MRP: ???549", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_tiger);

        ModelClass prawn_freshwater = new ModelClass(R.drawable.prawn_freshwater,
                "Freshwater Large Prawns 30Count/Kg (Jhinga/Seegadi) - Cleaned & Deveined, No Tail",
                "If you love prawns but hate the prep-work that goes with them, these prawns are just for you. Butterflied, cleaned, and deveined with the head and tail removed - perfectly ready for your curry, biryani, pasta, stir fry, and more",
                "Gross Wt. 500gms | Net wt. 250gms",
                "MRP: ???535", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_freshwater);

        ModelClass prawn_scampi = new ModelClass(R.drawable.prawn_scampi,
                "Scampi (Giant Prawns/Jhinga/Seegadi) - Whole",
                "The succulent tropical region's native crustacean. These soft shelled giant prawn look-alike have a unique tasting meat mainly from its fleshy tail. Offered to you whole, get the most of their remarkably sweet flavour and firm and tender texture. A must-try for prawn lovers.",
                "Gross Wt. 521gms | Net wt. 500gms",
                "MRP: ???649", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_scampi);

        ModelClass prawn_seawater = new ModelClass(R.drawable.prawn_seawater,
                "Seawater Prawns 70Count/Kg (Jhinga/Seegadi) - Cleaned & Deveined, W/O Tail",
                "Most commonly used in the Chettinaad cuisine, these small-sized prawns absorb spices quite well, making it the perfect choice to be used in pickles, spicy curries, pulao & biryani. Order seawater prawns, peeled & deveined online on Licious and have it delivered to your doorstep within 90-120 minutes!",
                "Gross Wt. 521gms | Net wt. 250gms",
                "MRP: ???419", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_seawater);

        ModelClass prawn_jhinga = new ModelClass(R.drawable.prawn_jhinga,
                "Freshwater Prawns 80Count/Kg (Jhinga/Seegadi) - Whole",
                "If you are a fan of Prawns, you must try the Whiteleg Shrimp, a freshwater prawn found in tropical waters. It has a firm and moist texture, ideal for curries, stir fry and biryanis.",
                "Gross Wt. 250gms | Net wt. 250gms",
                "MRP: ???169", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_jhinga);

        ModelClass prawn_seegadi = new ModelClass(R.drawable.prawn_seegadi,
                "Freshwater Prawns 50Count/Kg (Jhinga/ Seegadi) - Cleaned & Deveined, No Tail",
                "Peeled and cleaned with head and tail removed, our medium-sized Freshwater Prawns are deveined and ready for your pan. These prawns are juicy and flavourful while being rich in proteins, omega-3 fatty acids, and antioxidants. They have a moist texture and a mild sweet taste as compared to other seafood. Ideal for curries, baked appetizers or even biryani, these prawns are perfect if you prefer fleshy, boneless seafood that requires minimum effort to eat. Buy Freshwater Prawns online and get them delivered at your doorstep.",
                "Gross Wt. 480gms | Net wt. 250gms",
                "MRP: ???399", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_seegadi);

        ModelClass prawn_pink = new ModelClass(R.drawable.prawn_pink,
                "Pink Shrimp (70C - 110C)- Cleaned & Deveined, No Tail",
                "The succulent, sweet-tasting meat of the Pink Shrimp can be pan-fried and tossed into a salad or made into spicy pickles. This seawater speciality is found in coasts of Kerala & Karnataka. Enjoy Pink Shrimp 70C - 110C delivered fresh to your doorstep only on Licious!",
                "Pieces | Net wt. ",
                "MRP: ???335", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_pink);

        ModelClass prawn_karrikadi = new ModelClass(R.drawable.prawn_karrikadi,
                "Seawater Prawns 350Count/Kg (Karrikadi)- Cleaned & Deveined, No Tail",
                "Most commonly used in the Chettinaad cuisine, these small sized prawns absorb spices quite well, making it the perfect choice to be used in pickles, spicy curries, pulao & biryani. Order Karrikadi Prawns peeled & deveined online on Licious and have it delivered to your doorstep within 90-120 minutes!",
                "Gross Wt. 500gms | Net wt. 200gms",
                "MRP: ???349", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_karrikadi);

        ModelClass prawn_tigertail = new ModelClass(R.drawable.prawn_tigertail,
                "Tiger Prawns (20C - 30C) - Cleaned & Deveined, with Tail",
                "The flavourful Tiger Prawns are perfect for those who enjoy the strong flavours of seawater fish. Abundantly found in the west coasts of India, the Tiger Prawn is large and tender. It is cleaned, deveined and ready to cook straight out of the pack. Make mouthwatering jumbo prawn curry or even fried jumbo prawns. Order Tiger Prawns (20C - 30C) - Cleaned & Deveined, with Tail only on Licious.",
                "Pieces | Net wt. ",
                "MRP: ???549", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_tigertail);

        ModelClass prawn_brown = new ModelClass(R.drawable.prawn_brown,
                "Brown Shrimp 70Count - 110Count/Kg (Jhinga/ Seegadi) - Cleaned and Deveined No Tail",
                "Packed full of flavour, Brown Shrimp also known as Bay shrimp or Sand shrimp can make any dish a comforting one. This small shellfish is similar in appearance to the prawn and can be pan-fried with veggies & is also perfect to be pickled. Order clean and deveined Brown Shrimps and get them delivered fresh to your kitchen.",
                "Pieces | Net wt. ",
                "MRP: ???325", "The Safest Prawns, for you",
                "Today 7 AM - 10 AM");
        modelClasses.add(prawn_brown);

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