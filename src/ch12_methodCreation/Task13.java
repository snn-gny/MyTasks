package ch12_methodCreation;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true,
    diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String s1 = scan.nextLine();

        System.out.println("Baska bir kelime giriniz: ");
        String s2 = scan.nextLine();

        System.out.println(s1+ "; "+s2+" icerir mi: " + kontrolEt(s1, s2));

        System.out.println(" '"+s1 +"' "+ " kelimesinin son harfleri " +" '"+ s2 +"' "+ " kelimesi ile aynı mı: " + kontrolEt(s1, s2));

    }

    private static boolean kontrolEt(String s1, String s2) {

        return s1.contains(s2);
    }

    private static boolean kontrolEt1(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return false;
        }
        String sonHarfler = s1.substring(s1.length() - s2.length());
        return sonHarfler.equals(s2);
    }


}
