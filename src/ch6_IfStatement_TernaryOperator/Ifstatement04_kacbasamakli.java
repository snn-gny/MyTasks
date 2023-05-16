package ch6_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ifstatement04_kacbasamakli {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 sayi 3 basamakli ise console ' a 3 basamakli yazdirin
		 sayi 2 basamakli ise console'a 2 basmakli yazdirin
		 sayi 3 basamakli yada 2 basamakli degilse ikiside degil yazdirin
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("bir sayi girin");
		String sayi=sc.nextLine();
		if (sayi.length()==3){
			System.out.println(sayi+ " 3 basamakli");
		}else if (sayi.length()==2){
			System.out.println(sayi+ " 2 basamakli");
		} else System.out.println(" ikiside degil");

		}


	}


