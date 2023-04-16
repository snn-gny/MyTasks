package haftaninTaskleri;

import java.util.Scanner;

public class T03_TasKagitMakas {

    public static void main(String[] args) {

        //task bu kodlarin taskini yaziniz
          /*
          ahmet bey den
          Tas kagit makas adinda String bir ArrayList olusturun
          2 oyuncudan da bu üc secenekten birisini secmesini isteyin
          Eger ikisi de ayni degeri tahminde bulunursa OutPut berabere
          1. oyuncunun tahmini tas 2.nin tahmini makas yada 1.nin makas 2. nin kagit yada 1.nin kagit 2. nin tas oldugu sartlarda kazanan 1. oyuncu olacak
          Ayni sartlar 2. ci oyuncu icinde gecerli olacak sekilde while döngüsün de 3 kez bu oyunu tekrar eden bir kod creat ediniz
          */





        // tas >makas
        // makas >kagit
        //kagit >tas
        int numberOfFirstWin = 0;
        int numberOfSecondWin = 0;
        int numberOfComWin = 0;
        int gameOver = 3;

//		List <String> elemanlar = new ArrayList<>();
//		elemanlar.add("Tas");
//		elemanlar.add("Makas");
//		elemanlar.add("Kagit");
        Scanner scan = new Scanner(System.in);

        while (numberOfFirstWin < gameOver && numberOfComWin < gameOver) {
            System.out.println("1. Oynucu Secimi: \nTas secmek icin 0 \n Makas secmek icin 1 \n Kagit secmek icin 2 \n seciniz.");
            int myGuess = scan.nextInt();
            System.out.println("2. Oynucu Secimi: \nTas secmek icin 0 \n Makas secmek icin 1 \n Kagit secmek icin 2 \n seciniz.");

            int yourGuess = scan.nextInt();
            ;
            System.out.println("1. Oyuncu Tahmini:" + myGuess + "\n" + "2. Oyuncu Tahmini:" + yourGuess);

            if (myGuess == yourGuess) {
                System.out.println("Berabere");
            } else if ((myGuess == 0 && yourGuess == 1) || (myGuess == 1 && yourGuess == 2) || (myGuess == 2 && yourGuess == 0)) {
                System.out.println("1. oyuncu Kazandi");
                numberOfFirstWin++;
            } else {
                System.out.println("2. oyuncu Kazandi");
                numberOfComWin++;
            }

        }

        if (numberOfFirstWin == 3) {
            System.out.println("==GAME OVER==");
            System.out.println("Sizin kazandiniz: " + numberOfFirstWin);
            System.out.println("Kabettiniz Bilgisayarin kazanma sayisi: " + numberOfComWin);
        } else if (numberOfComWin == 3) {
            System.out.println("==GAME OVER==");
            System.out.println("Biligisayar kazandi: " + numberOfComWin);
            System.out.println("Kaybettiniz Kazandiginiz ouyn sayisi : " + numberOfFirstWin);
        }


    }

}
