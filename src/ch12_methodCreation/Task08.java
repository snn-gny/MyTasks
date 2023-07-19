package ch12_methodCreation;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yil giriniz: ");
        int jahr = scan.nextInt();


        if (artikYil(jahr)) {
            System.out.println(jahr + " artık bir yıldır.");
        } else {
            System.out.println(jahr + " artık bir yıl değildir.");
        }


    }

    private static boolean artikYil(int jahr) {

        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
