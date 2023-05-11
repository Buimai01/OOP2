import java.io.FileReader;
import java.io.IOException;

public class Doc_du_lieu {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("D:\\Java\\untitled\\Vao_ra_du_lieu\\src\\text.txt");
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.println((char) i);
        }
        fileReader.close();
    }
}
