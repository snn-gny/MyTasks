package cxh_38_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class Lambda6Sorted {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(23, 55, 63, 99, 88, 65, 34, 35, 21, 72, 56, 45, 9, 3));
    // Task 1: list'in cift  elemanlarinin karelerini
        // kucukten buyuge print ediniz.
        ciftKareKucuktenBuyugeSort(sayi);//1156 3136 5184 7744
        System.out.println();
    // Task 2: list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
        tekElemanKareByktenKcge(sayi);//Optional[9801]
       // Kontrol amacli yapilan 3 satir:
        Stream<Integer> sayi2=sayi.stream().filter(x -> x % 2 != 0).map(x -> (int) Math.pow(x, 2)).sorted();
        System.out.println(Arrays.toString(sayi2.toArray()));
        //[9, 81, 441, 529, 1225, 2025, 3025, 3969, 4225, 9801]
        Stream<Integer> sayi3=sayi.stream().filter(x -> x % 2 != 0).map(x -> (int) Math.pow(x, 2)).sorted(Comparator.reverseOrder());
        System.out.println(Arrays.toString(sayi3.toArray()));
        //reverseOrder() ile
       // [9801, 4225, 3969, 3025, 2025, 1225, 529, 441, 81, 9]


    }

    private static void tekElemanKareByktenKcge(List<Integer> list) {
        System.out.println(list.stream().filter(x -> x % 2 != 0).map(x -> (int) Math.pow(x, 2)).sorted(Comparator.reverseOrder()).findFirst());

    }

    private static void ciftKareKucuktenBuyugeSort(List<Integer> list) {
        list.stream().filter(x->x%2==0).map(x->(int)Math.pow(x,2)).sorted().forEach(x->System.out.print(x+" "));
    }
}
