import java.io.*;
import java.util.Scanner;

// B1:*4 yếu tố của phương thức:
// -Tên phương thức: writeData
// -Kiểu trả về: boolean
// -Tham số đầu vào: data (kiểu String): dữ liệu cần ghi vào file, fileName( kiểu String): tên file mục tiêu để ghi dữ liệu
// *Đây là phương thức trả về giá trị boolean, cho biết kết quả thực hiện ghi dữ liệu vào file có thành công hay ko

public class FileInput_OutputStream2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dữ liệu cần ghi ra file ");
        String string = sc.nextLine();
        writeData(string, "D:\\Java\\untitled\\Vao_ra_du_lieu2\\src\\data.dat");
        readData("D:\\Java\\untitled\\Vao_ra_du_lieu2\\src\\data.dat");
    }
    public static boolean writeData(String data, String name) throws IOException {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            fos = new FileOutputStream(name);
            bos = new BufferedOutputStream(fos);
            bos.write(data.getBytes());
            bos.close();
            return true;
        }catch (IOException m) {
            System.out.println(m);
            return false;
        }finally {
            fos.close();
            bos.close();
        }
    }
    public static String readData (String fileName) throws IOException {
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(fileName);
                bis = new BufferedInputStream(fis);
                int i = 0;
                while ((i = bis.read()) != -1) {
                    System.out.print((char) i);
                }
            }catch (IOException m) {
                System.out.println(m);
            }finally {
                fis.close();
                bis.close();
            }
            return "";
        }
}