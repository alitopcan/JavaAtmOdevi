package com.testinium.atm;

import java.util.HashMap;
import java.util.Map;

public class HesapIslemleri {

    public void paraCek(float bakiye, float tutar2) {
        if (tutar2 > bakiye) {
            System.out.print("Yetersiz bakiye. ");
        }
        else
           System.out.println("Yeni bakiyeniz: " + (bakiye-tutar2));
    }

    public void paraYatir(float bakiye, float tutar) {

        System.out.println("Yeni bakiyeniz = " + (bakiye+tutar));
    }
}
