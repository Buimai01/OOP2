import java.io.*;
import java.util.Arrays;

public class Product implements Serializable{
    private int proID;
    private String proName;
    private double price;

    public Product() {
    }

    public Product(int proID, String proName, double price) {
        this.proID = proID;
        this.proName = proName;
        this.price = price;
    }

    public int getProID() {
        return proID;
    }

    public String getProName() {
        return proName;
    }

    public double getPrice() {
        return price;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proID=" + proID +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
class ProductProcess {
    public static boolean writeObjectData(Product[] objProduct, String fileName) throws Exception {
       try {
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
           oos.writeObject(objProduct);
           return true;
           }catch (IOException m) {
           m.printStackTrace();
       }
       return false;
    }
    public Product[] readObjectData(String fileName) throws Exception {
        Product[] products = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            products = (Product[]) ois.readObject();
            System.out.println(Arrays.toString(products));
        }catch (IOException e ) {
            System.out.println(e);
        }
        return products;
    }
}
class ProductApp {
    public static void main(String[] args) throws Exception{
        Product[] listProduct = new Product[2];
        listProduct[1] = new Product(2,"Bùi Thị Mai", 25);
        Product objProduct1 = new Product();
        objProduct1.setProID(1);
        objProduct1.setProName("Product 1");
        objProduct1.setPrice(2500);
        Product objProduct2 = new Product(2,"Product 2", 6000);
        ProductProcess objProductProcess = new ProductProcess();
        objProductProcess.writeObjectData(listProduct,"D:\\Java\\untitled\\Vao_ra_du_lieu2\\src\\object.dat");
        objProductProcess.writeObjectData(listProduct, "D:\\Java\\untitled\\Vao_ra_du_lieu2\\src\\object.dat");

        objProductProcess.readObjectData("D:\\Java\\untitled\\Vao_ra_du_lieu2\\src\\object.dat");

    }
}