package week5.thursday.homework.task2;

/**
 * Cause a deadlock.
 * Organize the expectations of ending a thread in main(),
 * and make the end of the method main() in this thread.
 */
public class Main {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    currentThread.join();
                    System.out.println("Thread 1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main thread");
    }
}
