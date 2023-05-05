package ch31_Polymorphism.task31;

public class Horse extends Animal{

    Animal animal1 = new Horse();
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
        System.out.println("nneneeiihhg");

    }
}
