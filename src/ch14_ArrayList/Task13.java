package ch14_ArrayList;

import java.util.ArrayList;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {


        int [] arr={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        ArrayList<Integer>arrayList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            arrayList.add(arr[i]);
            arrayList.add(arr[i+1]+arr[i+2]);
            arrayList.add(arr[i+3]+arr[i+4]+arr[i+5]);
            arrayList.add(arr[i+6]+arr[i+7]+arr[i+8]+arr[i+9]);
            break;

        }
        System.out.println(arrayList);//[3, 6, 18, 17]

    }
}