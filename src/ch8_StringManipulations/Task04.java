package ch8_StringManipulations;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /**Task->
         Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir isim yaziniz: ");
        String name1 = input.nextLine();

        System.out.println("Baska bir isim yaziniz: ");
        String name2 = input.nextLine();

        if (name1.length() % 2 == 0) {
            String firstPart = name1.substring(0, name1.length() / 2);
            String secondPart = name1.substring(name1.length() / 2);
            System.out.println(firstPart + name2 + secondPart);
        } else {
            System.out.println("1.Kelimeye 2.kelime  eklenemez");
        }
    }
}