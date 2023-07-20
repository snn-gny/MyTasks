package ch13_Arrays;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        // Kodu aşağıya yazınız..

        int[] arr = {2, 0, 0, 1, 0};
        moveZerosToFront(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToFront(int[] nums) {
        int index = nums.length - 1;

        // Sıfır olmayan sayıları dizinin sonuna doğru taşır
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[index--] = nums[i];
            }
        }

        // Kalan boş alanlara sıfırları yerleştirir
        while (index >= 0) {
            nums[index--] = 0;
        }
    }
}