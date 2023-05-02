package ch32_Abstract.task32.Ornek3;

public class Palov implements IFood {
    @Override
    public void taste() {
        System.out.println("safranlı tane tane..");
    }

    @Override
    public double ucret() {
        return 4.0;
    }

    public void fry() {
        System.out.println("pirinçler tereyağında kavruldu...");
    }

    public void boil() {
        System.out.println("kısık ateşte pişirildi..");
    }
}
