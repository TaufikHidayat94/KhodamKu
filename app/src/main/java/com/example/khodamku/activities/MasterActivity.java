package com.example.khodamku.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.example.khodamku.R;
import com.example.khodamku.models.User;
import com.example.khodamku.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;


public class MasterActivity extends BaseActivity {

    private TextView masterInfo;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        setupViews();
    }

    protected void setupViews(){
        masterInfo = findViewById(R.id.masterInfo);

        List<User> userList = getUsers();
        StringBuilder info = new StringBuilder();

        for (User user:userList) {
            info.append("Name: ").append(user.getName()).append("\n")
                    .append("Email: ").append(user.getPhone()).append("\n")
                    .append("Phone: ").append(user.getEmail()).append("\n\n");
        }
        masterInfo.setText(info.toString());
    }

    private List<User> getUsers() {
        //Return a list of dummy users for demonstration
        List<User> users = new ArrayList<>();
        users.add(new User("Taufik Hidayat", "085744556677", "TaufikHidayat1@example.com","password1"));
        users.add(new User("Kifuat Hidayat", "087544332211", "email2@example.com","password2"));
        users.add(new User("Unsia","085678908765","unsia@unsia.ac.id","password3"));
        return users;
    }
}