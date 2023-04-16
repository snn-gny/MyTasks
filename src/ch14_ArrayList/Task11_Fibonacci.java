package ch14_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("kac tane tam sayi girmek istersin");
        int boyut= input.nextInt();

        ArrayList<Integer>arrayList=new ArrayList<>();

        arrayList.add(1);
        arrayList.add(1);


        for (int i = 2; i < boyut; i++) {

            arrayList.add(arrayList.get(i - 2)+arrayList.get(i-1));



        }
        System.out.println("arrayList = " + arrayList);


    }
}
