package week3.thursday.homework.task1;

/**
 * Develop classes FlyingBird and NonFlyingBird.
 */
public abstract class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can fly :)");
    }
}
