package ch13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından
        // ortalamadan buyuk olan eleman sayısını print eden code create ediniz
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

        int ort =0;
        int top =0;

        for (int i = 0; i < arr.length; i++) {
            top +=arr[i];
        }
        ort =top/ arr.length;

        System.out.println("Arrayin ortalamasi: " + ort);

        int buyuk = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ort) {
                buyuk++;
            }
        }

        System.out.println("Arrayin " + ort + " den buyuk olan eleman sayisi: " + buyuk);
    }

}



