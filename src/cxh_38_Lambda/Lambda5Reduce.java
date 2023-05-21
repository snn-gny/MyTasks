package cxh_38_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda5Reduce {
    public static void main(String[] args) {
    // Task 1 : List'in cift elemanlarin karelerinin
    // en buyugunu print ediniz.

        List<Integer> list = new ArrayList<>(Arrays.asList(23, 55, 63, 99, 88, 65, 34, 35, 21, 72, 56, 45, 9, 3));

        ciftElemanKare(list); //max= Optional[7744.0]

        System.out.println();

        ciftElemanKaresi(list);//Optional[7744.0]

        System.out.println();

    // Task 2 : List'teki tum elemanlarin toplamini print ediniz.

        toplamElemanlar(list);//668

        System.out.println();

        System.out.println(list.stream().reduce(Math::addExact));
        //Optional[668]

    // Task 3: List'teki cift elemanlarin carpimini  yazdiriniz.
        System.out.println();

        ciftElemanCarp(list);//12063744

    // Task 4: List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
        System.out.println();
        enkucukPrint(list);
    // Task 5: List'teki 24'ten buyuk en kucuk tek sayiyi print ediniz.
        System.out.println();
        yirmidorttenbuyukenkucuktekSayiPrint(list);

    }

    private static void yirmidorttenbuyukenkucuktekSayiPrint(List<Integer> list) {
      System.out.println(list.stream().filter(x -> x > 24 && x % 2 == 1).sorted().findFirst());//Optional[35]
        System.out.println(list.stream().sorted().filter(x -> x % 2 == 1 && x > 24).findFirst());//Optional[35]
       System.out.println(list.stream().filter(x -> x % 2 == 1 && x > 24).reduce(Integer::min));//Optional[35]
      System.out.println(list.stream().filter(x -> x % 2 == 1 && x > 24).reduce(Math::min));//Optional[35]
    }

    private static void enkucukPrint(List<Integer> list) {
        System.out.println(list.stream().sorted().reduce(Math::min));//Optional[3]
        System.out.println(list.stream().reduce(Math::min));//Optional[3]
        System.out.print(list.stream().reduce(Integer::min));//Optional[3]
        System.out.println(list.stream().sorted().findFirst());//Optional[3]
    }

    private static void ciftElemanCarp(List<Integer> list) {
        //System.out.println(list.stream().filter(x -> x % 2 == 0).reduce(1, (x, y) -> x * y));
        // 12063744
        System.out.println(list.stream().filter(x -> x % 2 == 0).reduce(Math::multiplyExact));
        //Optional[12063744]
    }

    private static void toplamElemanlar(List<Integer> list) {
        System.out.println(list.stream().reduce(0, (a, b) -> a + b));
    }

    private static void ciftElemanKare(List<Integer> list) {
        Optional<Double> max = list.stream().filter(x -> x % 2 == 0).map(x -> Math.pow(x, 2)).sorted().
                reduce(Math::max);
        System.out.println("max= " +max);


    }
    private static void ciftElemanKaresi(List<Integer> list) {
        System.out.println(list.stream().filter(x -> x % 2 == 0).map(x -> Math.pow(x, 2)).sorted().
                reduce(Math::max));


    }




}

