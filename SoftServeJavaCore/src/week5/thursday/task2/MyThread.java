package week5.thursday.task2;

public class MyThread implements Runnable {
    private int number;
    private int time;
    private String message;

    public MyThread(int number, int time, String message) {
        this.number = number;
        this.time = time;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println(message);

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
