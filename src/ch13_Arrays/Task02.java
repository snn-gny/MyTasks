package ch13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen arrayde olmasini istediginiz eleman sayini yaziniz:  ");
        int eleman = scan.nextInt();

        int [] arr =new int[eleman];
        System.out.println("Arrayinizdeki eleman sayisi =  " + Arrays.toString(arr));

        for (int i = 0; i < eleman; i++) {
            System.out.println(i+1 +". nci degeri gir");
            arr[i]=scan.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }
        System.out.println("Arrayiniz:  " + Arrays.toString(arr));

        int toplam=0;
        for (int i = 0; i < eleman; i++) {
            toplam +=arr[i];
        }
        System.out.println("Arrayinizdeki sayilarin toplami :  " + toplam);
    }
}
/*
        Scanner input=new Scanner(System.in);

        System.out.println("kac elamanli array istersin");
        int boyut=input.nextInt();

        int [] arr=new int[boyut];//kullaniciidan alinan deger yeni array in boyutu olarak belirlendi
        int toplam=0;

        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            arr[i]=input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
            toplam+=arr[i];
        }
        System.out.println("seniin istedigin array budur = "+ Arrays.toString(arr));//seniin istedigin array budur = [10, 20, 30]
        System.out.println("toplam = " + toplam);//toplam = 60



    }
}
*/