package ch10_whileLoops;

import java.util.OptionalInt;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz: ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();


        for (int i = sayi1; i <= sayi2 ; i++) {
            System.out.print(i+"  ");

        }
        System.out.println();
        int i =sayi1;
        while (i<=sayi2){
            System.out.println(i);
            i++;
        }






    }
}
