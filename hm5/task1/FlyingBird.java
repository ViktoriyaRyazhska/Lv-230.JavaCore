package temp.task1;

/**
 * Created by forest on 18.03.2017.
 */
public class FlyingBird extends Bird {
    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
