package ch13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
// arraydeki her bir elemani index degeri kadar artiralim

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

        int[] shiftedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int newIndex = (i + arr.length - 1) % arr.length;
            shiftedArr[newIndex] = arr[i];
        }

        System.out.println("Arrayinizin bir sola kaydirilmis hali: " + Arrays.toString(shiftedArr));

    }

}
