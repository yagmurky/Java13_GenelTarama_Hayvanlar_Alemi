package com.yagmur.entity;

import java.util.UUID;

public class Hayvan {
    private String id;
    private String ad;
    private int yas;

    public Hayvan() {
        this.id= UUID.randomUUID().toString();
    }

    public Hayvan(String ad, int yas) {
        this.id= UUID.randomUUID().toString();
        this.ad = ad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", yas='" + yas + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void hareketEt() {
        System.out.println(ad + " hareket ediyor.");
    }

    public void beslen() {
        System.out.println(ad + " besleniyor.");
    }
}
