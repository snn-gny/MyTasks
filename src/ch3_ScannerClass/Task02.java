package ch3_ScannerClass;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner scn=new Scanner(System.in);
        System.out.println("please enter your weight grade");
        double weight=scn.nextDouble();
        System.out.println("please enter your length grade");
        double length=scn.nextDouble()/100;

        double BMI=weight/(length*length);
        System.out.println("yourBMI= " + BMI);



    }
}
