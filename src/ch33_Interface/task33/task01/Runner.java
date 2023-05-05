package ch33_Interface.task33.task01;

public class Runner extends Cember {
    public static void main(String[] args) {
        Cember cember=new Cember();
        System.out.println("cember cevresi= "+cember.cevre());
        System.out.println("cember alani= "+cember.alan());

        Dikdortgen dikdortgen=new Dikdortgen();
        System.out.println("dikdortgen cevresi= "+dikdortgen.cevre());
        System.out.println("dikdortgen alani= "+dikdortgen.alan());

        Kare kare =new Kare();
        System.out.println("kare cevresi= "+kare.cevre());
        System.out.println("kare alani= "+kare.alan());


    }
}
