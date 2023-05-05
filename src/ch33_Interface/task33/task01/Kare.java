package ch33_Interface.task33.task01;

import ch33_Interface.task33.task01.Dikdortgen;
import ch33_Interface.task33.task01.Sekil;

public class Kare  implements Sekil {


    @Override
    public double cevre(double... boyut) {
        return KAREKENAR*4;
    }

    @Override
    public double alan(double... boyut) {
        return KAREKENAR*KAREKENAR;
    }
}