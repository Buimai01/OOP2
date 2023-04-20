package De_Cuong;

public class bai1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //gán giá trị của phần tử đầu tiên cho max, sau đó dùng max so sánh với các phần tử còn lại
        int max = numbers[0];
        System.out.println("Các phần tử trong mảng là: ");
        //In ra các phần tử trong mảng
        for (int i : numbers) {
            System.out.println(i);
        }
        //Tìm số lớn nhất trong mảng
        for (int num : numbers) {
            if (max < num)
                max = num;
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
        //Tìm số lẻ trong mảng
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                System.out.println("Số lẻ trong mảng là:" + i);
            }
        }
        //Tìm số chẵn trong mảng
        for (int i = 0; i < numbers.length;i++) {
            if (i % 2 ==0) {
                System.out.println("Sỗ chẵn trong mảng là:" + i);
            }
        }
    }
    }

