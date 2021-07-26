package com.masai.licious.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.masai.licious.R;

public class LocationScreenTwo extends AppCompatActivity {

    ImageButton imageButton;
    EditText etLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_screen2);
        etLocation=findViewById(R.id.etDeliverySearch);
        imageButton=findViewById(R.id.igSearch);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location=etLocation.getText().toString();
                Intent intent=new Intent(LocationScreenTwo.this, HomeActivity.class);
                intent.putExtra("location",location);
                startActivity(intent);
            }
        });
    }
}