package ch8_StringManipulations;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        String kelime ;

        Scanner input= new Scanner(System.in);

        System.out.println("bir kelime yaziniz: ");
        kelime= input.nextLine();

        int index;
        System.out.println("index numarasini yaziniz: ");
        index= input.nextInt();

        System.out.println(kelime.charAt(index));



    }
}
