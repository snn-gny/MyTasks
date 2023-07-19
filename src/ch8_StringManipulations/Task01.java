package ch8_StringManipulations;

import java.io.*;
import java.util.Scanner;

public class Task01 {
    public static  void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Birden cok kelime veya cümle yazin.  ");

        s = scan.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println("String boştur.");
        } else {
            System.out.println("String dolu.");

        }
    }

}

