package ch28_ExceptionHandling.task28.task01;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul = new Okul("Ataturk ilkokulu", 2);
        Scanner input = new Scanner(System.in);

        while (true) {
            if (okul.ogrenciList.size() >= okul.maxOgrenciSayisi) {
                System.out.println("Sınıf kapasitesi doldu!");
                break;
            }
            try {
                System.out.println("Eklemek istediginiz ogencinin adini giriniz");
                String name = input.nextLine();

                System.out.println("Eklemek istediginiz ogencinin soyadini giriniz");
                String surName = input.nextLine();

                System.out.println("Eklemek istediginiz ogencinin  yasini giriniz");
                int age = Integer.parseInt(input.nextLine());

                Ogrenci ogrenci = new Ogrenci(name, surName, age);
                okul.ogrEkle(ogrenci);

            } catch (NumberFormatException e) {
                System.out.println("Yanlis yas formati girdiniz!");
            } catch (ArithmeticException e) {
                System.out.println("Baska bir ogrenci ekleyiniz.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }

        }



    }

}