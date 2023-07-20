package ch13_Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String [] s ={"Hello World"};

        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].replace('o', 'K');
        }

        System.out.println(s[0]);

        }


}