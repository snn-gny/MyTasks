package ch10_forLoop;

import java.util.Scanner;

public class Task08_Nested {
    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri

        */
/*

        int harf=65;
        //ASCII degeri

        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j <= i ; j++) {//j <= i neden yapiyoruz cunku cikan sekil dik ucgen oluyor
                System.out.print( (char) (harf+j)+" " );//burada ascii degerlerinden faydalanip char a casting yapip karakterlere cevirdik


               // System.out.print(  (harf+j)+" " );// bu sekilde olursa sadece ascii degerlerini yazar

            }
            System.out.println();
        }
*/


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int x = input.nextInt();

        int s=65;


        for (int i = 0; i < x; i++) {
            for (int j = 0; j <i ; j++) {

                System.out.print( (char) (s+j)+"  " );
            }
            System.out.println();
        }












    }
}
