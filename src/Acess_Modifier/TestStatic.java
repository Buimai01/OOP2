package Acess_Modifier;

public class TestStatic {
    public static void main(String[] args) {
        Static_Method.change();
        Static_Method s1 = new Static_Method(111, "Minh");
        Static_Method s2 = new Static_Method(222, "Lan");
        Static_Method s3 = new Static_Method(333, "Loan");
        s1.display();
        s2.display();
        s3.display();

    }
}
