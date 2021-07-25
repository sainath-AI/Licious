package com.masai.licious.Cart;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.masai.licious.R;

import org.w3c.dom.Text;


public class PaymentFragment extends Fragment {
    
   private Button mBtnPlaceOrder;
   private ImageView imageView;
   private TextView mPrice;
   private  TextView mTitle;
   private TextView mWeigth;
   private  TextView subtotal;
   private  TextView TotalPrice;
   private  String price;
   private  String name;
   private String weight;
   
    


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        getBundleData();
    }

    private void getBundleData() {
        if (getArguments() != null) {
            name = getArguments().getString("Name");
            mTitle.setText(name);
            price = getArguments().getString("Price");
            mPrice.setText(price);
            weight=getArguments().getString("weight");
            mWeigth.setText(weight);
            subtotal.setText(price);
            imageView.setImageResource(getArguments().getInt("image"));
            TotalPrice.setText("249");

        }
    }

    private void initViews(View view) {
        mBtnPlaceOrder=view.findViewById(R.id.placeorder);
        mTitle=view.findViewById(R.id.titleData1);
        mPrice=view.findViewById(R.id.PriceData1);
        mWeigth=view.findViewById(R.id.WeightData1);
        subtotal=view.findViewById(R.id.price11);
        TotalPrice=view.findViewById(R.id.TotalPrice11);
        imageView=view.findViewById(R.id.imagedata1);
        mBtnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Order placed successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}