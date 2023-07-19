package ch10_whileLoops;

import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scanner = new Scanner(System.in);
        String a = "javaCAN";
        String b = "jAVATAR";

        while (true) {
            System.out.print("Lütfen bir karakter/harf giriniz (Islemi bitirmek için x giriniz): ");
            String s = scanner.next();
            System.out.println(a);

            if (s.equals("x")) {
                System.out.println(b);
                break;
            }
        }
    }
}





