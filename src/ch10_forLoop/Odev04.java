package ch10_forLoop;

public class Odev04 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

        int n = 7;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            int num = count;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += n - j;
            }
            System.out.println();
            count++;
        }

    }
}
