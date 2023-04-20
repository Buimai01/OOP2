package lop_va_doi_tuong;

public class stopWatch2 {
    public static void main(String[] args) {
        stopwatch timeRun = new stopwatch();
        timeRun.start();
        for (int i = 0 ; i < 1000; i++){
            System.out.println("HeloWorl");
        }
        timeRun.stop();
        System.out.println("Kiểu giây: "+ timeRun.getElapsedTime());
    }
}
