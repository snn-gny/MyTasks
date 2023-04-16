package haftaninTaskleri;

import java.util.Scanner;

public class T06_Arrays {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */


        Scanner input=new Scanner(System.in);
        System.out.println("string bir ifade gir");
        String str = input.nextLine();

        int [] harfsayisi = new int[255];

        for (int i = 0; i < str.length() ; i++) {
            harfsayisi[str.charAt(i)]++; // burada str.charAt(i) hangi harf ise o harfin ascii degeri mesela 6 ise 6. indexe ilk buldugu harfi 1 olarak yaziyor
                                         // 6 ascii numarasina sahip ayni harften bir daha denk gelirse 6. indexi 1 daha arttiriyor 2 yapiyor.
                                        // Örnegin harfsayisi=[0,0,0,0,0,1,0,0...0] -->255 tane
                                        // bu satir harflerin ascii numaralarinin denk geldigi index alanina kac defa tekrarlandi ise o sayiyi yaziyor
        }

        for (int i = 0; i <harfsayisi.length ; i++) {
            if (harfsayisi[i]>0){
                System.out.printf("%c = %d ",i ,harfsayisi[i]);
            }
        }


//        char [] ch = new char[str.length()];
//        for (int i = 0; i < str.length() ; i++) {
//            ch[i] = str.charAt(i);
//            int count =0;
//            for (int j = 0; j <=i ; j++) {
//                if (str.charAt(i)==ch[j] ){
//                    count++;
//                }
//            }
//            if (count==1){
//                System.out.print(str.charAt(i)+ " = " + harfsayisi[str.charAt(i)]+ ", ");
//            }
//
//        }



    }

}
    

