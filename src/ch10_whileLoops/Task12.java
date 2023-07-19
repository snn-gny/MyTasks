package ch10_whileLoops;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println ("Bir text giriniz: ");
		String text =scan.nextLine ();
		int i=0;
		//char c ;

		do {
			//System.out.println (text.substring (0,i+1));
			i++;
		}while(i<text.length ());

		System.out.println();
		System.out.println("Metin içindeki harf sayısı: " + text.replaceAll("[^a-zA-Z]", "").length());
		System.out.println("Metin içindeki rakam sayısı: " + text.replaceAll("[^0-9]", "").length());
		System.out.println("Metin içindeki özel karakter sayısı: " + text.replaceAll("[a-zA-Z0-9]", "").length());

		System.out.println ("**********************************");




        //String text1 = scan.nextLine();
        int letterCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (int j = 0; j < text.length(); j++) {
            char c = text.charAt(j);
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (!Character.isLetterOrDigit(c)) {
                specialCharCount++;
            }
        }

        System.out.println("Metinde " + letterCount + " harf, " + digitCount + " rakam ve " + specialCharCount + " özel karakter var.");
    }
}



















