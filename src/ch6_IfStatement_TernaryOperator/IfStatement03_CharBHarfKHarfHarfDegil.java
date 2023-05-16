package ch6_IfStatement_TernaryOperator;

import java.util.Scanner;

public class IfStatement03_CharBHarfKHarfHarfDegil {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf" yazdirin
		 Bu character kucuk harf ise "Kucuk Harf" yazdirin
		 Bu character harf degil ise "Harf Degil" yazdirin
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir karakter girin");
		char c=sc.next().charAt(0);
		if (Character.isUpperCase(c)) {
			System.out.println(c+" Büyük harftir");}
		else if (Character.isLowerCase(c)) {
			System.out.println(c+" Kücük harftir");
		}else System.out.println("Harf Degil");


	}

}
