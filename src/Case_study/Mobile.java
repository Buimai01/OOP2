package Case_study;

public class Mobile {
  public int id;
  public String manufacturer;
  public String color;
  public int width;
  public int height;
  public int thickness;
  public int energy;

  public Mobile() {
    this.id = id;
    this.manufacturer = "Nokia";
    this.color = "Màu xanh";
    this.width = 30;
    this.height = 60;
    this.thickness = 1;
    this.energy = 10;
  }
  public Mobile (int id) {
    this.id = id;
  }public Mobile (String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Mobile(int id,String manufacturer) {
    this.id = id;
    this.manufacturer = manufacturer;
  }

  public Mobile(int id,String manufacturer, String color) {
    this.id = id;
    this.manufacturer = manufacturer;
    this.color = color;
  }

  public Mobile(int id,String manufacturer, String color, int width) {
    this.id = id;
    this.manufacturer = manufacturer;
    this.color = color;
    this.width = width;
  }

  public Mobile(int id,String manufacturer, String color, int width, int height) {
    this.id = id;
    this.manufacturer = manufacturer;
    this.color = color;
    this.width = width;
    this.height = height;
  }

  public Mobile(int id,String manufacturer, String color, int width, int height, int thickness) {
    this.id = id;
    this.manufacturer = manufacturer;
    this.color = color;
    this.width = width;
    this.height = height;
    this.thickness = thickness;
  }

  public Mobile(int id,String manufacturer, String color, int width, int height, int thickness, int energy) {
    this.id = id;
    this.manufacturer = manufacturer;
    this.color = color;
    this.width = width;
    this.height = height;
    this.thickness = thickness;
    this.energy = energy;
  }
  public int getId () {
    return this.id;
  }
  public void setId (int id) {
    this.id = id;
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
    Mobile objMobile2 = new Mobile("Nokia" );
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
  class MobileStore {
  public Mobile [] listmobile;
  public int numberOfMobile;
  public MobileStore() {
    listmobile = new Mobile[100];
    this.numberOfMobile = 0;
  }
  public MobileStore(int height) {
    listmobile = new Mobile[100];
    this.numberOfMobile = 0;
  }
    public boolean addMobile (Mobile mobile) {
      if( this.numberOfMobile < listmobile.length) {
        listmobile[this.numberOfMobile] = mobile;
        this.numberOfMobile++;
        return true;
      }
      return  false;
    }
    public boolean sellMobile (String id ) {
    for (int i = 0; i < this.numberOfMobile; i++) {
        for (int j = i; j < this.numberOfMobile - 1; j++) {
          listmobile[j] = listmobile [j + 1];
        }
        listmobile [this.numberOfMobile-1] = null;
        this.numberOfMobile--;
        return true;

    }
    return false;
    }
  }

