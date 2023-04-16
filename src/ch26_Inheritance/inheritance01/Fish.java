package ch26_Inheritance.inheritance01;

public class Fish extends Animal{//fish dogrudan Animal a extend edildi

    public void izgaraAlabalik(){
        System.out.println("bu mevsimde alabalik iyi gideer fish class inda");
    }

    public Fish() {//pm siz const create edildi
        System.out.println("fish and chips cok meshur");
    }
}
