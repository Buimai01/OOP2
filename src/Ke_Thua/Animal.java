package Ke_Thua;

public class Animal {
    private double weight;
    private double height;

    public Animal() {
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Animal(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String toString() {
      return "A Animal with weight: "
              + getWeight()
              + "and height"
              + getHeight();
    }
}
class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
        Animal animal1 = new Animal(2, 5);
        System.out.println(animal1);
        Animal animal2 = new Animal();
        animal2.setHeight(1);
        animal2.setWeight(4);
        System.out.println(animal2);
    }
}
class Cat extends Animal {
    private double age;
    public Cat() {
        super();
        this.age = 1.0;
    }
    public Cat(double age) {
        super();
        this.age = age;
    }
    public Cat (double weight, double height, double age) {
        super (weight, height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    public String sound() {
        return "Meo meo meo.....";
    }
    public String eat() {
        return "Mouse";
    }
}
 class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
        cat = new Cat(3.5);
        System.out.println(cat);
        cat = new Cat(3.5, 5, 10);
        System.out.println(cat);
    }
}
