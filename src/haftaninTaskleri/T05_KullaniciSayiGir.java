package haftaninTaskleri;

import java.util.Scanner;

public class T05_KullaniciSayiGir {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, 
		 * ekrana o ana kadar girmiş olduğu 
         * tüm sayıların toplamını yazdırınız.
         * Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
		*/


		Scanner input=new Scanner(System.in);
		int sayi = 1;

		int toplam=0;

			while (sayi!=0){

				System.out.println("bir sayi giriniz");

				sayi=input.nextInt();

				toplam+=sayi;


		}System.out.println("Girdiginiz sayilarin toplami = " + toplam);




	}

}
