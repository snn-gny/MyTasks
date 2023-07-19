package ch3_ScannerClass;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

    /*    Bir int oluşturun.
          Konsol'a herhangi bir sayı giriniz.
          Bu sayıyı yazdırın.   */

        //Kodu aşağıya  yazınız.
/*         int s;
        Scanner scn=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        s= scn.nextInt();
        System.out.println("s = " + s);*/

        int q;
        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayi giriniz:  ");

        q=scan.nextInt();
        System.out.println("Sayi = " + q);


    }
}
