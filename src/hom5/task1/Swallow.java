package hom5.task1;

public class Swallow extends FlyingBird {

	public Swallow(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public String toString() {
		return "Swallow [fly()=" + fly() + ", isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs()
				+ ", toString()=" + super.toString() + "]";
	}

}
