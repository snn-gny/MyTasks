package ch10_whileLoops;

import java.util.Scanner;
public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        int rastgeleSayi = (int) (Math.random() * 100) + 1;
        int tahminSayisi = 0;
        boolean sayiBulundu = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ile 100 arasında bir sayı tuttum. Tahmin et!");

        while (!sayiBulundu) {
            System.out.print("Tahmininizi girin: ");
            int tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin == rastgeleSayi) {
                sayiBulundu = true;
                System.out.println("Tebrikler, sayıyı " + tahminSayisi + " tahminde buldunuz!");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Sayıyı büyüt!");
            } else {
                System.out.println("Sayıyı küçült!");
            }
        }

        scanner.close();


    }

}
