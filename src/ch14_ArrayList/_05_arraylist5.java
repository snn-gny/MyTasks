//package ch14_ArrayList;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class _05_arraylist5 {
//
//    /*
//        rotateList() isminde bir method oluşturun.
//        Parametre olarak String ArrayList
//        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
//        Tersten yazılmış halini return edin.
//        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
//        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
//     */
//
//    public static void main(String[] args) {
//
//        rotateList();
//        System.out.println("rotateList() = " + rotateList());//[Ohio, Florida, Atlanta, New york]
//
//
//    }
//
//    private static ArrayList<String> rotateList() {
//
//
//        ArrayList<String>arrayList=new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
//        //2.yol:
//        Collections.reverse(arrayList);
//        System.out.println("ilk sonuc arrayList = " + arrayList);
//
//        ArrayList<String>list2=new ArrayList<>();
//
//        for (int i = arrayList.size()-1; i >=0;  i--) {
//
//            list2.add(arrayList.get(i));
//
//        }
//
//        return list2;
//
//
//    }
//
//
//}
//
