package cxh_38_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda9match {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("kumpir", "Waffle", "adana", "kokorec","doner box",
                "midye", "ciger", "iskembe", "islak hamburger", "ciger", "adana", "waffle", "kumpir", "Kumpir", "kuzu", "ezme"));

        // Task 1: List elemanlarinin karakter sayisini
        // 7 ve 7 'den az olma durumunu kontrol ediniz.->

        karakterSayisi7denAz  ( menu);
        // false
        //true
        // false

        // Task 2: List elemanlarinin "W" ile baslamasını kontrol ediniz.-> noneMatch
        System.out.println();
        listWIleBaslayanKontrol(menu);
      // true
      //  false
      //  false

        // Task 3: List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
        System.out.println();
        xIleBitenKontrol(menu);
        // true
        //  false
        //  false

    }

    private static void xIleBitenKontrol(List<String> list) {
        System.out.println(list.stream().anyMatch(x -> x.endsWith("x")));
        System.out.println(list.stream().noneMatch(x -> x.endsWith("x")));
        System.out.println(list.stream().allMatch(x -> x.endsWith("x")));
    }

    private static void listWIleBaslayanKontrol(List<String> list) {
        System.out.println(list.stream().anyMatch(x -> x.startsWith("W")));//true
        System.out.println(list.stream().noneMatch(x -> x.startsWith("W")));//false
        System.out.println(list.stream().allMatch(x -> x.startsWith("W")));//false





    }

    private static void karakterSayisi7denAz(List<String> list) {
        System.out.println(list.stream().allMatch(x -> x.length() <= 7));//false
        System.out.println(list.stream().anyMatch(x -> x.length() <= 7));//true
        System.out.println(list.stream().noneMatch(x -> x.length() <= 7));//false


    }
}
