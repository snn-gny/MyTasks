package ch3_ScannerClass;

import java.util.Scanner;

public class _29_Scanner9 {

    public static void main(String[] args) {

    /*    Bir float oluşturunuz.
          Konsola boyunuzu giriniz.
          Float'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz (metre cinsinden): ");
        float boy = scanner.nextFloat();

        System.out.println("Girdiğiniz boy: " + boy);

// TODO: 24.04.2023 //input mismatch exception aliniyor ondalik girince

    }


}
