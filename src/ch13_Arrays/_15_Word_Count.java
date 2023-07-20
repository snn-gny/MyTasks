package ch13_Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String [] s ={"Removes white space from both ends of a string"};

        // Split the string into words using space as the delimiter
        String[] words = s[0].split(" ");

        // Print the number of words
        System.out.println("Kelime sayısı: " + words.length);
    }

}