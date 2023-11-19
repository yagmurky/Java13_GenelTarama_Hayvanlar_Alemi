package com.yagmur.entity;

import com.yagmur.entity.Hayvan;

public class Kus extends Hayvan {
    private int kanatUzunlugu;

    public Kus(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public Kus(String ad, int yas, int kanatUzunlugu) {
        super(ad, yas);
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public void uc (){
        System.out.println(getAd() + kanatUzunlugu + " cm uzunluğunda kanatlarıyla uçuyor.");
    }

    public void gocEt (){
        System.out.println(getAd() + " göç ediyor.");
    }



}
