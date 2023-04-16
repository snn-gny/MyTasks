package Constructor_projeGiris01;

import java.time.LocalDateTime;

//task step 1
public class Kullanici {//POJO

    String name;//obj icin deger alacak intance variable
    LocalDateTime kayitZamani;

    public Kullanici(String name, LocalDateTime kayitZamani) {///full pm li const
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    public Kullanici() {
    }

    @Override
    public String toString() {//bu class dan olusturulan objelri print edebilmek icin

        return "Kullanici{" +
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}
