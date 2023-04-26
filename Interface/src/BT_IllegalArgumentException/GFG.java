package BT_IllegalArgumentException;

public class GFG {
    public static void main(String[] args) {
        // String thiết lập một chuỗi rỗng và gọi hàm getLength()
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException m) {
            System.out.println("IllegalArgumentException caught");
        }
        // Chuỗi s được đặt thành một gi trị và gọi hàm getLength()
        s = "Bùi Thị Mai";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException m) {
            System.out.println("IllegalArgumentException caught");
        }
        // Đặt s là null và gọi getLength()
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException m) {
            System.out.println("IllegalArgumentException caught");
        }
    }
    // Hàm trả vè độ dài của chuỗi s
    // Nó ném IllegalArgumentException nếu s là null
    public static int getLength (String s ) {
        if (s == null) throw new IllegalArgumentException("Đối số không thể rỗng");
        return s.length();
    }
}
// B2: Mục đích của hàm getLength() là trả về độ dài của chuỗi s. Nếu chuỗi s là null hàm ném ra ngoại lệ IllegalArgumentException thông báo "The argument cannot be null"
// B3: Chương trình sẽ in ra kết quả
       // IllegalArgumentException caught (chuỗi s rỗng)
       // 11 (Chuỗi có giá trị là "Bùi Thị Mai")
       // IllegalArgumentException caught (Chuỗi s là null)
// B4: Ngoại lệ IllegalArgumentException xảy ra khi một tham số truyền vào cho hàm không hợp lệ nó xảy ra khi chuỗi s là null và hà không thể tính được ộ dài của chuỗi đó
