package ch10_forLoop;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */
        int x,y;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        x=scan.nextInt();

        System.out.println("Bir sayi daha giriniz: ");
        y=scan.nextInt();
        int a;

        for (int i = x; i < y; i++) {

            if(i%2==0) {

            System.out.println(i);

        }


        }


    }

}





















