package com.example.khodamku.models;

public class User {
    private String name;
    private String phone;
    private String email;
    private String password;

    //constructor
    public User(String name, String phone, String email, String password) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
        //getters and setters

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getPhone(){
            return phone;
        }
        public void setPhone(String phone){
            this.phone = phone;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public String getPassword(){
            return password;
        }
        public void setPassword(String password){
            this.password = password;
        }
}
