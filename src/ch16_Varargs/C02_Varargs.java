package ch16_Varargs;

import java.util.Arrays;

public class C02_Varargs {
    public static void main(String[] args) {
            /*
        array ve varargs method:
         */
        //task1 verilen bir array deki elemanlari toplayan method create ediniz

        int arr[] ={22,33,44,55,6,77,88,55,44,66,35};
        arrTopla(arr);//verilen array deki elemanlair toplayan method

        //task2 n sayida int degerleri toplayan varargs methodu create eediniz
        varargsTopla(22,33,44,55,6,77,88,55,44,66,35);

        //task3 varargs methoduna array i pm olarak verinz
        System.out.println("varargsTopla(arr) = " + varargsTopla(arr));


    }

    private static int varargsTopla(int... i) {
        System.out.println(i);//referans degerini aliriz [I@6cd8737
        System.out.println("Arrays.toString(i) = " + Arrays.toString(i));

        int toplam=0;
        for (int w  :  i    ) {//varargs pm leri array oldugu icin loop kullanilabilir
            toplam += w;
        }
        System.out.println("sayilarin toplami varargs ile "+toplam);

        return toplam;
    }

    private static void arrTopla(int[] arr) {
        int toplam=0;
        for (int i  :  arr    ) {//varargs pm leri array oldugu icin loop kullanilabilir
            toplam+=i;
        }
        System.out.println("sayilarin toplami varargs ile "+toplam);

    }
}
