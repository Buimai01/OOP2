package Acess_Modifier;

public class Static_Method {
    private int rollo;
    private String name;
    private static String college = "BBDIT";
    Static_Method (int r, String n) {
        rollo = r;
        name = n;
    }
    static void change() {
        college = "Student";
    }
    void display() {
        System.out.println(rollo + "" + name + "" + college);
    }
}

