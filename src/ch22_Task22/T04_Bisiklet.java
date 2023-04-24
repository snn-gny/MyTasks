package ch22_Task22;

import java.util.Scanner;

public class T04_Bisiklet {
int hiz;
int vites=1;
static Scanner input = new Scanner(System.in);

    public T04_Bisiklet() {
    }

    public T04_Bisiklet(int hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;
    }

    public void hizdegistir(){
        System.out.println("Yeni hizi giriniz");
        hiz = input.nextInt();

    }

    public void vitesArtir(){
        vites++;
        if (vites>5){
            System.out.println("Vites 5 ten büyük olamaz");
            vitesAzalt();
        }
    }
    public void vitesAzalt(){
        vites--;
        if (vites<1){
            System.out.println("Vites 1 den kücük olamaz");
            vitesArtir();
        }
    }
    public void durumGoster(){
        System.out.println("Hiz   = "+ hiz);
        System.out.println("Vites = "+ vites);
    }

}
