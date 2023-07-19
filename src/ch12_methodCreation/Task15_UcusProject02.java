package ch12_methodCreation;

import java.util.Scanner;


/**
 *  Bir uçuş rezervasyon sistemi için aşağıdaki sorunu çözen bir Java programı yazmanız isteniyor.
 * Uygulama, kullanıcıdan uçuş için gerekli bilgileri alacak ve uçuş ücretini hesaplayacak.
 * Kullanıcıdan aşağıdaki bilgiler istenecek:
 * Uçmak istediği şehir (B, C veya D)
 * Yaşı
 * Gidiş-dönüş veya tek yönlü uçuş seçimi (Evet/Hayır)
 * Uçuş ücreti, aşağıdaki kriterlere göre hesaplanacak:
 * Şehir seçimine göre:
 * B: Ücret = 500 * 0.1
 * C: Ücret = 700 * 0.1
 * D: Ücret = 900 * 0.1
 * Yaşa göre:
 * 0-12 yaş arası: Yaş katsayısı = 0.5
 * 12-24 yaş arası: Yaş katsayısı = 0.9
 * 65 yaş ve üstü: Yaş katsayısı = 0.7
 * Diğer durumlar için yaş katsayısı = 1.0
 * Gidiş-dönüş seçeneğine göre:
 * Evet: Yön katsayısı = 0.8 * 2
 * Hayır: Yön katsayısı = 1.0
 * Uçuş ücreti = Şehir ücreti * Yaş katsayısı * Yön katsayısı
 * Uygulama, hesaplanan uçuş ücretini ekrana yazdıracak.
 * İki farklı yöntemle bu sorunu çözen iki farklı sınıf (Task15_UcusProject02 ve Task15_UcusProject03)
 * oluşturmanız bekleniyor. Her iki sınıf da kullanıcının girişlerine göre uçuş ücretini hesaplamalı ve
 * sonucu ekrana yazdırmalıdır.
  * Sorununuz bu şekilde. Her iki projeyi de inceleyerek, kullanıcıdan alınan bilgilere göre
 * uçuş ücretini doğru bir şekilde hesaplayan ve ekrana yazdıran bir Java programı yazmalısınız.
 */
public class Task15_UcusProject02 {
    static Scanner scan = new Scanner(System.in);
    static double ucret;
    static double yasKatsayi;
    static double yonKatsayi;

    public static void main(String[] args) {

        run();
    }
    public static void run() {

        System.out.println("Ödemeniz Gereken Ücret : " + (sehir() * yas() * yon()) + " $");
    }

    public static double sehir() {

        System.out.print("Lütfen Uçmak İstediğiniz Şehri Seçiniz : B / C / D --> ");
        char sehir = scan.next().toUpperCase().trim().charAt(0);

        switch (sehir) {
            case 'B':
                ucret = 500 * 0.1;
                break;
            case 'C':
                ucret = 700 * 0.1;
                break;
            case 'D':
                ucret = 900 * 0.1;
                break;
            default:
                System.out.println("Geçersiz Giriş Yaptınız !..");
                sehir();
        }
        return ucret;
    }

    public static double yas() {

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        int yas = scan.nextInt();

        if (yas > 0) {
            if (yas < 12) {
                yasKatsayi = 0.5;
            } else if (yas < 24) {
                yasKatsayi = 0.9;
            } else if (yas > 65) {
                yasKatsayi = 0.7;
            } else
                yasKatsayi = 1;
        } else {
            System.out.println("Yaş 0 dan küçük olamaz!!..");
            yas();
        }
        return yasKatsayi;
    }

    public static double yon() {

        System.out.print("Gidiş / Dönüş için -1- Tek Yön için -2- Giriniz : ");
        int yon = scan.nextInt();

        switch (yon) {
            case 2:
                yonKatsayi = 1;
                break;
            case 1:
                yonKatsayi = 2 * 0.8;
                break;
            default:
                System.out.println("Geçersiz Seçim Yaptınız !..");
                yon();
                break;
        }
        return yonKatsayi;
    }
}
