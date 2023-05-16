package ch6_IfStatement_TernaryOperator;

import java.util.Scanner;

public class IfElseIf04_Milenyum {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum�? yazdırın.
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl�? yazdırın.
		Eğer yıl 10’a bolunuyorsa ekrana “Onyıl�? yazdırın
		 */
		Scanner sc=new Scanner(System.in);

		System.out.println("bir yil girin");
		int yil=sc.nextInt();

		if (yil%1000==0){
			System.out.println("“Milenyum�?");
		} else if (yil%100==0) {
			System.out.println("“Yüzyıl�?");
		}else if (yil%10==0) {
			System.out.println("“Onyil�?");
		}else System.out.println("diger");

		//ternary den method call
		yil();

	}

	//Chatgpt den ternary cozumu
	public static void yil(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir yıl girin: ");
		int year = scanner.nextInt();
		scanner.close();

		String category = year % 1000 == 0 ? "Milenyum"
				: year % 100 == 0 ? "Yüzyıl"
				: year % 10 == 0 ? "Onyıl"
				: "Diğer";

		System.out.println(category);
	}
}

	

