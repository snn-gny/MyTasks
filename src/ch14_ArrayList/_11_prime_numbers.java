package ch14_ArrayList;

import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {


       /* Scanner input=new Scanner(System.in);
        System.out.println("pozitif bir sayi gir");
        int sayi=input.nextInt();

        int countAsal=0;
        
        boolean flag=true;

        ArrayList<Integer>arrayList=new ArrayList<>();

        for (int i = 2; i < sayi; i++) {

                arrayList.add(i);
                if (arrayList.get(i)%i==0){
                    flag=false;


                }else {

                    countAsal++;

            }
        }
        System.out.print("asal sayilar = " + arrayList + " ");
        System.out.println(sayi + " e kadar " + countAsal + " tane asal sayi vardir");

        */


/*
        ArrayList<Integer> asalSayilar = new ArrayList<>();

        int n = 28, count = 0, i, j;


        if (n <= 0) {
            System.out.println("Negatif sayi girdiniz!");

        } else {
            for (i = 2; i <= n; i++) {  // i bölünen sayi
                count = 0;
                for (j = 2; j <= i / 2; j++) {  //j bölen sayi
                    if (i % j == 0) {   //sayi tam bölünüyorsa asal degildir

                        count++;
                        break;
                    }

                }

                if (count == 0 && i != 1) {  //burda sartin saglanmadiklari demek count =0 olmasi bu durumda da olusan sayilari liste
                    //yapip listenin boyutu asal sayi adedini veriyor bize

                    asalSayilar.add(i);
                }
            }

            System.out.println("toplam " + asalSayilar.size() + " adet asal sayi vardir." + asalSayilar);


        }

    }

 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Negatif Olmayan Bir sayi Giriniz: ");
        int n = scanner.nextInt();


        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i+ " ");
                count++;

            }

        }System.out.println("count= "+ count);







    }
}



