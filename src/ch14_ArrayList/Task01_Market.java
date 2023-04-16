package ch14_ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */



        static AbstractList<String> days=new ArrayList<>(Arrays.asList("pazartesi","sali","carsamba","persembe","cuma","cumartesi","pazar"));//1.adim
        static AbstractList<Double>dailyTotal=new ArrayList<>();//2.adim

        static Scanner input=new Scanner(System.in);
        static double weeklyTotal=0;//dailylist icindeki verileri toplamak icin olusturuldu

        public static void main(String[] args) {

            int gun=0;

            while(gun<7){//3.adim

                System.out.println("patron " + days.get(gun) + " hasilatini gir");

                double gunlukHasilat= input.nextDouble();


                dailyTotal.add(gunlukHasilat);

                weeklyTotal+=gunlukHasilat;

                gun++;


            }

// 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.

            System.out.println("weeklyTotal = " + weeklyTotal);

            getOrtalamaKazanc();
            System.out.println("getOrtalamaKazanc() = " + getOrtalamaKazanc());

            getOrtalamaninUstundeKazancGünleri();
            System.out.println("getOrtalamaninUstundeKazancGünleri() = " + getOrtalamaninUstundeKazancGünleri());

            getOrtalamaninAltindaKazancGünleri();
            System.out.println("getOrtalamaninAltindaKazancGünleri() = " + getOrtalamaninAltindaKazancGünleri());


        }



        private static String getOrtalamaninAltindaKazancGünleri() {
            String OrtalamaninAltindaKazancGünler="";

            for (int i = 0; i < days.size(); i++) {//gunluk cirolarin icinde doner

                if(dailyTotal.get(i)<getOrtalamaKazanc()){//gunluk kazanclar ile ort kazanci kiyaslar
                    OrtalamaninAltindaKazancGünler+=" " + days.get(i);//ortalama kazanctan buyuk adimlari ekler

                }

            }
            return OrtalamaninAltindaKazancGünler;


        }

        private static String getOrtalamaninUstundeKazancGünleri() {

            String ortalamaUstuGunler="";

            for (int i = 0; i < days.size(); i++) {//gunluk cirolarin icinde doner

                if(dailyTotal.get(i)>getOrtalamaKazanc()){//gunluk kazanclar ile ort kazanci kiyaslar
                    ortalamaUstuGunler+=" " + days.get(i);//ortalama kazanctan buyuk adimlari ekler

                }

            }
            return ortalamaUstuGunler;

        }

        private static double getOrtalamaKazanc() {//4.adim


            return weeklyTotal/ days.size();// haftalik ciro gun sayisina bolundu




    }




}



