//package ch14_ArrayList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class _03_arraylist3 {
//
//    /*
//        getLength() isminde bir method oluşturun.
//        Parametre olarak String ArrayList
//        Return tipi Integer ArrayList
//        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//
//        Tüm elementlerin uzunluğunu döndürün
//
//        Örneğin;
//        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//        Tüm Stringlerin uzunluklarını yazdırın;
//        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
//     */
//
//    public static void main(String[] args) {
//
//        getLength1();
//        System.out.println("getLength1() = " + getLength1());
//
//
//    }
//
//    private static ArrayList<Integer> getLength1() {
//
//        ArrayList<String> list= new ArrayList<>(List.of( "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
//
//        ArrayList<Integer> listUzunluk=new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//
//            listUzunluk.add(list.get(i).length());
//
//        }
//
//        return listUzunluk;
//    }
//
//
//}