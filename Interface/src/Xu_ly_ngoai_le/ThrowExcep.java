package Xu_ly_ngoai_le;

public class ThrowExcep {
    static void fun () {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e ) {
            System.out.println("Bắt bên trong fun(). ");
            throw e;
        }
    }

    public static void main(String[] args) {
       try {
           fun();
       } catch (NullPointerException e ) {
           System.out.println("Bắt trong main.");
       }
    }
}
