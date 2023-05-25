import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BT_CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/xa-hoi.htm");
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            //useDelimiter phương thức của lớp Scanner sử dụng để đặt một dấu phân cách đê tách các thành phần của chuỗi trong đầu vào
            sc.useDelimiter("\\Z");
            // Đọc một chuỗi từ một đối tượng Scanner và gán giá trị đó vào một biến chuỗi. next() sẽ đọc chuỗi tiếp theo trong dòng văn bản được đưa vào Scanner và trả về dưới dạng String
            String content = sc.next();
            sc.close();
            // replaceAll sử dụng để thay thế tất cả các ký tự hoặc chuỗi con trong một chuỗi bằng một chuỗi khác
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("article-title\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
