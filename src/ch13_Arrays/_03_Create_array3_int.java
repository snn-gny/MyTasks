package ch13_Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..

        int [] sayilar =new int[5];
        sayilar[0]=25;
        sayilar[1]=30;
        sayilar[2]=30;
        sayilar[3]=35;
        sayilar[4]=100;

        int toplam=0;

        for (int i=0;i< sayilar.length;i++){
       toplam+= sayilar[i];
        }
            System.out.println("toplam = " + toplam);







    }
}