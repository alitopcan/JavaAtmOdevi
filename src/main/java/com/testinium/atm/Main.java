package com.testinium.atm;

import com.testinium.models.BireyselMusteri;
import com.testinium.models.KurumsalMusteri;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        float bakiye = 0.0F;
        YanSinif yanSinif = new YanSinif();
        Map<String, Object> kurumsalMap = yanSinif.kurumsal();
        Map<String, Object> bireyselMap = yanSinif.bireysel();

     Scanner myObj = new Scanner(System.in);
        System.out.println("Müşteri No Giriniz: ");
        String musteriNo = myObj.nextLine();
        for (Map.Entry<String, Object> entry : bireyselMap.entrySet()) {
            String key = entry.getKey();
            if (musteriNo.equals(key)) {
                BireyselMusteri value = (BireyselMusteri) entry.getValue();
                bakiye = value.hesapBakiyesi;
                System.out.println("Müşteri Bilgileri: \n" + "Ad Soyad: " + value.adSoyad + "\nTc No: " + value.tcKimlikNo + "\nHesap Bakiyesi: " + value.hesapBakiyesi + "\nEv adresi: " + value.evAdresi);
            }
        }
        if (bakiye == 0) {
            for (Map.Entry<String, Object> entry : kurumsalMap.entrySet()) {
                String key = entry.getKey();
                if (musteriNo.equals(key)) {
                    KurumsalMusteri value = (KurumsalMusteri) entry.getValue();
                    bakiye = value.hesapBakiyesi;
                    System.out.println("Müşteri Bilgileri: \n" + "Ad Soyad: " + value.adSoyad + "\nTc No: " + value.tcKimlikNo + "\nHesap Bakiyesi:" + value.hesapBakiyesi + "\nSirket Adi: " + value.sirketAdi);
                }
            }
        }
        if (bakiye != 0) {
            System.out.println("\n****İSLEMLER****\n");
            System.out.println("1. Para Yatırma");
            System.out.println("2. Para Çekme");
            System.out.print("\nİsleminizi Seciniz: ");
            int islem = myObj.nextInt();

            HesapIslemleri hesapIslemleri = new HesapIslemleri();

            switch (islem) {
                case 1:
                    System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                    float tutar = myObj.nextFloat();
                    hesapIslemleri.paraYatir(bakiye,tutar);
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                    float tutar2 = myObj.nextFloat();
                   hesapIslemleri.paraCek(bakiye,tutar2);
                    break;
                default:
                    System.out.println("Yanlıs islem sectiniz.");

            }
        }
        else
            System.out.println("Aradığınız Müşteri Bulunamadı.");

  }
}
