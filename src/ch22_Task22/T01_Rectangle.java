package ch22_Task22;

public class T01_Rectangle {
     double width;
     double length;
     //double cevre;
     //double alan;


    public T01_Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void cevre(){

        //cevre = width * 2 + length * 2;
        //System.out.println("cevre = " + cevre);
        System.out.println("(cevre = " + (width * 2 + length * 2));
    }
    public void alan(){
        //alan = width * length;
        //System.out.println("alan = " + alan);
        System.out.println("alan = " + width * length);
    }



}
