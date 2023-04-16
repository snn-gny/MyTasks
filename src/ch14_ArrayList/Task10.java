package ch14_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
/*
        int countI=0;
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int a : arr) {
            arrayList.add(a);

        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i+1; j < arrayList.size(); j++) {
                if (arrayList.get(i)==(arrayList.get(j)) && arrayList.contains()){
                    arrayList2.add(arrayList.get(i));
                }


            }

        }
        Collections.sort(arrayList2);
        System.out.println(arrayList2);//[1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9]

 */
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};

        List<Integer> tekrarsizList = new ArrayList<>();
        for (Integer s:arr) {
            if (!tekrarsizList.contains(s)) {//eleman yoksa add ile tekrarsız liste ekle eleman varsa  geç
                tekrarsizList.add(s);
            }
        }
        Collections.sort(tekrarsizList);//list elemanlrını NO sıraladık
        int tekrarsizArray[]=new int[tekrarsizList.size()];//tekrarsizList.size() kadar lenght olan bos array atandı
        for (int i = 0; i <tekrarsizList.size(); i++) {
            tekrarsizArray[i]=tekrarsizList.get(i);

        }
        System.out.println(" ahanda sana her elemandan bir tane olan array ..."+Arrays.toString(tekrarsizArray));

    }

}