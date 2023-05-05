package ch31_Polymorphism.task31;

public class Dog extends Animal{

    Animal animal2 = new Dog();


    @Override
    public void run() {
        super.run();
    }

    @Override
    public void run(int meters) {
        super.run(meters);
    }

    @Override
    public void run(int units, String unit) {
        super.run(units, unit);
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }
}
