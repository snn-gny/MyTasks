package ch8_StringManipulations;

import java.util.Scanner;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


        /* TASK:
         * Kullanıcıdan bir isim isteyiniz ve isim sadece 3 harfli olmalıdır. Ternary
         * operatörünü kullanarak harflerin unique (farklı) olup olmadığına bakınız.
         * Örneğin: ala => 3
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir isim giriniz: ");
        String isim = scanner.nextLine();

        boolean unique = true;
        for (int i = 0; i < isim.length(); i++) {
            for (int j = i + 1; j < isim.length(); j++) {
                if (isim.charAt(i) == isim.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (!unique) {
                break;
            }
        }

        String sonuc = (isim.length() == 3 && unique) ? "3 harfli ve harfleri unique" : "3 harfli veya harfleri unique değil";
        System.out.println(isim + " " + sonuc);

        System.out.println("********** 2. yöntem");


        boolean unique1 = true;
        for (int i = 0; i < isim.length(); i++) {
            for (int j = i + 1; j < isim.length(); j++) {
                if (isim.charAt(i) == isim.charAt(j)) {
                    unique1 = false;
                    break;
                }
            }
            if (!unique1) {
                break;
            }
        }

        String harfDurumu = (unique1) ? "harfleri unique" : "harfleri unique değil";
        String sonuc1 = (isim.length() == 3) ? "3 harfli ve " + harfDurumu : "3 harfli değil ve " + harfDurumu;
        System.out.println(isim + " " + sonuc1);
    }
}





