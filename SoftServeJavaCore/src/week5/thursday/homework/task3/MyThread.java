package week5.thursday.homework.task3;

public class MyThread extends Thread {
    private Thread thread;
    private String message;
    private int times;

    public MyThread(Thread thread) {
        this.thread = thread;
    }

    public MyThread(String message, int times) {
        this.message = message;
        this.times = times;
    }

    @Override
    public void run() {
        if (thread == null) {
            for (int i = 0; i < times; i++) {
                System.out.println(message);
            }
        } else {
            thread.start();
        }
    }
}

