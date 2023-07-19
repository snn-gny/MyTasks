package ch3_ScannerClass;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    Bir String oluştur.
          Konsol'a 10 sene önceki yaşadığın şehri yazın.
          Bu String'i yazdırın.   */

        //Kodu aşağıya  yazınız.

/*        Scanner scn=new Scanner(System.in);
        System.out.println("10 sene önce nerde yasiyordun?");
        String sehir=scn.next();*/

        String sehir;

        Scanner input=new Scanner(System.in);

        System.out.print("10 sene önceki yaşadığıniz şehri yazıniz:  ");

        sehir=input.next();

        System.out.println("10 sene önceki yaşadığıniz şehir =  " + sehir);


    }
}
