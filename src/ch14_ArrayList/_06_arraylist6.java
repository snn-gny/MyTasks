package ch14_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        hillNum();
        System.out.println("hillNum() = " + hillNum());//2

    }

    private static int hillNum() {
        
        
        ArrayList<Integer>arrayList=new ArrayList<>(List.of(5 ,4 ,6, 2, 1));

        int hillNum=0;

        for (int i = 1; i < arrayList.size()-1; i++) {
            if (arrayList.get(i)<arrayList.get(i-1) && arrayList.get(i)>arrayList.get(i+1)){

                hillNum+= arrayList.get(i);
            }
            
        }
        

        return hillNum;
        
    }


}
