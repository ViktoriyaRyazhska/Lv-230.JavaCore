package week5.thursday.task2;

/**
 * Output two messages «Hello, world» and «Peace in the peace»
 * 5 times each with the intervals of 2 seconds, and the second - 3 seconds.
 * After printing messages, print the text «My name is …»
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable run1 = new MyThread(5, 2000, "Hello, world");
        Thread thread1 = new Thread(run1);
        Runnable run2 = new MyThread(5, 3000, "Peace int the peace");
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("My name is Vlad");
    }
}
