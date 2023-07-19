package ch10_forLoop;

public class Odev01 {

    public static void main(String[] args) {

        //    0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.

        //Kodu aşağıya yazınız.

        for (int i = 0; i <= 100; i++) { // loop from 0 to 100
            if (i % 2 == 0) { // check if i is divisible by 2
                System.out.println(i); // print i
            }
        }



    }
}
