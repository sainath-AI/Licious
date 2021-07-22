package com.masai.licious.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.masai.licious.R;


public class PackageActivity extends AppCompatActivity {


    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private int position;
    ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        FragmentManager fm=getSupportFragmentManager();
        setViewPagerAdapter();
        getIntentData();
    }

    private void getIntentData() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            position = getIntent().getIntExtra("position", 0);
            viewPager.setCurrentItem(position);
            Log.d("tag", " " + position);
        }
    }

    private void setViewPagerAdapter() {
       adapter=new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(adapter);
        tabLayout.addTab(tabLayout.newTab().setText("Fish/SeaFoods"));
        tabLayout.addTab(tabLayout.newTab().setText("Chicken"));
        tabLayout.addTab(tabLayout.newTab().setText("Mutton"));
        tabLayout.addTab(tabLayout.newTab().setText("ColdCuts"));
        tabLayout.addTab(tabLayout.newTab().setText("Eggs"));
        tabLayout.addTab(tabLayout.newTab().setText("Prawn"));
        tabLayout.addTab(tabLayout.newTab().setText("Kabab/Tandoori"));
        tabLayout.addTab(tabLayout.newTab().setText("Saver"));
        tabLayout.addTab(tabLayout.newTab().setText("ReadyToCook"));
        tabLayout.addTab(tabLayout.newTab().setText("Spreads"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });



    }
}