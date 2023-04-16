package ch16_Varargs;

public class Task01 {
    public static void main(String[] args) {
            /*
        Task ->
        verilen Stringleri birlestiren concat isimli METHOD create ediniz.

        input : "m", "e", "r", "v", "e";
        output : merve

        input : "a", "l", "i";
        output : ali

         */

        String[] arr1 = {"m", "e", "r", "v", "e"};
        String[] arr2 = {"a", "l", "i"};

        concat(arr1);
        concat(arr2);

        isimConcat(arr1);
        isimConcat(arr2);
        isimConcat("QA", "Java","Tester","Software");//concat = QAJavaTesterSoftware


    }

//fethiye hanim
    private static void isimConcat(String... arr) {
        String concat = "";
        for (String str : arr) {
            concat += str;
        }
        System.out.println("concat = " + concat);

    }

    //ahmet bey
    private static void concat(String... s) {
        String ss = "";
        for (String w : s) {
            ss += w;
        }
        System.out.println(ss);
    }
}