package ch12_methodCreation;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        System.out.println("calculateOvertime(09.00,20.00,40,1.8) = " + calculateOvertime(09.00, 20.00, 40, 1.8));

    }

public static double calculateOvertime(double startHour, double endHour, double hourlyRate, double overtimeRate) {
    double totalHours = endHour - startHour;                                                    //toplamHours = bitişHour - startHour;
    double regularHours = Math.min(totalHours, 8);                                          // toplamHours = bitişHour - startHour;
    double overtimeHours = totalHours - regularHours;                                      //  fazla mesaiSaat = toplamSaat - normalSaat;
    double regularPay = regularHours * hourlyRate;                                           //  normalÖdeme = normalHours saatlik Ücret;
    double overtimePay = overtimeHours * hourlyRate * overtimeRate;               // fazla mesaiÖdeme = fazla mesaiSaatsaatlikÜcret fazla mesaiÜcreti;
    double totalPay = regularPay + overtimePay;                                               //  toplamÖdeme = normalÖdeme + fazla mesaiÖdemesi;
    return totalPay;                                                                                         // return toplam Ödeme;
}


}
