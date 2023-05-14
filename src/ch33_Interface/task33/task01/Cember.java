package ch33_Interface.task33.task01;

public class Cember implements Sekil {
    //Çemberin çevresi, çemberin merkezinden geçen bir çizginin uzunluğuna eşittir ve
    // 2πr formülüyle hesaplanır. Burada "r" çemberin yarıçapıdır ve "π" ise yaklaşık olarak 3.14 sayısıdır.
    //
    //Örneğin, bir çemberin yarıçapı 5 cm ise, çemberin çevresi şu şekilde hesaplanabilir:
    //
    //Çevre = 2πr
    //Çevre = 2 x 3.14 x 5
    //Çevre = 31.4 cm
    //
    //Bu çemberin çevresi yaklaşık olarak 31.4 cm'dir.

    @Override
    public double cevre(double... boyut) {
        return 2*PI*CEMBERYARICAP;
    }









    //Bir dairenin alanı, yarıçapının karesine π (pi) sayısıyla çarpılarak hesaplanır.
    // Yani A = πr^2 formülü kullanılır.
    //
    //Örneğin, 5 birim yarıçaplı bir dairenin alanı hesaplanacaksa,
    // A = π(5)^2 = 25π birim kare olacaktır. Yaklaşık olarak, 78.5 birim kare eder.
    //
    //Burada, π sayısı matematiksel sabit bir sayıdır ve yaklaşık olarak 3.14 olarak kabul edilir.
    // Ancak hesaplamalarınızda daha kesin sonuçlar için π'nin tam değerini kullanabilirsiniz.


    @Override
    public double alan(double... boyut) {
        return PI*CEMBERYARICAP*CEMBERYARICAP;

    }





    //Bir dairenin alanı, yarıçapının karesine π (pi) sayısıyla çarpılarak hesaplanır.
    // Yani A = πr^2 formülü kullanılır.
    //
    //Örneğin, 5 birim yarıçaplı bir dairenin alanı hesaplanacaksa,
    // A = π(5)^2 = 25π birim kare olacaktır. Yaklaşık olarak, 78.5 birim kare eder.
    //
    //Burada, π sayısı matematiksel sabit bir sayıdır ve yaklaşık olarak 3.14 olarak kabul edilir.
    // Ancak hesaplamalarınızda daha kesin sonuçlar için π'nin tam değerini kullanabilirsiniz.



    }




