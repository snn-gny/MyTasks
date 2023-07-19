package ch3_ScannerClass;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"
/* GÖREV ->
Kullanıcıdan ara sınav notunu, final notunu ve proje notunu girmesini isteyin
Genel notu hesaplayın (ara sınav: %30, proje: %20, final: %50)
 Örnek:
	      GİRİŞ: ara sınav notu = 78
	      		 final notu = 66
	      		 proje notu = 90
	      ÇIKTI: "Notunuz: 81,6"

		 */
        Scanner scn=new Scanner(System.in);
        System.out.println("please enter your mid-term grade");
        double midTermGrade=scn.nextDouble()*0.3;

        System.out.println("please enter your final grade");
        double finalGrade=scn.nextDouble()*0.5;

        System.out.println("please enter your project term grade");
        double projectGrade=scn.nextDouble()*0.2;

        double yourGrade=(midTermGrade+finalGrade+projectGrade);
        System.out.println("yourGrade = " + yourGrade);


    }
}
