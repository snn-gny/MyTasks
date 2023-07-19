package ch12_methodCreation;

import  java.util.Scanner;

public class Task01 {
    public static void main (String[] args) {
        /*
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...
         */

        Scanner input = new Scanner (System.in);
        System.out.println ("Lütfen bir sayi giriniz: ");
        int x = input.nextInt ();

        System.out.println ("Lütfen bir sayi giriniz: ");
        int y = input.nextInt ();

        boolean result = vergleich(x, y);
        System.out.println("Sonuç: " + result);

    }//main sonu

    public static boolean vergleich(int x, int y) {
        return x == y;

    }

}
