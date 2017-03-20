package week3.thursday.homework.task1;

/**
 * Create array Bird and add different birds to it.
 * Call fly() method for all of it.
 * Output the information about each type of created bird.
 */
public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(false, true),
                new Chicken(true, true)
        };

        for (Bird b : birds) {
            System.out.println(b);
            b.fly();
        }
    }
}
