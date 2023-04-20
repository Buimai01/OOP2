package lop_va_doi_tuong;

import java.util.Scanner;

public class lop_hinh_chu_nhat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        double width = sc.nextDouble();
        System.out.print("Nhập chiều dài: ");
        double height = sc.nextDouble();
        lop_hinh_chu_nhat1 lopHinhChuNhat1 = new lop_hinh_chu_nhat1(width, height);
        System.out.println("Hình chữ nhật của bạn \n" + lopHinhChuNhat1.display());
        System.out.println("Chu vi của hình chữ nhật: " + lopHinhChuNhat1.dientich());
        System.out.println("Diện tích của hình chữ nhật: " + lopHinhChuNhat1.chuvi());

    }
}
