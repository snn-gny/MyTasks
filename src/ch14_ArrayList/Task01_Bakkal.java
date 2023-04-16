package ch14_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Bakkal {
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

    static ArrayList<String> days=new ArrayList<>(Arrays.asList("pazartesi","Sali","Carsamba","persembe","Cuma","Cumartesi","pazar")) ;//1.adim
            static ArrayList<Double> dailyTotal=new ArrayList<>();//2.adim
    static Scanner input=new Scanner(System.in);
    static double weeklyTotal=0;


    public static void main(String[] args) {
        int i=0;
        while (i<7){//3.adim
            System.out.println("patron  "+ days.get(i) +"  hasilatini  gir");
        //    double gunlukHasilat = input.nextDouble();
            dailyTotal.add(input.nextDouble());
            //kullanicinin girdigi her ucreti weeklytotale ekleuin
        //    weeklyTotal+=gunlukHasilat;
            System.out.println("ayni degeri tekrar gir");
            weeklyTotal+=input.nextDouble();

        //    weeklyTotal+=dailyTotal.get(i);
            i++;
        }
// 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
        System.out.println("weeklyTotal = " + weeklyTotal);
        System.out.println("getOrtalamaKazanc() = " + getOrtalamaKazanc());
        // 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
        //     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        //     * 			 ortalama kazançtan yüksekse o günleri return yap.
        System.out.println("getOrtalamaninUstundeKazancGünleri() = " + getOrtalamaninUstundeKazancGünleri());

        //6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
        //     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        //     * 			 ortalama kazançtan aşağıysa o günleri return yap.

        System.out.println("getOrtalamaninAltindaKazancGünleri() = " + getOrtalamaninAltindaKazancGünleri());


    }


    private static String getOrtalamaninAltindaKazancGünleri() {
        String ortalamaAltiGunler="";
        for (int i = 0; i < dailyTotal.size() ; i++) {//gunluk cirolarin icinde doner
            if (dailyTotal.get(i) < getOrtalamaKazanc()){//gunluk kazanclar ile ortalaama kazanci kiyaslar
                ortalamaAltiGunler+=" "+days.get(i);//ortala kazanctan buyuk olanlari ekler
            }
        }
        return ortalamaAltiGunler;
    }


    private static String getOrtalamaninUstundeKazancGünleri() {//5.adim
        String ortalamaUstuGunler="";
        for (int i = 0; i < dailyTotal.size() ; i++) {//gunluk cirolarin icinde doner
            if (dailyTotal.get(i) > getOrtalamaKazanc()){//gunluk kazanclar ile ortalaama kazanci kiyaslar
                ortalamaUstuGunler+=" "+days.get(i);//ortala kazanctan buyuk olanlari ekler
            }
        }
        return ortalamaUstuGunler;
    }

    private static double getOrtalamaKazanc() {//4.adim
        return weeklyTotal/days.size();//haftalik ciro 7 ye bolundu days in size i 7 dir
    }


}
