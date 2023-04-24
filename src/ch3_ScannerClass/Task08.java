package ch3_ScannerClass;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scn=new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre vizeNote ein ");
        double vizeNote=scn.nextDouble();
        System.out.println("Bitte geben Sie Ihre finalNote ein ");
        double finalNote=scn.nextDouble();
        double letzteNote=vizeNote*0.3+finalNote*0.7;



    }
}
