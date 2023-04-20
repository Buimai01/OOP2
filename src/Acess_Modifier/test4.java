package Acess_Modifier;

public class test4 {
     static int count = 0;
    test4() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        test4 t1 = new test4();
        test4 t2 = new test4();
        test4 t3 = new test4();
    }
}
