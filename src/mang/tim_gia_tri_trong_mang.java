package mang;

import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Black", "Pink", "Orange", "Yellow", "Green", "White", "Purple"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một tên của màu: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(input_name)) {
                System.out.println("Vị trí của màu trong danh sách " + input_name + "là: " + i);
                isExist = true;
                break;
            }
        }
                if (!isExist) {
            System.out.println("Không tìm thấy" + input_name + "trong danh sách ");
        }


    }
}
