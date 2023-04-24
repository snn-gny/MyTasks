package ch22_Task22;

import java.util.Scanner;

public class T03_Runner {
    /*
    Task 03 ->
    T03_Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    T03_Student Class : fields : name, maxCredit, dersleri(T03_Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    T01_Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */ static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        T03_Student obj = new T03_Student();
        obj.kayit();
        boolean devamMi = true;

        while (devamMi) {
            obj.toplamkredisi();
            System.out.println("ders girisine devam edecek misiniz E/H");
            String secim = input.nextLine().toUpperCase();
             if (secim.equals("E")) {
                obj.toplamkredisi();
            } else devamMi = false;
            if (T03_Student.toplamCredit >10){
                System.out.println("Maximum krediyi 10 u astiniz daha fazla ders secemezsiniz");break;}


        }
        System.out.println(T03_Lesson.isim + " isimli ogrencinin sectigi " + T03_Student.count+ " dersin toplam kredisi " + T03_Student.toplamCredit);
        System.out.println("T03_Student.derslerList = " + T03_Student.derslerList);
    }
}