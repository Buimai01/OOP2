package BT_6_2;

public interface GeometricObject {
    public abstract double getArea();
    public abstract double getPerimeter();
}
class Circle implements GeometricObject {
    protected double radius;
    public Circle (double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Hình tròn có diện tích là:"
                +getArea()
                + " và chu vi là:"
                +getPerimeter();
    }
}
class Rectange implements GeometricObject {
    protected double width;
    protected double length;
    public Rectange (double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    public String toString() {
        return "Hình chữ nhật có diện tích là: "
                +getArea()
                +" và chu vi là: "
                +getPerimeter()
                + super.toString();
    }
}
class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println(" Hình tròn là:");
        System.out.println("Diện tích là:" + circle.getArea());
        System.out.println("Chu vi là:" + circle.getPerimeter());
        System.out.println("-----------------------");
        System.out.println("Hình chữ nhật là: ");
        Rectange rectange = new Rectange(2, 5.6);
        System.out.println("Diện tích là:" + rectange.getArea());
        System.out.println("Chu vi là:" + rectange.getPerimeter());
    }
}

