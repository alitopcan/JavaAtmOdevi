package com.testinium.models;

public class KurumsalMusteri extends Musteri {

    public String sirketAdi;

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

}
