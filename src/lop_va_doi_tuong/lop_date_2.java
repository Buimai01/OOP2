package lop_va_doi_tuong;

import java.util.Scanner;

public class lop_date_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        int day = sc.nextInt();
        System.out.print("Nhập tháng: ");
        int month = sc.nextInt();
        System.out.print("Nhập năm: ");
        int year = sc.nextInt();
        lop_date_1 date = new lop_date_1(day, month, year);
        System.out.println("Ngày: " + date.getDay());
        System.out.println("Tháng: " + date.getMonth());
        System.out.println("Năm: " + date.getYear());
        System.out.println("Date: " + date.myDate());
    }
}
