package ch14_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */




        ArrayList<Integer>arrayList=new ArrayList<>(List.of(2,4,6,7,9));

        int kareToplam=0;

        for (int each:arrayList) {
                kareToplam+=each*each;
        }
        System.out.println("kareToplam = " + kareToplam);

    }

}

