package ch8_StringManipulations;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        String kelime ;

        Scanner input= new Scanner(System.in);

        System.out.println("bir kelime yaziniz: ");
        kelime= input.nextLine();

        System.out.println(kelime.substring(0,kelime.length()-1));






    }
}
