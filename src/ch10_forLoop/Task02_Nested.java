package ch10_forLoop;

public class Task02_Nested {
    public static void main(String[] args) {
        /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz
         */

        int n = 5; // Satır sayısı

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

}
/*
int n = 6; - n değişkeni, satır sayısını temsil eder. Bu örnekte, 6 satırdan oluşan
bir şekil oluşturmak istediğimiz için n değerini 6 olarak belirledik.

Dıştaki for döngüsü i değişkeni ile satırları kontrol eder.
İlk satırdan başlayarak i'yi 1'den n'e kadar artırır.

İçteki for döngüsü j değişkeni ile sütunları kontrol eder.
İlk sütundan başlayarak j'yi 1'den n-1'e kadar artırır. (n-1 kullanıldığına dikkat edin,
çünkü son sütunda boşluk yerine yeni bir satır karakteri eklemek için println() kullanacağız.)

İçteki döngü içinde System.out.print("# "); ifadesi kullanılarak her sütuna bir # karakteri ve bir boşluk yazdırılır.

İçteki döngü tamamlandığında, System.out.println();
ifadesi kullanılarak bir satır atlama gerçekleştirilir ve bir sonraki satıra geçilir.

Dıştaki döngü bu şekilde n satır boyunca devam eder ve şekil tamamlanır.
 */