package ch8_StringManipulations;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        String ad ;

        Scanner input= new Scanner(System.in);

        System.out.println("Ad ve soyadinizi yaziniz: ");
        ad= input.nextLine();

//        String ad1 =ad.substring(0,ad.charAt(' '));
//        String soyad1 =ad.substring(ad.charAt(' ')+1);
//
//
//        System.out.println("ad1 = " + ad1);
//        System.out.println("soyad1 = " + soyad1);



        String[] adSoyad = ad.split(" ");

        System.out.println("Ad: " + adSoyad[0]);
        System.out.println("Soyad: " + adSoyad[1]);

        System.out.println("-----------------------------------------------------------");


        System.out.println("Ad ve soyadınızı giriniz: ");
        String ad_Soyad = input.nextLine();

        String[] ad_SoyadArray = ad_Soyad.split(" ");

        String ad1 = ad_SoyadArray[0].toUpperCase();
        String soyad1 = ad_SoyadArray[1].toUpperCase();

        System.out.println("Adınız: " + ad1+"\nSoyadınız: " + soyad1);
        //System.out.println("\nSoyadınız: " + soyad1);



    }
}
