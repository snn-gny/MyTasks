package ch12_methodCreation;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main (String[] args) {
//        getAsalMi (15);
//        System.out.println (getAsalMi (17));

        getAsalMi (29);
        System.out.println (getAsalMi (23));


    }

//    static boolean getAsalMi (int x) {
//        if (!(x % 2 == 0) && !(x % 3 == 0) && !(x % 5 == 0) &&
//                !(x % 7 == 0) && !(x % 11 == 0) && !(x % 13 == 0) &&
//                !(x % 17 == 0) && !(x % 19 == 0) && !(x % 23 == 0) && !(x % 29 == 0)) {
//            System.out.println ("x " + x + " asal bir sayidir.");
//
//        }
//        return true;
//    }

    public static boolean getAsalMi(long x) {
        if (x <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}


