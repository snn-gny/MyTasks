package ch3_ScannerClass;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

    /*    Bir int oluştur.
          Konsol'a arabanızdaki kapı sayısını girin.
          Bu int'i yazdırın.  */

        //Kodu aşağıya  yazınız.

        Scanner scn=new Scanner(System.in);
        System.out.println("Arabanizda kac kapi vardir?");
        int sayi=scn.nextInt();

        System.out.println("araba kapi sayisi = " + sayi);


    }
}


