package haftaninTaskleri;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {//yanlis cozum


        Scanner input = new Scanner(System.in);
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");

        double yukseklik=input.nextDouble();
        double ziplamaYukseklik = yukseklik*0.75;
        double topunToplamYolu = yukseklik ;//ilk atilan yukseklik atandi toplam yol a
        int yereVurmaSayisi=0;

        do {
            yereVurmaSayisi++;
            yukseklik = ziplamaYukseklik;//
            topunToplamYolu += yukseklik * 2;
            ziplamaYukseklik *= (0.75);
            System.out.println("yukseklik = " + yukseklik);
            System.out.println("topunToplamYolu = " + topunToplamYolu);

        }while (ziplamaYukseklik>=1.0);
        System.out.println("yereVurmaSayisi = " + yereVurmaSayisi);
        System.out.println("girilien = " );
        System.out.println("topunToplamYolu = " + (topunToplamYolu));






    }
}
