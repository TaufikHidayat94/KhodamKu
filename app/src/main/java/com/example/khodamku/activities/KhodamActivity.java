package com.example.khodamku.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.example.khodamku.R;
import com.example.khodamku.models.Khodam;
import com.example.khodamku.utils.BaseActivity;


public class KhodamActivity extends BaseActivity {

    private TextView nameKhodam;
    private TextView nimKhodam;
    private TextView jenisKhodam;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khodam);
        setupViews();
    }

    @Override
    protected void setupViews(){
       nameKhodam = findViewById(R.id.nameKhodam);
       nimKhodam = findViewById(R.id.nimKhodam);
       jenisKhodam = findViewById(R.id.jenisKhodam);

    //Contoh KhodamKu

    Khodam khodam = new Khodam("Halo, Taufik Hidayat!","NIM kamu: 230101020110.","Khodam kamu: Beruang Kutub Pakai Topi", "passs");

    nameKhodam.setText(khodam.getNama());
    nimKhodam.setText(khodam.getNim());
    jenisKhodam.setText(khodam.getJenis());

    }
}