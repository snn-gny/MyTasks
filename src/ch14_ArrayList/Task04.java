package ch14_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Haydi bir isim listesi olusturalim. Kac tane isim girmek istersin");
        int isimSayisi=input.nextInt();

        ArrayList<String>arrayList=new ArrayList<>();

        for (int i = 0; i < isimSayisi; i++) {
            System.out.println(i+1 + ". ismi giriniz");
            arrayList.add(input.next());
        }
        System.out.print("Girilen isimler= " + arrayList + " ");

        ArrayList<String>yeniList=new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).toLowerCase().contains("a")){
                yeniList.add(arrayList.get(i));
            }

        }
        System.out.println("a bulunanlarin silindigi liste = " + yeniList);


    }
}
