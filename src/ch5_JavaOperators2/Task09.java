package ch5_JavaOperators2;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ciftlikteki inek sayisini girin");
        int inek= input.nextInt();
        int inekayaksayisi=inek*4;
        System.out.println("inekayaksayisi = " + inekayaksayisi);

        System.out.println("Ciftlikteki koyun sayisini girin");
        int koyun= input.nextInt();
        int koyunayaksayisi=koyun*4;
        System.out.println("koyunayaksayisi = " + koyunayaksayisi);

        System.out.println("Ciftlikteki tavuk sayisini girin");
        int tavuk= input.nextInt();
        int tavukayaksayisi=tavuk*2;
        System.out.println("tavukayaksayisi = " + tavukayaksayisi);

        int toplamayaksayisi=inekayaksayisi+koyunayaksayisi+tavukayaksayisi;
        System.out.println("toplamayaksayisi = " + toplamayaksayisi);


        //Ciftlikteki inek sayisini girin
        //10
        //inekayaksayisi = 40
        //Ciftlikteki koyun sayisini girin
        //10
        //koyunayaksayisi = 40
        //Ciftlikteki tavuk sayisini girin
        //5
        //tavukayaksayisi = 10
        //toplamayaksayisi = 90


  #





    }

}
