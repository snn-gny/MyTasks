package ch3_ScannerClass;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Banka Hesabınız Var mı? (evet/hayır): ");
        String cevap = scanner.nextLine();

        boolean bankaHesabiVarMi = cevap.equalsIgnoreCase("evet");
        System.out.println("Banka hesabım var mı? " + bankaHesabiVarMi);

    }
}
