package com.masai.licious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LocationScreen extends AppCompatActivity {
private TextView TvDelivery;
private static final int REQ_CODE=101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_screen);
        TvDelivery=findViewById(R.id.tvDelivery);
        String[] permission={Manifest.permission.ACCESS_FINE_LOCATION};
        ActivityCompat.requestPermissions(LocationScreen.this,permission,REQ_CODE);
        TvDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LocationScreen.this,LocationScreen2.class);
                startActivity(intent);
            }
        });
    }
}