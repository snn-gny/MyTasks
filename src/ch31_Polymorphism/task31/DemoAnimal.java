package ch31_Polymorphism.task31;

public class DemoAnimal {
    public static void main(String[] args) {

        Animal animal1 =new Horse();

        animal1.makeSound();
        animal1.run();

        //TODO diger class lari calisiniz


        Animal[] animals = {new Dog(), new Cat(),new Horse()};
         /*
        Bu kod, bu tür alt sınıfların, üst sınıfın bir dizi referansı ile aynı şekilde kullanılabileceğini gösterir.
        Yani, animals dizisi hem Dog, Cat ve Horse sınıflarından türetilen nesneleri içerebilir ve bu nesneleri aynı
         şekilde davranırken kullanılabilir. Bu da polimorfizm kavramının bir örneğidir.
         */

        for (Animal each :animals  ) {
            each.makeSound();
        }

    }
}
