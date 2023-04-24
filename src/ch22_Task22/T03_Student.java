package ch22_Task22;

import java.util.ArrayList;
import java.util.Scanner;

public class T03_Student {
    static ArrayList<T03_Lesson> derslerList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static int toplamCredit=0;
    static int count=0;
    public void kayit() {
        System.out.println("ismini gir");
         T03_Lesson.isim = input.nextLine();
    }

    public int toplamkredisi() {


        T03_Lesson lessons = new T03_Lesson(T03_Lesson.isim, T03_Lesson.name,T03_Lesson.credit );
        System.out.println("ders ismini gir");
        T03_Lesson.name = input.nextLine();
        derslerList.add(lessons);
        count++;
        toplamCredit += T03_Lesson.credit;
        return toplamCredit;
    }
}

