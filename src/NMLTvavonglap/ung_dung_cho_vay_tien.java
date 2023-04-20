package NMLTvavonglap;

import java.util.Scanner;

public class ung_dung_cho_vay_tien {
    public static void main(String[] args) {
      double money = 1.0;
      int month = 1;
      double laisuat = 1.0;
        Scanner input = new Scanner (System.in);
        System.out.println("Nhập số tiền đầu tư: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = input.nextInt();
        System.out.println("Nhập lãi suất hàng năm theo tỉ lệ %:" );
        laisuat = input.nextDouble();
        double tongtienlai = 0;
        for (int i = 0; i < month; i++) {
           laisuat +=money * (laisuat/100) /12 * month;
            System.out.println("Tổng tiền lãi: " + laisuat);
        }

    }
}
