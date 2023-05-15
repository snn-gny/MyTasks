package ch5_JavaOperators2;

import java.util.Scanner;

public class Task06_ucbasamktektek {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();

        int yuzler=a/100;
        System.out.println(yuzler);

        int onlar=a%100/10;
        System.out.println(onlar);

        int birler=a%10;
        System.out.println(birler);



    }
}
