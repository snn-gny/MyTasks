package ch13_Arrays;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

        int [] arr = {12,2,5,15,8};
        Arrays.sort(arr);
        System.out.println("enBuyukSayi: "+ (arr[arr.length-1]));

        int enbuyukSayi=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>enbuyukSayi){
                enbuyukSayi=arr[i];
            }


        }

        System.out.println("enbuyukSayi = " + enbuyukSayi);
    }
}

