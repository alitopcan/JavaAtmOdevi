package com.testinium.models;

public class BireyselMusteri extends Musteri {

    public String evAdresi;

    public BireyselMusteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }


    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }
}
