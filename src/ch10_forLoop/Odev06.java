package ch10_forLoop;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner  scan = new Scanner(System.in);
        System.out.println("1'den büyük bir tam sayı giriniz: ");
        int x =scan.nextInt();

        int sum =0;
        for (int i = 1; i <= x; i++) {
            sum += i * i;
        }

        System.out.println("Kareler toplamı: " + sum);




    }
}
