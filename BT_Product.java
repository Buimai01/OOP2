import java.io.*;
import java.util.Arrays;

public class BT_Product implements Serializable {
    private int id;
    private String name;
    private int price;
    private String manufacturer;
    public BT_Product() {
    }

    public BT_Product(int id, String name, int price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "BT_Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
class ProductProcess2 {
public static boolean writeProduct(Product objProduct, String filename) throws IOException {
    ObjectOutputStream oos = null;
    try {
        oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(objProduct);
        oos.close();
        return true;
    }catch (IOException m) {
        System.out.println(m);
        return false;
    }
}
    public static Product[] readProduct (String fileName) throws Exception {
    Product [] listProduct = null;
    ObjectInputStream oos = null;
    try {
        oos = new ObjectInputStream(new FileInputStream(fileName));
        listProduct = (Product[]) oos.readObject();
        oos.close();
    }catch (IOException m) {
        System.out.println(m);
    }finally {
        oos.close();
        return listProduct;
    }
    }
}
class ProductApp2 {
    public static void main(String[] args)throws Exception {
        Product [] products = new Product[5];
        products[0] = new Product(1, "Trà sữa", 35);
        products[1] = new Product(2, "Toboki", 50);
        products[2] = new Product(3, "Trà đào", 25);
        products[3] = new Product(4, "Trà thái", 45);
        products[4] = new Product(5, "Trà sữa trân châu đường đen", 55);
        String filName = "D:\\Java\\untitled\\Vao_ra_du_lieu2\\src\\product.txt";
        ProductProcess productProcess = new ProductProcess();
        ProductProcess.writeObjectData(products,"product.txt");
        for (Product m:products
             ) {
            System.out.println(m);
        }
        productProcess.readObjectData(filName);
        System.out.println("Ghi ra file thành công!");
    }
}
