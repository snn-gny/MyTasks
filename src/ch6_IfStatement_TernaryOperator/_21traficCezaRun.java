package ch6_IfStatement_TernaryOperator;

import java.util.Scanner;

public class _21traficCezaRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hizinizi giriniz");
        int speed = sc.nextInt();

        System.out.println("Ehliyetniz varsa E,yoksa H tuslayin");
        String ehliyet = sc.next();

        if (ehliyet.equalsIgnoreCase("E")) {
            if (speed >= 55 && speed <= 74) {
                System.out.println("Cezaniz 100 $");
            } else if (speed >= 75 && speed <= 84) {
                System.out.println("Cezaniz 150 $");
            } else if (speed >= 85 && speed <= 94) {
                System.out.println("Cezaniz 500 $");
            }
        }

        else {
                if (speed >= 55 && speed <= 74) {
                    System.out.println("Cezaniz 300 $");
                } else if (speed >= 75 && speed <= 84) {
                    System.out.println("Cezaniz 350 $");
                } else if (speed >= 85 && speed <= 94) {
                    System.out.println("Cezaniz 700 $");
                }
            }
    }
}