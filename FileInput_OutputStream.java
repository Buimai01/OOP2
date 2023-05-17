import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Bước 1:
// -Lớp FileInputStream/FileOutputStream thuộc package: java.io.
// -Lớp FileInputStream có 3 phương thức khởi tạo. Thường dùng phương thức FileInputStream(File file) khởi tạo để tạo đối tượng
// -Lớp FileOutputStream có 5 phương thức khởi tạo. Thường dùng phương thức FileOutputStream(File file) khởi tạo để tạo đối tượng
// *Nếu trong quá trình ghi dữu liệu bị lỗi, phương thức sẽ ném ra ngoại lệ IOException để thông báo lỗi hệ thống
// *Phương thức read(), write(), close() ném ra ngoại lệ: IOException, để bắt được ngoại lệ này cần làm khởi tạo ngoại lệ IOException hoặc xử dụng try-catch để bắt ngoại lệ

public class FileInput_OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
             fos = new FileOutputStream("D:\\Java\\untitled\\Vao_ra_du_lieu2\\src\\person.dat");
             String s = "Bùi Thị Mai: 25012004";
             byte b[] = s.getBytes();
             fos.write(b);
             fis = new FileInputStream("D:\\Java\\untitled\\Vao_ra_du_lieu2\\src\\person.dat");
             int i = 0;
             while ((i = fis.read()) != -1){
                 System.out.print((char) i);
             }
             fos.close();
             fis.close();
            System.out.println("Ghi dữ liệu thành công");
        }catch (Exception m){
            System.out.println(m);
        }finally {
            fos.close();
            fis.close();
        }
    }
}
