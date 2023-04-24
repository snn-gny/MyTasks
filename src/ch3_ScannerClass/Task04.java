package ch3_ScannerClass;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scn=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scn.nextLine().toUpperCase();
        System.out.println("please enter your surname");
        String surName=scn.nextLine().toUpperCase();
        System.out.println("please enter your age");
        int age=scn.nextInt();
        System.out.println("please enter your weight");
        double weight=scn.nextDouble();
        System.out.println("please enter your length");
        double length=scn.nextDouble();
        System.out.println("How long will you continue to our salon?");
        int duration=scn.nextInt();
        double price=duration*20;
        System.out.println(name+ " "+surName+" is "+age+" years old  and " + weight + " kg " + length + " cm " + duration + " month long " + " total price:" + price + " $ ");


    }
}
