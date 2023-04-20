package lop_va_doi_tuong;

import java.util.Scanner;

public class mo_ta_hinh_chu_nhat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều dài: ");
        double height = sc.nextDouble();
        mo_ta_hinh_chu_nhat moTaHinhChuNhat = new mo_ta_hinh_chu_nhat(width, height);
        System.out.println("Chu vi của hình chữ nhật: " + moTaHinhChuNhat.dientich());
        System.out.println("Diện tích của hình chữ nhật: " + moTaHinhChuNhat.chuvi());

    }
}
