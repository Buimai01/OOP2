package Acess_Modifier;

public class StaticProperty {
    private String name;
    private String engine;
    public static int numberOfcars;
    public StaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfcars++;

    }
}
