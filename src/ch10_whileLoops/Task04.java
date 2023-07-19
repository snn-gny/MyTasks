package ch10_whileLoops;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
		int sayi = 999;

		//int div=24;
		int counter=1;
		int counter1=1;


		while (sayi > 100)
		{
			if (sayi%4==0 && sayi%6==0){
				System.out.println("sayi "+counter+"= "+ sayi);
				counter++;
			}

			sayi--;
		}

		System.out.println("3 basamaklı 4 ve 6'ya tam bölünebilen tam sayı sayısı: " + counter);

		System.out.println("**************************");

		for (int i = 999; i >= 100; i--) {

			if (i%4==0 && i%6==0) {

				System.out.println("sayi "+counter1+"= "+ i);
				counter1++;

			}



		}
		System.out.println("3 basamaklı 4 ve 6'ya tam bölünebilen tam sayı sayısı: " + counter);

	}

}
