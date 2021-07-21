package com.masai.licious.activities;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.masai.licious.R;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    ImageSlider imageSlider;

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
        imageSlider.setImageList(slideModelList,ScaleTypes.FIT);
    }

    private void initViews() {
        imageSlider=findViewById(R.id.image_slider);

    }
}