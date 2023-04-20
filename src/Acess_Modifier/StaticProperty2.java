package Acess_Modifier;

public class StaticProperty2 {
    public static void main(String[] args) {
        StaticProperty s1 = new StaticProperty("Shoppe 2", "Mai3");
        System.out.println(StaticProperty.numberOfcars);
        StaticProperty s2 = new StaticProperty("Lazada 3", "Mai5");
        System.out.println(StaticProperty.numberOfcars);
        StaticProperty s3 = new StaticProperty("Lazada 8", "Mai9");
        System.out.println(StaticProperty.numberOfcars);
    }
}
