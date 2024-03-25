package Bai3;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        // Đo thời gian của một hoạt động nào đó
        stopwatch.start();
        // Thực hiện một số công việc
        // ...
        stopwatch.stop();

        System.out.println("Elapsed time in milliseconds: " + stopwatch.getElapsedTime());
    }
}
