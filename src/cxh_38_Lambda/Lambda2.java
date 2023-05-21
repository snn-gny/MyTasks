package cxh_38_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        // Task 1 : "Structured Programming"kullanarak list elemanlarıni once naturalordering
        // ile siralayip çiftlerini
        // aynı satirda aralarında bosluk olacak sekilde print ediniz
        List<Integer> sayi=new ArrayList<>(Arrays.asList(23,55,63,99,88,65,34,35,21,72,56,45,9,3));
        for (Integer each:sayi) {
           if (each%2==0){
               System.out.println(each+"");
           }
        }
        //Task 2 : "Functional Programming" kullanarak list elemanlarının çiftlerini
        // aynı satirda aralarında bosluk olacak sekilde print ediniz.
        System.out.println();
       sayi.stream().filter(w->w%2==0).sorted().forEach(w->System.out.print(w+" "));
       //kucukten buyuge siralanarak yazdirildi
        //Task 3 : "Functional Programming" kullanarak list
        // elemanlarının 35 den küçük ve çift sayilari  aynı satirda aralarında
        // bosluk olacak sekilde print ediniz.
        System.out.println();
        sayi.stream().filter(w->w<35 && w %2==0).forEach(w-> System.out.println(w+" "));

    }
}
