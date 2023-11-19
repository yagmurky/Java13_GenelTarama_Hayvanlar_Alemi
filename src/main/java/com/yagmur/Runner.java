package com.yagmur;

import com.yagmur.entity.*;

public class Runner {
    public static void main(String[] args) {


        Balik balik=new Balik("Nemo", 4,"kırmızı");
        System.out.println(balik.toString());
        balik.yuz();
        balik.hareketEt();
        balik.beslen();

        Kedi kedi=new Kedi("Loki",2,"Smokin");
        System.out.println(kedi.toString());
        kedi.miyavla();
        kedi.hareketEt();
        kedi.beslen();

        Kus kus=new Kus("Boncuk", 1, 5);
        System.out.println(kus.toString());
        kus.uc();
        kus.beslen();
        kus.hareketEt();
        kus.gocEt();

        Yilan yilan=new Yilan("Harry",8, "Yeşil");
        System.out.println(yilan.toString());
        yilan.deriDok();
        yilan.beslen();
        yilan.hareketEt();





    }
}
