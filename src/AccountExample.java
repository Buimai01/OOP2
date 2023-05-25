import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    // cho phép dấu gạch dưới
    // các chữ thường từ a-z hoặc 0-9
    // Ít nhất 6 ký tự
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public AccountExample () {
    }
    //validate() thực hiện chuyển tiếp
    public boolean validate (String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[] {"123abc", "abc123", "abcdefgh", "123456"};
    public static final String[] invalidAccount = new String[] {".@", "12345", "1234_","abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is" + account + " is valid: " + isValid);
        }
        for (String account : invalidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is" + account + " is valid: " + isValid);
        }
    }
}
