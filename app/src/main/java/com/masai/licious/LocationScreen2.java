package com.masai.licious;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.masai.licious.activities.HomeActivity;

public class LocationScreen2 extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_screen2);
        imageButton=findViewById(R.id.igSearch);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LocationScreen2.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}