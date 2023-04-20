package BT_6_1;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString() {
        return "1 hình cùng màu sắc: "
                +getColor()
                +(isFilled() ? "filled " : "not filled");
    }
}
class Circle extends Shape {
    protected double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        this.color =color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public String toString () {
        return "Một đường tròn có bán kính: "
                +getRadius()
                + ", Đó là một lớp con của "
                + super.toString();
    }
}
class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled ) {
        this.width = width;
        this.length = length;
        this.filled = filled;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea () {
        return width * length;
    }
    public double getPerimeter () {
        return 2 * (width + length);
    }
    public String toString () {
        return "Hình chữ nhật có chiều rộng ="
                +getWidth()
                + " và chiều dài ="
                +getLength()
                + " Đó là lớp con của"
                + super.toString();
    }
}
class Square extends Rectangle {
    protected double side;
    public Square() {}
    public Square(double side) {
      this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }
    public String toString() {
        return "Hình vuông:"
                +super.toString()
                + "Side = "
                + width;
    }
}
class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.setFilled(true);
        System.out.println("Vòng tròn:" + circle.toString());
        System.out.println("Bán kính là:" + circle.getRadius());
        System.out.println("Diện tích là:" + circle.getArea());
        System.out.println("Chu vi là:" + circle.getPerimeter());
        System.out.println("-------------------------");
        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println("Hình chữ nhật:" + rectangle.toString());
        System.out.println("Diện tích là:" + rectangle.getArea());
        System.out.println("Chu vi là:" + rectangle.getPerimeter());
        System.out.println("----------------------------");
        Square square = new Square(4);
        System.out.println("Side của hình vuông:" + square.getSide());
    }
}
