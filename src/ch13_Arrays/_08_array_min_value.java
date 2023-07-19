package ch13_Arrays;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int [] arr ={14 , 197 , 54 , 21};
        Arrays.sort(arr);
        System.out.println("enKucukSayi: "+ (arr[0]));

        int enKucukSayi =arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (enKucukSayi  > arr[i]){
                enKucukSayi  = arr[i] ;
        }

        }
        System.out.println("enKucukSayi = " + enKucukSayi);


    }
}

