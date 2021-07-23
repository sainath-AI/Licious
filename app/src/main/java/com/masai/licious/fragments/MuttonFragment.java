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
import com.masai.licious.Adapters.MuttonAdapter;
import com.masai.licious.R;

import java.util.ArrayList;


public class MuttonFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> modelClasses=new ArrayList<>();

    public  static  MuttonFragment newInstance(){
        MuttonFragment muttonFragment=new MuttonFragment();
        return muttonFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mutton, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView1);
        buildRecyclerViewData();
        setRecyclerdata();
    }

    private void setRecyclerdata() {
        MuttonAdapter muttonAdapter=new MuttonAdapter(modelClasses);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(muttonAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void buildRecyclerViewData() {
        ModelClass shoulder = new ModelClass(R.drawable.mutton_shoulder,
                "Lamb Curry Cut - Shoulder",
                "Evenly cut from the top front leg, our medium-sized, bone-in Lamb Shoulder Curry Cuts are one of the juiciest meat portions. Obtained from healthy lambs raised in open pastures, they are rich in proteins, vitamin B12, zinc, and iron. High on flavour with a firm texture and a little more fat as compared to leaner cuts, they are ideal for slow-cooked curries. Order Lamb Shoulder Curry Cuts online and get them home delivered.",
                "Gross Wt. 833gms | Net wt. 500gms",
                "MRP: ₹599", "The Safest Mutton in Town",
                "Today 7 AM - 10 AM");
        modelClasses.add(shoulder);

        ModelClass curry = new ModelClass(R.drawable.mutton_curry,
                "Lean Goat Curry Cut",
                "Our Lean Goat Curry Cut contains succulent pieces of goat meat cut from the shoulders, ribs and leg which are fat trimmed .Relish bite-sized cuts of protein -rich goat meat that are low in fat as compared to other cuts and have a firm texture Lean cuts are going to result in a delicious gravy but much lighter, and low in fat content. Recommended that lean meat be cooked over high heat as it doesn’t take too long to cook evenly.",
                "Gross Wt. 660gms | Net wt. 500gms",
                "MRP: ₹525", "The Safest Mutton in Town",
                "Today 7 AM - 10 AM");
        modelClasses.add(curry);

        ModelClass keema = new ModelClass(R.drawable.mutton_keema,
                "Lamb Mince (Keema)",
                "Lamb meat from the hind legs is ground to perfection to offer you the finest Lamb Mince from Licious. This versatile meat is rich in flavour and has a tender, fine-grained texture. Also popularly known as keema, lamb mince is rich in proteins, vitamins, and minerals and is a perfect blend of lamb meat & fat. Lamb mince can be an ideal choice to make meatballs, burgers, keema curry, and kebabs. Order Lamb Mince online from Licious and get it home-delivered.\n" +
                        "\n" +
                        "Note: Licious Mutton is thoroughly cleaned before it is minced. You can cook it straight from the pack. To retain the taste, texture and flavour of the mince, please do not wash it.",
                "Gross Wt. 625gms | Net wt. 500gms",
                "MRP: ₹549", "The Safest Mutton in Town",
                "Today 7 AM - 10 AM");
        modelClasses.add(keema);

        ModelClass heart = new ModelClass(R.drawable.mutton_heart,
                "Mutton Heart",
                "Unlike other muscle meats, mutton hearts have a slightly dense and firm texture with a rich, dark meat flavour. Hearts are popularly enjoyed grilled or sautéed with a mix of fresh vegetables. Here, we offer fresh lamb & goat hearts, cleaned and cut for easy cooking.",
                "Gross Wt. 250gms | Net wt. 250gms",
                "MRP: ₹199", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(heart);

        ModelClass biryani = new ModelClass(R.drawable.mutton_biryani,
                "Goat Biryani Cut",
                "Expertly carved, ideal for Awadhi, Parsi, Hyderabadi Biryani and every other biryani imaginable! A dominance of bone-in pieces ensure flavours infuse into the biryani for a rich, authentic taste. The fibrous texture of goat meat amalgamates the flavours of spices that go into your biryani of choice.",
                "Gross Wt. 666gms | Net wt. 500gms",
                "MRP: ₹549", "The Safest Mutton in Town",
                "Today 7 AM - 10 AM");
        modelClasses.add(biryani);

        ModelClass lamb = new ModelClass(R.drawable.mutton_lamb,
                "Lamb - Boneless",
                "Our medium-sized boneless portions of lamb meat are neatly cut from the legs. These meat portions are juicy with a strong flavour. In terms of nutrients, these meat portions are rich in proteins, vitamins and minerals. High on flavour, these dark meat portions are lean and low in fat as compared to richer curry, shoulder or biryani cuts. Ideal for curries or grilled preparations, these are perfect if you prefer more flesh and no bones in the meat. Buy from Licious online and get fresh Lamb Boneless Leg meat portions home delivered.",
                "Gross Wt. 758gms | Net wt. 500gms",
                "MRP: ₹839", "The Safest Mutton in Town",
                "Today 7 AM - 10 AM");
        modelClasses.add(lamb);

        ModelClass ribs = new ModelClass(R.drawable.mutton_ribs,
                "Goat Ribs and Chops",
                "Mutton Ribs and Chops are mainly cut from the rack of the Goat, which is the upper centre part of the goat's body. The package also includes cuts from the shoulders, ribs and loins. Mutton Chops are T-bone steaks that give you tender meat once cooked evenly. Goat Ribs and Chops are strong in flavour and tender in texture. These are also the fattier cuts of the Goat. Rich in proteins and minerals, Goat Ribs and Chops are an excellent choice for barbecuing or making a curry. Buy Goat Ribs and Chops online from Licious and get home delivery. ",
                "Gross Wt. 588gms | Net wt. 500gms",
                "MRP: ₹599", "300+ speciality cuts",
                "Today 7 AM - 10 AM");
        modelClasses.add(ribs);

        ModelClass liver = new ModelClass(R.drawable.mutton_liver,
                "Mutton Liver Chunks",
                "Also known as Kaleji, the Lamb Liver Pieces from Licious are cleaned and sinew-free. These smooth-textured pieces are a nutrient-dense superfood. The Lamb Liver is high in minerals, vitamins and protein while it has a lower level of fat as compared to muscle meats. Ideal for a quick pan-fried meal, you can easily prepare a flavourful Lamb Liver Masala with a blend of dry spices and herbs. Order the Lamb Liver pieces online from Licious in just a few clicks.",
                "Gross Wt. 250gms | Net wt. 250gms",
                "MRP: ₹229", "300+ speciality cuts",
                "Today 7 AM - 10 AM");
        modelClasses.add(liver);

        ModelClass tail = new ModelClass(R.drawable.mutton_tail,
                "Goat Tail - Hind Meat",
                "Thoroughly cleaned and cut into even pieces, Goat Tail is perfect for making comforting soups and is even enjoyed as a deep-fried treat! Order Goat Tail online from Licious, obtained from grass-fed, humanely raised goats, and prepare delicious dishes.",
                "Gross Wt. 263gms | Net wt. 200gms",
                "MRP: ₹189", "The Safest Mutton in Town",
                "Today 7 AM - 10 AM");
        modelClasses.add(tail);

        ModelClass kapura = new ModelClass(R.drawable.mutton_kapura,
                "Mutton Kapura Large",
                "Mutton kapura is known for being rich in multiple nutrients, such as magnesium and zinc. This delicacy offers a mild yet rich flavour that is best enjoyed cooked with a variety of spices, or deep fried.",
                "Gross Wt. 296gms | Net wt. 250gms",
                "MRP: ₹199", "The Licious Promise",
                "Today 7 AM - 10 AM");
        modelClasses.add(kapura);

    }

}