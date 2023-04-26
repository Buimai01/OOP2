package Ngoai_le_do_nguoi_dung_dinh_nghia;
// Một lớp đại diện cho ngoại lệ người dùng xác định

public class
MyException extends Exception{
    public MyException (String s) {
        // Gọi hàm tạo của ngoại lệ gốc
        super(s);
    }
}
// Một lớp sử dụng MyException ở trên
class Main {
    // Chương trình điều khển
    public static void main(String[] args) {
       try {
           // Ném một đối tượng của ngoại lệ do người dùng xác định
           throw new MyException("GreeksGeeks");
       } catch (MyException e) {
           System.out.println("Caught");
           // In ra thông báo từ đối tượng MyException
           System.out.println(e.getMessage());
       }
    }
}
// B2:
// Đoạn mã trên gồm 2 lớp và mục đích của từng lớp:
// Lớp MyException: đại diện cho ngoại lệ người dùng định nghĩa, kế thừa từ lớp Exception, lớp này dùng để xử lý các ngoại lệ chưa được xử lý trong chương trình và in ra thông báo lỗi
// Lớp Main: Kiểm tra và xử lý ngoại lệ trong chương trình
// B3:
// Đoạn mã trên in ra kết quả là "Caught" và "GreeksGreeks", ngoại lệ MyException ném ra trong khối try-catch, khối catch sẽ bắt lỗi này và in ra thông báo "Caught" giá trị "GeeksGeeks" được truyền vào ngoại lệ MyException trong khối try-catch