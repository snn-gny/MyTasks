package ch13_Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */


        String s = "Hello World";
        String tersS = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            tersS += s.charAt(i);
        }

        System.out.println("Tersten yazdırılan String: " + tersS);


        System.out.println("----------------------------------------");

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        System.out.println("Tersten yazdırılan String: " + sb.toString());

        }


}