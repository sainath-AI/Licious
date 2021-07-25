package com.masai.licious.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.masai.licious.R;

import static com.masai.licious.R.color.dark_grey;
import static com.masai.licious.R.color.red;

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
                Intent intent = new Intent(LoginScreenOne.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        mEtMobileNumberOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 10) {
                    mBtnOtpOne.setBackgroundColor(getColor(red));
                } else {
                    mBtnOtpOne.setBackgroundColor(getColor(dark_grey));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

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