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
public class Task15_UcusProject03 {
    static Scanner scan = new Scanner(System.in);
    static double fiyatB = 500*0.1;
    static double fiyatC = 700*0.1;
    static double fiyatD = 900*0.1;

    public static void main(String[] args) {
        travel();
    }
    public static void travel() {
        System.out.print("hangi şehre gideceksiniz : B - C - D ");
        String city = scan.next().toUpperCase().trim();
        System.out.print("yaşınızı giriniz : ");
        int age = scan.nextInt();
        System.out.print("gidiş-dönüş bilet almak ister misiniz: <E>vet ya da <H>ayır : ");
        char gd = scan.next().toUpperCase().trim().charAt(0);

        switch (city) {
            case "B" : agediscount(age); flightdiscount(gd); totalbill(agediscount(age), flightdiscount(gd), fiyatB); break;
            case "C" : agediscount(age); flightdiscount(gd); totalbill(agediscount(age), flightdiscount(gd), fiyatC); break;
            case "D" : agediscount(age); flightdiscount(gd); totalbill(agediscount(age), flightdiscount(gd), fiyatD); break;
            default :
                System.out.println("hatalı giriş yaptınız");
        }
    }

    public static double agediscount(int age) {
        double agedis=1.0;
        if (age >= 65){
            agedis= 0.7;
        }else if (age >= 0 && age <12) {
            agedis= 0.5;
        }else if (age >= 12 && age <24) {
            agedis= 0.9;
        }else if (age <0){
            System.out.println("Invalid age: " + age); travel();
        }
        return agedis;
    }

    public static double flightdiscount(char gd) {
        double flighttype = 1.0;
        switch (gd) {
            case 'E' : flighttype = 0.8*2; break;
            case 'H' : break;
            default :
                System.out.println("Hatalı Giriş yaptınız. "); travel(); break;
        }
        return flighttype;
    }

    public static void totalbill(double agediscount, double flightdiscount, double fiyat) {
        double sum = agediscount * flightdiscount * fiyat;
        System.out.println("Bilet Fiyatı = " + sum);
    }

}
