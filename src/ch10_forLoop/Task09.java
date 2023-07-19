package ch10_forLoop;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının hesap eden code create ediniz
         */
        Scanner input = new Scanner(System.in);


        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Sayı " + i + ": ");
            int sayi = input.nextInt();

            if (sayi<10 || sayi>20)
            {
                toplam += sayi;
            }

        }
        System.out.println("Toplam: " + toplam);

    }
}


/**
 *
 Bu kod, kullanıcının 5 sayısını girmesine ve 10 ile 20 arasında olmayan sayıları toplamına eklemeye çalışır.

 İlk olarak, `Scanner` sınıfından bir nesne oluşturulur ve `toplam` değişkeni 0 olarak başlatılır.

 Daha sonra, `for` döngüsü ile 5 kez sayı girilmesi istenir ve her bir sayı `sayi` değişkenine atanır.

 `if` koşulu, girilen sayının 10 ile 20 arasında olup olmadığını kontrol eder.
 Eğer sayı 10 ile 20 arasında değilse, `toplam` değişkenine eklenir.

 Döngü tamamlandığında, toplam değeri ekrana yazdırılır.
 */