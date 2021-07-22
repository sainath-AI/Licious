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
import com.masai.licious.R;

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
        mIvSpreads = findViewById(R.id.spreads);
        mIveggs = findViewById(R.id.eggs);
        mIvKabab = findViewById(R.id.kabab);
        mIvPrawn = findViewById(R.id.prawn);
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
        mIvSpreads.setOnClickListener(this);
        mIveggs.setOnClickListener(this);
        mIvKabab.setOnClickListener(this);
        mIvPrawn.setOnClickListener(this);
        mIvMetopiaJoin.setOnClickListener(this);
        mIvLiciousWay.setOnClickListener(this);
        mIvReferFriend.setOnClickListener(this);
        mRelativelayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search:
                //    Intent intent1=new Intent(HomeActivity.this,---------);
                //   startActivity(intent1);
                break;
            case R.id.bell:
                //    Intent intent2=new Intent(HomeActivity.this,-------);
                //  startActivity(intent2);
                break;
            case R.id.cart:
                //   Intent intent3=new Intent(HomeActivity.this,-------);
                //   startActivity(intent3);
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
            case R.id.spreads:
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
            case R.id.coldcuts:
                goToPackageActivity(8);
                break;
            case R.id.saver:
                goToPackageActivity(9);
                break;
            case R.id.metopiaJoin:
                //  Intent intent4=new Intent(HomeActivity.this,-----);
                //   startActivity(intent4);
                break;
            case R.id.licious1:
                //  Intent intent5 =new Intent(HomeActivity.this,-----);
                //startActivity(intent5);
                break;
            case R.id.referNow:
                // Intent intent6=new Intent(HomeActivity.this,-----);
                //startActivity(intent6);
                break;
            case R.id.bestSeller:
                goToPackageActivity(10);
                break;

        }
    }

    private void goToPackageActivity(int position) {
        Intent intent = new Intent(this, PackageActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}