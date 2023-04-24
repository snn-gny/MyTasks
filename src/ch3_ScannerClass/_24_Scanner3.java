package ch3_ScannerClass;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.
        String s;
        Scanner scn=new Scanner(System.in);
        System.out.println("bir meyve giriniz");
        s= scn.next();
        System.out.println("s = " + s);

    }
}
