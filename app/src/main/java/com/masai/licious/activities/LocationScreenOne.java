package com.masai.licious.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.masai.licious.R;

public class LocationScreenOne extends AppCompatActivity {
private TextView TvDelivery;
private static final int REQ_CODE=101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_screen);
        TvDelivery=findViewById(R.id.tvDelivery);
        String[] permission={Manifest.permission.ACCESS_FINE_LOCATION};
        ActivityCompat.requestPermissions(LocationScreenOne.this,permission,REQ_CODE);
        TvDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LocationScreenOne.this, LocationScreenTwo.class);
                startActivity(intent);
            }
        });
    }
}