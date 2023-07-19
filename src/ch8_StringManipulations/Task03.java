package ch8_StringManipulations;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.


        String s ="Alamanya";

        System.out.println(s.indexOf("a",1)); // 'a'  nin indexini yazdirir. bu tam dogru olmaz, birden fazla 'a' var.
        System.out.println(s.charAt(s.length()-6)); // sondan 6. karakteri yazdirir.

        System.out.println("*********2. yol***********");

        int index = s.indexOf("a", 1); // 1. karakterden başlayarak "a" karakterinin indeksi bulunur
        System.out.println(index); // 4


    }

}
