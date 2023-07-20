package ch13_Arrays;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here
        int[] intArr = {1, 2, 3, 4};

        boolean sonuc = no14(intArr);
        System.out.println("Sonuç: " + sonuc);
    }

    public static boolean no14(int[] nums) {
        boolean hasOne = false;
        boolean hasFour = false;

        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            } else if (num == 4) {
                hasFour = true;
            }
        }

        return !(hasOne && hasFour);
    }

}