package ch14_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.


        ortalamadanBuyuk();


            }

    private static ArrayList<Integer> ortalamadanBuyuk() {

        Scanner input=new Scanner(System.in);
        System.out.println("kac tane sayi girmek istersiniz");
        int count= input.nextInt();

        double sayiToplam=0;
        double ortalama=0;

        ArrayList<Integer>arrayList=new ArrayList<>();
        ArrayList<Integer>yeniList=new ArrayList<>();


        for (int i = 0; i < count; i++) {

            System.out.println(i + 1 + ". sayiyi giriniz");
            arrayList.add(input.nextInt());

            sayiToplam += arrayList.get(i);
        }
        ortalama = sayiToplam / count;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > ortalama) {
                yeniList.add(arrayList.get(i));
            }

        }
        System.out.println("ortalama = " + ortalama);
        System.out.print("Ortalamadan buyuk olanlar = " + yeniList + " ");


        return yeniList;
    }


}



