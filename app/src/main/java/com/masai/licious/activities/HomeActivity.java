package com.masai.licious.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.masai.licious.LiciousMeatopia;
import com.masai.licious.LiciousWay;
import com.masai.licious.NotificationActivity;
import com.masai.licious.R;
import com.masai.licious.ReferEarnActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageSlider imageSlider;
    private ImageView mIvSearch;
    private ImageView mIvNotification;
    private ImageView mIvCart;
    private ImageView mIvFish;
    private ImageView mIvChicken;
    private ImageView mIvMutton;
    private ImageView mIvReadyToCook;
    private ImageView mIvSpreads;
    private ImageView mIveggs;
    private ImageView mIvKabab;
    private ImageView mIvPrawn;
    private ImageView mIvMetopiaJoin;
    private ImageView mIvLiciousWay;
    private ImageView mIvReferFriend;
    private RelativeLayout mRelativelayout;
    private ImageView mIvColdCuts;
    private ImageView mIvSaver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();
        setSliderImage();
    }

    private void setSliderImage() {
        List<SlideModel> slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.fresh1, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.fresh2, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.fresh3, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.fresh4, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.fresh5, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.fresh6, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.fresh7, ScaleTypes.FIT));
        imageSlider.setImageList(slideModelList, ScaleTypes.FIT);
    }

    private void initViews() {
        imageSlider = findViewById(R.id.image_slider);
        mIvSearch = findViewById(R.id.search);
        mIvNotification = findViewById(R.id.bell);
        mIvCart = findViewById(R.id.cart);

        mIvFish = findViewById(R.id.fish);
        mIvChicken = findViewById(R.id.chicken);
        mIvMutton = findViewById(R.id.mutton);
        mIvReadyToCook = findViewById(R.id.readytocook);
        mIvColdCuts = findViewById(R.id.coldcuts);
        mIveggs = findViewById(R.id.eggs);
        mIvPrawn = findViewById(R.id.prawn);
        mIvKabab = findViewById(R.id.kabab);
        mIvSpreads = findViewById(R.id.spreads);
        mIvSaver = findViewById(R.id.saver);

        mIvMetopiaJoin = findViewById(R.id.metopiaJoin);
        mIvLiciousWay = findViewById(R.id.licious1);
        mIvReferFriend = findViewById(R.id.referNow);
        mRelativelayout = findViewById(R.id.bestSeller);
        mIvSearch.setOnClickListener(this);
        mIvNotification.setOnClickListener(this);
        mIvCart.setOnClickListener(this);

        mIvFish.setOnClickListener(this);
        mIvChicken.setOnClickListener(this);
        mIvMutton.setOnClickListener(this);
        mIvReadyToCook.setOnClickListener(this);
        mIvColdCuts.setOnClickListener(this);
        mIveggs.setOnClickListener(this);
        mIvPrawn.setOnClickListener(this);
        mIvKabab.setOnClickListener(this);
        mIvSpreads.setOnClickListener(this);
        mIvSaver.setOnClickListener(this);

        mIvMetopiaJoin.setOnClickListener(this);
        mIvLiciousWay.setOnClickListener(this);
        mIvReferFriend.setOnClickListener(this);
        mRelativelayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search:
                Intent intent1 = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(intent1);
                break;
            case R.id.bell:
                Intent intent2 = new Intent(HomeActivity.this, NotificationActivity.class);
                startActivity(intent2);
                break;
            case R.id.cart:
                Intent intent3 = new Intent(HomeActivity.this, CartActivity.class);
                startActivity(intent3);
                break;
            case R.id.fish:
                goToPackageActivity(0);
                break;
            case R.id.chicken:
                goToPackageActivity(1);
                break;
            case R.id.mutton:
                goToPackageActivity(2);
                break;
            case R.id.readytocook:
                goToPackageActivity(3);
                break;
            case R.id.coldcuts:
                goToPackageActivity(4);
                break;
            case R.id.eggs:
                goToPackageActivity(5);
                break;
            case R.id.prawn:
                goToPackageActivity(6);
                break;
            case R.id.kabab:
                goToPackageActivity(7);
                break;
            case R.id.spreads:
                goToPackageActivity(8);
                break;
            case R.id.saver:
                goToPackageActivity(9);
                break;
            case R.id.metopiaJoin:
                Intent intent4 = new Intent(HomeActivity.this, LiciousMeatopia.class);
                startActivity(intent4);
                break;
            case R.id.licious1:
                Intent intent5 = new Intent(HomeActivity.this, LiciousWay.class);
                startActivity(intent5);
                break;
            case R.id.referNow:
                Intent intent6 = new Intent(HomeActivity.this, ReferEarnActivity.class);
                startActivity(intent6);
                break;

        }
    }

    private void goToPackageActivity(int position) {
        Intent intent = new Intent(this, PackageActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}