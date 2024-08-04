package com.example.khodamku.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.example.khodamku.R;
import com.example.khodamku.models.User;
import com.example.khodamku.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import com.example.khodamku.R;

public class ProfileActivity extends BaseActivity {

    private TextView nameProfil;
    private TextView phoneProfil;
    private TextView emailProfil;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupViews();
    }

    @Override
    protected void setupViews(){
        nameProfil = findViewById(R.id.nameProfil);
        phoneProfil = findViewById(R.id.phoneProfil);
        emailProfil = findViewById(R.id.emailProfil);

        //Contoh KhodamKu

        User user = new User("Taufik Hidayat","085789098765","taufikhidayat.exp@example.com", "passs");

        nameProfil.setText(user.getName());
        phoneProfil.setText(user.getPhone());
        emailProfil.setText(user.getEmail());

    }
}