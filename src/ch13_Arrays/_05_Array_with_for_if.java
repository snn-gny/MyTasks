package ch13_Arrays;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.

        int []arr ={5,6,8,12,14,19};
        int islem =0;
        int top1=0;
        int top2=0;
        for (int i=0; i< arr.length;i++){
            if ((arr[i]%2==0)){
               top1+=arr[i];
            //    System.out.println("top1 = " + top1);
            }
            else{
                top2+=arr[i];
               // System.out.println("top2 = " + top2);
            }
            islem=top1-top2;
        }
       System.out.println("islem = " +islem);

    }
}
