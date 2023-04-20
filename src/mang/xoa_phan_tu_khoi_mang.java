import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Giá Trị Cần Xóa: ");
        int index = scanner.nextInt();
         removeElementIn (arrayNumber, index);
    }
    private static void removeElementIn(int[] arrays, int index ) {
        int sizeArray = arrays.length -1;
        int[] newArray = new int [sizeArray];
        System.arraycopy(arrays, 0, newArray, 0, index);
        System.arraycopy(arrays, index + 1 , newArray, index, newArray.length - index);

        for (int number : newArray
             ) {
            System.out.println(number);
        }

    }
}
