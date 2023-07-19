package ch12_methodCreation;


import java.util.Scanner;

public class Odev02 {
	public static void main (String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method
		create ediniz
		 */
		Scanner input = new Scanner (System.in);
		System.out.println ("Lütfen bir metin giriniz: ");
		String text = input.nextLine ();

		//String input = "Hello123World456";
		int count = countDigits (text);
		System.out.println ("Rakam sayısı: " + count);
	}

	public static int countDigits (String str) {
		int count = 0;

		for (int i = 0; i < str.length (); i++) {
			char c = str.charAt (i);
			if (Character.isDigit (c)) {
				count++;
			}
		}

		return count;
	}

}