package ch10_whileLoops;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner scanner = new Scanner (System.in);
        int toplamSayi = 0;
        int sayiAdedi = 0;

        while (true) {
            System.out.print("Lütfen bir sayı giriniz (Islemi bitirmek için 0 giriniz): ");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                System.out.println("Girilen sayilarin toplami: " + toplamSayi);
                System.out.println("Girilen sayilarin adedi: " + sayiAdedi);
                break;
            }



            toplamSayi += sayi;
            sayiAdedi++;

        }









    }
}
