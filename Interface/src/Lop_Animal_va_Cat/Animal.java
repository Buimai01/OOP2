package Lop_Animal_va_Cat;

public  abstract class Animal {
    public abstract String makeSound();
}
class Cat extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Cat: meo meo meo ";
    }
    @Override
    public String howToEat() {
        return "Miệng";
    }
}
class Test {
    public static void main(String[] args) {
        Animal [] animals = new Animal[1];
        animals[0] = new Cat();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Cat) {
                Edible edibler = (Cat) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
interface Edible {
    String howToEat();
}