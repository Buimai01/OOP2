import java.util.Scanner;

public class tim_gia_tri_lon_nhat {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập một kích thước: ");
            size = sc.nextInt();
            if (size > 20 )
                System.out.println("Kích thước không được vượt quá 20: ");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử" + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Danh sách tài sản: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array [j] + "\t");
        }
        int max = array [0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max )  {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị tài sản lớn nhất trong danh sách là " + max + " , tại vị trí " + index);
    }
}
