package ch16_Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
        /*
        VARARGS :dillerdeki  yuklem gelmemisse veya daha ornek cogaltilacaksa kullanildigi gibi javada da ayni sekilde kullanilir
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır
	        .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

  */

        // Task -> verilen iki sayı toplamını print eden METHOD create ediniz

        int sayi1=99;
        int sayi2=15;
        int sayi3=66;
        int sayi4=55;

        topla(sayi1,sayi2);
        topla(sayi3,sayi4);

        // Task -> verilen üç sayı toplamını print eden METHOD create ediniz
        topla(sayi3,sayi4,sayi1);

        System.out.println(" **** **** varargs **** ****");
        toplaVarags(sayi1,sayi2,sayi3,sayi4);
        toplaVarags(sayi1,sayi2,sayi3);
        toplaVarags(sayi1,sayi2);
        toplaVarags(sayi1,sayi2,sayi3,34);
        toplaVarags(sayi1,sayi2,sayi3,34,99);
        toplaVarags(sayi1);

        // Task -> verilen String'lerin en fazla karaktere sahip olanı print eden
        // METHOD create ediniz->>
        // parametre saysı belirli değil : varargs

        String str1="java";
        String str2="java script";
        String str3="phyton";
        String str4="c++";

        enUzunKelime(str1,str4);
        enUzunKelime(str1,str2,str3);
        enUzunKelime(str1,str2,str3,str4);

    }
    private static void enUzunKelime(String... str) {//gelen data type ne olursa olsun varargs pm si artik method icinde Array dir
        String enUzunKelime="";
        for (String w :  str ) {
            if (w.length()>enUzunKelime.length()){
                enUzunKelime=w;
            }
        }
        System.out.println("en uzun kelime "+enUzunKelime);

    }

    private static void toplaVarags(int... sayi) {//varargs method
        int toplam=0;
        for (int i:sayi    ) {//varargs pm leri array oldugu icin loop kullanilabilir
            toplam+=i;
        }
        System.out.println("sayilarin toplami varargs ile "+toplam);

    }

    private static void topla(int a, int b, int c) {
        System.out.println("iki sayinin toplami = "+(a+b+c));
    }

    private static void topla(int s, int s1) {
        System.out.println("iki sayinin toplami = "+(s+s1));
    }
}
