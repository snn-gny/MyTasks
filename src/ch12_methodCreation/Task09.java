package ch12_methodCreation;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen saniyeye cevirilecek bir saat giriniz: ");
        double hours = scan.nextDouble();

        double sekunde= cevirici(hours);
        System.out.println(hours+" saat = " + sekunde + " saniyeye esittir.");

    }

    private static double cevirici(double hours) {
        double sekunde;
        return  hours*3600;
    }


}

//12,36
//12.36 saat = 44496.0 saniyeye esittir.
//12
//12.0 saat = 43200.0 saniyeye esittir.
//0,36
//0.36 saat = 1296.0 saniyeye esittir.