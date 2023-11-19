package com.yagmur.entity;

import com.yagmur.entity.Hayvan;

public class Kedi extends Hayvan {
    private String tur;

    public Kedi(String tur) {
        this.tur = tur;
    }

    public Kedi(String ad, int yas, String tur) {
        super(ad, yas);
        this.tur = tur;
    }

    public Kedi() {

    }

    public void miyavla() {
        System.out.println(getAd() + " miyavlıyor.");
    }



}
