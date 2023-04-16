package ch14_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */


/*
        String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        ArrayList<String>arrayList=new ArrayList<>();


        for (int i = 0; i < isimler.length; i++) {


            arrayList.add(isimler[i]);

        }
        arrayList.set(2,"Furkan");
        arrayList.set(7,"Kemal");
        System.out.println("arrayList = " + arrayList);

        String [] yeniIsimler=arrayList.toArray(arrayList.toArray(new String[0]));
        System.out.println("Arrays.toString(yeniIsimler) = " + Arrays.toString(yeniIsimler));//[Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]

 */
        //2.yol:
        Scanner input = new Scanner(System.in);
        String[] isimler = new String[10];
        System.out.println("10 kisiden olusan bir  dizi olusturun");
        for (int i = 0; i < isimler.length; i++) {
            System.out.println((i + 1) + ". sayiyi giriniz");
            isimler[i] = input.nextLine();
        }
        System.out.println("dizinin orijinal hali :");

        System.out.println(Arrays.toString(isimler)); //[a, b, c, d, e, f, g, h, i, k]


        String temp = isimler[2];
        isimler[2] = isimler[7];
        isimler[7] = temp;

        System.out.println("dizinin yeni hali :");  //[a, b, h, d, e, f, g, c, i, k]

        System.out.println(Arrays.toString(isimler));


    }
}
