package cxh_38_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(23,55,63,99,88,65,34,35,21,72,56,45,9,3));
        //1.yazim mit stream
        sayi.stream().forEach(x-> System.out.print(x+" "));

        System.out.println();
        //2.yazim ohne stream
        sayi.forEach(x-> System.out.print(x+" "));

        System.out.println();
        //3.yazim  mit method reference
        sayi.forEach(System.out::println);
    }
}
