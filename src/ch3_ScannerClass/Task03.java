package ch3_ScannerClass;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner scn=new Scanner(System.in);
        System.out.println("please enter your sleep time");
        int sleepTime=scn.nextInt();

        int sleepTimeOfMonth=sleepTime*30;
        System.out.println("sleepTimeOfMonth = " + sleepTimeOfMonth);

        int sleepTimeOfYear=sleepTimeOfMonth*12;
        System.out.println("sleepTimeOfYear = " + sleepTimeOfYear);
       // int sleepTimeOfYear=sleepTime*365;

        int sleepTimeOfFortyYear=sleepTimeOfYear*40;
        //int sleepTimeOfFortyYear=sleepTime*365*40;
        System.out.println("sleepTimeOfFortyYear = " + sleepTimeOfFortyYear);
        // int sleepTimeOfYear=sleepTime*365;
        System.out.println();
        System.out.println("sleepTimeOfMonth = " + sleepTimeOfMonth +"\n"+ "sleepTimeOfYear = " + sleepTimeOfYear + "\n"+"sleepTimeOfFortyYear = " + sleepTimeOfFortyYear);
    }
}
