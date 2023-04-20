package lop_va_doi_tuong;

public class stopwatch {
    public double startTime = 0;
    public double endTime = 0;
    public boolean running = false;
    public void start() {
        this.startTime = System. currentTimeMillis();
        this.running = true;
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }
    public double getElapsedTime() {
        double elapsed;
        if (running) {
            elapsed = ((System.currentTimeMillis() - startTime) /1000);
        } else {
            elapsed = ((this.endTime - this.startTime) / 1000);
        }
        return elapsed;
    }

}
