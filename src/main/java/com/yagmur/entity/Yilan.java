package com.yagmur.entity;

import com.yagmur.entity.Hayvan;

public class Yilan extends Hayvan {
    private String deriRengi;

    public Yilan(String deriRengi) {
        this.deriRengi = deriRengi;
    }

    public Yilan(String ad,int yas, String deriRengi) {
        super(ad, yas);
        this.deriRengi = deriRengi;
    }

    public void deriDok (){
        System.out.println(deriRengi + " renkli yılan deri döküyor.");
    }



}
