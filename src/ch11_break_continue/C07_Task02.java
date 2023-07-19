package ch11_break_continue;

import java.util.Scanner;

public class C07_Task02 {
    public static void main(String[] args) {
        // task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Bir ifade giriniz: ");
        String ifade = input.nextLine();

        int aSayisi = 0;
        for (int i = 0; i < ifade.length(); i++) {
            char harf = ifade.charAt(i);
            if (harf == 'a') {
                aSayisi++;
            } else if (harf == 'c') {
                break; // "c" karakterine kadar sayma işlemi durduruldu
            }
        }
        System.out.println("Ifadenin 'c' karakterine kadarki 'a' karakter sayısı: " + aSayisi);
    }

}
