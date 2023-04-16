package ch14_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */


        tekElemanlar();

    }

    private static ArrayList<Integer> tekElemanlar() {

        Scanner input =new Scanner(System.in);
        ArrayList<Integer>arrayList=new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println(i+1 + " .Sayi gir");

            arrayList.add(input.nextInt());

        }
        ArrayList<Integer>tekOlanlar=new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i)%2==1){
                tekOlanlar.add(arrayList.get(i));

            }

        }
        System.out.println("tekOlanlar = " + tekOlanlar);

        return tekOlanlar;

    }


}
