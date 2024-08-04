package com.example.khodamku.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.khodamku.R;
import com.example.khodamku.utils.BaseActivity;

public class LoginActivity extends BaseActivity {

    private EditText unameEditText;
    private EditText passEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupViews();
    }
    @Override
    protected void setupViews(){
        unameEditText   = findViewById(R.id.unameEditText);
        passEditText    = findViewById(R.id.passEditText);
        loginButton     = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //example simple authentication
                if (unameEditText.getText().toString().equals("KifuatH")&&
                        passEditText.getText().toString().equals("password")){
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}