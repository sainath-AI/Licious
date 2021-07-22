package com.masai.licious;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
            @Override
            public void run() {
                mEtOtpTwo.setText("4 3 7 6 3 9");
                mBtnConfirmOtpTwo.setBackgroundColor(R.drawable.rectangle_button);
            }
        },2000);
        mTvSkipTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //redirect to the home screen
            }
        });
        mTvEditNumberTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEtMobileNumberTwo.getText().clear();
            }
        });
        mTvResendTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEtOtpTwo.getText().clear();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mEtOtpTwo.setText("5678");
                    }
                },2000);
            }
        });
        mBtnConfirmOtpTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreenTwo.this,LocationScreen.class);
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