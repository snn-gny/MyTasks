package ch10_forLoop;

public class Odev07 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *

     */
    public static void main(String[] args) {
        int n = 7; // Satır sayısı

        for (int i = 1; i <= n; i++) {
            // Boşlukları yazdırma
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları ve ünlem işaretlerini yazdırma
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("! ");
                }
            }

            System.out.println(); // Bir sonraki satıra geç
        }

        // En alt satırı yazdırma
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }
}









