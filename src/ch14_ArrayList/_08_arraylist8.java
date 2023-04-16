package ch14_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        secondMax();
        System.out.println("secondMax() = " + secondMax());//6


    }

    private static int secondMax() {

        ArrayList<Integer>arrayList=new ArrayList<>(List.of(5,3,4,6,7));

        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        return arrayList.get(1);
    }


}
