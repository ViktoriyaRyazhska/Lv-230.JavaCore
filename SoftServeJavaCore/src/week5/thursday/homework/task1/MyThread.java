package week5.thursday.homework.task1;

public class MyThread extends Thread {
    private String message;
    private int times;

    public MyThread(String message, int times) {
        this.message = message;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {

            System.out.println(message);
        }
    }
}

