package ch5_JavaOperators2;

import java.util.Scanner;

public class Task05_saatsaniye {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir saat girin");
        int saatsaniyehali=input.nextInt()*3600;

        System.out.println(saatsaniyehali);





            //Chatgpt
        System.out.print("Saat girin: ");
        int saat = input.nextInt();

        System.out.print("Dakika girin: ");
        int dakika = input.nextInt();

        System.out.print("Saniye girin: ");
        int saniye = input.nextInt();

        int toplamSaniye = (saat * 3600) + (dakika * 60) + saniye;

        System.out.println("Toplam saniye: " + toplamSaniye);

    }

}
