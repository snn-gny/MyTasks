package ch12_methodCreation;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
         Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
         ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kare için 1'e, dikdörtgen için 2'ye, üçgen için 3'e basınız: ");
        int sayi = scanner.nextInt();

        switch (sayi) {
            case 1:
                System.out.println("Karenin bir kenarını giriniz: ");
                int kenar = scanner.nextInt();
                int kareAlan = kareAlanHesapla(kenar);
                int kareCevre = kareCevreHesapla(kenar);
                System.out.println("Karenin Alanı: " + kareAlan);
                System.out.println("Karenin Çevresi: " + kareCevre);
                break;

            case 2:
                System.out.println("Dikdörtgenin kısa kenarını giriniz: ");
                int kisaKenar = scanner.nextInt();
                System.out.println("Dikdörtgenin uzun kenarını giriniz: ");
                int uzunKenar = scanner.nextInt();
                int dikdortgenAlan = dikdortgenAlanHesapla(kisaKenar, uzunKenar);
                int dikdortgenCevre = dikdortgenCevreHesapla(kisaKenar, uzunKenar);
                System.out.println("Dikdörtgenin Alanı: " + dikdortgenAlan);
                System.out.println("Dikdörtgenin Çevresi: " + dikdortgenCevre);
                break;

            case 3:
                System.out.println("Üçgenin taban uzunluğunu giriniz: ");
                int taban = scanner.nextInt();
                System.out.println("Üçgenin yüksekliğini giriniz: ");
                int yukseklik = scanner.nextInt();
                int ucgenAlan = ucgenAlanHesapla(taban, yukseklik);
                System.out.println("Üçgenin Alanı: " + ucgenAlan);

                System.out.println("Üçgenin 2.kenar uzunluğunu giriniz: ");
                int kenar2 = scanner.nextInt();

                System.out.println("Üçgenin 3.kenar uzunluğunu giriniz: ");
                int kenar3 = scanner.nextInt();

                int ucgenCevre  = ucgenCevreHesapla(taban, kenar2, kenar3);
                System.out.println("Ücgenin Cevresi = " + ucgenCevre);

                break;

            default:
                System.out.println("Geçersiz seçim yaptınız.");
        }
    }

    public static int kareAlanHesapla(int kenar) {
        return kenar * kenar;
    }

    public static int kareCevreHesapla(int kenar) {
        return 4 * kenar;
    }

    public static int dikdortgenAlanHesapla(int kisaKenar, int uzunKenar) {
        return kisaKenar * uzunKenar;
    }

    public static int dikdortgenCevreHesapla(int kisaKenar, int uzunKenar) {
        return 2 * (kisaKenar + uzunKenar);
    }

    public static int ucgenAlanHesapla(int taban, int yukseklik) {
        return (taban * yukseklik) / 2;
    }

    public static int ucgenCevreHesapla(int taban, int kenar1, int kenar2) {
        return  (taban + kenar1 +kenar2);
    }
}
