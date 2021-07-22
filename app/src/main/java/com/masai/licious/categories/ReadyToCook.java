package com.masai.licious.categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.masai.licious.R;

import java.util.ArrayList;

public class ReadyToCook extends AppCompatActivity {

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

        CategoryModel rtcChickenTikka = new CategoryModel(R.drawable.rtc_chickentikka,
                "Chicken Tikka | Ready To Cook",
                "An ode to one of India's oldest recipes. Boneless chicken chunks marinated twice for a bite bursting with flavour. An authentic Licious take on the classic chicken tikka with a desirable spicy note that lingers.",
                "Pieces 9-11 | Net wt. 450gms",
                "MRP: ₹299", "How To Cook",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcChickenTikka);

        CategoryModel rtcAmritsariFish = new CategoryModel(R.drawable.rtc_amritsarifish,
                "Amritsari Fish | Ready to Cook",
                "The ready-to-deep-fry Amritsari Fish from Licious offers pieces of Basa fish marinated in chillies, carom (ajwain) seeds, white vinegar and other spices. Prepared expertly, the marinade gives this dish a stimulating, spicy flavour, making it a perfect Amritsari dish. Ideal for deep frying, you can sprinkle some chaat masala while serving the dish. Buy Amritsari Fish online and enjoy delicious fish appetizers at home.",
                "Pieces 7-10 | Net wt. 300gms",
                "MRP: ₹279", "How To Cook",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcAmritsariFish);

        CategoryModel rtcTandooriChicken = new CategoryModel(R.drawable.rtc_tandoorichicken,
                "Tandoori Chicken | Ready in 8 Minutes",
                "Smokey, spicy and mildly tangy, this Tandoori Chicken is the must-have appetiser at any meal. Marinated in a mixture of flavourful spices and masalas, the highlight of the dish is the heat from the Kashmiri chillies and the juiciness of the chicken. Serve it with some roomali roti or chapati have it on its own with a squeeze of lime and pickled onion.",
                "Pieces 4 | Net wt. 350gms",
                "MRP: ₹249", "How To Cook",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcTandooriChicken);

        CategoryModel rtcPrawns = new CategoryModel(R.drawable.rtc_prawns,
                "Prawns Zaffrani | Ready in 8 Minutes",
                "Creamy and enhanced with saffron, our medium-sized, tail-on Prawns Zaffrani symbolizes royal delicacy. A batch of fresh prawns marinated using cream cheese, garlic, cashews and one of the most valuable spices – saffron, this dish has its own distinct flavour. You can pan-fry, oven bake or grill the prawns until cooked completely. Buy ready-to-cook Prawns Zaffrani online from Licious and enjoy delicious, crispy bites of prawns at home.",
                "Pieces 12-16 | Net wt. 200gms",
                "MRP: ₹332", "How To Cook",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcPrawns);

        CategoryModel rtcKebabPlatter = new CategoryModel(R.drawable.rtc_kebabplatter,
                "Assorted Kebab Platter | Ready to Cook",
                "Indulge in our Nawabi-style kebabs as you watch the gentleman’s game! The platter consists of Afghani Murgh Seekh Kebab, Purani Dilli Mutton Seekh Kebab & Lucknowi Galouti Kebab - each ready within 8 minutes!\n" +
                        "\n" +
                        "Note: Use within 15 days from the date of manufacture. FSSAI Category 8.3.2: Heat-treated processed comminuted meat and poultry products.",
                "Pieces 14 | Net wt. 14",
                "MRP: ₹798", "How To Cook",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcKebabPlatter);

        CategoryModel rtcChickenBones = new CategoryModel(R.drawable.rtc_chickenbones,
                "Masala Chicken Soup Bones",
                "Masala Chicken Soup bones from Licious are generously seasoned with a secret blend of herbs and spices. Ready for you to prepare a delicious chicken broth, these bones are a rich source of minerals like calcium and vitamins. Order Masala Chicken Soup Bones from Licious and make a spicy and hearty bone broth at home.",
                "Pieces 10-11 | Net wt. 250gms",
                "MRP: ₹89", "Get value for money!",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcChickenBones);

        CategoryModel rtcFishFingers = new CategoryModel(R.drawable.rtc_fishfingers,
                "Fish Fingers | Ready to Cook",
                "Marinated with paanch-phoran spices and coated with panko crumbs, our Bengali Style Fish Finger preparation is a traditional one. Boneless Basa pieces marinated in kasundi mustard, red chilli, garlic-ginger and gram flour make this dish mildly spicy. Deep fry until the fish fingers turn golden-brown on all sides and serve with chutney, lemon and onion slices. Buy the ready to cook package from Licious online and snack on Bengali Style Fish Fingers right at home.",
                "Pieces 9-12 | Net wt. 250gms",
                "MRP: ₹299", "How To Cook",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcFishFingers);

        CategoryModel rtcMixedPlatter = new CategoryModel(R.drawable.rtc_mixedplatter,
                "Mixed Party Platter | Ready to Cook",
                "Enjoy a mix of chicken and seafood with our special party platters! Get the party started with Nilgiri Fish Tikka (7-9 pcs), Creamy Afghani Chicken (7-9 pcs) & Prawns Zaffrani (7-9 pcs).",
                "Pieces 24-27 | Net wt. 800gms",
                "MRP: ₹499", "How To Cook",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcMixedPlatter);

        CategoryModel rtcChickenPlatter = new CategoryModel(R.drawable.rtc_chickenplatter,
                "Chicken Party Platter | Ready to Cook",
                "Celebrations done right with a mix of Spicy & Creamy in our best-loved Chicken Marinades! Start with the heat of Habanero Chicken Wings (10 pcs), take the middle path with Chicken Tikka Boneless (7-8 pcs), and close with Creamy Afghani Chicken (7-8 pcs). There's something for every Chicken-loving palate!",
                "Pieces 24-28 | Net wt. 900gms",
                "MRP: ₹427", "How To Cook",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcChickenPlatter);

        CategoryModel rtcRoastChicken = new CategoryModel(R.drawable.rtc_roastchicken,
                "Sunday Roast Chicken - Whole | Ready to Cook",
                "Delight your taste buds with some amazing Sunday Roast Chicken. Show off your culinary magic (minus the hassle) with our fresh, pre-marinated and easy to cook chicken. The aromatic spice mix in the oil brings out all the natural flavours of the meat and keeps it juicy. Enjoy the feast!",
                "Pieces 1 | Net wt. 1200gms",
                "MRP: ₹499", "How To Cook",
                "Today 7 AM - 10 AM");
        categoryModelList.add(rtcRoastChicken);

    }

    private void setCategoryView() {
        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(categoryAdapter);
    }
}