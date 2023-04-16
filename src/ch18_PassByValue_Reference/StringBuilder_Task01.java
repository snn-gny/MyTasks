package ch18_PassByValue_Reference;

public class StringBuilder_Task01 {
    public static void main(String[] args) {
          /*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Method yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I
	        It is not a palindrome"
		 */
        String cumle = "iki";
        System.out.println("isPalindrome(sentence1) = " + method(cumle));


    }

    public static boolean method(String str) {
        StringBuilder tersi= new StringBuilder(str.toLowerCase());
        tersi.reverse();

        return tersi.toString().equals(str.toLowerCase());
    }
}
