import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BT_Class {
    public static void main(String[] args) {
        String btclass = ("^[CAP]\\d{4}[GHIK]$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your class:");
        String nameclass = sc.nextLine();
        Pattern pattern = Pattern.compile(btclass);
        Matcher matcher = pattern.matcher(nameclass);
        if (matcher.matches()){
            System.out.println("Nhập tên lớp hợp lệ");
        }else {
            System.out.println("Nhập tên lớp không hợp lệ");
        }
    }
}
