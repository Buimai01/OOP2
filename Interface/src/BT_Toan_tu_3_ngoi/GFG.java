package BT_Toan_tu_3_ngoi;

public class GFG {
    public static void main(String[] args) {
        // Khởi tạo biến String với giá trị null
        String str = null;
        // Dùng toán tử 3 ngôi để lấy substring từ index 0 đến 8 kết quả trả về chuỗi rỗng
        String message = (str == null) ? "" : str.substring(0,8);
        System.out.println(message);
        // Khởi tạo biến String với giá trị null
        // Biến str được gán giá trị là Greeksforgreeks
        str = "Greeksforgreeks";
        // Dùng toán tử 3 ngôi để lấy substring từ index 0 đến 8 kết quả trả về chuỗi "Greeksfo"
        message = (str == null) ? "" : str.substring(0,8);
        System.out.println(message);
    }
}
// Đoạn mã lệnh trên in ra kết quả là "Greeksfo"
// Cú pháp tổng quát toán tử 3 ngôi:
//biến = Biểu thức logic ? Câu lệnh khi biểu thức trả về true : Câu lệnh biểu thức trả về false
