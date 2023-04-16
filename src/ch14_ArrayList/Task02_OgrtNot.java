package ch14_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;



public class Task02_OgrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir ogretmenden girmek istedigi kadar notu alınız, ve
         ortalamayı geçen ogrenci sayısını bulan code create ediniz.

         */


        Scanner input=new Scanner(System.in);
        System.out.println("kac tane not girmek istersiniz");
        int count= input.nextInt();

       int ogrenciSayisi=0;
        double toplamNot=0;
        double ortalama=0;

        ArrayList<Double>ogrenciNotlari=new ArrayList<>();


        for (int i = 0; i < count; i++) {

            System.out.println(i+1 + ". notu giriniz");
            ogrenciNotlari.add(input.nextDouble());

            toplamNot+=ogrenciNotlari.get(i);

        }
        ortalama=toplamNot/count;

        for (int i = 0; i < count; i++) {
            if(ogrenciNotlari.get(i)>ortalama){
                ogrenciSayisi++;

            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("Ortalamayi gecen ogrenci sayisi = " + ogrenciSayisi);


    }
}
