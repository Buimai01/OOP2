package Acess_Modifier;

public class test {
    int rollno;
    String name;
    static String college = "Bách Khoa";
    static void change() {
        college = "Quốc gia";
    }
    test (int r, String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println(rollno + "-" + name + "-" + college);
    }

    public static void main(String[] args) {
        test.change();
        test t1 = new test(11, "Hoàng");
        test t2 = new test(22, "Thanh");
        test t3 = new test(33, "Nam");
        test t4 = new test(44, "Minh");
        t1.display();
        t2.display();
        t3.display();
        t4.display();

    }
}
