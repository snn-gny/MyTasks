package ch32_Abstract.task32.Ornek3;

public class Borsh implements IFood {
    @Override
    public void taste() {
        System.out.println("yeni tadlara merhaba");
    }

    @Override
    public double ucret() {
        return 3.0;
    }

    public void boil() {
        System.out.println("kısık ateşde ağır ağır pişti");
    }

    public void eatTomorrow() {
        System.out.println("1 gün sonra yemek daha lezzetli olur.");
    }
}
