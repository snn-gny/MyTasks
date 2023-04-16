package ch14_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)

         */

    public static void main(String[] args) {


        System.out.println("getCountt() = " + getCountt());


    }

    private static int getCountt() {


        ArrayList<String> names = new ArrayList<>(List.of("Ayse", "Fatma", "Hayriye", "Cevriye", "Ayse", "Gul", "Fethiye", "Ayse"));

        int count = 0;
        String tekrarlayan = "";


        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                   if (!tekrarlayan.contains(names.get(i))) {
                       tekrarlayan += names.get(i) + " ";

                  }
                    count++;

                }

            }

        }
        System.out.println("tekrarlayan = " + tekrarlayan);


        return count;



    }
}
