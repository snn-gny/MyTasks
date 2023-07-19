package ch3_ScannerClass;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */

        //Kodu aşağıya  yazınız.
/*        String s;
        Scanner scn=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        s= scn.next();
        System.out.println("s = " + s);*/
        
        
        String adiniz;
        Scanner ad= new Scanner(System.in);

        System.out.print("Lütfen adinizi giriniz:  ");
        adiniz=ad.next();

        System.out.println("Adiniz = " + adiniz);


    }
}
