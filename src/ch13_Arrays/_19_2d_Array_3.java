package ch13_Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String[][] s2D = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};

        // Diziyi değiştirme işlemi
        for (int i = 0; i < s2D.length; i++) {
            for (int j = 0; j < s2D[i].length; j++) {
                if (s2D[i][j].equals("ohio")) {
                    s2D[i][j] = "Florida";
                }
            }
        }

        // Değiştirilmiş diziyi yazdırma işlemi
        for (int i = 0; i < s2D.length; i++) {
            for (int j = 0; j < s2D[i].length; j++) {
                System.out.print(s2D[i][j] + " ");
            }
            System.out.println(); // Her satırın sonunda yeni bir satıra geçmek için
        }
    }
}

