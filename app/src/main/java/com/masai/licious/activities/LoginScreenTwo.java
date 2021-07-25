package com.masai.licious.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.masai.licious.R;

import static com.masai.licious.R.color.red;

public class LoginScreenTwo extends AppCompatActivity {

    private TextView mTvSkipTwo, mTvTermsTwo, mTvEditNumberTwo, mTvResendTwo;
    private EditText mEtMobileNumberTwo, mEtOtpTwo;
    private Button mBtnConfirmOtpTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_activity);
        initViews();
    }

    private void initViews() {
        mTvSkipTwo = findViewById(R.id.tvSkipTwo);
        mTvTermsTwo = findViewById(R.id.tvTermsTwo);
        mEtMobileNumberTwo = findViewById(R.id.etMobileNumberTwo);
        mEtOtpTwo = findViewById(R.id.etOtpTwo);
        mBtnConfirmOtpTwo = findViewById(R.id.btnConfirmOtpTwo);
        mTvEditNumberTwo = findViewById(R.id.tvEditNumberTwo);
        mTvResendTwo = findViewById(R.id.tvResendTwo);
        String number = getIntent().getStringExtra("number");
        mEtMobileNumberTwo.setText(number);
        new Handler().postDelayed(new Runnable() {
            @SuppressLint("SetTextI18n")
            @Override
            public void run() {
                mEtOtpTwo.setText("437639");
                mBtnConfirmOtpTwo.setBackgroundColor(getColor(red));
            }
        },2500);
        mTvSkipTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreenTwo.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        mTvEditNumberTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreenTwo.this,LoginScreenOne.class);
                startActivity(intent);
            }
        });
        mTvResendTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEtOtpTwo.getText().clear();
                new Handler().postDelayed(new Runnable() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void run() {
                        mEtOtpTwo.setText("548273");
                        mBtnConfirmOtpTwo.setBackgroundColor(getColor(red));
                    }
                },2500);
            }
        });

        mBtnConfirmOtpTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreenTwo.this, LocationScreenOne.class);
                startActivity(intent);
            }
        });
        mTvTermsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //terms and conditions
            }
        });
    }
}