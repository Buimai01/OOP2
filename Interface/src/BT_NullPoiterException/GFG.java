package BT_NullPoiterException;

public class GFG {
    public static void main(String[] args) {
        String ptr = null;
        if (ptr.equals("gfg"))
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}
//B1: Khi chạy đoạn mã lệnh xảy ra lỗi NullPoiterException vì biến ptr chưa khởi tạo giá trị và đang có giá trị là null khi gọi phương thức equals trên với giá trị là "gfg" nên nó xảy ra lỗi
class GFG1 {
    public static void main(String[] args) {
        // Khởi tạo biến String với giá trị null
        String ptr = null;
        try {
            if (ptr.equals("gfg"))
                System.out.println("Same");
            else
                System.out.println("Not Same");
        } catch (NullPointerException m) {
            System.out.println("NullPointerException Caught");
        }
    }
}
//B2: Nó in ra kết quả là NullPointerException Caught vì sử dụng thêm Try - catch để bắt lỗi
//B3: NullPointerException xảy ra khi một tham chiếu đến đối tượng null được sử dụng trong một phép toán mà đòi hỏi đối tượng
class GFG2 {
    public static void main(String[] args) {
        String ptr =  null;
        // Kiểm tra xe ptr có null hay không bằng cách sử dụng thử bắt
        try {
            if ("gfg".equals(ptr))
                System.out.println("Same");
            else
                System.out.println("Not Same");
        } catch (NullPointerException m) {
            System.out.println("Caught NullPointerException");
        }
    }
}
//B4: Nó in ra kết quả là "Not Same" bởi vì nó sử dụng phép só sánh ,ptr đang có giá trị là null, không phải là "gfg". Nếu ptr được khởi tạo với giá trị "gfg", kết quả sẽ là "Same". Tuy nhiên, try-catch block vẫn được sử dụng để bắt lỗi NullPointerException trong trường hợp ptr không được khởi tạo giá trị