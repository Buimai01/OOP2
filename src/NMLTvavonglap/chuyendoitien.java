package NMLTvavonglap;

import java.util.Scanner;

public class chuyendoitien {
    public static void main(String[] args) {
        double vnđ = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Giá trị VNĐ: " + quydoi);

    }
}
