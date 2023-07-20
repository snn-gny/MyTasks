package ch13_Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {
    /*
    Bu şekilde bir String oluşturunuz. "$12 $23 $10 $2 $5 $2"
    $ işaretlerini kaldırın ve sayıları toplayın.
    Sayıların toplamını yazdırın.
    */

        String[] arr = { "$12 $23 $10 $2 $5 $2 $6" };

        // Remove the dollar signs and split the string into individual numbers
        String[] numbers = arr[0].replace("$", "").split(" ");

        int sum = 0;
        for (String number : numbers) {
            // Convert each number to an integer and add it to the sum
            sum += Integer.parseInt(number);
        }

        System.out.println("Sayıların toplamı: " + sum);
    }

}