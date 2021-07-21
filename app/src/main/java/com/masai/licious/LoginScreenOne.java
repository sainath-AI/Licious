package com.masai.licious;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginScreenOne extends AppCompatActivity {

    private final String numberValidation = "[0-9]+";
    private TextView mTvSkipOne, mTvTermsOne;
    private EditText mEtMobileNumberOne;
    private Button mBtnOtpOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        initViews();
    }

    private void initViews() {
        mTvSkipOne = findViewById(R.id.tvSkipOne);
        mTvTermsOne = findViewById(R.id.tvTermsOne);
        mEtMobileNumberOne = findViewById(R.id.etMobileNumberOne);
        mBtnOtpOne = findViewById(R.id.btnOtpOne);
        mTvSkipOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //redirect to the home screen
            }
        });
        mEtMobileNumberOne.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                mBtnOtpOne.setBackgroundColor(R.color.red);
            }
        });
        mBtnOtpOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobileNumber = mEtMobileNumberOne.getText().toString();
                if (mobileNumber.length() == 10
                        && mobileNumber.matches(numberValidation)) {
                    Intent intent = new Intent(LoginScreenOne.this, LoginScreenTwo.class);
                    intent.putExtra("number", mobileNumber);
                    startActivity(intent);
                    LoginScreenOne.this.finish();
                } else {
                    mEtMobileNumberOne.setError("Phone number is not valid");
                }
            }
        });
        mTvTermsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //terms and conditions
            }
        });
    }
}