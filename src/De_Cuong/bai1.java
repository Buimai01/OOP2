package Đề_cương;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //gán giá trị của phần tử đầu tiên cho max, sau đó dùng max so sánh với các phần tử còn lại
        int max = numbers[0];
        System.out.println("Các phần tử trong mảng là: ");
        for (int i: numbers) {
            System.out.println(i + ",");
        }
        for (int num: numbers) {
            if (max < num)
                max = num;
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
        for (int i = 0; i < numbers.length; i++) {
        }
        }
    }

