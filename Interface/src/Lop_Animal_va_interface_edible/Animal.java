package Lop_Animal_va_interface_edible;

import java.awt.image.LookupOp;

public  abstract class Animal {
    public abstract String makeSound();
}
class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roàm roàm ";
    }
}
class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cuuc cuuc";
    }

    @Override
    public String howToEat() {
        return "Có thể ăn được ";
    }
}
class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals [0] = new Tiger();
        animals [1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
         Fruit [] fruit = new Fruit [2];
         fruit [0] = new Orange();
         fruit [1] = new Apple();
         for (Fruit fruits : fruit) {
             System.out.println(fruits.howToEat());
         }
    }
}
interface Edible {
    String howToEat();
}
 abstract class Fruit implements Edible{
}
class Apple extends Fruit{
    public String howToEat () {
        return "Táo có thể ăn được";
    }
}
class Orange extends Fruit {
    public String howToEat () {
        return "Cam có thể ăn được";
    }
}