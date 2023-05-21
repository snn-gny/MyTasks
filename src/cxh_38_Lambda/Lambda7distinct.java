package cxh_38_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda7distinct {
    public static void main(String[] args) {

        List<String> menu = new ArrayList<>(Arrays.asList("kumpir", "waffle", "adana", "kokorec",
                "midye", "ciger", "iskembe", "islak hamburger", "ciger", "adana", "waffle", "kumpir", "Kumpir"));
        alfabetikBuyukHarfTekrarsiz(menu);
        //ADANA CIGER ISKEMBE ISLAK HAMBURGER KOKOREC KUMPIR MIDYE WAFFLE
        System.out.println();
        characterSayiTersSiraliTekrarsiz   (menu); //5 6 7 15
        System.out.println();


    }

    private static void characterSayiTersSiraliTekrarsiz(List<String> list) {
     list.stream().map(String::length).distinct().sorted().forEach(x-> System.out.print(x+" "));
    }

    private static void alfabetikBuyukHarfTekrarsiz(List<String> list) {
      list.stream().map(String::toUpperCase).sorted().distinct().forEach(x-> System.out.print(x+" "));
    }









}

