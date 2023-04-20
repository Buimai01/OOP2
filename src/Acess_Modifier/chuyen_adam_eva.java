package Acess_Modifier;

public class chuyen_adam_eva {
    public static void main(String[] args) {
        Apple a = new Apple();
        Human adam = new Human ("Adam" , 100, "nam");
        Human eva = new Human ("Eva", 200, "nữ");
        eva.say("Mời anh iu ăn táo");
        adam.say("Okiii anh zai ơi");
        while (a.getWeight() > 0) {
            eva.eat(a);
            adam.eat(a);
        }
        System.out.println("Hết chuyện");
    }
}
class Apple {
    public int getWeight() {
        return weight;
    }
    protected int weight = 10;
}
class Human{
    public Human (String name, double weight, String gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public String getGender() {
        return gender;
    }
    private String name;
    private double weight;
    private String gender;
    public void say(String word) {
        System.out.println(name + ":" + word) ;
    }
    public void eat (Apple a) {
        if (a.getWeight() > 0) {
            System.out.println(name + " :Đã ăn một miếng táo");
            weight++;
            a.weight--;
        } else {
            System.out.println("Đã hết táo");
        }
    }
}
