package week5.thursday.task1;

/**
 * Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            Thread.sleep(1000);
        }
    }
}
