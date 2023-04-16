package ch14_ArrayList;

import java.util.ArrayList;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {

        dupicate();
        System.out.println("dupicate() = " + dupicate());


    }

    private static boolean dupicate() {

        int [] arr={1,2,3};
        boolean flag=false;

        ArrayList<Integer>arrayList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {

                if(arr[i]==arr[j]) {
                    flag = true;
                    break;

                }
            }

        }
        return flag;
    }


}