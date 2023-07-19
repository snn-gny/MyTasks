package ch12_methodCreation;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */

        Scanner input = new Scanner(System.in);
        System.out.print("Bir E-mail adresi giriniz: ");
        String email =input.nextLine();

        System.out.println("validateEmail(email) = " + validateEmail(email));

    }

    private static boolean validateEmail(String email) {
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if (atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) {
            return true;
        } else {
            return false;
        }
    }
}