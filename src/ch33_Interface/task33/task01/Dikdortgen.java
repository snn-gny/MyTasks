package ch33_Interface.task33.task01;

public class Dikdortgen implements Sekil {


    @Override
    public double cevre(double... boyut) {
        return 2*(DIKDORTGENKENAR1+DIKDORTGENKENAR);
    }

    @Override
    public double alan(double... boyut) {
        return DIKDORTGENKENAR1*DIKDORTGENKENAR;
    }
}