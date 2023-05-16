package ch6_IfStatement_TernaryOperator;

public class _09_if_else_if_statement_with_logic_operators {

    public static void main(String[] args) {

      /* str bir String'dir.
        Eğer String Orange'ye eşit ise ve uzunluğu 6'ya eşit ise "Orange has six letters" yazdırınız.
        Eğer String Apple'ye eşit ise ve uzunluğu 5'ya eşit ise "Apple has five letters" yazdırınız.
        Eğer String Orange'yi kapsıyorsa ve uzunluğu 10'dan fazla ise
        "String contain orange and length is more then 10" yazdırınız.
        Not: Uzunluk derken ingilizcedeki "length" yani karakter sayısından bahsediliyor.  */

        String str = "Orange";

        if ( str.equals("Orange") && str.length() == 6){
            System.out.println("\"Orange has six letter");}
        else if (str.equals("Apple") && str.length() == 5) {
            System.out.println("\"Apple has five letter");}
        else if (str.contains("Orange")&& str.length()>10){
            System.out.println("\"String contain orange and length is more then 10\"");}
        else System.out.println("yanlis giris");






    }
}