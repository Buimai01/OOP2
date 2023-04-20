package mang;

public class tim_gia_tri_nho_nhat_mang {
    public static void main(String[] args) {
       int numbers[] = new int[] {45, 23, 51, 12, 25, 32, 16, 98};
       int min = numbers[0];
       for (int i = 0; i < numbers.length; i++) {
           if(numbers [i] < min) {
               min = numbers [i];
           }
       }
        System.out.println("Giá trị nhỏ nhất là: " + min );
    }
}
