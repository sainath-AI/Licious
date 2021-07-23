package com.masai.licious;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.masai.licious.activities.HomeActivity;

public class CartActivity extends AppCompatActivity {
private ImageButton btnback;
private View vContinueShopping;
private TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        btnback=findViewById(R.id.igBack);
        vContinueShopping=findViewById(R.id.vShopping);
        txtView=findViewById(R.id.textView7);
        vContinueShopping.setOnClickListener(v -> {
            Intent intent=new Intent(CartActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        txtView.setOnClickListener(v -> {
            Intent intent=new Intent(CartActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        btnback.setOnClickListener(v -> {
            Intent intent=new Intent(CartActivity.this, HomeActivity.class);
            startActivity(intent);
        });


    }
}