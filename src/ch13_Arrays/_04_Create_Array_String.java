package ch13_Arrays;

public class _04_Create_Array_String {

    public static void main(String[] args) {

        /*
        String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */

        // Kodu aşağıya yazınız..


        //String [] sehirler ={"new jersey" , "new york", "boston","California"};
        String [] sehirler = new String[4];
        sehirler[0] ="new jersey" ;
        sehirler[1] ="new york";
        sehirler[2] ="boston";
        sehirler[3] ="California";

        for (int i=0;i<sehirler.length;i++){
            System.out.println(sehirler[i]);
        }
        System.out.println();
        System.out.println("sehirler arraydeki eleman sayisi = " + sehirler.length);

    }
}
