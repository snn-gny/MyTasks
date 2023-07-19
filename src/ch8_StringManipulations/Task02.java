package ch8_StringManipulations;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Könnten Sie bitte ein Password eingeben: ");

        s = scan.nextLine();

 /*       // İlk karakterin büyük harf olup olmadığını kontrol et

        if (!Character.isUpperCase(s.charAt(0))) {
            System.out.println("Şifre büyük harfle başlamalıdır.");
            return;
        }

        // Son karakterin sayı olup olmadığını kontrol et
        if (!Character.isDigit(s.charAt(s.length() - 1))) {
            System.out.println("Şifre bir sayı ile bitmelidir.");
            return;
        }

        // Parola uzunluğunun en az 6 karakter olup olmadığını kontrol edin
        if (s.length() < 6) {
            System.out.println("Şifre en az 6 karakter uzunluğunda olmalıdır.");
            return;
        }

        System.out.println("Şifre geçerli.");

        System.out.println("****************2. Yol***********");*/

        if (s.length() < 6) {
            System.out.println("Şifreniz en az 6 karakter uzunluğunda olmalıdır.");
        } else if (!Character.isUpperCase(s.charAt(0))) {
            System.out.println("Şifrenizin ilk karakteri büyük harf olmalıdır.");
        } else if (!Character.isDigit(s.charAt(s.length() - 1))) {
            System.out.println("Şifrenizin son karakteri sayı olmalıdır.");
        } else {
            System.out.println("Şifreniz doğrudur.");
        }

    }
}
