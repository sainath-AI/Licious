package com.masai.licious.Cart;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.masai.licious.Adapters.ModelClass;
import com.masai.licious.R;

public class CheckFragment extends Fragment {

    private Button mBtnproceed;
    private ImageView mIvImage;
    private TextView mTvTitle;
    private TextView mTvprice;
    private TextView mTvWieght;
    private TextView mTvPrice2;
    private String name;
    private String price;
    String weight;
    Bitmap bitmap;
    ModelClass modelClass;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_check, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        getBundleData();

    }

    private void getBundleData() {
        if (getArguments() != null) {
            name = getArguments().getString("Title");
            mTvTitle.setText(name);
            price = getArguments().getString("price");
            mTvprice.setText(price);
            weight=getArguments().getString("weight");
            mTvWieght.setText(weight);
            mTvPrice2.setText(price);
            mIvImage.setImageResource(getArguments().getInt("image"));

        }
    }

    private void initView(View view) {
        mBtnproceed=view.findViewById(R.id.proceed);
        mIvImage=view.findViewById(R.id.imagedata);
        mTvprice=view.findViewById(R.id.PriceData);
        mTvPrice2=view.findViewById(R.id.priceData2);
        mTvTitle=view.findViewById(R.id.titleData);
        mTvWieght=view.findViewById(R.id.WeightData);
        mBtnproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PaymentFragment paymentFragment=new PaymentFragment();
                Bundle bundle =new Bundle();
                bundle.putString("Name",name);
                bundle.putString("Price",price);
                bundle.putString("weight",weight);
                bundle.putInt("image",R.drawable.chicken_tangdi);
                paymentFragment .setArguments(bundle);
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.flContainer1,paymentFragment,"paymentFragment").addToBackStack("paymentfragment").commit();

            }
        });

    }
}