import java.io.FileWriter;
import java.io.IOException;

import static java.awt.SystemColor.text;

public class Ghi_du_lieu {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\Java\\untitled\\Vao_ra_du_lieu\\src\\test.txt");
        fileWriter.write("Helllo Mieeee");
        fileWriter.close();
    }
}
