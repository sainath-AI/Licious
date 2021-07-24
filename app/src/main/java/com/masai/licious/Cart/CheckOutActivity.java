package com.masai.licious.Cart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.masai.licious.R;


public class CheckOutActivity extends AppCompatActivity {

    private Bundle bundle;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        fragmentManager=getSupportFragmentManager();
        getIntentData();
        launchFragment();
    }

    private void launchFragment() {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        CheckFragment checkFragment=new CheckFragment();
        checkFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.flContainer1,checkFragment,"checkfragment").commit();
    }

    private void getIntentData() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            bundle = getIntent().getBundleExtra("data");
            Log.d("tag", bundle.getString("name"));
        }
    }
}