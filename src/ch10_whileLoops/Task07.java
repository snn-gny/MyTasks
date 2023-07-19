package ch10_whileLoops;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        int sayi1, sayi2, sayi3, sayi4, sayi5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1.sayiyi giriniz:  ");
        sayi1=scanner.nextInt();

        System.out.println("Lütfen 2.sayiyi giriniz:  ");
        sayi2=scanner.nextInt();

        System.out.println("Lütfen 3.sayiyi giriniz:  ");
        sayi3=scanner.nextInt();

        System.out.println("Lütfen 4.sayiyi giriniz:  ");
        sayi4=scanner.nextInt();

        System.out.println("Lütfen 5.sayiyi giriniz:  ");
        sayi5=scanner.nextInt();

        int i = 1;
        while ( i <=5 ) {
            if (sayi1>sayi2 && sayi1>sayi3 && sayi1>sayi4 && sayi1>sayi5){
                System.out.println("En büyük sayi= "+sayi1);
            } else if (sayi2>sayi1 && sayi2>sayi3 && sayi2>sayi4 && sayi2>sayi5)  {
                System.out.println("En büyük sayi= " + sayi2);
            } else if (sayi3>sayi1 && sayi3>sayi2 && sayi3>sayi4 && sayi3>sayi5) {
                System.out.println("En büyük sayi= " + sayi3);
            }else if (sayi4>sayi1 && sayi4>sayi2 && sayi4>sayi3 && sayi4>sayi5) {
                System.out.println("En büyük sayi= " + sayi4);
            }else {
                System.out.println("En büyük sayi= " + sayi5);
            }
            i++;
        }

    }
}
