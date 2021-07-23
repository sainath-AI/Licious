package com.masai.licious;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.masai.licious.activities.HomeActivity;

public class ReferEarnActivity extends AppCompatActivity {
private ImageButton igbtnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer_earn);
        igbtnback=findViewById(R.id.igBackbtn);
        igbtnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ReferEarnActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}