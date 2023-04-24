package ch22_Task22;

import java.util.Scanner;

public class T04_Runner {
    /*
    Task 04->
     T04_Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile T01_Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */
static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        giris();
    }
    public static void giris(){

        T04_Bisiklet obj = new T04_Bisiklet();


        boolean cikilsinMi=true;
        while (cikilsinMi) {
            System.out.println("Lütfen secim yapiniz \n1. Hiz degistir" +
                    "                                \n2. Vites Artir" +
                    "                                \n3. Vites Azalt" +
                    "                                \n4. Durumu Göster" +
                    "                                \n5. Cikis");

            int secim = input.nextInt();
            switch (secim) {
                case 1:
                    obj.hizdegistir();
                    break;
                case 2:
                    obj.vitesArtir();
                    break;
                case 3:
                    obj.vitesAzalt();
                    break;
                case 4:
                    obj.durumGoster();
                    break;
                case 5:

                    System.out.println("Cikmak istediginize emin misiniz? E/H");

                    String secim2 =input.next().toUpperCase();
                    if (secim2.charAt(0)=='E'){
                        cikilsinMi=false; break;
                    }else giris();
                default:

                    System.out.println("yanlis tuslama yaptin tekrar dene");
                    giris();
            }

        }
    }




}
