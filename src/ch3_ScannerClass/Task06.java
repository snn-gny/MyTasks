package ch3_ScannerClass;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        //hipotenüs Formülü: c = kare_kök (a * a + b * b) c hipotenüsün uzunluğu ve a ve b diğer iki tarafın uzunluklarıdır.
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the rectogram of the  first triangle ");
        double first=scn.nextDouble();
        System.out.println("Please enter the rectogram of the second triangle ");
        double second=scn.nextDouble();
        double hipotenus = Math.sqrt((first * first) + (second * second));
        System.out.println("Hipotenüs: " + hipotenus);
    }
    }

