package ch14_ArrayList;

import java.util.Scanner;

public class Haftanin_Taski {
    public static void main(String[] args) {

        /* HAFTANIN TASK'iiii :-)
        Bir top belirli yükseklikten atılmaktadır.
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan code create ediniz.

        */

        Scanner input = new Scanner(System.in);

        System.out.println("Top hangi yükseklikten birakiliyor : ");
        double yukseklik = input.nextDouble();

        double yukariZiplama = yukseklik*0.75;

        int count =0;
        double toplamYol =0;

        while(yukariZiplama>1){

            yukariZiplama = yukariZiplama*0.75;
            toplamYol += yukariZiplama;
            count++;
        }

        System.out.println("Toplam yol = " + (toplamYol+yukseklik));
        System.out.println("Yere vurma sayisi = " + (count+1));
    }
}
