import java.io.*;

public class Doc_ghi_du_lieu_vao_file {
    //readFromFile có chức năng đọc dữ liệu t một file và trả về nội dung file đó dưới dạng chuỗi
    // fileName là đường dẫn hoặc tên file cần đọc, phương thức sẽ mở và đọc file theo đường dẫn này, nếu file không tồn tại hoặc có lỗi trong quá trình đọc trả về giá trị null haowjc ném ra ngoại lệ
    public static String readFromFile(String fileName) {
        String result = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // khai báo biến để tạo ra một đối tượng chuỗi,biến này chứa một chuỗi ký tự được nhập từ ng dùng
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result += line + "\n";
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static boolean writeToFile (String fileName, String content) {
      try {
          FileWriter fileWriter = new FileWriter(fileName);
          fileWriter.write(content);
          fileWriter.close();
          return true;
      } catch (IOException e) {
          e.printStackTrace();
          return false;
      }
    }

    public static void main(String[] args) {
        String fileName = "D:\\Java\\untitled\\Vao_ra_du_lieu\\src\\test1.txt";
        String content = readFromFile(fileName);
        System.out.println(content);
        String newData = "Đây là dữ liệu mới được ghi vào tệp";
        if (writeToFile(fileName, newData)) {
            System.out.println("Ghi thành công dữ liệu vào tệp");
        } else {
            System.out.println("Không thể ghi dữ liệu vào tệp");
        }

    }
}
