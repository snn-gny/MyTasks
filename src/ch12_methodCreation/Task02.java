package ch12_methodCreation;

public class Task02 {

   public static void main(String[] args) {
    // task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Lütfen bir adınızı giriniz: ");
    String x = input.nextLine();

    System.out.println("Lütfen bir soyadinizi giriniz: ");
    String y = input.nextLine();

    // nested method kullanarak ad ve soyadın ilk harflerini değiştirme
    String ad = ilkHarfBuyuk(x);
    String soyad = ilkHarfBuyuk(y);

    // değiştirilmiş ad ve soyadı ekrana yazdırma
    System.out.println("Adınız: " + ad+ ", Soyadınız: " + soyad);
    //System.out.println("Soyadınız: " + soyad);
}

// nested method
public static String ilkHarfBuyuk(String s) {
    String ilkHarf = s.substring(0, 1).toUpperCase();
    String kalanHarfler = s.substring(1).toLowerCase();
    return ilkHarf + kalanHarfler;
}
}
