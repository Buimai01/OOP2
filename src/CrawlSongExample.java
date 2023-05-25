import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) throws IOException {
        try {
            //URL(Uniform Resource Locator) là một tham chiếu hoặc địa chỉ đến các tài nguyên duy nhất, định dạng của URL nằm trong chuỗi mô tả quá trình tìm kiếm tài nguyên trên Internet
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            // Đọc nội dung của một tài nguyên từ một URL cụ thể
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            //useDelimiter phương thức của lớp Scanner sử dụng để đặt một dấu phân cách đê tách các thành phần của chuỗi trong đầu vào
            sc.useDelimiter("\\Z");
            // Đọc một chuỗi từ một đối tượng Scanner và gán giá trị đó vào một biến chuỗi. next() sẽ đọc chuỗi tiếp theo trong dòng văn bản được đưa vào Scanner và trả về dưới dạng String
            String content = sc.next();
            sc.close();
            // replaceAll sử dụng để thay thế tất cả các ký tự hoặc chuỗi con trong một chuỗi bằng một chuỗi khác
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        }catch (IOException m) {
            m.printStackTrace();
        }
    }
}
