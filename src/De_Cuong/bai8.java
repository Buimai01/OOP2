package De_Cuong;

public class bai8 {
    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            for (int num: numbers) {
                if ( isPrime(num)) {
                    System.out.println(num);
                }
            }
        }
        static boolean isPrime (int number) {
            boolean check = true;
            if (number == 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                }
            }
            return check;
        }
    }

