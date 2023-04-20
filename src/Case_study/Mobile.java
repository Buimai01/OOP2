package on_bai_tap;

public class Mobile {
  public String manufacturer;
  public String color;
  public int width;
  public int height;
  public int thickness;
  public int energy;

  public Mobile() {
    this.manufacturer = "Nokia";
    this.color = "Màu xanh";
    this.width = 30;
    this.height = 60;
    this.thickness = 1;
    this.energy = 10;
  }

  public Mobile(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Mobile(String manufacturer, String color) {
    this.manufacturer = manufacturer;
    this.color = color;
  }

  public Mobile(String manufacturer, String color, int width) {
    this.manufacturer = manufacturer;
    this.color = color;
    this.width = width;
  }

  public Mobile(String manufacturer, String color, int width, int height) {
    this.manufacturer = manufacturer;
    this.color = color;
    this.width = width;
    this.height = height;
  }

  public Mobile(String manufacturer, String color, int width, int height, int thickness) {
    this.manufacturer = manufacturer;
    this.color = color;
    this.width = width;
    this.height = height;
    this.thickness = thickness;
  }

  public Mobile(String manufacturer, String color, int width, int height, int thickness, int energy) {
    this.manufacturer = manufacturer;
    this.color = color;
    this.width = width;
    this.height = height;
    this.thickness = thickness;
    this.energy = energy;
  }
  public String getManufacturer () {
    return this.manufacturer;
  }
  public void setManufacturer (String manufacturer) {
    this.manufacturer = manufacturer;
  }
  public String getColor () {
    return this.color;
  }
  public void setColor (String color) {
    this.color = color;
  }
  public int getWidth () {
    return this.width;
  }
  public void setWidth (int width) {
    this.width = width;
  }
  public int getHeight () {
    return this.height;
  }
  public void setHeight (int height) {
    this.height = height;
  }
  public int getThickness() {
    return this.thickness;
  }
  public void setThickness (int thickness) {
    this.thickness = thickness;
  }
  public int getEnergy () {
    return this.energy;
  }
  public void setEnergy(int energy) {
    if (energy >=0 && energy <= 100) {
      this.energy = energy;
    } else {
      System.out.println("Mức năng lượng phải nằm trong khoảng 0- 100");
    }
  }
}
class AppMobile {
  public static void main(String[] args) {
    Mobile objMobile1 = new Mobile();
    objMobile1.setManufacturer("Samsung");
    objMobile1.setColor("màu vàng");
    objMobile1.setWidth(15);
    System.out.println("Manufacturer:" + objMobile1.getManufacturer());
    System.out.println("Color:" + objMobile1.getColor());
    System.out.println("Width:" + objMobile1.getWidth());
    System.out.println("Height:" + objMobile1.getHeight());
    System.out.println("Thickness:" + objMobile1.getThickness());
    System.out.println("Energy:" + objMobile1.getEnergy());
    Mobile objMobile2 = new Mobile("Apple");
    objMobile2.setHeight(12);
    objMobile2.setWidth(20);
    objMobile2.setEnergy(100);
    System.out.println("Manufacturer:" + objMobile2.getManufacturer());
    System.out.println("Color:" + objMobile2.getColor());
    System.out.println("Width:" + objMobile2.getWidth());
    System.out.println("Height:" + objMobile2.getHeight());
    System.out.println("Thickness:" + objMobile2.getThickness());
    System.out.println("Energy:" + objMobile2.getEnergy());

  }

  }

