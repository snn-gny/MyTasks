package ch3_ScannerClass;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
        Scanner scn=new Scanner(System.in);

        System.out.println("Bitte fügen Sie ein Zahl ein/Please insert a number");
        int zahl=scn.nextInt();

        System.out.println("Bitte fügen Sie ein  ganze Zahl ein/Please insert a integer number");
        int zahl2=scn.nextInt();

        //Method Call
        sammlung(zahl,zahl2);
        beule(zahl,zahl2);
        subtraktion(zahl,zahl2);
        aufteilung(zahl,zahl2);


    }//main sonu
    public static void sammlung(int a, int b){
        int sum= a+b;
    System.out.println("sum"+sum);

    }
    public static void beule(int a, int b){
        int beule= a*b;
    System.out.println("beule"+beule);

    }
    public static void subtraktion(int a, int b){
        if (a>b){int sub= a-b;
            System.out.println("sub"+sub);}
        else if (a<b) {int sub= b-a;
            System.out.println("sub"+sub);}
        else System.out.println("Geben Sie bitte ein richtige ganze Zahl");

    }
    public static void aufteilung(int a, int b){
        if (a>b){int ateil= a/b;
            System.out.println("ateil"+ateil);}
        else if (a<b) {int ateil= b/a;
            System.out.println("ateil"+ateil);}
        else System.out.println("Geben Sie bitte ein richtige ganze Zahl");
    }//method sonu

    }//class sonu
