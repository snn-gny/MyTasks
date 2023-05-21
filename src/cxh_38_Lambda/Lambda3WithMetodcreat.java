package cxh_38_Lambda;

import java.util.*;

public class Lambda3WithMetodcreat {
    public static void main(String[] args) {
        
     // Task 1 : "Structured Programming"kullanarak list elemanlarıni
     // once naturalordering
     // ile siralayip çiftlerini
     // aynı satirda aralarında bosluk olacak sekilde print ediniz

        List<Integer> sayi=new ArrayList<>(Arrays.asList(23,55,63,99,88,65,34,35,21,72,56,45,9,3));

        ciftkcktenbygesirali(sayi);//34 56 72 88

       //Task 2 : "Functional Programming" kullanarak list elemanlarının çiftlerini
       // aynı satirda aralarında bosluk olacak sekilde print ediniz.

        System.out.println();

        ciftelemanFunctional(sayi);//34 56 72 88

        //Task 3 : "Functional Programming" kullanarak list
        // elemanlarının 35 den küçük ve tek sayilari  aynı satirda aralarında
        // bosluk olacak sekilde print ediniz.

        System.out.println();

        tek35tenkucuk(sayi);//3 9 21 23


        //Task 4 : "Functional Programming" kullanarak list
        // elemanlarının 34 den buyuk YADA  çiftlerini  aynı satirda
        // aralarında bosluk olacak sekilde print ediniz.
        System.out.println();
        cift34tenbuyuk(sayi);//56 72 88
    }

    private static void cift34tenbuyuk(List<Integer> sayi) {

        sayi.stream().filter(x -> x >34 && x % 2== 0).sorted().forEach( x -> System.out.print( x+" "));
    }

    private static void tek35tenkucuk(List<Integer> sayi) {

        sayi.stream().filter(x-> x < 35 && x % 2 != 0).sorted().forEach(x->System.out.print( x+" "));
    }

    private static void ciftelemanFunctional(List<Integer> sayi) {
        sayi.stream().sorted().filter(x->x%2==0).forEach(x-> System.out.print(x+" "));
    }

    private static void ciftkcktenbygesirali(List<Integer> sayi) {
        Collections.sort(sayi);

        for (Integer each:sayi) {
        if(each%2==0 ){
            System.out.print(each+" ");
        }
    }





    }//method sonu


}
