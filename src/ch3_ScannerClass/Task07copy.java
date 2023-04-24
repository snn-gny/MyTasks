package ch3_ScannerClass;

import java.util.Scanner;

public class Task07copy {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scn=new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Geschwindigkeit ein ");
        double geschwindigkeit=scn.nextDouble();
        System.out.println("Bitte geben Sie  die Entfernung ein ");
        double entfernung=scn.nextDouble();
        double dauer = entfernung/geschwindigkeit;
        System.out.println("dauer: " + dauer);
    }



    }