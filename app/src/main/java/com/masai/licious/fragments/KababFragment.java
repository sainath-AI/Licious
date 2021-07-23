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

import com.masai.licious.Adapters.KababAdapter;
import com.masai.licious.Adapters.ModelClass;
import com.masai.licious.R;

import java.util.ArrayList;


public class KababFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> modelClasses=new ArrayList<>();


    public KababFragment(){

    }
    public  static  KababFragment newInstance(){
        KababFragment kababFragment=new KababFragment();
        return kababFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kabab, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView1);
        buildRecyclerViewData();
        setRecyclerdata();
    }

    private void setRecyclerdata() {
        KababAdapter kababAdapter=new KababAdapter(modelClasses);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(kababAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void buildRecyclerViewData() {

        ModelClass kebab_afghani = new ModelClass(R.drawable.kebab_afghani,
                "Afghani Murgh Seekh Kebab | Ready in 8 Minutes",
                "Meat minced from tender cuts of the chicken is shaped in to perfect ready-to-cook kebabs after it is mixed with spices and herbs. The authentic Afghani Murgh Seekh Kebab is ideal for pan-frying or grilling. When evenly cooked, the kebab turns charred on the outside and succulent on the inside. Order Afghani Murgh Seekh Kebabs from Licious and get them home delivered.",
                "Pieces 4 | Net wt. 4",
                "MRP: ₹249", "How To Cook",
                "Today 7 AM - 10 AM");
        modelClasses.add(kebab_afghani);

        ModelClass kebab_tangdi = new ModelClass(R.drawable.kebab_tangdi,
                "Chicken Tangdi Kebab | Ready in 8 Minutes",
                "Pre-smoked and roasted over charcoal, our Tangdi Kebab is flavoured with fragrant spices such as mace, fennel and cardamom. The kebab's creamy marinade, made with cheese and cream, provides a contrast to the heat of the spices. Licious Tangdi Kebab can be cooked within 8 minutes and is best had with tangy mint chutney!",
                "Pieces 3 | Net wt. 300gms",
                "MRP: ₹249", "How To Cook",
                "Today 7 AM - 10 AM");
        modelClasses.add(kebab_tangdi);

        ModelClass kebab_mutton = new ModelClass(R.drawable.kebab_mutton,
                "Purani Dilli ki Mutton Seekh Kebab | Ready in 8 Minutes",
                "The ready-to-cook Mutton Seekh Kebabs from Licious are a blend of the finest minced meat from the best cuts of a Lamb with fresh, authentic spices. These medium-spicy kebabs are made with a host of ingredients and spices such as onion, ginger, green chilli, mint leaves and cilantro. The Kebabs are ideal for pan-frying or grilling and are ready in just 8 minutes. Order Mutton Seekh Kebabs online from Licious and enjoy a juicy and succulent meat indulgence at home.",
                "Pieces 4 | Net wt. 4",
                "MRP: ₹356", "How To Cook",
                "Today 7 AM - 10 AM");
        modelClasses.add(kebab_mutton);

        ModelClass kebab_hyderabadi = new ModelClass(R.drawable.kebab_hyderabadi,
                "Hyderabadi Mutton Shami Kebab | Ready in 8 Minutes",
                "Super easy to cook, the Hyderabadi Mutton Shami Kebabs offered from Licious are prepared using perfectly ground mutton and generous seasoning of herbs and spices. The concentrated amount of meat in these kebabs makes them a rich source of protein and iron. These medium-spicy kebabs are ideal for grilling or pan-frying, and can be perfect starters for any occasion. Buy Hyderabadi Mutton Shami Kebabs online, pan-sear and serve them hot with lemon wedges and chutney.",
                "Pieces 6 | Net wt. 6",
                "MRP: ₹260", "How To Cook",
                "Today 7 AM - 10 AM");
        modelClasses.add(kebab_hyderabadi);

        ModelClass kebab_malai = new ModelClass(R.drawable.kebab_malai,
                "Chicken Malai Tikka | Ready in 8 Minutes",
                "Marinated in an aromatic mixture of spices such as cardamom and mace, Licious Malai Kebab is a great appetizer for any occasion. Pre-roasted over charcoal, this kebab offers smoky flavours with every bite. Order online from Licious and experience delectable Tandoori dishes from the comfort of your home!",
                "Pieces 6-8 | Net wt. 350gms",
                "MRP: ₹299", "How To Cook",
                "Today 7 AM - 10 AM");
        modelClasses.add(kebab_malai);

        ModelClass rtcTandooriChicken = new ModelClass(R.drawable.rtc_tandoorichicken,
                "Tandoori Chicken | Ready in 8 Minutes",
                "Smokey, spicy and mildly tangy, this Tandoori Chicken is the must-have appetiser at any meal. Marinated in a mixture of flavourful spices and masalas, the highlight of the dish is the heat from the Kashmiri chillies and the juiciness of the chicken. Serve it with some roomali roti or chapati have it on its own with a squeeze of lime and pickled onion.",
                "Pieces 4 | Net wt. 350gms",
                "MRP: ₹249", "How To Cook",
                "Today 7 AM - 10 AM");
        modelClasses.add(rtcTandooriChicken);

        ModelClass rtcKebabPlatter = new ModelClass(R.drawable.rtc_kebabplatter,
                "Assorted Kebab Platter | Ready to Cook",
                "Indulge in our Nawabi-style kebabs as you watch the gentleman’s game! The platter consists of Afghani Murgh Seekh Kebab, Purani Dilli Mutton Seekh Kebab & Lucknowi Galouti Kebab - each ready within 8 minutes!\n" +
                        "\n" +
                        "Note: Use within 15 days from the date of manufacture. FSSAI Category 8.3.2: Heat-treated processed comminuted meat and poultry products.",
                "Pieces 14 | Net wt. 14",
                "MRP: ₹798", "How To Cook",
                "Today 7 AM - 10 AM");
        modelClasses.add(rtcKebabPlatter);

        ModelClass rtcChickenPlatter = new ModelClass(R.drawable.rtc_chickenplatter,
                "Chicken Party Platter | Ready to Cook",
                "Celebrations done right with a mix of Spicy & Creamy in our best-loved Chicken Marinades! Start with the heat of Habanero Chicken Wings (10 pcs), take the middle path with Chicken Tikka Boneless (7-8 pcs), and close with Creamy Afghani Chicken (7-8 pcs). There's something for every Chicken-loving palate!",
                "Pieces 24-28 | Net wt. 900gms",
                "MRP: ₹427", "How To Cook",
                "Today 7 AM - 10 AM");
        modelClasses.add(rtcChickenPlatter);

    }

}