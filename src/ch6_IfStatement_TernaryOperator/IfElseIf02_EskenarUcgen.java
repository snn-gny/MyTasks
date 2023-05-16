package ch6_IfStatement_TernaryOperator;

import java.util.Scanner;

public class IfElseIf02_EskenarUcgen {

	public static void main(String[] args) {
			/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
			“Eşkenar üçgen�? yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen�?
			yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın�?
		 
		 */
		//todo tekrar bak
		Scanner sc=new Scanner(System.in);
		System.out.println("Ücgenin ilk kenarini girin");
		int kenar1=sc.nextInt();

		System.out.println("Ücgenin ikinci kenarini girin");
		int kenar2=sc.nextInt();

		System.out.println("Ücgenin ucuncu kenarini girin");
		int kenar3=sc.nextInt();

		boolean eSkenarUcgenDegil = kenar1 == kenar2 ? (kenar2 == kenar3 ? false : true) : true;

		if (eSkenarUcgenDegil) {
			System.out.println("Eşkenar üçgen değil");
		} else {
			System.out.println("Eşkenar üçgen");
		}

		boolean eSkenarUcgen = kenar1 == kenar2 && kenar2 == kenar3;

		if (eSkenarUcgen) {
			System.out.println("Eşkenar üçgen");
		} else {
			System.out.println("Eşkenar üçgen değil");
		}


	}
	

}
