import java.sql.SQLOutput;
import java.util.Scanner;

public class ungdungdocthanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số: ");
        int number = scanner.nextInt();
        int convert, remainder;

        if (number <0) {
            System.out.println("The program not support");
        }
        System.out.println(number + ":");
        if (number > 99 || number < 1000) {
            remainder = number%100;
            convert = (number - remainder)/100;

        switch (convert) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Fire");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;

        }
            System.out.println("hundred");
        }
        remainder = number%100;
        convert = (number - remainder )/100;
                switch(number) {
                    case 20:
                        System.out.print("Twenty");
                        break;
                    case 30:
                        System.out.println("Thirty");
                        break;
                    case 40:
                        System.out.println("Forty");
                        break;
                    case 50:
                        System.out.println("Fifty");
                        break;
                    case 60:
                        System.out.println("Sixty");
                        break;
                    case 70:
                        System.out.println("Seventy");
                        break;
                    case 80:
                        System.out.println("Eighty");
                        break;
                    case 90:
                        System.out.println("Ninety");
                        break;

                }

    }
}
