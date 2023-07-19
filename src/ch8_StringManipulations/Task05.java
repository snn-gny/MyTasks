package ch8_StringManipulations;

import java.util.Scanner;

import  java.lang.*;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */

        String ad, soyad ;

        Scanner input= new Scanner(System.in);

        System.out.println("Adinizi yaziniz: ");
        ad= input.nextLine();

        System.out.println("Soyadinizi yaziniz: ");
        soyad= input.nextLine();



        System.out.println(ad.substring(0, 1).toUpperCase()+ad.substring(1).toLowerCase());

        System.out.println(soyad.substring(0, 1).toUpperCase()+soyad.substring(1).toLowerCase());





    }
}
