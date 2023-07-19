package ch10_forLoop;

public class Task03_Nested {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yukarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.

       //Asiye Hanim task cok dogru cevap
        for (int i = 1; i <= 10; i++) {// carpim tablosunun ilk carpani

            for (int j = 1; j <= 10; j++) { //carpim tablosunun ikinci carpani

                //   System.out.println("i*j degeri= "+i +"*"+j +" = " + i*j);
                System.out.println(i + "*" + j + " = " + i * j);
            }
            System.out.println(); //dummy kod islevsiz kodu okumayi ve konsol kozmetigi iccin yazilir
        }

        System.out.println("---------------2.yöntem---------------------");
        //ahmet bey
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);

            }
            System.out.println();
        }
    }
}
/**
 * Dıştaki for döngüsü i değişkeni ile ilk çarpanı kontrol eder.
 * Bu örnekte, çarpım tablosunun ilk çarpanı 1'den 10'a kadar artırılır.
 *
 * İçteki for döngüsü j değişkeni ile ikinci çarpanı kontrol eder.
 * Bu örnekte, çarpım tablosunun ikinci çarpanı da 1'den 10'a kadar artırılır.
 *
 * İçteki döngü içinde System.out.println(i +"*"+j +" = " + i*j);
 * ifadesi kullanılarak her çarpım sonucu ekrana yazdırılır. İlgili çarpım işleminin sonucu,
 * i ve j değerleri kullanılarak hesaplanır ve ekrana yazdırılır.
 *
 * İçteki döngü tamamlandığında, System.out.println();
 * ifadesi kullanılarak bir satır atlama gerçekleştirilir ve bir sonraki çarpım işlemine geçilir.
 *
 * Dıştaki döngü bu şekilde devam eder ve tüm çarpım tablosu ekrana yazdırılır.
 */
