package ch13_Arrays;

import javax.swing.*;
import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..

        int [] arr ={ 15 , 25, 22, 18, 30};
        Arrays.sort(arr);
        int enBuyukIkinciSayi= arr[arr.length-2];
        System.out.println("enBuyukIkinciSayi = " + enBuyukIkinciSayi);
    }
 }






