package ch10_whileLoops;

import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Lütfen bir sayı giriniz: ");
        int zahl = scanner.nextInt ();

        int i = 0;

        while (i<zahl) {

            if (i%2 == 1) {
               // System.out.print (zahl+"'e/a kadar tek sayilar: "+ i);
               System.out.print ( i +",");
                //System.out.print ("Girilen sayıya kadar olan tek sayilar =   " + i);
            }

            i++;
        }

    }
}
