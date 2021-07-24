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

import com.masai.licious.Adapters.ColdCutsAdapter;
import com.masai.licious.Adapters.ModelClass;
import com.masai.licious.R;

import java.util.ArrayList;


public class ColdCutsFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> modelClasses=new ArrayList<>();

    public  static ColdCutsFragment newInstance(){
        ColdCutsFragment coldcutsFragment=new ColdCutsFragment();
        return coldcutsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coldcuts, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView1);
        buildRecyclerViewData();
        setRecyclerdata();
    }

    private void setRecyclerdata() {
        ColdCutsAdapter coldCutsAdapter=new ColdCutsAdapter(modelClasses);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(coldCutsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void buildRecyclerViewData() {

        ModelClass cc_chickensalami = new ModelClass(R.drawable.cc_chickensalami,
                "Peppery Chicken Salami | Ready to Eat",
                "Spiced to a perfect level with black pepper and red chilli powder, the Peppery Chicken Salami from Licious is a delicious ready-to-eat treat for all meat lovers. Lean and flavourful, these salamis can be a perfect addition to your pizza, sandwich, burger, or salad. With low fat content when compared to red meat salamis, chicken salamis are a good source of proteins and calcium . Buy Peppery Chicken Salami online and get doorstep delivery.",
                "Pieces 10-14 | Net wt. 200gms",
                "MRP: ₹315", "Enjoy Delicious Breakfast",
                "Today 7 AM - 10 AM");
        modelClasses.add(cc_chickensalami);

        ModelClass cc_chickensausage = new ModelClass(R.drawable.cc_chickensausage,
                "Chicken Breakfast Sausage with Chives | Ready to Eat",
                "At Licious, Chicken Breakfast Sausages are processed in-house with fresh ingredients and spices. These sausages are made from ground chicken, onion and chives. The juicy and flavourful chicken sausages are perfect for pan-seared, fried or grilled dishes. They are high in nutrition, as they provide proteins and iron. Moreover, chicken sausages contain lower levels of calories and fat as compared to red meat sausages. Order Chicken Breakfast Sausage with Chives online to prepare healthy, delicious breakfast every day.",
                "Pieces 8-11 | Net wt. 250gms",
                "MRP: ₹315", "Enjoy Delicious Breakfast",
                "Today 7 AM - 10 AM");
        modelClasses.add(cc_chickensausage);

        ModelClass cc_chickenlyoner = new ModelClass(R.drawable.cc_chickenlyoner,
                "Chicken Lyoner | Ready to Eat",
                "The Chicken Lyoner at Licious is prepared from fresh chicken sausages and is smoked to perfection. Seasoned with onion, garlic and herbs, the ready-to-eat lyoner salamis are high on flavour. With a high nutritional value in the form of proteins and vitamins, the lyoner salamis make for a healthy breakfast. Ideal for eating as is or pan-frying, their smoky flavour will enhance any sandwich, salad or pizza. Buy Chicken Lyoner online from Licious and get a fresh pack delivered to your doorstep.",
                "Pieces 10-11 | Net wt. 250gms",
                "MRP: ₹299", "Enjoy Delicious Breakfast",
                "Today 7 AM - 10 AM");
        modelClasses.add(cc_chickenlyoner);

        ModelClass cc_chickenloaf = new ModelClass(R.drawable.cc_chickenloaf,
                "Chicken Loaf (Smoked & Sliced) | Ready to Eat",
                "Chicken Loaf from Licious is neatly sliced and smoked to give you a perfect Salami with subtle hints of red chilli. The salami is ready-to-eat and is ideal in a sandwich, as topping on a pizza, in pastas or as a great side to your eggs at breakfast. Order Chicken Loaf from Licious and make a quick snack at home.",
                "Pieces 22-25 | Net wt. 200gms",
                "MRP: ₹299", "Enjoy Delicious Breakfast",
                "Today 7 AM - 10 AM");
        modelClasses.add(cc_chickenloaf);

        ModelClass cc_chickenfrankfurterr = new ModelClass(R.drawable.cc_chickenfrankfurterr,
                "Smoked Chicken Frankfurter | Ready to Eat",
                "Smoked Chicken Frankfurters from Licious are lightly seasoned and smoked sausages. Also known as Hot Dogs or Wieners, the Chicken Frankfurter is a ready-to-cook offering. You can cook it in a variety of ways that include frying, grilling or steaming. Make a Frankfurter hot-dog with a split bun and top it with your favourite condiments. Order Smoked Chicken Frankfurter online from Licious and make a protein-rich quick meal at home.",
                "Pieces 5 | Net wt. 250gms",
                "MRP: ₹284", "Enjoy Delicious Breakfast",
                "Today 7 AM - 10 AM");
        modelClasses.add(cc_chickenfrankfurterr);

        ModelClass cc_chickennuremberger = new ModelClass(R.drawable.cc_chickennuremberger,
                "Classic Chicken Nuremberger | Ready to Eat",
                "Originating from the historic Bavarian city of Nuremberg in Germany, the Nuremberger sausage is known for its small size. At Licious, the Classic Chicken Nuremberger is seasoned with fresh herbs and spices. These savoury sausages are flavoured with a mix of marjoram, sage, mustard and garlic. Grill, pan-fry or simply boil these firm and flavoursome sausages to make the perfect hot dogs, sandwiches, or tacos. Buy Classic Chicken Nuremberger online and enjoy delicious hot dogs at home.",
                "Pieces 10-13 | Net wt. 250gms",
                "MRP: ₹299", "Enjoy Delicious Breakfast",
                "Today 7 AM - 10 AM");
        modelClasses.add(cc_chickennuremberger);

    }

}