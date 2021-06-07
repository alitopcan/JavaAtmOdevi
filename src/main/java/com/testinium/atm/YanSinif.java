package com.testinium.atm;

import com.testinium.models.BireyselMusteri;
import com.testinium.models.KurumsalMusteri;

import java.util.HashMap;
import java.util.Map;

public class YanSinif {
    public Map<String, Object> kurumsal(){
        Map<String, Object> atmMap = new HashMap<>();
        atmMap.put("123", new KurumsalMusteri("12345678901", "Ali Topcan", 1000,"Topcan Holding"));
        atmMap.put("345", new KurumsalMusteri("98765432109", "Sener Topcan", 2000,"Topcan Holding"));
        atmMap.put("567", new KurumsalMusteri("23456789012", "Gülizar Topcan", 3000,"Topcan Holding"));

        return atmMap;
    }
    public Map<String, Object> bireysel(){
        Map<String, Object> atmMap = new HashMap<>();
        atmMap.put("678", new BireyselMusteri("98765432109", "Veli Topçu", 2000,"Ankara"));
        atmMap.put("789", new BireyselMusteri("23456789012", "Yılmaz Kılıç", 3000,"Tokat"));

        return atmMap;
    }
}
