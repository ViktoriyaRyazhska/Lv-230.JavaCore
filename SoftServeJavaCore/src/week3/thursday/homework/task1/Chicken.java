package week3.thursday.homework.task1;

/**
 * Create class Chicken.
 */
public class Chicken extends NonFlyingBird {

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "I'm a chicken";
    }
}
