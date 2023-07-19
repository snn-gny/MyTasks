package ch13_Arrays;

import java.util.Arrays;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

        //Kodu aşağıya yazınız.

//String[] meyveler = {"Apple", "Orange", "Banana", "Kiwi"};
        String[]meyveler =new String [4];
        meyveler[0] = "Apple";
        meyveler[1] ="Orange";
        meyveler[2] ="Banana";
        meyveler[3] ="Kiwi";

for (int i = 0; i <  meyveler.length; i++) {
    System.out.print( meyveler[i]);
}

    }
}
