package ch12_methodCreation;

import java.util.Random;

public class Odev01Medium {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */

    public static void main (String[] args) {

        int max = 10; // örnek bir değer
        int randomNumber = randomNum(max);
        System.out.println("Random number: " + randomNumber);

    }


    public static int randomNum (int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max+1);
        return randomNumber;
    }
}