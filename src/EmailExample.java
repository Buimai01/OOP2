import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    //Đối tượng mẫu, phiên bản đã được biên dịch của biểu thức chính quy
    private static Pattern pattern;
    //Phương tiện để so khớp chuỗi dữ liệu đầu vào với đối tượng Pattern đã được tạo ở trên
    private Matcher matcher;
    // ^ bắt đầu chuỗi String hoặc một dòng
    // + có ít nhất một ký tự
    // @ kết thúc bằng một ký hiệu
    // $ kết thúc chuỗi String haowjc kết thúc dòng 
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public EmailExample () {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class EmailExampleTest {
    private static EmailExample ee;
    public static final String [] validEmail = new String[] {"a@gmail.com", "ab@gmail.com", "abc@hotgmail.com"};
    public static final String [] invaliEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        ee = new EmailExample();
        for (String email : validEmail ) {
            boolean isvalid = ee.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invaliEmail) {
            boolean isvalid = ee.validate(email);
            System.out.println("Email is " + email + " is valid:" + isvalid);
        }
    }
}