package De_Cuong;

public class bai7 {
    public static void main(String[] args) {
     int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     int [] copyArr = numbers;
        System.out.println("Copy một mảng mới từ mảng cũ là: ");
        for (int number: copyArr) {
            System.out.println(number + "");
        }
    }
}
