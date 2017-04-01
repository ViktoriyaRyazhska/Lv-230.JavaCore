package temp.hm9.task3;

public class Task3 {
    public static void main(String[] args) {
        Thread t3 = new MyThread("Thread number three", 5);
        Thread t2 = new MyThread("Thread number two", 3, t3);
        Thread t1 = new MyThread(t2);
        t1.start();
    }
}
