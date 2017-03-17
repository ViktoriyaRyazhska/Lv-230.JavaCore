package hom5.task1;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public boolean fly() {
		return false;
	}

}
