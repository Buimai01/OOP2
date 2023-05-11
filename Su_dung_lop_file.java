import java.io.File;

public class Su_dung_lop_file {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\untitled\\Vao_ra_du_lieu\\src\\test.txt");
        // exists để kiểm tra xem tệp hoặc thư mục có tồn tại trên hệ tống ko, trả về true nếu tệp tồn tại và ngược lại
        if (file.exists()) {
            System.out.println("File tồn tại");
        } else {
            System.out.println("File không tồn tại");
        }
        // isDirectory để kiểm tra xem một đường dẫn tới thư mục hay không
        if (file.isDirectory()) {
            System.out.println("Đây là một thư mục");
        } else {
            System.out.println("Đây không phải là một thư mục");
        }
        // getAbsolutePath() để lấy đường dẫn tuyệt đối đến tệp haowjc thư mục được chỉ định
        System.out.println("Đường dẫn đến file: " + file.getAbsolutePath());
    }
}
