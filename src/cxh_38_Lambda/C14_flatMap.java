package cxh_38_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C14_flatMap {
    /*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir.
   Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ]
   gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.

 */
    public static void main(String[] args) throws IOException {

        //TASK 01 --> esintiler java.txt dosyasindaki farkli kelimeleri  print ediniz..
        Path esintiPath = Path.of("C:\\Users\\pc\\IdeaProjects\\DeJavaTutorial\\src\\javadan-esintiler");
        //yukarida erisilecek dosyanin path i tanimlandi
        Stream<String> stream =  Files.lines(esintiPath);
        System.out.println(" //TASK 01 --> esintiler java.txt dosyasindaki farkli kelimeleri  print ediniz..");

        System.out.println(stream.map(t -> t.split(" "))//burdan sonraki akis herbir satir dis array herbir kelime ic array
                .flatMap(Arrays::stream)//eskisi gibi bir stream eldee ettik
                .distinct()
                .collect(Collectors.toList()));


        //TASK 02 --> .txt dosyasindaki tum kelimeleri natural order  print ediniz..



        //TASK 03 --> .txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.



        //TASK 04 --> .txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.


        //TASK 05 --> .txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.


        //TASK 06 --> .txt dosyasinda kac /farklı harf kullanildigini print ediniz.


        //TASK 07 --> .txt dosyasinda kac farkli kelime kullanildigini print ediniz.


        //TASK 08 --> .txt dosyasinda  farkli kelimeleri print ediniz


    }
}
