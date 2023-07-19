package ch10_whileLoops;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden
		soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print eden code create ediniz

		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen adinizi ve soyadinizi yaziniz: ");
		String isim = input.nextLine();

		int i = 0;
		while (i < isim.length()) {
			System.out.print(isim.charAt(i) + " ");
			i++;
		}
	}




}
