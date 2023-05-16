package ch6_IfStatement_TernaryOperator;

import java.util.Scanner;

public class _22Ehliyet_ {

    public static void main(String[] args) {
        /*
          TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise
           kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Ehliyetniz varsa E,yoksa H tuslayin");
        String ehliyet = sc.next();
        System.out.println();


        if (ehliyet.equalsIgnoreCase("h")){
            System.out.println("once ehliyet almalisin");
        }

        else if (ehliyet.equalsIgnoreCase("E")) {

            System.out.println("Tecrubenizi giriniz");
            int tecrube = sc.nextInt();

            System.out.println("Kac km  gittiniz");
            double yol = sc.nextDouble();

            if (tecrube >= 7 && yol >= 100000) {
                System.out.println("kontak anahtarini alabilirsin");}
            else if (ehliyet.equalsIgnoreCase("E")) {
                if (tecrube < 7 || yol < 100000)
                {System.out.println((7 - tecrube) + " yil tecruben eksik  " + (100000 - yol) + " km yol yapman lazim");}

            }

        }












    }
}