package cxh_38_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda9limit {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("kumpir", "waffle", "adana", "kokorec","doner box",
                "midye", "ciger", "iskembe", "islak hamburger", "ciger", "adana", "waffle", "kumpir", "Kumpir",
                "kuzu", "ezme"));
        //task 1: ilk 3 menuyu  getir
        menu.stream().limit(3).forEach(x-> System.out.print(x+" "));
        //kumpir waffle adana
        System.out.println();

        // Task 2: Karakter sayisi en buyuk ilk iki elemani yazdiriniz.
        karakterSayisiEnBuyukEleman(menu);
        //[islak hamburger, doner box]


        //***yildizdan***
       menu.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(2).forEach(x->System.out.print(x+" "));
       //islak hamburger doner box

        //bu da guzelmis...||
        //                 ^^

        Object [] enBuyukIlkIkiEleman = menu.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(2).toArray();
        System.out.println("Arrays.toString(enBuyukIlkIkiEleman) = " +
                Arrays.toString(enBuyukIlkIkiEleman));

    }

    private static void karakterSayisiEnBuyukEleman(List<String> list) {

       Stream<String> list2=list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(2);
        System.out.println(Arrays.toString(list2.toArray()));//[islak hamburger, doner box]
    }
}
