package week3.thursday.homework.task1;

/**
 * Create class Penguin.
 */
public class Penguin extends NonFlyingBird {

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "I'm a penguin";
    }
}
