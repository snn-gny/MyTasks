package ch12_methodCreation;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
		// ceviren bir method yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Saati saniyeye cevirmek icin 1'e, \nmil'i kilometreye cevirmek icin 2'ye, \nkilogrami grama cevirmek icin 3'e  basiniz.");

		int x = scan.nextInt();


		switch (x) {

			case 1:

				System.out.print("Saat değerini girin: ");
				int hours = scan.nextInt();

				int seconds = ceviriciHours(hours);
				System.out.println(hours + " saat " + seconds + " saniyeye eşittir.");

				break;

			case 2:

				System.out.print("Mil değerini girin: ");
				double mil = scan.nextDouble();

				double km = ceviriciMil(mil);
				System.out.println(mil + " mil " + km + " kilometreye eşittir.");

				break;

			case 3:

				System.out.print("Kilogram değerini girin: ");
				double kg = scan.nextDouble();

				double gram = ceviriciKg(kg);
				System.out.println(kg + " Kilogram " + gram + " grama eşittir.");

				break;
		}


	}

	public static int ceviriciHours(int hours) {
		return hours * 3600;
	}

	public static double ceviriciMil(double mil) {

		return mil * 1.609344;
	}

	public static double ceviriciKg(double kg) {

		return kg * 1000;
	}
}
