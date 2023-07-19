package ch8_StringManipulations;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String isim ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen adinizi yaziniz: " );
        isim =scan.nextLine();


        // İsminizi konsola yazdırma
        for (int i = 0; i < isim.length(); i++) {
            char karakter = isim.charAt(i); // İsmin her bir karakterini alın

            // Karakterin harfDepo içindeki indeksini bulun
            int indeks = harfDepo.indexOf(Character.toUpperCase(karakter));

            // İndeksi kullanarak karakteri konsola yazdırın
            if (indeks != -1) {
                System.out.print(harfDepo.charAt(indeks));
            }
        }

        System.out.println("********isim sifreleme **************");

        StringBuilder sifreliIsim = new StringBuilder();
        // Metni şifreleyerek sifreliMetin değişkenine ekleme
        for (int i = 0; i < isim.length(); i++) {
            char karakter = isim.charAt(i); // Metindeki her bir karakteri alın

            // Karakterin harfDepo içindeki indeksini bulun
            int indeks = harfDepo.indexOf(Character.toUpperCase(karakter));

            // İndeksi kullanarak karakterin bir sonraki harfini alın
            char yeniKarakter;
            if (indeks != -1) {
                int yeniIndeks = (indeks + 5) % harfDepo.length(); // Sonraki harfin indeksi
                yeniKarakter = harfDepo.charAt(yeniIndeks);
            } else {
                yeniKarakter = karakter; // Eğer karakter harfDepo içinde değilse, aynı karakteri kullanın
            }

            sifreliIsim.append(yeniKarakter); // Şifreli metne yeni karakteri ekleme
        }

        System.out.println("Şifrelenmiş Isim: " + sifreliIsim.toString());


    }
}
