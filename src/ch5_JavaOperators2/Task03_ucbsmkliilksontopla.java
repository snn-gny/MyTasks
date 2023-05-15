package ch5_JavaOperators2;

import java.util.Scanner;

public class Task03_ucbsmkliilksontopla {
	
	public static void main(String[] args) {
		
		/* Soru
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner input=new Scanner(System.in);
		System.out.println("uc basamakli bir sayi giriniz");
		int a=input.nextInt();
		int abirler=a%10;
		System.out.println(abirler);
		int ayuzler=a/100;
		System.out.println(ayuzler);
		int toplam=abirler+ayuzler;
		System.out.println(toplam);


					//chatgpt
				System.out.print("Üç basamaklı bir sayı girin: ");
				int sayi = input.nextInt();

				// İlk rakamı elde etmek için sayıyı 100 ile böleriz.
				int ilkRakam = sayi / 100;

				// Son rakamı elde etmek için sayının modunu alırız (10'a göre modunu almak son rakamı verir).
				int sonRakam = sayi % 10;

				// İlk ve son rakamların toplamını hesaplarız.
				int toplam2 = ilkRakam + sonRakam;

				System.out.println("İlk ve son rakamların toplamı: " + toplam);
			}
		}



