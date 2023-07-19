package ch10_forLoop;

public class Odev02 {

    public static void main(String[] args) {

        /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.


         */


        //Kodu aşağıya yazınız.

        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0  &&  i% 4 == 0) {

                System.out.println(i);
            }
        }
/*
        for (int i = 0; i <= 100; i++) { // loop from 0 to 100
            if (i % 20 == 0) { // check if i is divisible by 20
                System.out.println(i); // print i
            }
        }
*/


    }
}
