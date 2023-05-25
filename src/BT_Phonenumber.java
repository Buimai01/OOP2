import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class BT_Phonenumber {
    public static void main(String[] args) {
        String phoneNumber ="\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone: ");
        String number = sc.nextLine();
        Pattern pattern = Pattern.compile(phoneNumber);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            System.out.println("Số điện thoại hợp lệ ");
        }else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
