package com.example.khodamku.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.khodamku.R;
import com.example.khodamku.utils.BaseActivity;

public class HomeActivity extends BaseActivity {

    private Button profileButton;
    private Button masterButton;
    private Button khodamButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupViews();
    }

    @Override
    protected void setupViews(){
        profileButton = findViewById(R.id.profileButton);
        masterButton = findViewById(R.id.masterButton);
        khodamButton = findViewById(R.id.khodamButton);
        logoutButton = findViewById(R.id.logoutButton);

        profileButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(
                        HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        masterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this, MasterActivity.class);
                startActivity(intent);
            }
        });
        khodamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        HomeActivity.this, KhodamActivity.class);
                startActivity(intent);
            }
        });
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        HomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}