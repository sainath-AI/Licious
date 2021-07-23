package com.masai.licious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.masai.licious.Adapters.PagerAdapeterView;
import com.masai.licious.activities.ViewPagerAdapter;

public class NotificationActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private int position;
    PagerAdapeterView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
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
        adapter=new PagerAdapeterView(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(adapter);
        tabLayout.addTab(tabLayout.newTab().setText("Offers"));
        tabLayout.addTab(tabLayout.newTab().setText("Alerts"));


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