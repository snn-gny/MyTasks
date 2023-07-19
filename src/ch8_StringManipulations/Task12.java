package ch8_StringManipulations;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        String ad;

        Scanner input = new Scanner(System.in);

        System.out.println("Göbek adinizi, adinizi ve soyadinizi yaziniz: ");
        ad = input.nextLine();

        String[] words = ad.split(" ");
        String shortenedName = "";

        for (int i = 0; i < words.length; i++) {
            shortenedName += words[i].charAt(0) + ".";
        }

        System.out.println("Kurzer isim: " + shortenedName);


    }
}
