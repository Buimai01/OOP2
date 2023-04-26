package BT_IllegalTriangleException;

import java.util.Scanner;

public class
IllegalTriangleException extends Exception{
    //đặt tên biến
    public IllegalTriangleException (String message) {
        super(message);
    }
}
class Triangle {
    private double side;
    private double side1;
    private double side2;
    public Triangle(double side, double side1, double side2) throws IllegalTriangleException {
        if (side < 0 || side1 < 0 || side2 < 0) {
            throw new IllegalTriangleException("Giá trị âm");
        }
        if (side + side1 <= side2 || side + side2 <= side1 || side1 + side2 <= side) {
            throw new IllegalTriangleException("Vi phạm bất đẳng thức tam giác");
        }
        this.side = side;
        this.side1 = side;
        this.side2 = side2;
    }
    public double getPerimeter() {
        return side + side1 + side2;
    }
    public double getArea() {
        double s = (side + side1 + side2) / 2.0;
        return Math.sqrt(s * (s - side) * (s - side1) * (s - side2));
    }
}
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập chiều dài cạnh 1: ");
            double side = sc.nextDouble();
            System.out.print("Nhập chiều dài cạnh 2: ");
            double side1 = sc.nextDouble();
            System.out.print("Nhập chiều dài cạnh 3: ");
            double side2 = sc.nextDouble();
            Triangle triangle = new Triangle(side, side1, side2);
            System.out.println("Chu vi:" + triangle.getPerimeter());
            System.out.println("Diện tích:" + triangle.getArea());
        } catch (IllegalTriangleException a) {
            //getMessage(): trả về một message cụ thể về exception đã xảy ra
            System.out.println("Tam giác không hợp lệ:" + a.getMessage());
        } catch (Exception a ) {
            System.out.println("Nhập số không hợp lệ ");
        }
    }
}

