package ch28_ExceptionHandling.task28.task06;

public class Task06_a {
    public static void main(String[] args) throws Exception {
        //    randomSayi isminde static void bir method create ediniz.
        //    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
        //    Bu iki random sayının toplamını yazdırın.
        //    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
        //     ("Sayı 12'den küçük ise hata verir") print edin.


        randomToplami(0, 10);//Exception in thread "main" java.lang.Exception:
        //1.deneme sayi 12 den kücükse hata verir


        //2.deneme (randomSayi1+randomSayi2) = 15


    }

    public static void randomToplami(int a, int b) throws Exception {
        int randomSayi1 = (int) ((Math.random() * (a - b + 1)) + b);
        int randomSayi2 = (int) (Math.random() * (a - b + 1) + b);
        try {
            if (randomSayi1 + randomSayi2 < 12) {
                System.out.println("randomSayi1 = " + randomSayi1);
                System.out.println("randomSayi2 = " + randomSayi2);
                throw new Exception();
            } else {
                System.out.println("randomSayi1 = " + randomSayi1);

                System.out.println("randomSayi2 = " + randomSayi2);
                System.out.println("(randomSayi1+randomSayi2) = " + (randomSayi1 + randomSayi2));

            }
        } catch (Exception e) {
            throw new Exception("sayi 12 den kücükse hata verir");
        }

    }

}