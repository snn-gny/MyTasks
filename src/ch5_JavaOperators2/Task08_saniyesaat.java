package ch5_JavaOperators2;

import java.util.Scanner;

public class Task08_saniyesaat {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
            //chatgpt

                Scanner scanner = new Scanner(System.in);
                System.out.print("Saniye girin: ");
                int saniye = scanner.nextInt();

                int saat = saniye / 3600; // Saniyeyi saatlere çevirir.
                int kalanSaniye = saniye % 3600; // Saatleri çıkardıktan sonra kalan saniyeyi alır.

                int dakika = kalanSaniye / 60; // Kalan saniyeyi dakikalara çevirir.
                int kalanSaniye2 = kalanSaniye % 60; // Dakikaları çıkardıktan sonra kalan saniyeyi alır.

                System.out.println(saniye + " saniye = " + saat + " saat " + dakika + " dakika " + kalanSaniye2 + " saniye");









        Scanner input=new Scanner(System.in);
        System.out.println("saniye girin");
        int saniye1=input.nextInt();
        System.out.println(saniye1);
        int saat1=saniye1/3600;
        int dakika1=saniye1/60;
        System.out.println(dakika1);
        System.out.println(saat1);

    }
}
