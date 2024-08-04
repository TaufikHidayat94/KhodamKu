package com.example.khodamku.models;

public class Khodam {
    private String nama;
    private String nim;
    private String jenis;
    private String validity;

    //constructor
    public Khodam(String nama, String nim, String jenis, String vaidity) {
        this.nama = nama;
        this.nim = nim;
        this.jenis = jenis;
        this.validity = validity;
    }
    //getters and setters

    public String getNama(){
        return nama;
    }
    public void setNama(String name){
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getValidity(){
        return validity;
    }
    public void setValidity(String validity){
        this.validity = validity;
    }
}
