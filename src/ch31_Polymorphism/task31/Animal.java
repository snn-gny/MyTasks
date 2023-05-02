package ch31_Polymorphism.task31;

public class Animal {

    public void run(){
        System.out.println("animals are running");
    }

    public void run(int meters) {
        System.out.println("animals are running " +meters +" meters");
    }

    public void run(int units, String unit){
        System.out.println("animals are running "+units+ " "+unit +"!");
    }
    public void makeSound(){
        System.out.println("animals are making sound");
    }

}
