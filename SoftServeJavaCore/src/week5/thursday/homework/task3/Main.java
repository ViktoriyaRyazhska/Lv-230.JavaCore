package week5.thursday.homework.task3;

/**
 * Create a thread «one», which would start the thread «two»,
 * which has to output its number («Thread number two») 3 times
 * and create thread «three», which would to output message «Thread number three» 5 times.
 */
public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread(new MyThread("Thread number two", 3));
        Thread t3 = new MyThread("Thread number three", 5);

        t1.start();
        t3.start();
    }
}
