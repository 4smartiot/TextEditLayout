package com.tipandroid.textinputlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    String name = "";
    String email = "";
    String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText tfName = (TextInputEditText) findViewById(R.id.tf_name);
        TextInputEditText tfEmail = (TextInputEditText) findViewById(R.id.tf_email);
        TextInputEditText tfPassword = (TextInputEditText) findViewById(R.id.tf_password);
        Button btnSubmit = (Button) findViewById(R.id.btn_submit);
        TextView tvInfo = (TextView) findViewById(R.id.tv_info);


        tfName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!TextUtils.isEmpty(s.toString())){
                    name = s.toString();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        tfEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!TextUtils.isEmpty(s.toString())){
                    email = s.toString();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        tfEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!TextUtils.isEmpty(s.toString())){
                    password = s.toString();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        btnSubmit.setOnClickListener(v->{
            tvInfo.setText("Your infomation is : \n" + "Name : "+ name +"\nEmail : "+ email + "\nPassword : "+ password);
        });
    }
}