package ch28_ExceptionHandling.task28.task01;

import java.util.ArrayList;
import java.util.Arrays;

    public class Okul {

    String okulAd;

    int maxOgrenciSayisi=2;

    static ArrayList<Ogrenci>ogrenciList=new ArrayList<>();

    public Okul() {
    }

    public Okul(String okulAd, int maxOgrenciSayisi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;

    }
    public void ogrEkle(Ogrenci ogrenci){
        if (ogrenci.getYas()<15){
            ogrenciList.add(ogrenci);

        }else System.out.println("ogrenci yasi 15 ten buyuk olmamali");

    }

        @Override
        public String toString() {
            return "Okul{" +
                    "okulAd='" + okulAd + '\'' +
                    ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                    '}';
        }
    }