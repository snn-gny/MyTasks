package ch3_ScannerClass;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("kilonuzu giriniz (kg cinsinden): ");
        byte kg = scanner.nextByte();

        System.out.println("Girdiğiniz kg: " + kg);


    }
}
