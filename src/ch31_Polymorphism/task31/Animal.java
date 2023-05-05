package ch31_Polymorphism.task31;

public class Animal {

    Animal animal1 = new Cat();

    public void run(){
        System.out.println("animals are running");
    }

    public void run(int meters) {
        System.out.println("animals are running "
                +meters +" meters");
    }

    public void run(int units, String unit){
        System.out.println("animals are running "+units+ " "+unit +"!");
    }
    public void makeSound(){
        System.out.println("animals are making sound");
    }

    public Animal() {
    }

    public Animal(Animal animal1) {
        this.animal1 = animal1;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal1=" + animal1 +
                '}';
    }

}
