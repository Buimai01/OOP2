package De_Cuong;

public class bai9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 8, 9, 41, 23,15};
        int sum = 0;
        for (int num: numbers) {
            sum = sum + num;
        }
        System.out.println("Tổng giá trị của toàn bộ phần tử trong mảng là:" + sum);
        for (int num: numbers) {
            sum = sum * num;
        }
        System.out.println("Tích của toàn bộ phần tử tron mảng là: " + sum);
    }
}
