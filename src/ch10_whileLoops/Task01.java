package ch10_whileLoops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını print eden code create ediniz.
 */
        Scanner input = new Scanner(System.in);
//        int sayi = input.nextInt();
//
//        int count =0;
//        int toplam = 0;
//
//
//        while (toplam>333) {
//            //System.out.print("Sayı " + i + ": ");
//
//
//
//            count++;
//            toplam += sayi;
//            if (toplam>333)
//            {
//                break;
//
//            }
//            System.out.println(count);
//        }
//        System.out.println("Girilen sayı adedi: "+count +  "\nSayilarin Toplami: " + toplam);

        System.out.println("-----------------------------------------------------");


            int count = 0;
            int toplam = 0;

            while (toplam <= 333) {
                System.out.print("Sayı " + (count + 1) + ": ");
                int sayi1 = input.nextInt();

                count++;
                toplam += sayi1;

                if (toplam >= 333) {
                    break;
                }
            }

System.out.println("Girilen sayı adedi: " + count + "\nSayilarin Toplami: " + toplam);





    }
}


