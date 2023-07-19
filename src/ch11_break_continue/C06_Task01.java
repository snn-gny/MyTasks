package ch11_break_continue;

import java.util.Scanner;

public class C06_Task01 {

    public static void main(String[] args) {
        // Task-> girilen 7 tamsyının 10 ile 20 arasındakileri hariç toplamını print eden code create ediniz.

        Scanner input = new Scanner(System.in);


        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Sayı " + i + ": ");
            int sayi = input.nextInt();

            if (sayi>=10 && sayi<=20)
            {
                sayi++;
                continue;
            }
            toplam +=sayi;
        }
        System.out.println("Toplam: " + toplam);

    }
}



