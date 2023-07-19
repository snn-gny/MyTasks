package ch12_methodCreation;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int x = scan.nextInt();

        System.out.println("Ikinci sayiyi giriniz: ");
        int y = scan.nextInt();

        toplam(x, y);

        System.out.println("Birinci sayi ile ikinci sayinin toplami =  " + toplam(x, y));

        carpma(x, y);

        System.out.println("Birinci sayi ile ikinci sayinin carpimi =  " + carpma(x, y));


        cikarma(x, y);

        System.out.println("Birinci sayi ile ikinci sayinin farki =  " + cikarma(x, y));


        bölme(x, y);

        System.out.println("Birinci sayinin ikinci sayiya bölümü =  " + bölme(x, y));

    }

    private static int toplam(int x, int y) {
        return x + y;
    }

    private static int carpma(int x, int y) {
        return x * y;
    }

    private static int cikarma(int x, int y) {
        return x - y;
    }

    private static int bölme(int x, int y) {
        return x / y;

    }
}