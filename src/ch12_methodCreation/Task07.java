package ch12_methodCreation;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

        int x = 12;
        int y = 24;
        int z = 34;

        siralamaX(x,y,z);
        System.out.println("x en büyüktür= " + siralamaX(x, y, z));

        siralamaY(x,y,z);
        System.out.println("y en büyüktür= " + siralamaY(x, y, z));

        siralamaY(x,y,z);
        System.out.println("z en büyüktür= " + siralamaZ(x, y, z));


    }

    public static boolean siralamaX ( int x,  int y, int z) {
        x = 12;
        y = 24;
        z = 34;

       // if(x>y && x>z)

        return x>y && x>z;
    }

    public static boolean siralamaY ( int x,  int y, int z) {
        x = 12;
        y = 24;
        z = 34;

        // if(x>y && x>z)

        return x<y && y>z;
    }

    public static boolean siralamaZ ( int x,  int y, int z) {
        x = 12;
        y = 24;
        z = 34;

        // if(z>y && x<z)

        return x<z && y<z;
    }
}

