package cxh_38_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda4Map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(23, 55, 63, 99, 88, 65, 34, 35, 21, 72, 56, 45, 9, 3));

    // Task 1: Functional Programming ile listin
    // cift elemanlarinin  karelerini ayni satirda
    // aralarina bosluk bırakarak print ediniz

        ciftKareMethod(sayi);//1156 3136 5184 7744

        System.out.println();

    // Task 2: Functional Programming ile listin tek elemanlarinin
    // kuplerinin bir fazlasini ayni satirda
    // aralarina bosluk birakarak print ediniz.

        tekKupArtiBirMethod(sayi);
        //12168 166376 250048 970300 274626 42876 9262 91126 730 28
        System.out.println();
    // Task 3: Functional Programming ile listin cift elemanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak print ediniz.
        ciftElemanKarekok(sayi);
        //9 5 8 7

    }

    private static void ciftElemanKarekok(List<Integer> sayi) {
        sayi.stream().filter(x->x%2==0).map(x->(int)Math.sqrt(x)).forEach(x-> System.out.print(x+" "));
    // .map(Math::sqrt) böyle de mümkün double deger return eder.
    }

    private static void tekKupArtiBirMethod(List<Integer> sayi) {
        sayi.stream().filter(x->x%2!=0).map(x->(int)Math.pow(x,3)+1)
                .forEach(x->System.out.print(x+" "));
    }

    private static void ciftKareMethod(List<Integer> sayi) {
    sayi.stream().filter(x -> x % 2 == 0).map(x->x*x).sorted().forEach(x->System.out.print(x+" "));
    }
}
