package Xu_ly_ngoai_le;

import java.util.Scanner;

public class TestTry_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            if (99 %n == 0)
                System.out.println(n + "là hệ số của 99");
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Gặp phải ngoại lệ: " + e);
        }
    }
}
