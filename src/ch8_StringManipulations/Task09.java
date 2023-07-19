package ch8_StringManipulations;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        String kelime ;

        Scanner input= new Scanner(System.in);

        System.out.println("bir kelime yaziniz: ");
        kelime= input.nextLine();

        System.out.println(kelime.substring(0,kelime.length()/2));


    }
}
