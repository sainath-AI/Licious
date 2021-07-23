package com.masai.licious;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.masai.licious.activities.HomeActivity;

public class LiciousWay extends AppCompatActivity {
private ImageButton igbtnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licious_way);
        igbtnback=findViewById(R.id.igBackbtn);
        igbtnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LiciousWay.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}