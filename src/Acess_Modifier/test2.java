package Acess_Modifier;

public class test2 {
   static int nhan(int x ) {
       return x * x * x;
   }

    public static void main(String[] args) {
        int result = test2.nhan(2);
        System.out.println(result);
    }

    }

