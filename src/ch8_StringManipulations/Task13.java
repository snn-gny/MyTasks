package ch8_StringManipulations;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==> 14

        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.

        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.

        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz

        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********

        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin veya cümle  yaziniz: ");
        text = input.nextLine();
        int characterCount =text.replace(" ","").length();

        System.out.println(text.length());
        System.out.println("Metindeki karakter sayısı: " + characterCount);

        System.out.println("---------------- 2. Yöntem ------------------");

        int characterCount1 = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                characterCount1++;
            }
        }

        System.out.println("Metindeki karakter sayısı: " + characterCount1);

    }
}
