package ch13_Arrays;

public class _02_Create_array2 {

    public static void main(String[] args) {

    /*          int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.
     */
        // Kodu aşağıya yazınız..

        int [] sayilar = new int[5];
        sayilar[0] =13;
        sayilar[1] =15;
        sayilar[2] =14;
        sayilar[3] =16;
        sayilar[4] =16;

        for(int i=0;i<sayilar.length;i++){
            System.out.println( sayilar[i]);
        }




    }
}








