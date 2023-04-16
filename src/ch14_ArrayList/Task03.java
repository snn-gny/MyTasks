package ch14_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.


/*
        Scanner input=new Scanner(System.in);
        System.out.println("Hangi sayiya bakmak istersin");
        int istenen=input.nextInt();


        ArrayList<Integer>arrayList=new ArrayList<>(List.of(22,33,44,55,66));

        boolean flag=false;


        for (int i = 0; i < arrayList.size(); i++) {

            if ((arrayList.contains(istenen))){

                System.out.println(istenen + " bu list e aittir");
                flag=true;
                break;

            }else {
                System.out.println(istenen + " bu list e ait degildir");
                flag=false;
                break;
            }

        }

 */
        //2. yol:
        Scanner input = new Scanner(System.in);
        System.out.println("hangi sayiyi ögrenmek istiyorsun");

        int sayi = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 78, 19, 15, 12, 13));

        if (arr.contains(sayi)) {
            System.out.println("true");
        } else System.out.println("false");


    }


    }
