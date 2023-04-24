package ch3_ScannerClass;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız.
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        Scanner scn=new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihre a Nummer ein ");
        double a=scn.nextInt();

        System.out.println("Bitte geben Sie Ihre b Nummer ein ");
        double b=scn.nextInt();

        System.out.println("Bitte geben Sie Ihre c Nummer ein ");
        double c=scn.nextInt();

        System.out.println(((a * a) - (b * b)) / (c * 3));


    }
}
