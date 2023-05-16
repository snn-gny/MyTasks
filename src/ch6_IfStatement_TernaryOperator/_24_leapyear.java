package ch6_IfStatement_TernaryOperator;

import java.util.Scanner;

public class _24_leapyear {
    public static void main(String[] args) {


         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir yil girin");
        int yil=sc.nextInt();
                //ChatGpt

            int year = 2024;

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        public static boolean isLeapYear(int year) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        }







