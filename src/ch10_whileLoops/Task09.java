package ch10_whileLoops;
import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {


        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Lütfen toplamak istediginiz sayi adedini yazin: ");
        int counterNummer = scanner.nextInt();

        int totalNumbers = 0;
        //int counterNummer = 0;

        while (true) {
            System.out.print("Lütfen bir sayı giriniz: ");
            int number = scanner.nextInt();


            if (counterNummer==number) {
                System.out.println("Toplam pozitif sayı: " + totalNumbers);
                //System.out.println("Toplam yanlış sayı: " + totalNegativeNumbers);
                System.out.println("Toplam  sayı: " + totalNumbers);
                break;
            }

            if (number < 0) {
                System.out.println("Negatif sayı giremezsiniz.");
                continue;
            }

            totalNumbers += number;
            totalNumbers++;

        }



    }

}
