package cxh_38_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda8comparing {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("kumpir", "waffle", "adana", "kokorec",
                "midye", "ciger", "iskembe", "islak hamburger", "ciger", "adana", "waffle", "kumpir", "Kumpir","kuzu","ezme"));



        // Task 1: List elemanlarini character sayisina gore
        // kckten byk e gore print ediniz...
        System.out.println();

        characterSayiDogalSirali(menu);//4 4 5 5 5 5 5 6 6 6 6 6 7 7 15
        System.out.println();

        sonHarfGoreTersSirala(menu);
        System.out.println();
        //kuzu kumpir ciger islak hamburger ciger kumpir Kumpir
        // waffle midye iskembe waffle ezme kokorec adana adana
        ciftLengthKarelerTekrarsizBuyuktenKucuge(menu);
        //36 16
//        menu.stream().
//                map(String::length).
//                filter(t->t%2==0).
//                sorted(Comparator.reverseOrder()).
//                map(t->t*t).
//                distinct().
//                forEach(System.out::println);




    }


    private static void ciftLengthKarelerTekrarsizBuyuktenKucuge(List<String> list) {
        list.stream().map(x->x.length()*x.length()).filter(x->x%2==0).distinct().sorted(Comparator.reverseOrder()).forEach(x->System.out.print(x+" "));
    }

    private static void sonHarfGoreTersSirala(List<String> list) {
        list.stream().sorted(Comparator. comparing(t -> t.toString().charAt(t.toString().length() - 1)).
                reversed()).forEach(x->System.out.print(x+" "));
    }

    private static void characterSayiDogalSirali(List<String> list) {
     list.stream().map(String::length).sorted().forEach(y-> System.out.print(y+" "));
    }
}
