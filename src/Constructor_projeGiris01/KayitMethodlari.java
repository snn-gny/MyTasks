package Constructor_projeGiris01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class KayitMethodlari {
    //step 2 a)
  static   ArrayList < Kullanici > kullanicilarList = new ArrayList();
    Scanner input =new Scanner(System.in);

   // step 2 b
    public  ArrayList<Kullanici> kayitAl(){
        //kullanici class dan obje ureten method
        //kullanicidan aldigi ismi array liste ekleyen method
        System.out.println("ismini gir");
        String isim=input.nextLine();

        Kullanici kullanici= new Kullanici(isim, LocalDateTime.now());
        //ustteki kod kullanicidan aldigi ismi 1. pm olarak const. a
        // verdi, 2. pm olarak direk LocalDateTime class inin now
        // methodu ile kayit zamanini biz atadik

        kullanicilarList.add(kullanici);//olusturlan obje liste eklendi

        return kullanicilarList;//listi return ediyoruz
    }

    //step 3
    public void sansliKullanici(ArrayList<Kullanici> list){//bu method kullanici listindeki ilk 10 saniyede
        // kayit olanlari bulmak icin crate edildi
        for (Kullanici each : list   ) {//pm olarak verilen listin icinde geziyoruz
            if (each.kayitZamani.getSecond()<= 10){//kullanicin kayit
                // oldugu zamanin saniyesi 10 dan kucuk mu kontrol edildi
                System.out.println("Sn "+each.name+" bugun sansli gunundesin");
            }else System.out.println("maalesef sansli gununde degilsin tekrar dene");

        }
    }
    public void listele(){

        System.out.println(kullanicilarList);
    }



}
