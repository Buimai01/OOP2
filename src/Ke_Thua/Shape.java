package Ke_Thua;

public class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        this.color = "green";
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
    public String toString() {
        return "A shape with color of "
                +getColor()
                + " and "
                + (isFilled()? "filled" : "not filled");
    }
}
class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
class Circle extends Shape {
    private double radius;
    public Circle() {}
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled) {
        super(color, filled);
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
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + " , which is a subclass of"
                + super.toString();
    }
}
class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.5);
        System.out.println(circle);
        circle = new Circle(2.5, "Green", false);
        System.out.println(circle);

    }
}
class Rectangle extends Shape {
    private double width = 1;
    private double length = 1.0;
    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle (double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
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
    public double getArea() {
        return width * this.length;
    }
    public double getPermeter() {
        return 2 * (width + this.length);
    }
    public String tostring () {
        return "A Rectangle with width = "
                + getWidth()
                + " and length "
                + getLength()
                + super.toString();
    }
}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(5, 9);
        System.out.println(rectangle);
        rectangle = new Rectangle(2, 5, "black", true);
        System.out.println(rectangle);
    }
}
class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public void setWidth (double width){
        setSide(width);
    }
    public void setLength (double length) {
        setSide(length);
    }
}