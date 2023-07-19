package ch10_forLoop;

public class Odev03 {

    public static void main(String[] args) {

        /* İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

         */

        int summe=0;
        for (int i = 0; i < 10; i++) {

            summe +=i;

        }

        System.out.println("İlk 10 doğal sayının toplamı: " + summe);

    }
}
