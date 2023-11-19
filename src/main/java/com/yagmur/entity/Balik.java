package com.yagmur.entity;

public class Balik extends Hayvan {

    private String pulRengi;

    public Balik(String pulRengi) {
        this.pulRengi = pulRengi;
    }

    public Balik(String ad, int yas, String pulRengi) {
        super(ad, yas);
        this.pulRengi = pulRengi;
    }

    public Balik() {

    }

    public void yuz (){
        System.out.println(getAd()+ " yüzüyor.");
    }

}
