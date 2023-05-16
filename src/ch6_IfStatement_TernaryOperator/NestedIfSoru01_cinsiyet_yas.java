package ch6_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NestedIfSoru01_cinsiyet_yas {

	public static void main(String[] args) {
				/*
				 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
				 */

		Scanner sc=new Scanner(System.in);
		System.out.println("cinsiyetinizi girin");
		String cinsiyet=sc.nextLine();

		System.out.println("yasinizi girin ");
		int yas=sc.nextInt();

		if (cinsiyet.equalsIgnoreCase("Erkek")){
			if (yas<18){
				System.out.println("erkek cocuk");
			}else {
				System.out.println("Adam");
			}
		}else if (cinsiyet.equalsIgnoreCase("Kadin")){
			if (yas<18){
				System.out.println("kiz cocuk");
			}else {
				System.out.println("Kadin");
			}
		}



		
	}
}
