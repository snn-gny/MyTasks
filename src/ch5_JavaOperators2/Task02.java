package ch5_JavaOperators2;

public class Task02 {
	public static void main(String[] args) {
		/*
		 Write a program that prints multiplication table for 1.
		 Do not use any loop.
		    1x1=1
		    1x2=2
			1x3=3
			1x4=4
			1x5=5
			1x6=6
			1x7=7	
			1x8=8
			1x9=9
			1x10=10
		 */

		printMultiplicationTable(1, 1);

			//1x1=1
			//1x2=2
			//1x3=3
			//1x4=4
			//1x5=5
			//1x6=6
			//1x7=7
			//1x8=8
			//1x9=9
			//1x10=10



	}

	public static void printMultiplicationTable(int n, int i) {
		if (i <= 10) {
			System.out.println(n + "x" + i + "=" + (n * i));
			printMultiplicationTable(n, i + 1);
		}
	}//todo oku anla tekrar






}














