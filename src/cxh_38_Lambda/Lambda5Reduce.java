package cxh_38_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda5Reduce {
    public static void main(String[] args) {
    // Task : List'in cift elemanlarin karelerinin
    // en buyugunu print ediniz.

        List<Integer> list = new ArrayList<>(Arrays.asList(23, 55, 63, 99, 88, 65, 34, 35, 21, 72, 56, 45, 9, 3));

        ciftElemanKare(list); //max= Optional[7744.0]

        System.out.println();

        ciftElemanKaresi(list);//Optional[7744.0]

        System.out.println();

        // Task : List'teki tum elemanlarin toplamini print ediniz.

        toplamElemanlar(list);//668

        System.out.println();

        System.out.println(list.stream().reduce(Math::addExact));
        //Optional[668]

        // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
        System.out.println();
        ciftElemanCarp(list);


    }

    private static void ciftElemanCarp(List<Integer> list) {

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

