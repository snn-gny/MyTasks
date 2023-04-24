package ch22_Task22;

import java.util.Scanner;

public class T02_ElektrikHesabi {
    int toplamTuketim;
    double oran;
    double fatura;
    static int count =0;
    static int i;
    static int a=2;
    public T02_ElektrikHesabi() {
    }

    public void tuketimEkle() {
        Scanner input = new Scanner(System.in);
        String devamMi;


        do {
            for ( i = 0; i <a ; i++) {


                System.out.println("Aylik Tüketilen enerjiyi giriniz");
                int tuketilenEnerji = input.nextInt();
                toplamTuketim += tuketilenEnerji;
                count++;
            }

            System.out.println("devam etmek ister misin? (E) / (H) evet icin E hayir H tuslarina basiniz");
            devamMi=input.next();
            a=1;

        }while(devamMi.equalsIgnoreCase("E"));
        odenecekTutar();
    }

    public void odenecekTutar() {
        fatura = toplamTuketim * 0.7;
    }


}
