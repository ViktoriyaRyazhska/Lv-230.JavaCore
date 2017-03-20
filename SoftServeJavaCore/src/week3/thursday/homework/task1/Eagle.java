package week3.thursday.homework.task1;

/**
 * Create class Eagle.
 */
public class Eagle extends FlyingBird {

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "I'm an eagle";
    }
}
