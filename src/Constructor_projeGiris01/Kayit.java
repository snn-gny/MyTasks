package Constructor_projeGiris01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {

    //step 2a)
   static ArrayList <Kullanici>kullanicilarList = new ArrayList<>();
    Scanner input=new Scanner(System.in);

    //step 2b)
    public ArrayList<Kullanici> kayitAl(){
    //kullanici class dan obje ureten method
        // kullanicidan aldigi ismi arraylist e ekleyen method


        System.out.println("ismini gir");
        String isim=input.nextLine();

     Kullanici kullanici=new Kullanici(isim, LocalDateTime.now());
     //ustteki kod kullanicidan aldigi ismi 1. pm olarak conts a verdi.
        // 2. pm olarak direk LocalDateTime class inin now methodu ile kayit zamnini biz atadik


        kullanicilarList.add(kullanici);//olusturulan obj list e eklendi


        return kullanicilarList;
        //list i return ediyoruz
    }

    //step 3
    public void sanslıKullanıcı(ArrayList<Kullanici>list){//bu method kullanici list indeki ilk on sn de
        // kayit olanlari bulmak icin create edildi


        for (Kullanici each:list) {//pm olarak verilen list in icinde geziyoruz
            if (each.kayitZamani.getSecond()<=10){//kullanicinin kayit oldugu zamanin sn si
                // 10 dan kucuk mu oldugu kontrol edildi

                System.out.println("sn " + each.name + " bugun sansli gunundesin");

            }else System.out.println("sansli gununde degilsin");

        }


    }

    public void listele(){
        System.out.println(kullanicilarList);


    }

}
