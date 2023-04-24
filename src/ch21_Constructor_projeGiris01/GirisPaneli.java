package ch21_Constructor_projeGiris01;

import java.util.Scanner;



public class GirisPaneli {

    public void giris(){

        KayitMethodlari obj = new KayitMethodlari();//kaayit claassi na erisebilmek icin obje create edildi
        Scanner in=new Scanner(System.in);

        boolean cikilsinMi=true;//while dongusu sartini kontrol edebilmek iciin create edildi
        while (cikilsinMi) {
            System.out.println("yapacagin islemi sec" +
                    " \n 1-> kayit ol\n 2->sansli kisi bul\n" +
                    " 3-> tum kullanicilari listele\n 4-> cikis");
            int secim = in.nextInt();
            switch (secim) {
                case 1:
                    obj.kayitAl();
                    giris();
                    break;
                case 2:
                    //obj.sansliKullanici(kullanicilarList);
                    giris();
                    break;
                case 3:
                     obj.listele();
                    giris();
                    break;
                case 4:
                    cikilsinMi = false;
                    break;
                default:
                    System.out.println("yanlis tuslama yaptin tekrar dene");
                    giris();
            }
        }




    }
}
