package ch10_whileLoops;
import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //	Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //	ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //	yanlislikla kac negative sayi girdigini
        //	ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scanner = new Scanner(System.in);
        int totalPositiveNumbers = 0;
        int totalNegativeNumbers = 0;
        int totalCorrectNumbers = 0;

        while (true) {
            System.out.print("Lütfen bir sayı giriniz (Islemi bitirmek için 0 giriniz): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Toplam pozitif sayı: " + totalPositiveNumbers);
                System.out.println("Toplam yanlış sayı: " + totalNegativeNumbers);
                System.out.println("Toplam doğru sayı: " + totalCorrectNumbers);
                break;
            }

            if (number < 0) {
                System.out.println("Negatif sayı giremezsiniz.");
                continue;
            }

            totalPositiveNumbers += number;
            totalCorrectNumbers++;
            totalNegativeNumbers++;
        }
    }
}








