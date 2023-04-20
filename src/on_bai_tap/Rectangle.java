package on_bai_tap;

public class Rectangle {
    public double height;
    public double width;
    public Rectangle() {
        this.height = 0.0;
        this.width = 0.0;
    }
    public Rectangle(double height) {
        this.height = 0.0;
    }
    public Rectangle(double height, double width) {
        this.height = height;
        this.width =  width;
    }
    public double getHeight () {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth () {
        return this.width;
    }
    public void setWidth (double width) {
        this.width = width;
    }
     public double Perimeter () {return (height + width) *2; }
     public double Acreage () {return height * width;}
}
class AppRectangle {
    public static void main(String[] args) {
        Rectangle objHCN1 = new Rectangle();
        objHCN1.setHeight(1.2);
        objHCN1.setWidth(2.4);
        System.out.println("Height:" + objHCN1.getHeight());
        System.out.println("Width:" + objHCN1.getWidth());
        System.out.println("Acreage:" + objHCN1.Acreage());
        System.out.println("Perimeter:" + (double) Math.round(objHCN1.Perimeter() * 10) / 10);
        System.out.println("-------------------");


        Rectangle objHCN2 = new Rectangle(1.6, 1.9);
        objHCN2.setHeight(2.3);
        double s2 = objHCN2.Acreage();
        System.out.println( "Acreage:" + (double) Math.round(objHCN2.Acreage() *10) / 10);
    }



}
