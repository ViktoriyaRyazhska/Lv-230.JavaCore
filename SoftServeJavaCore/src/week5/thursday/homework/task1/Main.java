package week5.thursday.homework.task1;

/**
 * Run three threads and output there different messages for 5 times.
 * The third thread supposed to start after finishing working of the two previous threads.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread("I`m first thread!", 5);
        Thread t2 = new MyThread("I`m second thread!", 5);
        Thread t3 = new MyThread("I`m third thread!", 5);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}
